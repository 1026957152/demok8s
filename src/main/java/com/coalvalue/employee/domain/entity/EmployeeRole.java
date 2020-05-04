package com.coalvalue.employee.domain.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Entity
@Table(name = "employee_role")
public class EmployeeRole extends BaseDomain {

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "ROLE_ID")
    private Integer roleId;

    public EmployeeRole() {
    }

    public EmployeeRole(String userId, Integer roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
