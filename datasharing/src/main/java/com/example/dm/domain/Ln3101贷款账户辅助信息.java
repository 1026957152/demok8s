package com.example.dm.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Ln3101")
public class Ln3101贷款账户辅助信息 {
  //comment on table WITHRUN.LN3101 is '贷款账户辅助信息';
/*  comment on column WITHRUN.LN3101.CONTRACTCODE is '合同代码';

  comment on column WITHRUN.LN3101.LNACCNUM is '贷款账号';

  comment on column WITHRUN.LN3101.FIRSTREPAYDATE is '首次还款发生日期';

  comment on column WITHRUN.LN3101.REPAYTERM is '还款期次';

  comment on column WITHRUN.LN3101.CURRENTTERM is '当期期次';

  comment on column WITHRUN.LN3101.BEGINTERESTDATE is '开始计息日期';

  comment on column WITHRUN.LN3101.PLANDATE is '计划还款日期';

  comment on column WITHRUN.LN3101.INITIALBAL is '当期期初余额';

  comment on column WITHRUN.LN3101.PLANPRINCIPAL is '应还本金';

  comment on column WITHRUN.LN3101.PLANINTEREST is '应还利息';*/

  @Id
  @Column(name = "contractcode")
  private String contractcode合同代码;
  @Column(name = "lnaccnum")
  private String lnaccnum贷款账号;
  @Column(name = "firstrepaydate")
  private java.sql.Date firstrepaydate首次还款发生日期;
  @Column(name = "repayterm")
  private long repayterm还款期次;
  @Column(name = "currentterm")
  private long currentterm当期期次;
  @Column(name = "beginterestdate")
  private java.sql.Date beginterestdate开始计息日期;
  @Column(name = "plandate")
  private java.sql.Date plandate计划还款日期;
  @Column(name = "initialbal")
  private double initialbal当期期初余额;
  @Column(name = "planprincipal")
  private double planprincipal应还本金;
  @Column(name = "planinterest")
  private double planinterest应还利息;

/*  comment on column WITHRUN.LN3101.ISREPAY is '是否偿还      ';

  comment on column WITHRUN.LN3101.NEXTINITIALBAL is '下期期初余额';

  comment on column WITHRUN.LN3101.HPFREPAYCONSTANT is '公贷还款常数';

  comment on column WITHRUN.LN3101.COMMREPAYCONSTANT is '商贷还款常数';

  comment on column WITHRUN.LN3101.LNRISKLEVEL is '贷款风险等级';

  comment on column WITHRUN.LN3101.LNSTATUS is '贷款状态';

  comment on column WITHRUN.LN3101.CLFLAG is '结清标志';

  comment on column WITHRUN.LN3101.LNCLDATE is '贷款结清日期';

  comment on column WITHRUN.LN3101.REPAYOVERDUEPRINCIPAL is '偿还逾期本金';*/
  @Column(name = "isrepay")
  private long isrepay是否偿还;
  @Column(name = "nextinitialbal")
  private double nextinitialbal下期期初余额;
  @Column(name = "hpfrepayconstant")
  private double hpfrepayconstant公贷还款常数;
  @Column(name = "commrepayconstant")
  private double commrepayconstant商贷还款常数;
  @Column(name = "lnrisklevel")
  private String lnrisklevel贷款风险等级;
  @Column(name = "lnstatus")
  private String lnstatus贷款状态;
  @Column(name = "clflag")
  private String clflag结清标志;
  @Column(name = "lncldate")
  private java.sql.Date lncldate贷款结清日期;
  @Column(name = "repayoverdueprincipal")
  private double repayoverdueprincipal偿还逾期本金;

/*  comment on column WITHRUN.LN3101.REPAYNORMALPRINCIPAL is '偿还正常本金';

  comment on column WITHRUN.LN3101.BEFREPAYPRINCIPAL is '提前还款本金';

  comment on column WITHRUN.LN3101.REPAYOVERDUEINTEREST is '偿还逾期利息';

  comment on column WITHRUN.LN3101.REPAYNORMALINTEREST is '偿还正常利息';

  comment on column WITHRUN.LN3101.REPAYNEWINTEREST is '偿还新产生利息';

  comment on column WITHRUN.LN3101.REPAYPRINCIPAL is '已还本金';

  comment on column WITHRUN.LN3101.REPAYINTEREST is '已还利息';

  comment on column WITHRUN.LN3101.REPAYPENALTY is '已还罚息';*/
  @Column(name = "repaynormalprincipal")
  private double repaynormalprincipal偿还正常本金;
  @Column(name = "befrepayprincipal")
  private double befrepayprincipal提前还款本金;
  @Column(name = "repayoverdueinterest")
  private double repayoverdueinterest偿还逾期利息;
  @Column(name = "repaynormalinterest")
  private double repaynormalinterest偿还正常利息;
  @Column(name = "repaynewinterest")
  private double repaynewinterest偿还新产生利息;
  @Column(name = "repayprincipal")
  private double repayprincipal已还本金;
  @Column(name = "repayinterest")
  private double repayinterest已还利息;
  @Column(name = "repaypenalty")
  private double repaypenalty已还罚息;
/*  comment on column WITHRUN.LN3101.REPAYCOMPINT is '已还复利';

  comment on column WITHRUN.LN3101.OVERDUEPRINCIPAL is '逾期本金';

  comment on column WITHRUN.LN3101.OVERDUEINTEREST is '逾期利息';

  comment on column WITHRUN.LN3101.REPAYMENTMAP is '还款情况位图';

  comment on column WITHRUN.LN3101.CITYCODE is '城市代码';

  comment on column WITHRUN.LN3101.CREATETIME is '创建时间';

  comment on column WITHRUN.LN3101.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.LN3101.FREEUSECHAR1 is '备用字符1';*/
  @Column(name = "repaycompint")
  private double repaycompint已还复利;
  @Column(name = "overdueprincipal")
  private double overdueprincipal逾期本金;
  @Column(name = "overdueinterest")
  private double overdueinterest逾期利息;
  @Column(name = "repaymentmap")
  private String repaymentmap还款情况位图;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;

