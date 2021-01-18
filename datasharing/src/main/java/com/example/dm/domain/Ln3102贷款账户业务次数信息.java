package com.example.dm.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Ln3102")
public class Ln3102贷款账户业务次数信息 {

/*  comment on column WITHRUN.LN3102.CONTRACTCODE is '合同代码';

  comment on column WITHRUN.LN3102.LNACCNUM is '贷款账号';

  comment on column WITHRUN.LN3102.CLAIMCOUNT is '理赔次数';

  comment on column WITHRUN.LN3102.FORCEDEDUCTCOUNT is '强扣次数';

  comment on column WITHRUN.LN3102.EXTENDCOUNT is '展期次数';

  comment on column WITHRUN.LN3102.SHORTENCOUNT is '缩期次数';

  comment on column WITHRUN.LN3102.OVERDUECOUNT is '逾期期数';*/

  @Id
  @Column(name = "contractcode")
  private String contractcode合同代码;
  @Column(name = "lnaccnum")
  private String lnaccnum贷款账号;
  @Column(name = "claimcount")
  private long claimcount理赔次数;
  @Column(name = "forcedeductcount")
  private long forcedeductcount强扣次数;
  @Column(name = "extendcount")
  private long extendcount展期次数;
  @Column(name = "shortencount")
  private long shortencount缩期次数;
  @Column(name = "overduecount")
  private long overduecount逾期期数;


/*  comment on column WITHRUN.LN3102.ACMLOVERDUECOUNT is '累计逾期期数';

  comment on column WITHRUN.LN3102.CONTINUECOUNT is '最大连续逾期期数';

  comment on column WITHRUN.LN3102.FORWARDCOUNT is '提前还款次数';

  comment on column WITHRUN.LN3102.REPAYCHGCOUNT is '还款方式转换次数';

  comment on column WITHRUN.LN3102.REMINDCOUNT is '催收次数';

  comment on column WITHRUN.LN3102.CLPRINTCOUNT is '结清证明打印次数';

  comment on column WITHRUN.LN3102.CITYCODE is '城市代码';

  comment on column WITHRUN.LN3102.CREATETIME is '创建时间';

  comment on column WITHRUN.LN3102.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.LN3102.FREEUSECHAR1 is '备用字符1';*/
  @Column(name = "acmloverduecount")
  private long acmloverduecount累计逾期期数;
  @Column(name = "continuecount")
  private long continuecount最大连续逾期期数;
  @Column(name = "forwardcount")
  private long forwardcount提前还款次数;
  @Column(name = "repaychgcount")
  private long repaychgcount还款方式转换次数;
  @Column(name = "remindcount")
  private long remindcount催收次数;
  @Column(name = "clprintcount")
  private long clprintcount结清证明打印次数;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;

/*
  comment on table WITHRUN.LN3102 is '贷款账户业务次数信息';

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

  public long getClaimcount理赔次数() {
    return claimcount理赔次数;
  }

  public void setClaimcount理赔次数(long claimcount理赔次数) {
    this.claimcount理赔次数 = claimcount理赔次数;
  }

  public long getForcedeductcount强扣次数() {
    return forcedeductcount强扣次数;
  }

  public void setForcedeductcount强扣次数(long forcedeductcount强扣次数) {
    this.forcedeductcount强扣次数 = forcedeductcount强扣次数;
  }

  public long getExtendcount展期次数() {
    return extendcount展期次数;
  }

  public void setExtendcount展期次数(long extendcount展期次数) {
    this.extendcount展期次数 = extendcount展期次数;
  }

  public long getShortencount缩期次数() {
    return shortencount缩期次数;
  }

  public void setShortencount缩期次数(long shortencount缩期次数) {
    this.shortencount缩期次数 = shortencount缩期次数;
  }

  public long getOverduecount逾期期数() {
    return overduecount逾期期数;
  }

  public void setOverduecount逾期期数(long overduecount逾期期数) {
    this.overduecount逾期期数 = overduecount逾期期数;
  }

  public long getAcmloverduecount累计逾期期数() {
    return acmloverduecount累计逾期期数;
  }

  public void setAcmloverduecount累计逾期期数(long acmloverduecount累计逾期期数) {
    this.acmloverduecount累计逾期期数 = acmloverduecount累计逾期期数;
  }

  public long getContinuecount最大连续逾期期数() {
    return continuecount最大连续逾期期数;
  }

  public void setContinuecount最大连续逾期期数(long continuecount最大连续逾期期数) {
    this.continuecount最大连续逾期期数 = continuecount最大连续逾期期数;
  }

  public long getForwardcount提前还款次数() {
    return forwardcount提前还款次数;
  }

  public void setForwardcount提前还款次数(long forwardcount提前还款次数) {
    this.forwardcount提前还款次数 = forwardcount提前还款次数;
  }

  public long getRepaychgcount还款方式转换次数() {
    return repaychgcount还款方式转换次数;
  }

  public void setRepaychgcount还款方式转换次数(long repaychgcount还款方式转换次数) {
    this.repaychgcount还款方式转换次数 = repaychgcount还款方式转换次数;
  }

  public long getRemindcount催收次数() {
    return remindcount催收次数;
  }

  public void setRemindcount催收次数(long remindcount催收次数) {
    this.remindcount催收次数 = remindcount催收次数;
  }

  public long getClprintcount结清证明打印次数() {
    return clprintcount结清证明打印次数;
  }

  public void setClprintcount结清证明打印次数(long clprintcount结清证明打印次数) {
    this.clprintcount结清证明打印次数 = clprintcount结清证明打印次数;
  }

  public String getCitycode城市代码() {
    return citycode城市代码;
  }

  public void setCitycode城市代码(String citycode城市代码) {
    this.citycode城市代码 = citycode城市代码;
  }


  public String getFreeusechar1备用字符1() {
    return freeusechar1备用字符1;
  }

  public void setFreeusechar1备用字符1(String freeusechar1备用字符1) {
    this.freeusechar1备用字符1 = freeusechar1备用字符1;
  }
}
