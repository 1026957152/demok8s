package com.coalvalue.employee.repository;

import com.coalvalue.employee.domain.entity.Button;
import com.coalvalue.employee.domain.entity.Menu;
import com.coalvalue.employee.domain.entity.Permission;
import com.coalvalue.employee.domain.entity.ResourceGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface PermissionRepository extends JpaRepository<Permission, Integer> {

    @Query("SELECT distinct m FROM Menu m,MenuBtnGroup mbg,Permission p, UserRole ur, User u\n" +
            "where m.id = mbg.resourceId and mbg.resourceType='MENU'\n" +
            "and mbg.groupId = p.resGroupId and p.enableFlag is true\n" +
            "and p.roleId = ur.roleId\n" +
            "and ur.userId = u.id and u.id = :userId\n" +
            "order by m.parentId, m.menuSeq")
    public List<Menu> queryUserMenus(@Param("userId") Integer userId);

    @Query("SELECT distinct b FROM Button b,MenuBtnGroup mbg,Permission p, UserRole ur, User u\n" +
            "where b.id = mbg.resourceId and mbg.resourceType='BUTTON'\n" +
            "and mbg.groupId = p.resGroupId and p.enableFlag is true\n" +
            "and p.roleId = ur.roleId\n" +
            "and ur.userId = u.id and u.id = :userId\n" +
            "order by b.menuId, b.buttonSeq")
    public List<Button> queryUserButtons(@Param("userId") Integer userId);

    @Query("SELECT r FROM Permission p,ResourceGroup r WHERE p.resGroupId = r.id AND p.roleId = :roleId")
    public List<ResourceGroup> queryResourceGroupByRole(@Param("roleId") Integer roleId);

    @Modifying
    @Query("delete from Permission p where p.roleId = :roleId and p.resGroupId in :resGrpIds")
    public void removePermission(@Param("roleId") Integer roleId, @Param("resGrpIds") List<Integer> resGrpIds);

    @Modifying
    @Query("delete from Permission p where p.roleId = :roleId")
    public void removePermissionByRole(@Param("roleId") Integer roleId);

    @Modifying
    @Query("delete from Permission p where p.resGroupId = :resGroupId")
    public void removePermissionByResGrp(@Param("resGroupId") Integer resGroupId);

}
