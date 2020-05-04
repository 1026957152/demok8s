package com.coalvalue.employee.repository;

import com.coalvalue.employee.domain.entity.MenuBtnGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Peter Xu on 01/10/2015.
 */
public interface MenuBtnGroupRepository extends JpaSpecificationExecutor<MenuBtnGroup>, JpaRepository<MenuBtnGroup, Integer> {

    @Modifying
    @Query("delete from MenuBtnGroup p where p.groupId = :groupId")
    public void removeMenuBtnGrpByResGrp(@Param("groupId") Integer groupId);

}
