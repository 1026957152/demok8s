package com.coalvalue.employee.service;


import com.coalvalue.employee.domain.ListItem;
import com.coalvalue.employee.domain.OperationResult;
import com.coalvalue.employee.domain.dto.RoleDto;
import com.coalvalue.employee.domain.entity.*;
import com.coalvalue.employee.enumType.BuessinessEnum;
import com.coalvalue.employee.enumType.UserTypeEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface RoleService extends BaseService {

    public Role queryRoleById(Integer roleId);

    /**
     * Query roles table
     * @param roleDto
     * @param pageable
     * @return
     */
    public Page<Role> queryRoles(RoleDto roleDto, Pageable pageable);

    public Role createRole(Role role);

    public Role updateRole(Role role);

    /**
     * Delete role, also userRole association
     * @param roleId
     */
    public void deleteRole(Integer roleId);

    /**
     * Query users under a specific role
     * @param roleId
     * @param pageable
     * @return
     */
    public Page<User> queryRoleUsers(Integer roleId, Pageable pageable);

    /**
     * Add user to a specific role
     * @param user
     * @param userRole
     */
    public void addRegisterUserRole(User user, UserTypeEnum userRole);

    public void addCompanyUserRole(User user, String userRole);

    void addCompanyUserType(User user, UserTypeEnum userRole);

    /**
     * Remove user from a specific role
     * @param user
     * @param role
     */
    public void removeUserFromRole(User user, Role role);

    /**
     * Query all role for a specific user
     * @param userId
     * @return
     */
    public List<Role> queryUserRoles(Integer userId);

    public List<Map> queryUserRolesMap(Integer userId);


    List<Map> queryEmployeeRolesMap(String userId);

    void addAdminUserRole(User user, String userRole);

    void addQualityInspectionRole(User user);
/*

    List<Role> queryAllRoles(Company company);
*/


    OperationResult addCompanyUserRole(User user, Integer roleId);


    OperationResult addCompanyUserRole(User user, Role role);

    OperationResult deleteCompanyUserRole(User user, Integer id);

    OperationResult deleteUserRole(User user, Integer userRoleRegisteredUser);

    UserRole getUserRoleById(Integer roleId);

    void addRegisterUserRole(BuessinessEnum buessinessEnum, Company company, User user);

    List<ListItem> getRolesForBussiness(Company company);


    OperationResult addRegisterEmployeeRole(UserTypeEnum userType, Employee user);
}
