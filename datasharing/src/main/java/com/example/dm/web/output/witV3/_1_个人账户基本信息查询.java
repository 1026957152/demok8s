package com.example.dm.web.output.witV3;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//import io.swagger.annotations.ApiModel;

//@ApiModel("个人账户基本信息查询")
//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class _1_个人账户基本信息查询 {


    @ApiModelProperty(value="XingMing_姓名",name="xing_ming",example="",position=1)
    @JsonProperty("xing_ming")
    @JSONField(name="xing_ming")
    private String XingMing_姓名;

    @ApiModelProperty(value="XingBie_性别",name="XingBie",example="",position=1)
    @JsonProperty("xing_bie")
    @JSONField(name="xing_bie")
    private String XingBie_性别;


    @ApiModelProperty(value="SJHM_手机号码",name="sjhm",example="",position=1)
    @JsonProperty("sjhm")
    @JSONField(name="sjhm")
    private String SJHM_手机号码;


    @ApiModelProperty(value="ZJLX_证件类型",name="zjlx",example="",position=1)
    @JsonProperty("zjlx")
    @JSONField(name="zjlx")
    private String ZJLX_证件类型;


    @ApiModelProperty(value="ZJHM_证件号码",name="zjhm",example="",position=1)
    @JsonProperty("zjhm")
    @JSONField(name="zjhm")
    private String ZJHM_证件号码;


    @ApiModelProperty(value="CSNY_出生年月",name="csny",example="",position=1)
    @JsonProperty("csny")
    @JSONField(name="csny")
    private String CSNY_出生年月;

    @ApiModelProperty(value="GRZH_个人账号",name="grzh",example="",position=1)
    @JsonProperty("grzh")
    @JSONField(name="grzh")
    private String GRZH_个人账号;


    @ApiModelProperty(value="GRZHZT_个人账户状态  0 正常 1 封存 9 销户 7 未知 ",name="grzhzt",example="",position=1)
    @JsonProperty("grzhzt")
    @JSONField(name="grzhzt")
    private String GRZHZT_个人账户状态;

    @ApiModelProperty(value="GRZHYE_个人账户余额",name="grzhye",example="",position=1)
    @JsonProperty("grzhye")
    @JSONField(name="grzhye")
    private String GRZHYE_个人账户余额;

    @ApiModelProperty(value="ZHHJY_最后汇缴月",name="zhhjy",example="",position=1)
    @JsonProperty("zhhjy")
    @JSONField(name="zhhjy")
    private String ZHHJY_最后汇缴月;

    @ApiModelProperty(value="SCTQR_上次提取日",name="sctqr",example="",position=1)

    @JsonProperty("sctqr")
    @JSONField(name="sctqr")
    private String SCTQR_上次提取日;

    @ApiModelProperty(value="DWMC_单位名称",name="dwmc",example="",position=1)

    @JsonProperty("dwmc")
    @JSONField(name="dwmc")
    private String DWMC_单位名称;

    @ApiModelProperty(value="DWZH_单位账号",name="dwzh",example="",position=1)

    @JsonProperty("dwzh")
    @JSONField(name="dwzh")
    private String DWZH_单位账号;

    public String getXingMing_姓名() {
        return XingMing_姓名;
    }

    public void setXingMing_姓名(String xingMing_姓名) {
        XingMing_姓名 = xingMing_姓名;
    }

    public String getXingBie_性别() {
        return XingBie_性别;
    }

    public void setXingBie_性别(String xingBie_性别) {
        XingBie_性别 = xingBie_性别;
    }

    public String getSJHM_手机号码() {
        return SJHM_手机号码;
    }

    public void setSJHM_手机号码(String SJHM_手机号码) {
        this.SJHM_手机号码 = SJHM_手机号码;
    }

    public String getZJLX_证件类型() {
        return ZJLX_证件类型;
    }

    public void setZJLX_证件类型(String ZJLX_证件类型) {
        this.ZJLX_证件类型 = ZJLX_证件类型;
    }

    public String getZJHM_证件号码() {
        return ZJHM_证件号码;
    }

    public void setZJHM_证件号码(String ZJHM_证件号码) {
        this.ZJHM_证件号码 = ZJHM_证件号码;
    }

    public String getCSNY_出生年月() {
        return CSNY_出生年月;
    }

    public void setCSNY_出生年月(String CSNY_出生年月) {
        this.CSNY_出生年月 = CSNY_出生年月;
    }

    public String getGRZH_个人账号() {
        return GRZH_个人账号;
    }

    public void setGRZH_个人账号(String GRZH_个人账号) {
        this.GRZH_个人账号 = GRZH_个人账号;
    }

    public String getGRZHZT_个人账户状态() {
        return GRZHZT_个人账户状态;
    }

    public void setGRZHZT_个人账户状态(String GRZHZT_个人账户状态) {
        this.GRZHZT_个人账户状态 = GRZHZT_个人账户状态;
    }

    public String getGRZHYE_个人账户余额() {
        return GRZHYE_个人账户余额;
    }

    public void setGRZHYE_个人账户余额(String GRZHYE_个人账户余额) {
        this.GRZHYE_个人账户余额 = GRZHYE_个人账户余额;
    }

    public String getZHHJY_最后汇缴月() {
        return ZHHJY_最后汇缴月;
    }

    public void setZHHJY_最后汇缴月(String ZHHJY_最后汇缴月) {
        this.ZHHJY_最后汇缴月 = ZHHJY_最后汇缴月;
    }

    public String getSCTQR_上次提取日() {
        return SCTQR_上次提取日;
    }

    public void setSCTQR_上次提取日(String SCTQR_上次提取日) {
        this.SCTQR_上次提取日 = SCTQR_上次提取日;
    }

    public String getDWMC_单位名称() {
        return DWMC_单位名称;
    }

    public void setDWMC_单位名称(String DWMC_单位名称) {
        this.DWMC_单位名称 = DWMC_单位名称;
    }

    public String getDWZH_单位账号() {
        return DWZH_单位账号;
    }

    public void setDWZH_单位账号(String DWZH_单位账号) {
        this.DWZH_单位账号 = DWZH_单位账号;
    }
}