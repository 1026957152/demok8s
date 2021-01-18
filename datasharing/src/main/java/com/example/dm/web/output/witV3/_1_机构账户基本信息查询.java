package com.example.dm.web.output.witV3;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
//import io.swagger.annotations.ApiModel;

//@ApiModel("个人账户基本信息查询")
//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class _1_机构账户基本信息查询 {



    @ApiModelProperty(value="unitaccname_单位名称",name="unitaccname",example="",position=1)
    @JsonProperty("unitaccname")
    @JSONField(name="unitaccname")
    private String unitaccname单位名称;


    @ApiModelProperty(value="orgcode_组织机构代码",name="orgcode",example="",position=1)
    @JsonProperty("orgcode")
    @JSONField(name="orgcode")
    private String orgcode_组织机构代码;

    @ApiModelProperty(value="unitkind_单位性质  a国家机关 b全额拨款事业单位 c差额拨款事业单位 d自收自支事业单位 e参公管理事业单位 g企业管理事业单位 h民办非企业单位 i国有企业 j民营企业 k外资企业 l股份有限公司 m城镇集体企业 n城镇私营企业 z其他 o军队",name="unitkind",example="",position=1)
    @JsonProperty("unitkind")
    @JSONField(name="unitkind")
    private String unitkind_单位性质;




    @ApiModelProperty(value="unitaddr_单位地址",name="unitaddr",example="",position=1)
    @JsonProperty("unitaddr")
    @JSONField(name="unitaddr")
    private String unitaddr_单位地址;


    @ApiModelProperty(value="leglaccname_单位法人代表",name="leglaccname",example="",position=1)
    @JsonProperty("leglaccname")
    @JSONField(name="leglaccname")
    private String leglaccname_单位法人代表;


    @ApiModelProperty(value="leglcertitype_法人代表证件类型",name="leglcertitype",example="",position=1)
    @JsonProperty("leglcertitype")
    @JSONField(name="leglcertitype")
    private String leglcertitype_法人代表证件类型1;

    @ApiModelProperty(value="leglcertinum_法人代表证件号码",name="leglcertinum",example="",position=1)
    @JsonProperty("leglcertinum")
    @JSONField(name="leglcertinum")
    private String leglcertinum_法人代表证件号码0;


    @ApiModelProperty(value="unitlinkman_单位联系人",name="unitlinkman",example="",position=1)
    @JsonProperty("unitlinkman")
    @JSONField(name="unitlinkman")
    private String unitlinkman_单位联系人;


    @ApiModelProperty(value="unitlinkphone_联系电话",name="unitlinkphone",example="",position=1)
    @JsonProperty("unitlinkphone")
    @JSONField(name="unitlinkphone")
    private String unitlinkphone_联系电话;


    @ApiModelProperty(value="agentinstcode_经办机构",name="agentinstcode",example="",position=1)
    @JsonProperty("agentinstcode")
    @JSONField(name="agentinstcode")
    private String agentinstcode_经办机构;


    @ApiModelProperty(value="Unitaccnum单位账号",name="unitaccnum",example="",position=1)
    @JsonProperty("unitaccnum")
    @JSONField(name="unitaccnum")
    private String unitaccnum单位账号;

    public String getUnitaccnum单位账号() {
        return unitaccnum单位账号;
    }

    public void setUnitaccnum单位账号(String unitaccnum单位账号) {
        this.unitaccnum单位账号 = unitaccnum单位账号;
    }

    @ApiModelProperty(value="frzflag_冻结标志",name="frzflag",example="",position=1)
    @JsonProperty("frzflag")
    @JSONField(name="frzflag")
    private String frzflag_冻结标志;

