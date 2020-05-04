package com.coalvalue.employee.domain.entity;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yuan zhao  on 08/10/2015.
 */

@Entity

@Table(name = "preforence")

public class Preference extends BaseDomain {






    private String storageNo;

    private String userId;
    private String employeeId;
    private String defaultPreferenceStorageHistoryId;
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Preference() {

    }

    public String getDefaultPreferenceStorageHistoryId() {
        return defaultPreferenceStorageHistoryId;
    }

    public void setDefaultPreferenceStorageHistoryId(String defaultPreferenceStorageHistoryId) {
        this.defaultPreferenceStorageHistoryId = defaultPreferenceStorageHistoryId;
    }

    public String getStorageNo() {
        return storageNo;
    }

    public void setStorageNo(String storageNo) {
        this.storageNo = storageNo;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }


    ;
}
