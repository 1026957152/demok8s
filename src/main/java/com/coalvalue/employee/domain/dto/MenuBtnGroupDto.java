package com.coalvalue.employee.domain.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Created by Peter Xu on 02/06/2015.
 */
public class MenuBtnGroupDto {

    private Integer resourceId;

    private String resourceType;

    private Integer groupId;

    public MenuBtnGroupDto(Integer groupId) {
        this.groupId = groupId;
    }

    public MenuBtnGroupDto(Integer resourceId, String resourceType, Integer groupId) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.groupId = groupId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
