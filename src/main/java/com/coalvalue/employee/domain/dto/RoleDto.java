package com.coalvalue.employee.domain.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Created by Peter Xu on 02/01/2015.
 */
public class RoleDto {

    private String roleName;

    private String roleDesc;
    private Integer userId;

    public RoleDto() {
    }

    public RoleDto(String roleName, String roleDesc) {
        this.roleName = roleName;
        this.roleDesc = roleDesc;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }
}
