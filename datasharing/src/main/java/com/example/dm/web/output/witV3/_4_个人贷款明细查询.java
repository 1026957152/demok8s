package com.example.dm.web.output.witV3;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;

//import io.swagger.annotations.ApiModel;


@ApiModel("个人贷款明细查询")
//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class _4_个人贷款明细查询 {

    @ApiModelProperty(value="transamt_交易金额",name="transamt",example="",position=0)
    @JsonProperty("transamt")
    @JSONField(name="transamt")
    private String transamt_交易金额;

    @ApiModelProperty(value="transstate_交易状态 0_正常 1_红字 2_蓝字 6_撤销 7_当日冲正 8_冲账 9_抹账",name="transstate",example="",position=0)
    @JsonProperty("transstate")
    @JSONField(name="transstate")
    private String transstate_交易状态;

    @ApiModelProperty(value="loanfundtype_贷款资金类型 01_正常本金 02_正常利息 11_逾期本金 12_应收利息 13_罚息",name="loanfundtype",example="",position=0)
    @JsonProperty("loanfundtype")
    @JSONField(name="loanfundtype")
    private String loanfundtype_贷款资金类型;

    @ApiModelProperty(value="transdate_交易日期 ",name="transdate",example="",position=0)
    @JsonProperty("transdate")
    @JSONField(name="transdate")

    private String transdate_交易日期;

    @ApiModelProperty(value="settlemode_结算方式 1_中心内部 2_现金 3_支票 4_委托扣款 5_电子转账",name="settlemode",example="",position=0)
    @JsonProperty("settlemode")
    @JSONField(name="settlemode")
    private String settlemode_结算方式;

    @ApiModelProperty(value="fundsource_资金来源 1_住房公积金 2_现金 3_保证金 4_抵债资产 5_风险准备金",name="fundsource",example="",position=0)
    @JsonProperty("fundsource")
    @JSONField(name="fundsource")
    private String fundsource_资金来源;


    @ApiModelProperty(value="dcflag_借贷标志 2_贷方 1_借方",name="dcflag",example="",position=0)
    @JsonProperty("dcflag")
    @JSONField(name="dcflag")
    private String dcflag_借贷标志;




    public void setTransamt_交易金额(String transamt_交易金额) {
        this.transamt_交易金额 = transamt_交易金额;
    }

    public String getTransamt_交易金额() {
        return transamt_交易金额;
    }

    public void setTransstate_交易状态(String transstate_交易状态) {
        this.transstate_交易状态 = transstate_交易状态;
    }

    public String getTransstate_交易状态() {
        return transstate_交易状态;
    }

    public void setLoanfundtype_贷款资金类型(String loanfundtype_贷款资金类型) {
        this.loanfundtype_贷款资金类型 = loanfundtype_贷款资金类型;
    }

    public String getLoanfundtype_贷款资金类型() {
        return loanfundtype_贷款资金类型;
    }

    public void setTransdate_交易日期(String transdate_交易日期) {
        this.transdate_交易日期 = transdate_交易日期;
    }

    public String getTransdate_交易日期() {
        return transdate_交易日期;
    }

    public void setSettlemode_结算方式(String settlemode_结算方式) {
        this.settlemode_结算方式 = settlemode_结算方式;
    }

    public String getSettlemode_结算方式() {
        return settlemode_结算方式;
    }

    public void setFundsource_资金来源(String fundsource_资金来源) {
        this.fundsource_资金来源 = fundsource_资金来源;
    }

    public String getFundsource_资金来源() {
        return fundsource_资金来源;
    }

    public void setDcflag_借贷标志(String dcflag_借贷标志) {
        this.dcflag_借贷标志 = dcflag_借贷标志;
    }

    public String getDcflag_借贷标志() {
        return dcflag_借贷标志;
    }
}