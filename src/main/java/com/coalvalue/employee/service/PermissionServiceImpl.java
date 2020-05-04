package com.coalvalue.employee.service;


import com.coalvalue.employee.domain.entity.*;
import com.coalvalue.employee.repository.EmployeeRoleRepository;
import com.coalvalue.employee.repository.PermissionRepository;
import com.coalvalue.employee.repository.ResourceGroupRepository;
import com.coalvalue.employee.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Peter Xu on 01/17/2015.
 */
@Service("permissionService")
@Transactional(readOnly = true)
public class PermissionServiceImpl extends BaseServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private ResourceGroupRepository resourceGroupRepository;
    @Autowired
    private EmployeeRoleRepository employeeRoleRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;


    @Override
    public Set<String> queryUserRoles(Integer userId) {
        List<Role> userRoles = userRoleRepository.queryUserRoles(userId);
        Set<String> roles = new HashSet<>();
        userRoles.forEach(role -> {
            roles.add(role.getRoleName());
        });


        userRoles.forEach(role -> {
            System.out.println("数据库获取的 用户 USER 权限："+ role.getRoleName());
        });
        return roles;
    }
    @Override
    public Set<String> queryEmployeeRoles(String userId) {

        System.out.println("数据库获取的 职工权限：userId "+ userId);
        List<Role> userRoles = employeeRoleRepository.queryUserRoles(userId);
        userRoles.forEach(role -> {
           System.out.println("数据库获取的 职工权限："+ role.getRoleName());
        });


        return userRoles.stream().map(e->e.getRoleName()).collect(Collectors.toSet());

    }
    @Override
    public Map queryResourceGroupByRole(Integer roleId) {
        List<ResourceGroup> roleResGroupList = permissionRepository.queryResourceGroupByRole(roleId);
        List<ResourceGroup> allResGroupList = resourceGroupRepository.findAll();
        Map<String, Object> data = new HashMap<>();
        data.put("roleResGroupList", roleResGroupList);
        data.put("allResGroupList", allResGroupList);
        return data;
    }

    @Override
    @Transactional
    public void assignRolePermission(Integer roleId, String resGrpIds) {
        //role permissions before update
        Set<Integer> originalResGrpIds = new HashSet<>();
        List<ResourceGroup> roleResGroupList = permissionRepository.queryResourceGroupByRole(roleId);
        roleResGroupList.forEach(resGrp -> {
            originalResGrpIds.add(resGrp.getId());
        });

        //role permissions assigned
        Set<Integer> currentResGrpIds = new HashSet<>();
        if (resGrpIds != null) {
            for (String resGrpId : resGrpIds.split(",")) {
                currentResGrpIds.add(Integer.parseInt(resGrpId));
            }
        }

        //Added permission
        currentResGrpIds.forEach(resGrpId -> {
            if (originalResGrpIds.size() == 0 || !originalResGrpIds.contains(resGrpId)) {
                Permission permission = new Permission(roleId, resGrpId, true);
                permissionRepository.save(permission);
            }
        });

        //Removed permission
        List<Integer> removedResGrpIds = new ArrayList<>();
        originalResGrpIds.forEach(resGrpId -> {
            if (currentResGrpIds.size() == 0 || !currentResGrpIds.contains(resGrpId)) {
                removedResGrpIds.add(resGrpId);
            }
        });
        if (removedResGrpIds.size() > 0) {
            permissionRepository.removePermission(roleId, removedResGrpIds);
        }
    }

    private List<MenuNode> getSubMenus(List<MenuNode> menuNodes, Integer parentId) {
        List<MenuNode> childs = new ArrayList<>();
        for (MenuNode menuNode : menuNodes) {
            if (parentId.equals(menuNode.getCurrent().getParentId())) {
                List<MenuNode> _childs = getSubMenus(menuNodes, menuNode.getCurrent().getId());
                menuNode.setChilds(_childs);
                childs.add(menuNode);
            }
        }
        return childs;
    }

    @Override
    public MenuNode queryHierarchyUserMenus(Integer userId) {
        List<Menu> menuList = queryUserMenus(userId);
        if (menuList == null || menuList.size() == 0) {
            return null;
        }
        List<MenuNode> menuNodeList = new ArrayList<>();

        for (Menu menu : menuList) {
            menuNodeList.add(new MenuNode(menu));
        }

        Menu rootMenu = menuList.get(0);
        MenuNode rootNode = new MenuNode(rootMenu);
        List<MenuNode> menuNodes = getSubMenus(menuNodeList, rootMenu.getId());
        rootNode.setChilds(menuNodes);
        return rootNode;
    }

    @Override
    public List<Menu> queryUserMenus(Integer userId) {
        return permissionRepository.queryUserMenus(userId);
    }
    @Override
    public Set<String> queryUserButtons(Integer userId) {
        List<Button> btns = permissionRepository.queryUserButtons(userId);
        Set<String> btnStr = new HashSet<>();
        btns.forEach(btn -> {
            btnStr.add(btn.getButtonHash());
        });
        return btnStr;
    }
}
