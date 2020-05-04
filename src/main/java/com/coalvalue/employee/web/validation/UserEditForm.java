package com.coalvalue.employee.web.validation;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Created by silence on 2016/1/23.
 */

public class UserEditForm {


 //   @NotEmpty
   // @NotBlank(message = "First name blank")

    private String familyName;
    private String givenName;
    private String nickName;
    private String gender;




    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
