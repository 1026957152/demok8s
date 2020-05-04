package com.coalvalue.employee.domain.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Created by zohu on 2/1/2015.
 */
public class UserDto {

    private String userName;

    private String password;

    private String userType;

    private String emailAddress;

    private String status;

    public UserDto(){}

    public UserDto(String userName, String password, String userType,
                   String emailAddress, String status) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.emailAddress = emailAddress;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
