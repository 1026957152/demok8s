package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;


@Entity
@Table(name = "Dp0107")
public class Dp0107个人账户信息表 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  // comment on table WITHRUN.DP0107 is '个人账户信息表';









/*  comment on column WITHRUN.DP0107.ID is 'id';

  comment on column WITHRUN.DP0107.DWZH is '单位账号（外部）';

  comment on column WITHRUN.DP0107.UNITACCNUM is '单位账号';

  comment on column WITHRUN.DP0107.GRJCBL is '个人缴存比例';

  comment on column WITHRUN.DP0107.DWJCBL is '单位缴存比例';*/


  @Id
  @Column(name = "id")
  private long id;
  @Column(name = "dwzh")
  private String dwzh单位账号外部;
  @Column(name = "unitaccnum")
  private String unitaccnum单位账号;
  @Column(name = "grjcbl")
  private double grjcbl个人缴存比例;
  @Column(name = "dwjcbl")
  private double dwjcbl单位缴存比例;

/*  comment on column WITHRUN.DP0107.JZNY is '缴至年月';

  comment on column WITHRUN.DP0107.GRZH is '个人账号（外部）';

  comment on column WITHRUN.DP0107.ACCNUM is '个人账号';

  comment on column WITHRUN.DP0107.GRJCJS is '个人缴存基数';

  comment on column WITHRUN.DP0107.GRZHZT is '个人账户状态';

  comment on column WITHRUN.DP0107.KHRQ is '开户日期';*/
  @Column(name = "jzny")
  private String jzny缴至年月;
  @Column(name = "grzh")
  private String grzh个人账号外部;
  @Column(name = "accnum")
  private String accnum个人账号;
  @Column(name = "grjcjs")
  private double grjcjs个人缴存基数;
  @Column(name = "grzhzt")
  private String grzhzt个人账户状态;
  @Column(name = "khrq")
  private java.sql.Date khrq开户日期;

/*  comment on column WITHRUN.DP0107.GRZHYE is '个人账户余额';

  comment on column WITHRUN.DP0107.GRZHSNJZYE is '个人账户上年结转余额';

  comment on column WITHRUN.DP0107.GRZHDNGJYE is '个人账户当年归集余额';

  comment on column WITHRUN.DP0107.GRYJCE is '个人月缴存额';

  comment on column WITHRUN.DP0107.DWYJCE is '单位月缴存额';

  comment on column WITHRUN.DP0107.XHRQ is '销户日期';

  comment on column WITHRUN.DP0107.XHYY is '销户原因';*/
  @Column(name = "grzhye")
  private double grzhye个人账户余额;
  @Column(name = "grzhsnjzye")
  private double grzhsnjzye个人账户上年结转余额;
  @Column(name = "grzhdngjye")
  private double grzhdngjye个人账户当年归集余额;
  @Column(name = "gryjce")
  private double gryjce个人月缴存额;
  @Column(name = "dwyjce")
  private double dwyjce单位月缴存额;
  @Column(name = "xhrq")
  private java.sql.Date xhrq销户日期;
  @Column(name = "xhyy")
  private String xhyy销户原因;


