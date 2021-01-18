package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

import java.time.LocalDateTime;

@Entity
@Table(name = "Ln0306")
public class Ln0306个人住房贷款逾期登记信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*  comment on column WITHRUN.LN0306.IDXH is 'id序号';

  comment on column WITHRUN.LN0306.CONTRACTCODE is '合同代码';

  comment on column WITHRUN.LN0306.DKZH is '贷款账号';

  comment on column WITHRUN.LN0306.YQQC is '逾期期次';

  comment on column WITHRUN.LN0306.YQBJ is '逾期本金';

  comment on column WITHRUN.LN0306.YQLX is '逾期利息';

  comment on column WITHRUN.LN0306.YQFX is '逾期罚息';

  comment on column WITHRUN.LN0306.SSRQ is '实收日期';*/

  @Id
  @Column(name = "idxh")
  private String idxhid序号;
  @Column(name = "contractcode")
  private String contractcode合同代码;
  @Column(name = "dkzh")
  private String dkzh贷款账号;
  @Column(name = "yqqc")
  private long yqqc逾期期次;
  @Column(name = "yqbj")
  private double yqbj逾期本金;
  @Column(name = "yqlx")
  private double yqlx逾期利息;
  @Column(name = "yqfx")
  private double yqfx逾期罚息;
  @Column(name = "ssrq")
  private java.sql.Date ssrq实收日期;


/*  comment on column WITHRUN.LN0306.HKQC is '还款期次';

  comment on column WITHRUN.LN0306.SSYQBJJE is '实收逾期本金金额';

  comment on column WITHRUN.LN0306.SSYQLXJE is '实收逾期利息金额';

  comment on column WITHRUN.LN0306.SSYQFXJE is '实收逾期罚息金额';

  comment on column WITHRUN.LN0306.ZXBH is '中心编号';

  comment on column WITHRUN.LN0306.LAST_UPDATE_TIME is '最后更新时间戳';

  comment on column WITHRUN.LN0306.CITYCODE is '城市代码';

  comment on column WITHRUN.LN0306.CREATETIME is '创建时间';*/
  @Column(name = "hkqc")
  private long hkqc还款期次;
  @Column(name = "ssyqbjje")
  private double ssyqbjje实收逾期本金金额;
  @Column(name = "ssyqlxje")
  private double ssyqlxje实收逾期利息金额;
  @Column(name = "ssyqfxje")
  private double ssyqfxje实收逾期罚息金额;
  @Column(name = "zxbh")
  private String zxbh中心编号;
  @Column(name = "last_Update_Time")
  private LocalDateTime lastUpdateTime最后更新时间戳;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;

  public LocalDateTime getLastUpdateTime最后更新时间戳() {
    return lastUpdateTime最后更新时间戳;
  }

  public void setLastUpdateTime最后更新时间戳(LocalDateTime lastUpdateTime最后更新时间戳) {
    this.lastUpdateTime最后更新时间戳 = lastUpdateTime最后更新时间戳;
  }

  public LocalDateTime getCreatetime创建时间() {
    return createtime创建时间;
  }

  public void setCreatetime创建时间(LocalDateTime createtime创建时间) {
    this.createtime创建时间 = createtime创建时间;
  }
//  comment on table WITHRUN.LN0306 is '个人住房贷款逾期登记信息';


  public String getIdxhid序号() {
    return idxhid序号;
  }

  public void setIdxhid序号(String idxhid序号) {
    this.idxhid序号 = idxhid序号;
  }

  public String getContractcode合同代码() {
    return contractcode合同代码;
  }

  public void setContractcode合同代码(String contractcode合同代码) {
    this.contractcode合同代码 = contractcode合同代码;
  }

  public String getDkzh贷款账号() {
    return dkzh贷款账号;
  }

  public void setDkzh贷款账号(String dkzh贷款账号) {
    this.dkzh贷款账号 = dkzh贷款账号;
  }

  public long getYqqc逾期期次() {
    return yqqc逾期期次;
  }

  public void setYqqc逾期期次(long yqqc逾期期次) {
    this.yqqc逾期期次 = yqqc逾期期次;
  }

  public double getYqbj逾期本金() {
    return yqbj逾期本金;
  }

  public void setYqbj逾期本金(double yqbj逾期本金) {
    this.yqbj逾期本金 = yqbj逾期本金;
  }

  public double getYqlx逾期利息() {
    return yqlx逾期利息;
  }

  public void setYqlx逾期利息(double yqlx逾期利息) {
    this.yqlx逾期利息 = yqlx逾期利息;
  }

  public double getYqfx逾期罚息() {
    return yqfx逾期罚息;
  }

  public void setYqfx逾期罚息(double yqfx逾期罚息) {
    this.yqfx逾期罚息 = yqfx逾期罚息;
  }

  public Date getSsrq实收日期() {
    return ssrq实收日期;
  }

  public void setSsrq实收日期(Date ssrq实收日期) {
    this.ssrq实收日期 = ssrq实收日期;
  }

  public long getHkqc还款期次() {
    return hkqc还款期次;
  }

  public void setHkqc还款期次(long hkqc还款期次) {
    this.hkqc还款期次 = hkqc还款期次;
  }

  public double getSsyqbjje实收逾期本金金额() {
    return ssyqbjje实收逾期本金金额;
  }

  public void setSsyqbjje实收逾期本金金额(double ssyqbjje实收逾期本金金额) {
    this.ssyqbjje实收逾期本金金额 = ssyqbjje实收逾期本金金额;
  }

  public double getSsyqlxje实收逾期利息金额() {
    return ssyqlxje实收逾期利息金额;
  }

  public void setSsyqlxje实收逾期利息金额(double ssyqlxje实收逾期利息金额) {
    this.ssyqlxje实收逾期利息金额 = ssyqlxje实收逾期利息金额;
  }

  public double getSsyqfxje实收逾期罚息金额() {
    return ssyqfxje实收逾期罚息金额;
  }

  public void setSsyqfxje实收逾期罚息金额(double ssyqfxje实收逾期罚息金额) {
    this.ssyqfxje实收逾期罚息金额 = ssyqfxje实收逾期罚息金额;
  }

  public String getZxbh中心编号() {
    return zxbh中心编号;
  }

  public void setZxbh中心编号(String zxbh中心编号) {
    this.zxbh中心编号 = zxbh中心编号;
  }


  public String getCitycode城市代码() {
    return citycode城市代码;
  }

  public void setCitycode城市代码(String citycode城市代码) {
    this.citycode城市代码 = citycode城市代码;
  }



}
