package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Dp1106")
public class Dp1106个人缴至信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*  comment on column WITHRUN.DP1106.ID is '序号';

  comment on column WITHRUN.DP1106.ACCNUM is '个人账号';

  comment on column WITHRUN.DP1106.STARTDPYM is '起始汇缴年月';

  comment on column WITHRUN.DP1106.LASTDPYM is '缴至年月';

  comment on column WITHRUN.DP1106.PERSONDPMAP is '个人缴存位图';

  comment on column WITHRUN.DP1106.CONTINUEMAP is '连续汇缴位图';

  comment on column WITHRUN.DP1106.YEARBEGBAL is '年初余额';

  comment on column WITHRUN.DP1106.YEARDPAMT is '年汇缴额';*/

  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "accnum")
  private String accnum个人账号;
  @Column(name = "startdpym")
  private String startdpym起始汇缴年月;
  @Column(name = "lastdpym")
  private String lastdpym缴至年月;
  @Column(name = "persondpmap")
  private String persondpmap个人缴存位图;
  @Column(name = "continuemap")
  private String continuemap连续汇缴位图;
  @Column(name = "yearbegbal")
  private double yearbegbal年初余额;
  @Column(name = "yeardpamt")
  private double yeardpamt年汇缴额;

/*  comment on column WITHRUN.DP1106.YEARSUPPDPAMT is '年正常补缴额';

  comment on column WITHRUN.DP1106.YEARFLOATSUPPDPAMT is '年不定额补缴额';

  comment on column WITHRUN.DP1106.YEARDRAWAMT is '年提取额';

  comment on column WITHRUN.DP1106.YEARADJUSTAMT is '年调账额';

  comment on column WITHRUN.DP1106.CREATETIME is '创建时间';

  comment on column WITHRUN.DP1106.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.DP1106.FREEUSECHAR1 is '备用字符1';*/
  @Column(name = "yearsuppdpamt")
  private double yearsuppdpamt年正常补缴额;
  @Column(name = "yearfloatsuppdpamt")
  private double yearfloatsuppdpamt年不定额补缴额;
  @Column(name = "yeardrawamt")
  private double yeardrawamt年提取额;
  @Column(name = "yearadjustamt")
  private double yearadjustamt年调账额;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;

/*

  comment on table WITHRUN.DP1106 is '个人缴至信息';
*/

  public long getId序号() {
    return id序号;
  }

  public void setId序号(long id序号) {
    this.id序号 = id序号;
  }

  public String getAccnum个人账号() {
    return accnum个人账号;
  }

  public void setAccnum个人账号(String accnum个人账号) {
    this.accnum个人账号 = accnum个人账号;
  }

  public String getStartdpym起始汇缴年月() {
    return startdpym起始汇缴年月;
  }

  public void setStartdpym起始汇缴年月(String startdpym起始汇缴年月) {
    this.startdpym起始汇缴年月 = startdpym起始汇缴年月;
  }

  public String getLastdpym缴至年月() {
    return lastdpym缴至年月;
  }

  public void setLastdpym缴至年月(String lastdpym缴至年月) {
    this.lastdpym缴至年月 = lastdpym缴至年月;
  }

  public String getPersondpmap个人缴存位图() {
    return persondpmap个人缴存位图;
  }

  public void setPersondpmap个人缴存位图(String persondpmap个人缴存位图) {
    this.persondpmap个人缴存位图 = persondpmap个人缴存位图;
  }

  public String getContinuemap连续汇缴位图() {
    return continuemap连续汇缴位图;
  }

  public void setContinuemap连续汇缴位图(String continuemap连续汇缴位图) {
    this.continuemap连续汇缴位图 = continuemap连续汇缴位图;
  }

  public double getYearbegbal年初余额() {
    return yearbegbal年初余额;
  }

  public void setYearbegbal年初余额(double yearbegbal年初余额) {
    this.yearbegbal年初余额 = yearbegbal年初余额;
  }

  public double getYeardpamt年汇缴额() {
    return yeardpamt年汇缴额;
  }

  public void setYeardpamt年汇缴额(double yeardpamt年汇缴额) {
    this.yeardpamt年汇缴额 = yeardpamt年汇缴额;
  }

  public double getYearsuppdpamt年正常补缴额() {
    return yearsuppdpamt年正常补缴额;
  }

  public void setYearsuppdpamt年正常补缴额(double yearsuppdpamt年正常补缴额) {
    this.yearsuppdpamt年正常补缴额 = yearsuppdpamt年正常补缴额;
  }

  public double getYearfloatsuppdpamt年不定额补缴额() {
    return yearfloatsuppdpamt年不定额补缴额;
  }

  public void setYearfloatsuppdpamt年不定额补缴额(double yearfloatsuppdpamt年不定额补缴额) {
    this.yearfloatsuppdpamt年不定额补缴额 = yearfloatsuppdpamt年不定额补缴额;
  }

  public double getYeardrawamt年提取额() {
    return yeardrawamt年提取额;
  }

  public void setYeardrawamt年提取额(double yeardrawamt年提取额) {
    this.yeardrawamt年提取额 = yeardrawamt年提取额;
  }

  public double getYearadjustamt年调账额() {
    return yearadjustamt年调账额;
  }

  public void setYearadjustamt年调账额(double yearadjustamt年调账额) {
    this.yearadjustamt年调账额 = yearadjustamt年调账额;
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