  //comment on table WITHRUN.LN3101 is '贷款账户辅助信息';
/*








*/

  public String getContractcode合同代码() {
    return contractcode合同代码;
  }

  public void setContractcode合同代码(String contractcode合同代码) {
    this.contractcode合同代码 = contractcode合同代码;
  }

  public String getLnaccnum贷款账号() {
    return lnaccnum贷款账号;
  }

  public void setLnaccnum贷款账号(String lnaccnum贷款账号) {
    this.lnaccnum贷款账号 = lnaccnum贷款账号;
  }

  public Date getFirstrepaydate首次还款发生日期() {
    return firstrepaydate首次还款发生日期;
  }

  public void setFirstrepaydate首次还款发生日期(Date firstrepaydate首次还款发生日期) {
    this.firstrepaydate首次还款发生日期 = firstrepaydate首次还款发生日期;
  }

  public long getRepayterm还款期次() {
    return repayterm还款期次;
  }

  public void setRepayterm还款期次(long repayterm还款期次) {
    this.repayterm还款期次 = repayterm还款期次;
  }

  public long getCurrentterm当期期次() {
    return currentterm当期期次;
  }

  public void setCurrentterm当期期次(long currentterm当期期次) {
    this.currentterm当期期次 = currentterm当期期次;
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

  public long getIsrepay是否偿还() {
    return isrepay是否偿还;
  }

  public void setIsrepay是否偿还(long isrepay是否偿还) {
    this.isrepay是否偿还 = isrepay是否偿还;
  }

  public double getNextinitialbal下期期初余额() {
    return nextinitialbal下期期初余额;
  }

  public void setNextinitialbal下期期初余额(double nextinitialbal下期期初余额) {
    this.nextinitialbal下期期初余额 = nextinitialbal下期期初余额;
  }

  public double getHpfrepayconstant公贷还款常数() {
    return hpfrepayconstant公贷还款常数;
  }

  public void setHpfrepayconstant公贷还款常数(double hpfrepayconstant公贷还款常数) {
    this.hpfrepayconstant公贷还款常数 = hpfrepayconstant公贷还款常数;
  }

  public double getCommrepayconstant商贷还款常数() {
    return commrepayconstant商贷还款常数;
  }

  public void setCommrepayconstant商贷还款常数(double commrepayconstant商贷还款常数) {
    this.commrepayconstant商贷还款常数 = commrepayconstant商贷还款常数;
  }

  public String getLnrisklevel贷款风险等级() {
    return lnrisklevel贷款风险等级;
  }

  public void setLnrisklevel贷款风险等级(String lnrisklevel贷款风险等级) {
    this.lnrisklevel贷款风险等级 = lnrisklevel贷款风险等级;
  }

  public String getLnstatus贷款状态() {
    return lnstatus贷款状态;
  }

  public void setLnstatus贷款状态(String lnstatus贷款状态) {
    this.lnstatus贷款状态 = lnstatus贷款状态;
  }

  public String getClflag结清标志() {
    return clflag结清标志;
  }

  public void setClflag结清标志(String clflag结清标志) {
    this.clflag结清标志 = clflag结清标志;
  }

  public Date getLncldate贷款结清日期() {
    return lncldate贷款结清日期;
  }

  public void setLncldate贷款结清日期(Date lncldate贷款结清日期) {
    this.lncldate贷款结清日期 = lncldate贷款结清日期;
  }

  public double getRepayoverdueprincipal偿还逾期本金() {
    return repayoverdueprincipal偿还逾期本金;
  }

  public void setRepayoverdueprincipal偿还逾期本金(double repayoverdueprincipal偿还逾期本金) {
    this.repayoverdueprincipal偿还逾期本金 = repayoverdueprincipal偿还逾期本金;
  }

  public double getRepaynormalprincipal偿还正常本金() {
    return repaynormalprincipal偿还正常本金;
  }

  public void setRepaynormalprincipal偿还正常本金(double repaynormalprincipal偿还正常本金) {
    this.repaynormalprincipal偿还正常本金 = repaynormalprincipal偿还正常本金;
  }

  public double getBefrepayprincipal提前还款本金() {
    return befrepayprincipal提前还款本金;
  }

  public void setBefrepayprincipal提前还款本金(double befrepayprincipal提前还款本金) {
    this.befrepayprincipal提前还款本金 = befrepayprincipal提前还款本金;
  }

  public double getRepayoverdueinterest偿还逾期利息() {
    return repayoverdueinterest偿还逾期利息;
  }

  public void setRepayoverdueinterest偿还逾期利息(double repayoverdueinterest偿还逾期利息) {
    this.repayoverdueinterest偿还逾期利息 = repayoverdueinterest偿还逾期利息;
  }

  public double getRepaynormalinterest偿还正常利息() {
    return repaynormalinterest偿还正常利息;
  }

  public void setRepaynormalinterest偿还正常利息(double repaynormalinterest偿还正常利息) {
    this.repaynormalinterest偿还正常利息 = repaynormalinterest偿还正常利息;
  }

  public double getRepaynewinterest偿还新产生利息() {
    return repaynewinterest偿还新产生利息;
  }

  public void setRepaynewinterest偿还新产生利息(double repaynewinterest偿还新产生利息) {
    this.repaynewinterest偿还新产生利息 = repaynewinterest偿还新产生利息;
  }

  public double getRepayprincipal已还本金() {
    return repayprincipal已还本金;
  }

  public void setRepayprincipal已还本金(double repayprincipal已还本金) {
    this.repayprincipal已还本金 = repayprincipal已还本金;
  }

  public double getRepayinterest已还利息() {
    return repayinterest已还利息;
  }

  public void setRepayinterest已还利息(double repayinterest已还利息) {
    this.repayinterest已还利息 = repayinterest已还利息;
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

  public double getOverdueprincipal逾期本金() {
    return overdueprincipal逾期本金;
  }

  public void setOverdueprincipal逾期本金(double overdueprincipal逾期本金) {
    this.overdueprincipal逾期本金 = overdueprincipal逾期本金;
  }

  public double getOverdueinterest逾期利息() {
    return overdueinterest逾期利息;
  }

  public void setOverdueinterest逾期利息(double overdueinterest逾期利息) {
    this.overdueinterest逾期利息 = overdueinterest逾期利息;
  }

  public String getRepaymentmap还款情况位图() {
    return repaymentmap还款情况位图;
  }

  public void setRepaymentmap还款情况位图(String repaymentmap还款情况位图) {
    this.repaymentmap还款情况位图 = repaymentmap还款情况位图;
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
