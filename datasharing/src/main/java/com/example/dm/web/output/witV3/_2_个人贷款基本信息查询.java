package com.example.dm.web.output.witV3;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//import io.swagger.annotations.ApiModel;


//@ApiModel("个人贷款基本信息查询_________________________")
//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class _2_个人贷款基本信息查询 {

    @ApiModelProperty(value="DKZH_贷款账号",name="DKZH",example="",position=0)
    @JsonProperty("DKZH")
    @JSONField(name="DKZH")
    private String DKZH_贷款账号;

    @ApiModelProperty(value="JKRXM_借款人姓名",name="JKRXM",example="",position=0)
    @JsonProperty("JKRXM")
    @JSONField(name="JKRXM")
    private String JKRXM_借款人姓名;


    @ApiModelProperty(value="JKHTBH_借款合同编号",name="JKHTBH",example="",position=0)
    @JsonProperty("JKHTBH")
    @JSONField(name="JKHTBH")
    private String JKHTBH_借款合同编号;


    @ApiModelProperty(value="DKFFE_贷款发放额",name="DKFFE",example="",position=0)
    @JsonProperty("DKFFE")
    @JSONField(name="DKFFE")
    private String DKFFE_贷款发放额;


    @ApiModelProperty(value="DKYE_贷款余额",name="DKYE",example="",position=0)
    @JsonProperty("DKYE")
    @JSONField(name="DKYE")
    private String DKYE_贷款余额;


    @ApiModelProperty(value="DKLL_贷款利率",name="DKLL",example="",position=0)
    @JsonProperty("DKLL")
    @JSONField(name="DKLL")
    private String DKLL_贷款利率;


    @ApiModelProperty(value="DKHKFS_贷款还款方式:  1等额本息, 2等额本金,3等本等息,4利随本清",name="DKHKFS",example="",position=0)
    @JsonProperty("DKHKFS")
    @JSONField(name="DKHKFS")
    private String DKHKFS_贷款还款方式;


    @ApiModelProperty(value="ZJHM_证件号码",name="ZJHM",example="",position=0)
    @JsonProperty("ZJHM")
    @JSONField(name="ZJHM")
    private String ZJHM_证件号码;


    @ApiModelProperty(value="DKZT_贷款状态",name="DKZT",example="",position=0)
    @JsonProperty("DKZT")
    @JSONField(name="DKZT")
    private String DKZT_贷款状态;


    @ApiModelProperty(value="DKFFSJ_贷款发放时间",name="DKZT",example="",position=0)
    @JsonProperty("DKFFSJ")
    @JSONField(name="DKFFSJ")
    private String DKFFSJ_贷款发放时间;


    public void setDKZT_贷款状态(String dkzt_贷款状态) {
        this.DKZT_贷款状态 = dkzt_贷款状态;
    }

    public String getDKZT_贷款状态() {
        return DKZT_贷款状态;
    }

    public void setDKFFSJ_贷款发放时间(String dkffsj_贷款发放时间) {
        this.DKFFSJ_贷款发放时间 = dkffsj_贷款发放时间;
    }

    public String getDKFFSJ_贷款发放时间() {
        return DKFFSJ_贷款发放时间;
    }

    public String getDKZH_贷款账号() {
        return DKZH_贷款账号;
    }

    public void setDKZH_贷款账号(String DKZH_贷款账号) {
        this.DKZH_贷款账号 = DKZH_贷款账号;
    }

    public String getJKRXM_借款人姓名() {
        return JKRXM_借款人姓名;
    }

    public void setJKRXM_借款人姓名(String JKRXM_借款人姓名) {
        this.JKRXM_借款人姓名 = JKRXM_借款人姓名;
    }

    public String getJKHTBH_借款合同编号() {
        return JKHTBH_借款合同编号;
    }

    public void setJKHTBH_借款合同编号(String JKHTBH_借款合同编号) {
        this.JKHTBH_借款合同编号 = JKHTBH_借款合同编号;
    }

    public String getDKFFE_贷款发放额() {
        return DKFFE_贷款发放额;
    }

    public void setDKFFE_贷款发放额(String DKFFE_贷款发放额) {
        this.DKFFE_贷款发放额 = DKFFE_贷款发放额;
    }

    public String getDKYE_贷款余额() {
        return DKYE_贷款余额;
    }

    public void setDKYE_贷款余额(String DKYE_贷款余额) {
        this.DKYE_贷款余额 = DKYE_贷款余额;
    }

    public String getDKLL_贷款利率() {
        return DKLL_贷款利率;
    }

    public void setDKLL_贷款利率(String DKLL_贷款利率) {
        this.DKLL_贷款利率 = DKLL_贷款利率;
    }

    public String getDKHKFS_贷款还款方式() {
        return DKHKFS_贷款还款方式;
    }

    public void setDKHKFS_贷款还款方式(String DKHKFS_贷款还款方式) {
        this.DKHKFS_贷款还款方式 = DKHKFS_贷款还款方式;
    }

    public String getZJHM_证件号码() {
        return ZJHM_证件号码;
    }

    public void setZJHM_证件号码(String ZJHM_证件号码) {
        this.ZJHM_证件号码 = ZJHM_证件号码;
    }
}