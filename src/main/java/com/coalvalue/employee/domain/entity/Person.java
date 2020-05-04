package com.coalvalue.employee.domain.entity;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED )
@Table(name = "person")
public class Person extends BaseDomain {


    private String companyNo;

    @NotNull
    private String userNo;

    @NotNull
    @Column(name = "NICK_NAME")
    private String nickName;

    @Size(max=10)
    @Column(name = "GENDER")
    private String gender;

    @Column(name = "PERSON_IMAGE")
    private String personImage;

    @Column(name = "COMPANY_ID")
    private Integer companyId;



    @Size(max=45)
    @Column(name = "REAL_NAME")
    private String realName;

    @Size(max=45)
    @Column(name = "Given_NAME")
    private String givenName;

    @Size(max=45)
    @Column(name = "Family_NAME")
    private String familyName;


    @Column(name = "ID_NO")
    private Integer idNo;

    @Column(name = "ID_EXPIRE_DATE")
    private Date idExpireDate;

    @Column(name = "IDENTITY_LEVEL")
    private Integer identityLevel;

    @Column(name = "IDENTITY_METHOD")
    private String identityMethod;

    @Column(name = "IDENTITY_DATE")
    private Date identityDate;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;


    @Size(max=50)
    @Column(name = "DEPARTMENT")
    private String department;

    @Size(max=50)
    @Column(name = "POSITION")
    private String position;



    @Size(max=200)
    @Column(name = "NOTE")
    private String note;

    @Column(name = "thumb_PERSON_IMAGE")
    private String thumbPersonImage;
    private String emailAddress;


    @NotNull
    private String userId;


    public Boolean getOvert() {
        return isOvert;
    }

    public void setOvert(Boolean ovvert) {
        this.isOvert = ovvert;
    }

    @Column(name = "is_overt")
    private Boolean isOvert;


    public Person() {
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


    public String getNickName() {
        return nickName;
    }

    public String getGender() {
        return gender;
    }

    public String getPersonImage() {
        return personImage;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public String getRealName() {
        return realName;
    }

    public Integer getIdNo() {
        return idNo;
    }

    public Date getIdExpireDate() {
        return idExpireDate;
    }

    public Integer getIdentityLevel() {
        return identityLevel;
    }

    public String getIdentityMethod() {
        return identityMethod;
    }

    public Date getIdentityDate() {
        return identityDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }



    public String getNote() {
        return note;
    }



    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPersonImage(String personImage) {
        this.personImage = personImage;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setIdNo(Integer idNo) {
        this.idNo = idNo;
    }

    public void setIdExpireDate(Date idExpireDate) {
        this.idExpireDate = idExpireDate;
    }

    public void setIdentityLevel(Integer identityLevel) {
        this.identityLevel = identityLevel;
    }

    public void setIdentityMethod(String identityMethod) {
        this.identityMethod = identityMethod;
    }

    public void setIdentityDate(Date identityDate) {
        this.identityDate = identityDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public void setNote(String note) {
        this.note = note;
    }




    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }


    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }

    public String getCompanyNo() {
        return companyNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
