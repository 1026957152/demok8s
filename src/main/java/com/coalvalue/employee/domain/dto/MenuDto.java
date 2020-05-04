package com.coalvalue.employee.domain.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Created by Peter Xu on 02/01/2015.
 */
public class MenuDto {

    private Integer parentId;

    public MenuDto() {

    }

    public MenuDto(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
