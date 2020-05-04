package com.coalvalue.employee.domain.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Created by yuan zhao  on 11/13/2015.
 */
@Entity
@Table(name = "bussiness")
public class Bussiness extends BaseDomain {


    @Column(name = "name")
    private String name;


    @Column(name = "company_id")
    private String companyId;
    @Column(name = "status")
    private String status;


    @Column(name = "primary_main")
    private Boolean primary;

    public Bussiness() {
    }


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }
}
