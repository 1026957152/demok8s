package com.coalvalue.employee.domain.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yuan zhao  on 10/19/2015.
 */
@Entity
@Table(name = "user_update")
public class UserUpdate extends BaseDomain {

  //  @Column(name = "update_id")
   // private Integer updateId;


    @Column(name = "note")
    private String note;

    @Column(name = "user_id")
    private Integer userId;


    @Column(name = "status")
    private String status;

    @Column(name = "source")
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserUpdate() {
    }


    public String getNote() {
        return note;
    }


    public void setNote(String note) {
        this.note = note;
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
