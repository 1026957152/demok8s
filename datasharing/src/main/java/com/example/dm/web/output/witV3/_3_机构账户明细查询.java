package com.example.dm.web.output.witV3;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


//@ApiModel(value = "个人账户明细查询",description="用户对象user")
//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class _3_机构账户明细查询 {






    @ApiModelProperty(value="seqno_0_不可为空_序号",name="seqno",example="",position=0)
    @JsonProperty("seqno")
    @JSONField(name="seqno")
  private long _1_seqno_0_不可为空_序号;

    @ApiModelProperty(value="transdate不可为空交易日期",name="transdate",example="",position=0)
    @JsonProperty("transdate")
    @JSONField(name="transdate")
  private LocalDate _2_transdate不可为空交易日期;


    @ApiModelProperty(value="unitaccnum不可为空单位账号",name="unitaccnum",example="",position=0)
    @JsonProperty("unitaccnum")
    @JSONField(name="unitaccnum")
  private String _3_unitaccnum不可为空单位账号;


    @ApiModelProperty(value="dcflag_不可为空_借贷标志 //1-借,2-贷",name="dcflag",example="",position=0)
    @JsonProperty("dcflag")
    @JSONField(name="dcflag")
  private String _4_dcflag_不可为空_借贷标志;

    @ApiModelProperty(value="unitcustid_0_不可为空_单位客户号 ",name="unitcustid",example="",position=0)
    @JsonProperty("unitcustid")
    @JSONField(name="unitcustid")
  private String _5_unitcustid_0_不可为空_单位客户号;


    @ApiModelProperty(value="entrytranscode_0_可为空_分录交易码 ",name="entrytranscode",example="",position=0)
    @JsonProperty("entrytranscode")
    @JSONField(name="entrytranscode")
  private String _6_entrytranscode_0_可为空_分录交易码;


    @ApiModelProperty(value="begym_0_可为空_开始年月 ",name="begym",example="",position=0)
    @JsonProperty("begym")
    @JSONField(name="begym")
  private String _7_begym_0_可为空_开始年月;
  @Column(name = "endym")

  @ApiModelProperty(value="endym_0_可为空_截止年月 ",name="endym",example="",position=0)
  @JsonProperty("endym")
  @JSONField(name="endym")
  private String _8_endym_0_可为空_截止年月;

    @ApiModelProperty(value="peoplenum_0_不可为空_人数 ",name="peoplenum",example="",position=0)
    @JsonProperty("peoplenum")
    @JSONField(name="peoplenum")
  private long _9_peoplenum_0_不可为空_人数;











    @ApiModelProperty(value="amt_0_不可为空_发生额 ",name="amt",example="",position=0)
    @JsonProperty("amt")
    @JSONField(name="amt")
  private double _10_amt_0_不可为空_发生额;

    @ApiModelProperty(value="lbal_0_不可为空_上笔余额 ",name="lbal",example="",position=0)
    @JsonProperty("lbal")
    @JSONField(name="lbal")
  private double _11_lbal_0_不可为空_上笔余额;

    @ApiModelProperty(value="bal_0_不可为空_余额 ",name="bal",example="",position=0)
    @JsonProperty("bal")
    @JSONField(name="bal")
  private double _12_bal_0_不可为空_余额;

    @ApiModelProperty(value="summarycode不可为空摘要代码 ",name="summarycode",example="",position=0)
    @JsonProperty("summarycode")
    @JSONField(name="summarycode")
  private String _13_summarycode不可为空摘要代码;

    @ApiModelProperty(value="remark__可为空_备注 ",name="remark",example="",position=0)
    @JsonProperty("remark")
    @JSONField(name="remark")
  private String _14_remark__可为空_备注;

    @ApiModelProperty(value="transtype_不可为空_交易类型_  //0-正常,1-红字,2-蓝字,6-撤销,7-当日冲正,8-冲账,9-抹账_0:;",name="transtype",example="",position=0)
    @JsonProperty("transtype")
    @JSONField(name="transtype")
  private String _15_transtype_不可为空_交易类型_;//0-正常,1-红字,2-蓝字,6-撤销,7-当日冲正,8-冲账,9-抹账_0:;




    public long get_1_seqno_0_不可为空_序号() {
        return _1_seqno_0_不可为空_序号;
    }

    public void set_1_seqno_0_不可为空_序号(long _1_seqno_0_不可为空_序号) {
        this._1_seqno_0_不可为空_序号 = _1_seqno_0_不可为空_序号;
    }

    public LocalDate get_2_transdate不可为空交易日期() {
        return _2_transdate不可为空交易日期;
    }

    public void set_2_transdate不可为空交易日期(LocalDate _2_transdate不可为空交易日期) {
        this._2_transdate不可为空交易日期 = _2_transdate不可为空交易日期;
    }

    public String get_3_unitaccnum不可为空单位账号() {
        return _3_unitaccnum不可为空单位账号;
    }

    public void set_3_unitaccnum不可为空单位账号(String _3_unitaccnum不可为空单位账号) {
        this._3_unitaccnum不可为空单位账号 = _3_unitaccnum不可为空单位账号;
    }

    public String get_4_dcflag_不可为空_借贷标志() {
        return _4_dcflag_不可为空_借贷标志;
    }

    public void set_4_dcflag_不可为空_借贷标志(String _4_dcflag_不可为空_借贷标志) {
        this._4_dcflag_不可为空_借贷标志 = _4_dcflag_不可为空_借贷标志;
    }

    public String get_5_unitcustid_0_不可为空_单位客户号() {
        return _5_unitcustid_0_不可为空_单位客户号;
    }

    public void set_5_unitcustid_0_不可为空_单位客户号(String _5_unitcustid_0_不可为空_单位客户号) {
        this._5_unitcustid_0_不可为空_单位客户号 = _5_unitcustid_0_不可为空_单位客户号;
    }

    public String get_6_entrytranscode_0_可为空_分录交易码() {
        return _6_entrytranscode_0_可为空_分录交易码;
    }

    public void set_6_entrytranscode_0_可为空_分录交易码(String _6_entrytranscode_0_可为空_分录交易码) {
        this._6_entrytranscode_0_可为空_分录交易码 = _6_entrytranscode_0_可为空_分录交易码;
    }

    public String get_7_begym_0_可为空_开始年月() {
        return _7_begym_0_可为空_开始年月;
    }

    public void set_7_begym_0_可为空_开始年月(String _7_begym_0_可为空_开始年月) {
        this._7_begym_0_可为空_开始年月 = _7_begym_0_可为空_开始年月;
    }

    public String get_8_endym_0_可为空_截止年月() {
        return _8_endym_0_可为空_截止年月;
    }

    public void set_8_endym_0_可为空_截止年月(String _8_endym_0_可为空_截止年月) {
        this._8_endym_0_可为空_截止年月 = _8_endym_0_可为空_截止年月;
    }

    public long get_9_peoplenum_0_不可为空_人数() {
        return _9_peoplenum_0_不可为空_人数;
    }

    public void set_9_peoplenum_0_不可为空_人数(long _9_peoplenum_0_不可为空_人数) {
        this._9_peoplenum_0_不可为空_人数 = _9_peoplenum_0_不可为空_人数;
    }

    public double get_10_amt_0_不可为空_发生额() {
        return _10_amt_0_不可为空_发生额;
    }

    public void set_10_amt_0_不可为空_发生额(double _10_amt_0_不可为空_发生额) {
        this._10_amt_0_不可为空_发生额 = _10_amt_0_不可为空_发生额;
    }

    public double get_11_lbal_0_不可为空_上笔余额() {
        return _11_lbal_0_不可为空_上笔余额;
    }

    public void set_11_lbal_0_不可为空_上笔余额(double _11_lbal_0_不可为空_上笔余额) {
        this._11_lbal_0_不可为空_上笔余额 = _11_lbal_0_不可为空_上笔余额;
    }

    public double get_12_bal_0_不可为空_余额() {
        return _12_bal_0_不可为空_余额;
    }

    public void set_12_bal_0_不可为空_余额(double _12_bal_0_不可为空_余额) {
        this._12_bal_0_不可为空_余额 = _12_bal_0_不可为空_余额;
    }

    public String get_13_summarycode不可为空摘要代码() {
        return _13_summarycode不可为空摘要代码;
    }

    public void set_13_summarycode不可为空摘要代码(String _13_summarycode不可为空摘要代码) {
        this._13_summarycode不可为空摘要代码 = _13_summarycode不可为空摘要代码;
    }

    public String get_14_remark__可为空_备注() {
        return _14_remark__可为空_备注;
    }

    public void set_14_remark__可为空_备注(String _14_remark__可为空_备注) {
        this._14_remark__可为空_备注 = _14_remark__可为空_备注;
    }

    public String get_15_transtype_不可为空_交易类型_() {
        return _15_transtype_不可为空_交易类型_;
    }

    public void set_15_transtype_不可为空_交易类型_(String _15_transtype_不可为空_交易类型_) {
        this._15_transtype_不可为空_交易类型_ = _15_transtype_不可为空_交易类型_;
    }
}