/*  comment on column WITHRUN.DP0107.GRCKZHHM is '个人存款账户号码';

  comment on column WITHRUN.DP0107.GRCKZHKHYHMC is '个人存款账户开户银行名称';

  comment on column WITHRUN.DP0107.GRCKZHKHYHDM is '个人存款账户开户银行代码';

  comment on column WITHRUN.DP0107.ZXBH is '中心编号';

  comment on column WITHRUN.DP0107.LAST_UPDATE_TIME is '最后更新时间戳';*/
  @Column(name = "grckzhhm")
  private String grckzhhm个人存款账户号码;
  @Column(name = "grckzhkhyhmc")
  private String grckzhkhyhmc个人存款账户开户银行名称;
  @Column(name = "grckzhkhyhdm")
  private String grckzhkhyhdm个人存款账户开户银行代码;
  @Column(name = "zxbh")
  private String zxbh中心编号;
  @Column(name = "last_Update_Time")
  private LocalDateTime lastUpdateTime最后更新时间戳;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDwzh单位账号外部() {
    return dwzh单位账号外部;
  }

  public void setDwzh单位账号外部(String dwzh单位账号外部) {
    this.dwzh单位账号外部 = dwzh单位账号外部;
  }

  public String getUnitaccnum单位账号() {
    return unitaccnum单位账号;
  }

  public void setUnitaccnum单位账号(String unitaccnum单位账号) {
    this.unitaccnum单位账号 = unitaccnum单位账号;
  }

  public double getGrjcbl个人缴存比例() {
    return grjcbl个人缴存比例;
  }

  public void setGrjcbl个人缴存比例(double grjcbl个人缴存比例) {
    this.grjcbl个人缴存比例 = grjcbl个人缴存比例;
  }

  public double getDwjcbl单位缴存比例() {
    return dwjcbl单位缴存比例;
  }

  public void setDwjcbl单位缴存比例(double dwjcbl单位缴存比例) {
    this.dwjcbl单位缴存比例 = dwjcbl单位缴存比例;
  }

  public String getJzny缴至年月() {
    return jzny缴至年月;
  }

  public void setJzny缴至年月(String jzny缴至年月) {
    this.jzny缴至年月 = jzny缴至年月;
  }

  public String getGrzh个人账号外部() {
    return grzh个人账号外部;
  }

  public void setGrzh个人账号外部(String grzh个人账号外部) {
    this.grzh个人账号外部 = grzh个人账号外部;
  }

  public String getAccnum个人账号() {
    return accnum个人账号;
  }

  public void setAccnum个人账号(String accnum个人账号) {
    this.accnum个人账号 = accnum个人账号;
  }

  public double getGrjcjs个人缴存基数() {
    return grjcjs个人缴存基数;
  }

  public void setGrjcjs个人缴存基数(double grjcjs个人缴存基数) {
    this.grjcjs个人缴存基数 = grjcjs个人缴存基数;
  }

  public String getGrzhzt个人账户状态() {
    return grzhzt个人账户状态;
  }

  public void setGrzhzt个人账户状态(String grzhzt个人账户状态) {
    this.grzhzt个人账户状态 = grzhzt个人账户状态;
  }

  public Date getKhrq开户日期() {
    return khrq开户日期;
  }

  public void setKhrq开户日期(Date khrq开户日期) {
    this.khrq开户日期 = khrq开户日期;
  }

  public double getGrzhye个人账户余额() {
    return grzhye个人账户余额;
  }

  public void setGrzhye个人账户余额(double grzhye个人账户余额) {
    this.grzhye个人账户余额 = grzhye个人账户余额;
  }

  public double getGrzhsnjzye个人账户上年结转余额() {
    return grzhsnjzye个人账户上年结转余额;
  }

  public void setGrzhsnjzye个人账户上年结转余额(double grzhsnjzye个人账户上年结转余额) {
    this.grzhsnjzye个人账户上年结转余额 = grzhsnjzye个人账户上年结转余额;
  }

  public double getGrzhdngjye个人账户当年归集余额() {
    return grzhdngjye个人账户当年归集余额;
  }

  public void setGrzhdngjye个人账户当年归集余额(double grzhdngjye个人账户当年归集余额) {
    this.grzhdngjye个人账户当年归集余额 = grzhdngjye个人账户当年归集余额;
  }

  public double getGryjce个人月缴存额() {
    return gryjce个人月缴存额;
  }

  public void setGryjce个人月缴存额(double gryjce个人月缴存额) {
    this.gryjce个人月缴存额 = gryjce个人月缴存额;
  }

  public double getDwyjce单位月缴存额() {
    return dwyjce单位月缴存额;
  }

  public void setDwyjce单位月缴存额(double dwyjce单位月缴存额) {
    this.dwyjce单位月缴存额 = dwyjce单位月缴存额;
  }

  public Date getXhrq销户日期() {
    return xhrq销户日期;
  }

  public void setXhrq销户日期(Date xhrq销户日期) {
    this.xhrq销户日期 = xhrq销户日期;
  }

  public String getXhyy销户原因() {
    return xhyy销户原因;
  }

  public void setXhyy销户原因(String xhyy销户原因) {
    this.xhyy销户原因 = xhyy销户原因;
  }

  public String getGrckzhhm个人存款账户号码() {
    return grckzhhm个人存款账户号码;
  }

  public void setGrckzhhm个人存款账户号码(String grckzhhm个人存款账户号码) {
    this.grckzhhm个人存款账户号码 = grckzhhm个人存款账户号码;
  }

  public String getGrckzhkhyhmc个人存款账户开户银行名称() {
    return grckzhkhyhmc个人存款账户开户银行名称;
  }

  public void setGrckzhkhyhmc个人存款账户开户银行名称(String grckzhkhyhmc个人存款账户开户银行名称) {
    this.grckzhkhyhmc个人存款账户开户银行名称 = grckzhkhyhmc个人存款账户开户银行名称;
  }

  public String getGrckzhkhyhdm个人存款账户开户银行代码() {
    return grckzhkhyhdm个人存款账户开户银行代码;
  }

  public void setGrckzhkhyhdm个人存款账户开户银行代码(String grckzhkhyhdm个人存款账户开户银行代码) {
    this.grckzhkhyhdm个人存款账户开户银行代码 = grckzhkhyhdm个人存款账户开户银行代码;
  }

  public String getZxbh中心编号() {
    return zxbh中心编号;
  }

  public void setZxbh中心编号(String zxbh中心编号) {
    this.zxbh中心编号 = zxbh中心编号;
  }

  public LocalDateTime getLastUpdateTime最后更新时间戳() {
    return lastUpdateTime最后更新时间戳;
  }

  public void setLastUpdateTime最后更新时间戳(LocalDateTime lastUpdateTime最后更新时间戳) {
    this.lastUpdateTime最后更新时间戳 = lastUpdateTime最后更新时间戳;
  }
}
