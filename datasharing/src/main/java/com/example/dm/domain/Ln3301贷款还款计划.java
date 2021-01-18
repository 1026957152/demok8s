package com.example.dm.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

import java.time.LocalDateTime;

@Entity
@Table(name = "Ln3301")
public class Ln3301贷款还款计划 {

/*  comment on column WITHRUN.LN3301.ID is '序号';

  comment on column WITHRUN.LN3301.CONTRACTCODE is '合同代码';

  comment on column WITHRUN.LN3301.CURRENTTERM is '当期期次';

  comment on column WITHRUN.LN3301.TERMSTATUS is '期次状态';

  comment on column WITHRUN.LN3301.LNRATE is '贷款利率';

  comment on column WITHRUN.LN3301.LNTERM is '贷款期数';

  comment on column WITHRUN.LN3301.BEGINTERESTDATE is '开始计息日期';

  comment on column WITHRUN.LN3301.PLANDATE is '计划还款日期';*/

  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "contractcode")
  private String contractcode合同代码;
  @Column(name = "currentterm")
  private long currentterm当期期次;
  @Column(name = "termstatus")
  private String termstatus期次状态;
  @Column(name = "lnrate")
  private double lnrate贷款利率;
  @Column(name = "lnterm")
  private long lnterm贷款期数;
  @Column(name = "beginterestdate")
  private java.sql.Date beginterestdate开始计息日期;
  @Column(name = "plandate")
  private java.sql.Date plandate计划还款日期;

/*  comment on table WITHRUN.LN3301 is '贷款还款计划';

  comment on column WITHRUN.LN3301.FACTDATE is '实还日期';

  comment on column WITHRUN.LN3301.CHGOVERDUEDATE is '转逾期日期';

  comment on column WITHRUN.LN3301.INITIALBAL is '当期期初余额';

  comment on column WITHRUN.LN3301.PLANPRINCIPAL is '应还本金';

  comment on column WITHRUN.LN3301.PLANINTEREST is '应还利息';

  comment on column WITHRUN.LN3301.PLANPENALTY is '应还罚息';

  comment on column WITHRUN.LN3301.PLANCOMPINT is '应还复利';

  comment on column WITHRUN.LN3301.NOTREPAYPRINCIPAL is '未还本金';

  comment on column WITHRUN.LN3301.NOTREPAYINTEREST is '未还利息';

  comment on column WITHRUN.LN3301.REPAYPENALTY is '已还罚息';*/
  @Column(name = "factdate")
  private java.sql.Date factdate实还日期;
  @Column(name = "chgoverduedate")
  private java.sql.Date chgoverduedate转逾期日期;
  @Column(name = "initialbal")
  private double initialbal当期期初余额;
  @Column(name = "planprincipal")
  private double planprincipal应还本金;
  @Column(name = "planinterest")
  private double planinterest应还利息;
  @Column(name = "planpenalty")
  private double planpenalty应还罚息;
  @Column(name = "plancompint")
  private double plancompint应还复利;
  @Column(name = "notrepayprincipal")
  private double notrepayprincipal未还本金;
  @Column(name = "notrepayinterest")
  private double notrepayinterest未还利息;
  @Column(name = "repaypenalty")
  private double repaypenalty已还罚息;
  @Column(name = "repaycompint")
  private double repaycompint已还复利;
  @Column(name = "stpenalty")
  private double stpenalty结算罚息;
  @Column(name = "stcompint")
  private double stcompint结算复利;
  @Column(name = "penaltydate")
  private java.sql.Date penaltydate罚息计算日期;
  @Column(name = "compintdate")
  private java.sql.Date compintdate复利计算日期;
  @Column(name = "isstopinterest")
  private long isstopinterest是否停息;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;


