package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

import java.time.LocalDateTime;

@Entity
@Table(name = "Dp0106")
public class Dp0106单位账户信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*  comment on column WITHRUN.DP0106.ID is 'id';

  comment on column WITHRUN.DP0106.DWZH is '';

  comment on column WITHRUN.DP0106.UNITACCNUM is '单位账号';

  comment on column WITHRUN.DP0106.DWJCBL is '单位缴存比例';

  comment on column WITHRUN.DP0106.GRJCBL is '个人缴存比例';

  comment on column WITHRUN.DP0106.DWJCRS is '单位缴存人数';

  comment on column WITHRUN.DP0106.DWFCRS is '单位封存人数';*/

  @Id
  @Column(name = "id")
  private long id;
  @Column(name = "dwzh")
  private String dwzh单位账号_外部;
  @Column(name = "unitaccnum")
  private String unitaccnum单位账号;
  @Column(name = "dwjcbl")
  private double dwjcbl单位缴存比例;
  @Column(name = "grjcbl")
  private double grjcbl个人缴存比例;
  @Column(name = "dwjcrs")
  private long dwjcrs单位缴存人数;
  @Column(name = "dwfcrs")
  private long dwfcrs单位封存人数;

/*  comment on column WITHRUN.DP0106.DWZHYE is '单位账户余额';

  comment on column WITHRUN.DP0106.DWXHRQ is '单位销户日期';

  comment on column WITHRUN.DP0106.DWXHYY is '单位销户原因';

  comment on column WITHRUN.DP0106.DWZHZT is '单位账户状态';

  comment on column WITHRUN.DP0106.JZNY is '缴至年月';

  comment on column WITHRUN.DP0106.ZXBH is '中心编号';

  comment on column WITHRUN.DP0106.LAST_UPDATE_TIME is '最后更新时间戳';*/
  @Column(name = "dwzhye")
  private double dwzhye单位账户余额;
  @Column(name = "dwxhrq")
  private java.sql.Date dwxhrq单位销户日期;
  @Column(name = "dwxhyy")
  private String dwxhyy单位销户原因;
  @Column(name = "dwzhzt")
  private String dwzhzt单位账户状态;
  @Column(name = "jzny")
  private String jzny缴至年月;
  @Column(name = "zxbh")
  private String zxbh中心编号;
  @Column(name = "last_Update_Time")
  private LocalDateTime lastUpdateTime最后更新时间戳;

  public LocalDateTime getLastUpdateTime最后更新时间戳() {
    return lastUpdateTime最后更新时间戳;
  }

  public void setLastUpdateTime最后更新时间戳(LocalDateTime lastUpdateTime最后更新时间戳) {
    this.lastUpdateTime最后更新时间戳 = lastUpdateTime最后更新时间戳;
  }
//comment on table WITHRUN.DP0106 is '单位账户信息';


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDwzh单位账号_外部() {
    return dwzh单位账号_外部;
  }

  public void setDwzh单位账号_外部(String dwzh单位账号_外部) {
    this.dwzh单位账号_外部 = dwzh单位账号_外部;
  }

  public String getUnitaccnum单位账号() {
    return unitaccnum单位账号;
  }

  public void setUnitaccnum单位账号(String unitaccnum单位账号) {
    this.unitaccnum单位账号 = unitaccnum单位账号;
  }

  public double getDwjcbl单位缴存比例() {
    return dwjcbl单位缴存比例;
  }

  public void setDwjcbl单位缴存比例(double dwjcbl单位缴存比例) {
    this.dwjcbl单位缴存比例 = dwjcbl单位缴存比例;
  }

  public double getGrjcbl个人缴存比例() {
    return grjcbl个人缴存比例;
  }

  public void setGrjcbl个人缴存比例(double grjcbl个人缴存比例) {
    this.grjcbl个人缴存比例 = grjcbl个人缴存比例;
  }

  public long getDwjcrs单位缴存人数() {
    return dwjcrs单位缴存人数;
  }

  public void setDwjcrs单位缴存人数(long dwjcrs单位缴存人数) {
    this.dwjcrs单位缴存人数 = dwjcrs单位缴存人数;
  }

  public long getDwfcrs单位封存人数() {
    return dwfcrs单位封存人数;
  }

  public void setDwfcrs单位封存人数(long dwfcrs单位封存人数) {
    this.dwfcrs单位封存人数 = dwfcrs单位封存人数;
  }

  public double getDwzhye单位账户余额() {
    return dwzhye单位账户余额;
  }

  public void setDwzhye单位账户余额(double dwzhye单位账户余额) {
    this.dwzhye单位账户余额 = dwzhye单位账户余额;
  }

  public Date getDwxhrq单位销户日期() {
    return dwxhrq单位销户日期;
  }

  public void setDwxhrq单位销户日期(Date dwxhrq单位销户日期) {
    this.dwxhrq单位销户日期 = dwxhrq单位销户日期;
  }

  public String getDwxhyy单位销户原因() {
    return dwxhyy单位销户原因;
  }

  public void setDwxhyy单位销户原因(String dwxhyy单位销户原因) {
    this.dwxhyy单位销户原因 = dwxhyy单位销户原因;
  }

  public String getDwzhzt单位账户状态() {
    return dwzhzt单位账户状态;
  }

  public void setDwzhzt单位账户状态(String dwzhzt单位账户状态) {
    this.dwzhzt单位账户状态 = dwzhzt单位账户状态;
  }

  public String getJzny缴至年月() {
    return jzny缴至年月;
  }

  public void setJzny缴至年月(String jzny缴至年月) {
    this.jzny缴至年月 = jzny缴至年月;
  }

  public String getZxbh中心编号() {
    return zxbh中心编号;
  }

  public void setZxbh中心编号(String zxbh中心编号) {
    this.zxbh中心编号 = zxbh中心编号;
  }


}
