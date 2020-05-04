package com.coalvalue.employee.service;

import com.coalvalue.employee.domain.dto.ButtonDto;
import com.coalvalue.employee.domain.dto.MenuBtnGroupDto;
import com.coalvalue.employee.domain.dto.MenuDto;
import com.coalvalue.employee.domain.dto.ResourceGroupDto;
import com.coalvalue.employee.domain.entity.*;
import com.coalvalue.employee.domain.pojo.ResourceNode;
import com.coalvalue.employee.repository.*;
import com.coalvalue.employee.repository.specification.ButtonSpec;
import com.coalvalue.employee.repository.specification.MenuBtnGroupSpec;
import com.coalvalue.employee.repository.specification.MenuSpec;
import com.coalvalue.employee.repository.specification.ResourceGroupSpec;
import com.coalvalue.employee.util.DomainPropertyCopyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by Peter Xu on 02/01/2015.
 */
@Service("resourceService")
@Transactional(readOnly = true)
public class ResourceServiceImpl extends BaseServiceImpl implements ResourceService {

    @Autowired
    private ResourceGroupRepository resourceGroupRepository;

    @Autowired
    private MenuBtnGroupRepository menuBtnGroupRepository;

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private ButtonRepository buttonRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public ResourceGroup queryResGroupById(Integer id) {
        return resourceGroupRepository.findById(id).get();
    }

    @Override
    public Page<ResourceGroup> queryResGroups(ResourceGroupDto resGrpDto, Pageable pageable) {
        ResourceGroupSpec resGrpSpec = new ResourceGroupSpec(resGrpDto);

        Specification<ResourceGroup> resGrpSpecification = resGrpSpec.defaultSpec();

        return resourceGroupRepository.findAll(resGrpSpecification, pageable);
    }

    @Override
    @Transactional
    public ResourceGroup createResourceGroup(ResourceGroup resGrp, String resStr) {
        ResourceGroup resourceGroup = resourceGroupRepository.save(resGrp);
        modifyResourceGroup(resStr, resourceGroup.getId());
        return resourceGroup;
    }

    @Override
    @Transactional
    public ResourceGroup updateResourceGroup(ResourceGroup resGrp, String resStr) {
        modifyResourceGroup(resStr, resGrp.getId());
        ResourceGroup original = queryResGroupById(resGrp.getId());
        DomainPropertyCopyer.copyProperty(resGrp, original);
        return resourceGroupRepository.save(original);
    }

    private void modifyResourceGroup(String resStr, Integer resGrpId) {
        if ("".equals(resStr)) {
            return;
        }
        String [] resources = resStr.split(";");
        for (String resource : resources) {
            String [] attrs = resource.split(",");
            String resourceType = attrs[0];
            Integer resourceId = Integer.parseInt(attrs[1]);
            Boolean resourceStatus = Boolean.parseBoolean(attrs[2]);
            if (resourceStatus) {
                MenuBtnGroup menuBtnGroup = new MenuBtnGroup(resourceId, resourceType, resGrpId);
                menuBtnGroupRepository.save(menuBtnGroup);
            } else {
                MenuBtnGroupSpec menuBtnGroupSpec = new MenuBtnGroupSpec(new MenuBtnGroupDto(resourceId, resourceType, resGrpId));
                Specification<MenuBtnGroup> resourcePredict = menuBtnGroupSpec.queryByResourceSpec();
                Optional<MenuBtnGroup> menuBtnGroup = menuBtnGroupRepository.findOne(resourcePredict);
                menuBtnGroupRepository.delete(menuBtnGroup.get());
            }
        }
    }

    @Override
    @Transactional
    public void deleteResourceGroup(Integer id) {
        //remove res_grp in menu_btn_grp
        menuBtnGroupRepository.removeMenuBtnGrpByResGrp(id);
        //remove res_grp in permission
        permissionRepository.removePermissionByResGrp(id);
        //remove res_grp in resource group
        resourceGroupRepository.deleteById(id);
    }

    @Override
    public ResourceNode queryResourceNodeByPID(Integer pid, Integer resGrpId) {
        //Query menus under pid
        MenuSpec menuSpec = new MenuSpec(new MenuDto(pid));
        Specification<Menu> pidSpec = menuSpec.queryMenuByPIDSpec();
        Sort menuSort = Sort.by(Sort.Direction.DESC,"menuSeq");
        List<Menu> menus = menuRepository.findAll(pidSpec, menuSort);

        //Query buttons under menu id (pid)
        ButtonSpec btnSpec = new ButtonSpec(new ButtonDto(pid));
        Specification<Button> menuIdSpec = btnSpec.queryBtnByMenuSpec();
        Sort btnSort = Sort.by(Sort.Direction.DESC,"buttonSeq");
        List<Button> buttons = buttonRepository.findAll(menuIdSpec, btnSort);

        //Query menus & buttons under group
        MenuBtnGroupSpec menuBtnGroupSpec = new MenuBtnGroupSpec(new MenuBtnGroupDto(resGrpId));
        Specification<MenuBtnGroup> groupIdPredict = menuBtnGroupSpec.queryByGroupIdSpec();
        List<MenuBtnGroup> menuBtnList = menuBtnGroupRepository.findAll(groupIdPredict);
        Set<Integer> menuIdSet = new HashSet<>();
        Set<Integer> btnIdSet = new HashSet<>();
        for (MenuBtnGroup menuBtnGroup : menuBtnList) {
            if ("MENU".equals(menuBtnGroup.getResourceType())) {
                menuIdSet.add(menuBtnGroup.getResourceId());
            } else {
                btnIdSet.add(menuBtnGroup.getResourceId());
            }
        }

        List<Boolean> menuStatus = matchList(menus, menuIdSet);
        List<Boolean> buttonStatus = matchList(buttons, btnIdSet);

        return new ResourceNode(menus, buttons, menuStatus, buttonStatus);
    }

    /**
     * l1 [1,2,3]
     * l2 [2,3,8]
     * @return [false,true,true]
     */
    private List<Boolean> matchList(List<? extends BaseDomain> l1, Set<Integer> l2) {
        List<Boolean> ret = new ArrayList<>();
        for (BaseDomain a : l1) {
            Integer id = a.getId();
            Boolean status = false;
            if (l2 != null && l2.contains(id)) {
                status = true;
            }
            ret.add(status);
        }
        return ret;
    }
}