/*    @Column(name = "unitacctype")
    private String unitacctype_单位账户类型;
// 1－普通4－自由5－军转6－托管7－执法8－久悬未取 9－预缴户*/


    @ApiModelProperty(value="lastbal_上日余额",name="lastbal",example="",position=1)
    @JsonProperty("lastbal")
    @JSONField(name="lastbal")
    private BigDecimal lastbal_上日余额;



    @ApiModelProperty(value="bal_余额",name="bal",example="",position=1)
    @JsonProperty("bal")
    @JSONField(name="bal")
    private BigDecimal bal_余额;


    @ApiModelProperty(value="lasttransdate_上笔发生日期",name="lasttransdate",example="",position=1)
    @JsonProperty("lasttransdate")
    @JSONField(name="lasttransdate")
    private Date lasttransdate_上笔发生日期;


    @ApiModelProperty(value="opnaccdate开户日期",name="opnaccdate",example="",position=1)
    @JsonProperty("opnaccdate")
    @JSONField(name="opnaccdate")
    private LocalDate opnaccdate开户日期;


    @ApiModelProperty(value="clsaccdate销户日期",name="clsaccdate",example="",position=1)
    @JsonProperty("clsaccdate")
    @JSONField(name="clsaccdate")

    private LocalDate clsaccdate销户日期;













    @ApiModelProperty(value="begpayym_起始汇缴年月",name="begpayym",example="",position=1)
    @JsonProperty("begpayym")
    @JSONField(name="begpayym")
    private String begpayym_起始汇缴年月;

    @ApiModelProperty(value="lpaym_缴至年月",name="lpaym",example="",position=1)
    @JsonProperty("lpaym")
    @JSONField(name="lpaym")
    private String lpaym_缴至年月;


    @ApiModelProperty(value="basenum_缴存基数",name="basenum",example="",position=1)
    @JsonProperty("basenum")
    @JSONField(name="basenum")
    private double basenum_缴存基数;

    @ApiModelProperty(value="indinorprop_个人正常比例",name="indinorprop",example="",position=1)
    @JsonProperty("indinorprop")
    @JSONField(name="indinorprop")
    private String indinorprop_个人正常比例;


    @ApiModelProperty(value="unitnorprop_单位正常比例",name="unitnorprop",example="",position=1)
    @JsonProperty("unitnorprop")
    @JSONField(name="unitnorprop")
    private double unitnorprop_单位正常比例;

    public String getBegpayym_起始汇缴年月() {
        return begpayym_起始汇缴年月;
    }

    public void setBegpayym_起始汇缴年月(String begpayym_起始汇缴年月) {
        this.begpayym_起始汇缴年月 = begpayym_起始汇缴年月;
    }

    public String getLpaym_缴至年月() {
        return lpaym_缴至年月;
    }

    public void setLpaym_缴至年月(String lpaym_缴至年月) {
        this.lpaym_缴至年月 = lpaym_缴至年月;
    }

    public double getBasenum_缴存基数() {
        return basenum_缴存基数;
    }

    public void setBasenum_缴存基数(double basenum_缴存基数) {
        this.basenum_缴存基数 = basenum_缴存基数;
    }

    public String getIndinorprop_个人正常比例() {
        return indinorprop_个人正常比例;
    }

    public void setIndinorprop_个人正常比例(String indinorprop_个人正常比例) {
        this.indinorprop_个人正常比例 = indinorprop_个人正常比例;
    }

    public double getUnitnorprop_单位正常比例() {
        return unitnorprop_单位正常比例;
    }

    public void setUnitnorprop_单位正常比例(double unitnorprop_单位正常比例) {
        this.unitnorprop_单位正常比例 = unitnorprop_单位正常比例;
    }


    public String getUnitaccname单位名称() {
        return unitaccname单位名称;
    }

    public void setUnitaccname单位名称(String unitaccname单位名称) {
        this.unitaccname单位名称 = unitaccname单位名称;
    }

    public String getOrgcode_组织机构代码() {
        return orgcode_组织机构代码;
    }

    public void setOrgcode_组织机构代码(String orgcode_组织机构代码) {
        this.orgcode_组织机构代码 = orgcode_组织机构代码;
    }

    public String getUnitkind_单位性质() {
        return unitkind_单位性质;
    }

    public void setUnitkind_单位性质(String unitkind_单位性质) {
        this.unitkind_单位性质 = unitkind_单位性质;
    }

    public String getUnitaddr_单位地址() {
        return unitaddr_单位地址;
    }

    public void setUnitaddr_单位地址(String unitaddr_单位地址) {
        this.unitaddr_单位地址 = unitaddr_单位地址;
    }

    public String getLeglaccname_单位法人代表() {
        return leglaccname_单位法人代表;
    }

    public void setLeglaccname_单位法人代表(String leglaccname_单位法人代表) {
        this.leglaccname_单位法人代表 = leglaccname_单位法人代表;
    }

    public String getLeglcertitype_法人代表证件类型1() {
        return leglcertitype_法人代表证件类型1;
    }

    public void setLeglcertitype_法人代表证件类型1(String leglcertitype_法人代表证件类型1) {
        this.leglcertitype_法人代表证件类型1 = leglcertitype_法人代表证件类型1;
    }

    public String getLeglcertinum_法人代表证件号码0() {
        return leglcertinum_法人代表证件号码0;
    }

    public void setLeglcertinum_法人代表证件号码0(String leglcertinum_法人代表证件号码0) {
        this.leglcertinum_法人代表证件号码0 = leglcertinum_法人代表证件号码0;
    }

    public String getUnitlinkman_单位联系人() {
        return unitlinkman_单位联系人;
    }

    public void setUnitlinkman_单位联系人(String unitlinkman_单位联系人) {
        this.unitlinkman_单位联系人 = unitlinkman_单位联系人;
    }

    public String getUnitlinkphone_联系电话() {
        return unitlinkphone_联系电话;
    }

    public void setUnitlinkphone_联系电话(String unitlinkphone_联系电话) {
        this.unitlinkphone_联系电话 = unitlinkphone_联系电话;
    }

    public String getAgentinstcode_经办机构() {
        return agentinstcode_经办机构;
    }

    public void setAgentinstcode_经办机构(String agentinstcode_经办机构) {
        this.agentinstcode_经办机构 = agentinstcode_经办机构;
    }

    public String getFrzflag_冻结标志() {
        return frzflag_冻结标志;
    }

    public void setFrzflag_冻结标志(String frzflag_冻结标志) {
        this.frzflag_冻结标志 = frzflag_冻结标志;
    }

    public BigDecimal getLastbal_上日余额() {
        return lastbal_上日余额;
    }

    public void setLastbal_上日余额(BigDecimal lastbal_上日余额) {
        this.lastbal_上日余额 = lastbal_上日余额;
    }

    public BigDecimal getBal_余额() {
        return bal_余额;
    }

    public void setBal_余额(BigDecimal bal_余额) {
        this.bal_余额 = bal_余额;
    }

    public Date getLasttransdate_上笔发生日期() {
        return lasttransdate_上笔发生日期;
    }

    public void setLasttransdate_上笔发生日期(Date lasttransdate_上笔发生日期) {
        this.lasttransdate_上笔发生日期 = lasttransdate_上笔发生日期;
    }

    public LocalDate getOpnaccdate开户日期() {
        return opnaccdate开户日期;
    }

    public void setOpnaccdate开户日期(LocalDate opnaccdate开户日期) {
        this.opnaccdate开户日期 = opnaccdate开户日期;
    }

    public LocalDate getClsaccdate销户日期() {
        return clsaccdate销户日期;
    }

    public void setClsaccdate销户日期(LocalDate clsaccdate销户日期) {
        this.clsaccdate销户日期 = clsaccdate销户日期;
    }
}