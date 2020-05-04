package com.coalvalue.employee.repository;


import com.coalvalue.employee.domain.entity.Employee;
import com.coalvalue.employee.domain.entity.EmployeeRole;
import com.coalvalue.employee.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface EmployeeRoleRepository extends JpaRepository<EmployeeRole, Integer> {


    Employee findByUserIdAndRoleId(String userId, Integer roleId);

    List<EmployeeRole> findByUserId(String userId);
    @Query("select r from Role r, EmployeeRole ur where r.id = ur.roleId and ur.userId = :userId")
    public List<Role> queryUserRoles(@Param("userId") String userId);


}
