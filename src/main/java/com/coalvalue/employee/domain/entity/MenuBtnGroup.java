package com.coalvalue.employee.domain.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Entity
@Table(name = "menu_btn_group")
public class MenuBtnGroup extends BaseDomain {

    @Column(name = "RESOURCE_ID")
    private Integer resourceId;

    @Column(name = "RESOURCE_TYPE")
    private String resourceType;

    @Column(name = "GROUP_ID")
    private Integer groupId;

    public MenuBtnGroup() {
    }

    public MenuBtnGroup(Integer resourceId, String resourceType, Integer groupId) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.groupId = groupId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
