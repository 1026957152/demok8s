package com.coalvalue.employee.domain.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Created by Peter Xu on 02/01/2015.
 */
public class ResourceGroupDto {

    private String groupName;

    private String groupDesc;

    public ResourceGroupDto() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
