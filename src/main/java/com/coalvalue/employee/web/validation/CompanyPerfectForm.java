package com.coalvalue.employee.web.validation;

import com.coalvalue.employee.configuration.CommonConstant;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Transient;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Peter Xu on 06/30/2015.
 */

public class CompanyPerfectForm  {


    private MultipartFile logoImageData;
    private MultipartFile backgroundFileDate;

    public MultipartFile getLogoImageData() {
        return logoImageData;
    }

    public void setLogoImageData(MultipartFile logoImageData) {
        this.logoImageData = logoImageData;
    }

    public MultipartFile getBackgroundFileDate() {
        return backgroundFileDate;
    }

    public void setBackgroundFileDate(MultipartFile backgroundFileDate) {
        this.backgroundFileDate = backgroundFileDate;
    }

    private String companyName;

    private String companyType;

    private String logoImage;

    private String phoneNumber;

    private String faxNumber;

    private String websiteUrl;

    private String country;

    private String city;

    private String location;

    private Integer districtId;

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    private String line1;



    private String province;

    private String prefecture;

    private String county;

    private String township;

    private String zip;







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


    private Date applyVerificationTime;

    private Date approvedTime;

    private String status;

    private boolean open;

    private boolean brand;


    private String thumbnailImage;
    private String smallImage;

    private boolean isVerified;

    private String companyNo;

    private String abbreviationName;

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
            return companyName;
        }

    }

    public void setAbbreviationName(String abbreviationName) {
        this.abbreviationName = abbreviationName;
    }


    public CompanyPerfectForm(String companyName, String companyLocation) {
        super();
        this.companyName = companyName;
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
        if(smallImage == null)
            return defaultUrl;
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }



    private String certifiedBrand;
    private Date certifiedDate;


    private String defaultUrl = "css/defaultUrl.jpg";


    public String getDefaultUrl() {
        return defaultUrl;
    }

    public boolean isCertifiedBrand() {
        return CommonConstant.COMPANY_VERIFICATION_BRAND.equals(certifiedBrand);
    }



    public void setCertifiedBrand(boolean certifiedBrand) {
        if(certifiedBrand) {
            this.certifiedBrand = CommonConstant.COMPANY_VERIFICATION_BRAND;
        }else {
            this.certifiedBrand = null;
        }

    }

    public Date getCertifiedDate() {
        return certifiedDate;
    }

    public void setCertifiedDate(Date certifiedDate) {
        this.certifiedDate = certifiedDate;
    }

    public CompanyPerfectForm() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyType() {
        return companyType;
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

    public String getCompanyShortDesc() {

        if(getCompanyDesc() == null){
            return  "";
        }
        return     getCompanyDesc().length() > CommonConstant.STRING_COMPANY_SHORT_DESC_LENGTH ? getCompanyDesc().substring(0, CommonConstant.STRING_COMPANY_SHORT_DESC_LENGTH) +"......" :getCompanyDesc();

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

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
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

    private Set<String> uneditable = new HashSet<String>()
    {{
            this.add("companyName");
            this.add("companyType");
            this.add("logoImage");
            this.add("operatingPeriod");
            this.add("businessLicense");
            this.add("legalRepresentative");
            this.add("taxAccount");
            this.add("taxPeriod");
            this.add("coalLicense");
            this.add("coalLicensePeriod");
        }};

    public Set<String> getUneditable(){
        if(this.status != CommonConstant.COMPANY_PARTIALAPPLICATION){
            return uneditable;
        }
        return new HashSet<String>();
    }

    public void changeStatus(String newStauts, String comment){
        String oldStatus = this.getStatus();


    }


    @Transient
    public boolean isCertified(){

        if(status != null) {
          return   status.equals(CommonConstant.COMPANY_APPROVED);

        }
        return  false;
    }




    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }

    public String getCompanyNo() {
        return companyNo;
    }




}
