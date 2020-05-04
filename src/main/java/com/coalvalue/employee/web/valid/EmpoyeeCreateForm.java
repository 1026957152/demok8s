package com.coalvalue.employee.web.valid;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.validation.constraints.NotNull;

/**
 * Created by silence on 2016/1/23.
 */
public class EmpoyeeCreateForm {






    private String phone;

    private String givenName;

    private String familyName;
    @NotNull
    private String userType;


    private String storageNo;
    private String nickName;
    private String password;
    private String createInvitedCode;
    private String note;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }



    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGivenName() {

        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }


    public String getStorageNo() {

        return storageNo;
    }

    public void setStorageNo(String storageNo) {
        this.storageNo = storageNo;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreateInvitedCode(String createInvitedCode) {
        this.createInvitedCode = createInvitedCode;
    }

    public String getCreateInvitedCode() {
        return createInvitedCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
