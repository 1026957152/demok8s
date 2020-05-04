package com.coalvalue.employee.service;


import com.coalvalue.employee.domain.entity.Menu;
import com.coalvalue.employee.domain.entity.MenuNode;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Peter Xu on 01/17/2015.
 */
public interface PermissionService extends BaseService {


    public Set<String> queryUserRoles(Integer userId);

    Set<String> queryEmployeeRoles(String userId);

    public Map queryResourceGroupByRole(Integer roleId);

    public void assignRolePermission(Integer roleId, String resGrpIds);

    MenuNode queryHierarchyUserMenus(Integer userId);

    List<Menu> queryUserMenus(Integer userId);

    Set<String> queryUserButtons(Integer userId);
}
