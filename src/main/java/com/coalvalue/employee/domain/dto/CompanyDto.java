package com.coalvalue.employee.domain.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

/**
 * Created by zohu on 3/15/2015.
 */
public class CompanyDto {

    private String companyName;

    private String companyType;

    private String logoImage;

    private String phoneNumber;

    private String faxNumber;

    private String websiteUrl;

    private String country;

    private String city;

    private String location;

    private String companyDesc;

    private String comment;

    private String backgroundFile;

    private String mainBusiness;

    private String orgCodeCertification;

    private String orgCode;

    private Date operatingPeriod;

    private String businessLicense;

    private String legalRepresentative;

    private String taxAccount;

    private Date taxPeriod;

    private String coalLicense;

    private Date coalLicensePeriod;

    private String bankName;

    private String bankBranch;

    private String bankAccount;

    private String accountName;

    private String isPublic;

    private String status;
    private Integer id;
    private List<String> companyTypes;


    public CompanyDto() {
    }


    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBackgroundFile() {
        return backgroundFile;
    }

    public void setBackgroundFile(String backgroundFile) {
        this.backgroundFile = backgroundFile;
    }

    public String getMainBusiness() {
        return mainBusiness;
    }

    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness;
    }

    public String getOrgCodeCertification() {
        return orgCodeCertification;
    }

    public void setOrgCodeCertification(String orgCodeCertification) {
        this.orgCodeCertification = orgCodeCertification;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public Date getOperatingPeriod() {
        return operatingPeriod;
    }

    public void setOperatingPeriod(Date operatingPeriod) {
        this.operatingPeriod = operatingPeriod;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getTaxAccount() {
        return taxAccount;
    }

    public void setTaxAccount(String taxAccount) {
        this.taxAccount = taxAccount;
    }

    public Date getTaxPeriod() {
        return taxPeriod;
    }

    public void setTaxPeriod(Date taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    public String getCoalLicense() {
        return coalLicense;
    }

    public void setCoalLicense(String coalLicense) {
        this.coalLicense = coalLicense;
    }

    public Date getCoalLicensePeriod() {
        return coalLicensePeriod;
    }

    public void setCoalLicensePeriod(Date coalLicensePeriod) {
        this.coalLicensePeriod = coalLicensePeriod;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public void setStatus(String status) {
        this.status = status;

    }

    public String getStatus() {
        return status;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getCompanyTypes() {
        return companyTypes;
    }

    public void setCompanyTypes(List<String> companyTypes) {
        this.companyTypes = companyTypes;
    }
}