/*
  comment on column WITHRUN.LN3301.REPAYCOMPINT is '已还复利';

  comment on column WITHRUN.LN3301.STPENALTY is '结算罚息';

  comment on column WITHRUN.LN3301.STCOMPINT is '结算复利';

  comment on column WITHRUN.LN3301.PENALTYDATE is '罚息计算日期';

  comment on column WITHRUN.LN3301.COMPINTDATE is '复利计算日期';

  comment on column WITHRUN.LN3301.ISSTOPINTEREST is '是否停息';

  comment on column WITHRUN.LN3301.CITYCODE is '城市代码';

  comment on column WITHRUN.LN3301.CREATETIME is '创建时间';

  comment on column WITHRUN.LN3301.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.LN3301.FREEUSECHAR1 is '备用字符1';*/

  public long getId序号() {
    return id序号;
  }

  public void setId序号(long id序号) {
    this.id序号 = id序号;
  }

  public String getContractcode合同代码() {
    return contractcode合同代码;
  }

  public void setContractcode合同代码(String contractcode合同代码) {
    this.contractcode合同代码 = contractcode合同代码;
  }

  public long getCurrentterm当期期次() {
    return currentterm当期期次;
  }

  public void setCurrentterm当期期次(long currentterm当期期次) {
    this.currentterm当期期次 = currentterm当期期次;
  }

  public String getTermstatus期次状态() {
    return termstatus期次状态;
  }

  public void setTermstatus期次状态(String termstatus期次状态) {
    this.termstatus期次状态 = termstatus期次状态;
  }

  public double getLnrate贷款利率() {
    return lnrate贷款利率;
  }

  public void setLnrate贷款利率(double lnrate贷款利率) {
    this.lnrate贷款利率 = lnrate贷款利率;
  }

  public long getLnterm贷款期数() {
    return lnterm贷款期数;
  }

  public void setLnterm贷款期数(long lnterm贷款期数) {
    this.lnterm贷款期数 = lnterm贷款期数;
  }

  public Date getBeginterestdate开始计息日期() {
    return beginterestdate开始计息日期;
  }

  public void setBeginterestdate开始计息日期(Date beginterestdate开始计息日期) {
    this.beginterestdate开始计息日期 = beginterestdate开始计息日期;
  }

  public Date getPlandate计划还款日期() {
    return plandate计划还款日期;
  }

  public void setPlandate计划还款日期(Date plandate计划还款日期) {
    this.plandate计划还款日期 = plandate计划还款日期;
  }

  public Date getFactdate实还日期() {
    return factdate实还日期;
  }

  public void setFactdate实还日期(Date factdate实还日期) {
    this.factdate实还日期 = factdate实还日期;
  }

  public Date getChgoverduedate转逾期日期() {
    return chgoverduedate转逾期日期;
  }

  public void setChgoverduedate转逾期日期(Date chgoverduedate转逾期日期) {
    this.chgoverduedate转逾期日期 = chgoverduedate转逾期日期;
  }

  public double getInitialbal当期期初余额() {
    return initialbal当期期初余额;
  }

  public void setInitialbal当期期初余额(double initialbal当期期初余额) {
    this.initialbal当期期初余额 = initialbal当期期初余额;
  }

  public double getPlanprincipal应还本金() {
    return planprincipal应还本金;
  }

  public void setPlanprincipal应还本金(double planprincipal应还本金) {
    this.planprincipal应还本金 = planprincipal应还本金;
  }

  public double getPlaninterest应还利息() {
    return planinterest应还利息;
  }

  public void setPlaninterest应还利息(double planinterest应还利息) {
    this.planinterest应还利息 = planinterest应还利息;
  }

  public double getPlanpenalty应还罚息() {
    return planpenalty应还罚息;
  }

  public void setPlanpenalty应还罚息(double planpenalty应还罚息) {
    this.planpenalty应还罚息 = planpenalty应还罚息;
  }

  public double getPlancompint应还复利() {
    return plancompint应还复利;
  }

  public void setPlancompint应还复利(double plancompint应还复利) {
    this.plancompint应还复利 = plancompint应还复利;
  }

  public double getNotrepayprincipal未还本金() {
    return notrepayprincipal未还本金;
  }

  public void setNotrepayprincipal未还本金(double notrepayprincipal未还本金) {
    this.notrepayprincipal未还本金 = notrepayprincipal未还本金;
  }

  public double getNotrepayinterest未还利息() {
    return notrepayinterest未还利息;
  }

  public void setNotrepayinterest未还利息(double notrepayinterest未还利息) {
    this.notrepayinterest未还利息 = notrepayinterest未还利息;
  }

  public double getRepaypenalty已还罚息() {
    return repaypenalty已还罚息;
  }

  public void setRepaypenalty已还罚息(double repaypenalty已还罚息) {
    this.repaypenalty已还罚息 = repaypenalty已还罚息;
  }

  public double getRepaycompint已还复利() {
    return repaycompint已还复利;
  }

  public void setRepaycompint已还复利(double repaycompint已还复利) {
    this.repaycompint已还复利 = repaycompint已还复利;
  }

  public double getStpenalty结算罚息() {
    return stpenalty结算罚息;
  }

  public void setStpenalty结算罚息(double stpenalty结算罚息) {
    this.stpenalty结算罚息 = stpenalty结算罚息;
  }

  public double getStcompint结算复利() {
    return stcompint结算复利;
  }

  public void setStcompint结算复利(double stcompint结算复利) {
    this.stcompint结算复利 = stcompint结算复利;
  }

  public Date getPenaltydate罚息计算日期() {
    return penaltydate罚息计算日期;
  }

  public void setPenaltydate罚息计算日期(Date penaltydate罚息计算日期) {
    this.penaltydate罚息计算日期 = penaltydate罚息计算日期;
  }

  public Date getCompintdate复利计算日期() {
    return compintdate复利计算日期;
  }

  public void setCompintdate复利计算日期(Date compintdate复利计算日期) {
    this.compintdate复利计算日期 = compintdate复利计算日期;
  }

  public long getIsstopinterest是否停息() {
    return isstopinterest是否停息;
  }

  public void setIsstopinterest是否停息(long isstopinterest是否停息) {
    this.isstopinterest是否停息 = isstopinterest是否停息;
  }

  public String getCitycode城市代码() {
    return citycode城市代码;
  }

  public void setCitycode城市代码(String citycode城市代码) {
    this.citycode城市代码 = citycode城市代码;
  }

  public LocalDateTime getCreatetime创建时间() {
    return createtime创建时间;
  }

  public void setCreatetime创建时间(LocalDateTime createtime创建时间) {
    this.createtime创建时间 = createtime创建时间;
  }

  public LocalDateTime getUpdatetime最后更新时间戳() {
    return updatetime最后更新时间戳;
  }

  public void setUpdatetime最后更新时间戳(LocalDateTime updatetime最后更新时间戳) {
    this.updatetime最后更新时间戳 = updatetime最后更新时间戳;
  }

  public String getFreeusechar1备用字符1() {
    return freeusechar1备用字符1;
  }

  public void setFreeusechar1备用字符1(String freeusechar1备用字符1) {
    this.freeusechar1备用字符1 = freeusechar1备用字符1;
  }
}
