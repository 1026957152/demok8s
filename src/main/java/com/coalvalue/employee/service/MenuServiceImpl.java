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
@Service("menuService")
@Transactional(readOnly = true)
public class MenuServiceImpl extends BaseServiceImpl implements MenuService {

    @Autowired
    private PermissionRepository permissionRepository;



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
