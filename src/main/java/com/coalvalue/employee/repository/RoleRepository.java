package com.coalvalue.employee.repository;


import com.coalvalue.employee.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface RoleRepository extends JpaSpecificationExecutor<Role>, JpaRepository<Role, Integer> {

    Optional<Role> findById(Integer roleId);
}
