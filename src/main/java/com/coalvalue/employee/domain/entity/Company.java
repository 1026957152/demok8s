package com.coalvalue.employee.domain.entity;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Peter Xu on 06/30/2015.
 */
@Entity
@Table(name = "company")
public class Company extends BaseDomain {

    private String zipcode;
    private String unifiedSocialCreditCode;

    public String getAllowedThing() {
        return allowedThing;
    }

    public void setAllowedThing(String allowedThing) {
        this.allowedThing = allowedThing;
    }

    @Column(name = "COMPANY_NAME")
    private String name;

    @Column(name = "COMPANY_TYPE")
    private String type;

    @Column(name = "LOGO_IMAGE")
    private String logoImage;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "FAX_NUMBER")
    private String faxNumber;

    @Column(name = "WEBSITE_URL")
    private String websiteUrl;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "district_id")
    private Integer districtId;
    private String businessStatus;

    @Column(name = "be_allowed")
    private String allowedThing;


    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }


    @Column(name = "company_address_id")
    private Integer companyAddressId;

    public Integer getCompanyAddressId() {
        return companyAddressId;
    }

    public void setCompanyAddressId(Integer companyAddressId) {
        this.companyAddressId = companyAddressId;
    }

    @Column(name = "COMPANY_DESC")
    private String companyDesc;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "BACKGROUND_FILE")
    private String backgroundFile;

    @Column(name = "MAIN_BUSINESS")
    private String mainBusiness;

    @Column(name = "ORG_CODE_CERTIFICATION")
    private String orgCodeCertification;

    @Column(name = "ORG_CODE")
    private String orgCode;

    @Column(name = "operating_period")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date operatingPeriod;

    @Column(name = "Business_license")
    private String businessLicense;

    @Column(name = "legal_representative")
    private String legalRepresentative;

    @Column(name = "Tax_account")
    private String taxAccount;

    @Column(name = "tax_period")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date taxPeriod;

    @Column(name = "coal_license")
    private String coalLicense;

    @Column(name = "coal_license_period")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date coalLicensePeriod;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_branch")
    private String bankBranch;

    @Column(name = "bank_account")
    private String bankAccount;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "apply_verification_time")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date applyVerificationTime;

    @Column(name = "approved_time")
    private Date approvedTime;

    @Column(name = "status")
    private String status;

    @Column(name = "public")
    private boolean open;

    @Column(name = "brand")
    private boolean brand;


    @Column(name = "thumbnail_image")
    private String thumbnailImage;
    @Column(name = "small_image")
    private String smallImage;



    @Column(name = "companyNo")
    private String no;

    @Column(name = "abbreviation_name")
    private String abbreviationName;

    @Column(name = "operational_product")
    private String operationalProduct;

    public String getOperationalProduct() {
        return operationalProduct;
    }

    public void setOperationalProduct(String operationalProduct) {
        this.operationalProduct = operationalProduct;
    }

    public String getAbbreviationName() {

        if(abbreviationName!=null){
            return abbreviationName;
        }else {
            return name;
        }

    }

    public void setAbbreviationName(String abbreviationName) {
        this.abbreviationName = abbreviationName;
    }



    public Company(String name, String companyLocation) {
        super();
        this.name = name;
        this.location = companyLocation;

    }


    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }


    public boolean isBrand() {
        return brand;
    }

    public void setBrand(boolean brand) {
        this.brand = brand;
    }

/*    public String getCertifiedBrand() {
        return certifiedBrand;
    }*/

    public String getSmallImage() {

        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }






    public Company() {
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLogoImage() {
        return logoImage;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getUrl() {
        return websiteUrl;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getLocation() {
        return location;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }



    public String getComment() {
        return comment;
    }

    public String getBackgroundFile() {
        return backgroundFile;
    }

    public String getMainBusiness() {
        return mainBusiness;
    }

    public String getOrgCodeCertification() {
        return orgCodeCertification;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public Date getOperatingPeriod() {
        return operatingPeriod;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public String getTaxAccount() {
        return taxAccount;
    }

    public Date getTaxPeriod() {
        return taxPeriod;
    }

    public String getCoalLicense() {
        return coalLicense;
    }

    public Date getCoalLicensePeriod() {
        return coalLicensePeriod;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public String getAccountName() {
        return accountName;
    }

    public Date getApplyVerificationTime() {
        return applyVerificationTime;
    }

    public Date getApprovedTime() {
        return approvedTime;
    }

    public String getStatus() {
        return status;
    }

    public boolean isOpen() {
        return open;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public void setUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setBackgroundFile(String backgroundFile) {
        this.backgroundFile = backgroundFile;
    }

    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness;
    }

    public void setOrgCodeCertification(String orgCodeCertification) {
        this.orgCodeCertification = orgCodeCertification;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setOperatingPeriod(Date operatingPeriod) {
        this.operatingPeriod = operatingPeriod;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public void setTaxAccount(String taxAccount) {
        this.taxAccount = taxAccount;
    }

    public void setTaxPeriod(Date taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    public void setCoalLicense(String coalLicense) {
        this.coalLicense = coalLicense;
    }

    public void setCoalLicensePeriod(Date coalLicensePeriod) {
        this.coalLicensePeriod = coalLicensePeriod;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setApplyVerificationTime(Date applyVerificationTime) {
        this.applyVerificationTime = applyVerificationTime;
    }

    public void setApprovedTime(Date approvedTime) {
        this.approvedTime = approvedTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOpen(boolean isPublic) {
        this.open = isPublic;
    }




    public void changeStatus(String newStauts, String comment){
        String oldStatus = this.getStatus();


    }




    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }



 /*   @Column(name = "verified")
    private boolean verified;

    public boolean isVerified() {
        return verified;
    }
    public boolean getVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }*/

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return no;
    }



    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getUnifiedSocialCreditCode() {
        return unifiedSocialCreditCode;
    }

    public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode;
    }
}
