package com.coalvalue.employee.domain.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Entity
@Table(name = "resource_group")
public class ResourceGroup extends BaseDomain {

    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "GROUP_DESC")
    private String groupDesc;

    public ResourceGroup() {
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
