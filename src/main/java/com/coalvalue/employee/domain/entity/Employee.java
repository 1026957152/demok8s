package com.coalvalue.employee.domain.entity;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by yuan zhao  on 08/10/2015.
 */

@Entity

@Table(name = "employee")

public class Employee extends BaseDomain {


    //@NotNull
    private String userNo;

    //@NotNull
    private String userId;

    @NotNull
    private String companyNo;

    @NotNull
    private String mobile;

    @NotNull
    private String no;
    @NotNull
    private String name;


    @NotNull
    private String companyId;
    private String note;
    @NotNull
    private String seq;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }





    @NotNull
    @Column(name = "status")
    private String status;


    @Column(name = "type")
    private String type;


    public Employee() {
    }





    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return seq;
    }
}
