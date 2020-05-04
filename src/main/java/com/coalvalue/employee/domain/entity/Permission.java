package com.coalvalue.employee.domain.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Entity
@Table(name = "permission")
public class Permission extends BaseDomain {

    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Column(name = "RES_GROUP_ID")
    private Integer resGroupId;

    @Column(name = "ENABLE_FLAG")
    private Boolean enableFlag;

    public Permission() {
    }

    public Permission(Integer roleId, Integer resGroupId, Boolean enableFlag) {
        this.roleId = roleId;
        this.resGroupId = resGroupId;
        this.enableFlag = enableFlag;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public Integer getResGroupId() {
        return resGroupId;
    }

    public Boolean getEnableFlag() {
        return enableFlag;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public void setResGroupId(Integer resGroupId) {
        this.resGroupId = resGroupId;
    }

    public void setEnableFlag(Boolean enableFlag) {
        this.enableFlag = enableFlag;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
