package com.coalvalue.employee.repository;

import com.coalvalue.employee.domain.entity.Role;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.domain.entity.UserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

    @Modifying
    @Query("delete from UserRole ur where ur.roleId = :roleId")
    public void deleteUserRoleAssociation(@Param("roleId") Integer roleId);

    @Modifying
    @Query("delete from UserRole ur where ur.userId = :userId")
    public void deleteAllUserRoleAssociation(@Param("userId") Integer userId);

    @Modifying
    @Query("delete from UserRole ur where ur.roleId = :roleId and ur.userId = :userId")
    public void deleteUserRoleAssociation(@Param("roleId") Integer roleId, @Param("userId") Integer userId);

    @Query("select r from Role r, UserRole ur where r.id = ur.roleId and ur.userId = :userId")
    public List<Role> queryUserRoles(@Param("userId") Integer userId);

    @Query("select u from User u, UserRole ur where u.id = ur.userId and ur.roleId = :roleId")
    public Page<User> queryRoleUsers(@Param("roleId") Integer roleId, Pageable pageable);

    UserRole findByUserIdAndRoleId(Integer id, Integer id1);

    Optional<UserRole> findById(Integer userRoleId);

}
