package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Dp0104")
public class Dp0104个人客户基本信息 {











  @Id
  @Column(name = "id")
  private long id;
  @Column(name = "grzh")
  private String grzh个人账号外部;
  @Column(name = "accnum")
  private String accnum个人账号;
  @Column(name = "xingming")
  private String xingming姓名;
  @Column(name = "xmqp")
  private String xmqp姓名全拼;
  @Column(name = "xingbie")
  private String xingbie性别;
  @Column(name = "gddhhm")
  private String gddhhm固定电话号码;
  @Column(name = "sjhm")
  private String sjhm手机号码;
/*  comment on column WITHRUN.DP0104.XINGBIE is '性别';

  comment on column WITHRUN.DP0104.GDDHHM is '固定电话号码';

  comment on column WITHRUN.DP0104.SJHM is '手机号码';*/
/*
  comment on table WITHRUN.DP0104 is '';

  comment on column WITHRUN.DP0104.ID is 'id';

  comment on column WITHRUN.DP0104.GRZH is '个人账号（外部）';

  comment on column WITHRUN.DP0104.ACCNUM is '个人账号';

  comment on column WITHRUN.DP0104.XINGMING is '姓名';

  comment on column WITHRUN.DP0104.XMQP is '姓名全拼';*/


/*  comment on column WITHRUN.DP0104.ZJLX is '证件类型';

  comment on column WITHRUN.DP0104.ZJHM is '证件号码';

  comment on column WITHRUN.DP0104.CSNY is '出生年月';

  comment on column WITHRUN.DP0104.HYZK is '婚姻状况';

  comment on column WITHRUN.DP0104.ZHIYE is '职业';

  comment on column WITHRUN.DP0104.ZHICHEN is '职称';

  comment on column WITHRUN.DP0104.ZHIWU is '职务';*/
  @Column(name = "zjlx")
  private String zjlx证件类型;
  @Column(name = "zjhm")
  private String zjhm证件号码;

  @Column(name = "csny")
  private String csny出生年月;
  @Column(name = "hyzk")
  private String hyzk婚姻状况;
  @Column(name = "zhiye")
  private String zhiye职业;
  @Column(name = "zhichen")
  private String zhichen职称;
  @Column(name = "zhiwu")
  private String zhiwu职务;

/*
  comment on column WITHRUN.DP0104.XUELI is '学历';

  comment on column WITHRUN.DP0104.YZBM is '邮政编码';

  comment on column WITHRUN.DP0104.JTZZ is '家庭住址';

  comment on column WITHRUN.DP0104.JTYSR is '家庭月收入';

  comment on column WITHRUN.DP0104.ZXBH is '中心编号';

  comment on column WITHRUN.DP0104.LAST_UPDATE_TIME is '最后更新时间戳';*/
  @Column(name = "xueli")
  private String xueli学历;
  @Column(name = "yzbm")
  private String yzbm邮政编码;
  @Column(name = "jtzz")
  private String jtzz家庭住址;
  @Column(name = "jtysr")
  private double jtysr家庭月收入;
  @Column(name = "zxbh")
  private String zxbh中心编号;

  @Column(name = "last_Update_Time")
  private LocalDateTime lastUpdateTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public String getXingming姓名() {
    return xingming姓名;
  }

  public void setXingming姓名(String xingming姓名) {
    this.xingming姓名 = xingming姓名;
  }

  public String getXmqp姓名全拼() {
    return xmqp姓名全拼;
  }

  public void setXmqp姓名全拼(String xmqp姓名全拼) {
    this.xmqp姓名全拼 = xmqp姓名全拼;
  }

  public String getXingbie性别() {
    return xingbie性别;
  }

  public void setXingbie性别(String xingbie性别) {
    this.xingbie性别 = xingbie性别;
  }

  public String getGddhhm固定电话号码() {
    return gddhhm固定电话号码;
  }

  public void setGddhhm固定电话号码(String gddhhm固定电话号码) {
    this.gddhhm固定电话号码 = gddhhm固定电话号码;
  }

  public String getSjhm手机号码() {
    return sjhm手机号码;
  }

  public void setSjhm手机号码(String sjhm手机号码) {
    this.sjhm手机号码 = sjhm手机号码;
  }

  public String getZjlx证件类型() {
    return zjlx证件类型;
  }

  public void setZjlx证件类型(String zjlx证件类型) {
    this.zjlx证件类型 = zjlx证件类型;
  }

  public String getZjhm证件号码() {
    return zjhm证件号码;
  }

  public void setZjhm证件号码(String zjhm证件号码) {
    this.zjhm证件号码 = zjhm证件号码;
  }

  public String getCsny出生年月() {
    return csny出生年月;
  }

  public void setCsny出生年月(String csny出生年月) {
    this.csny出生年月 = csny出生年月;
  }

  public String getHyzk婚姻状况() {
    return hyzk婚姻状况;
  }

  public void setHyzk婚姻状况(String hyzk婚姻状况) {
    this.hyzk婚姻状况 = hyzk婚姻状况;
  }

  public String getZhiye职业() {
    return zhiye职业;
  }

  public void setZhiye职业(String zhiye职业) {
    this.zhiye职业 = zhiye职业;
  }

  public String getZhichen职称() {
    return zhichen职称;
  }

  public void setZhichen职称(String zhichen职称) {
    this.zhichen职称 = zhichen职称;
  }

  public String getZhiwu职务() {
    return zhiwu职务;
  }

  public void setZhiwu职务(String zhiwu职务) {
    this.zhiwu职务 = zhiwu职务;
  }

  public String getXueli学历() {
    return xueli学历;
  }

  public void setXueli学历(String xueli学历) {
    this.xueli学历 = xueli学历;
  }

  public String getYzbm邮政编码() {
    return yzbm邮政编码;
  }

  public void setYzbm邮政编码(String yzbm邮政编码) {
    this.yzbm邮政编码 = yzbm邮政编码;
  }

  public String getJtzz家庭住址() {
    return jtzz家庭住址;
  }

  public void setJtzz家庭住址(String jtzz家庭住址) {
    this.jtzz家庭住址 = jtzz家庭住址;
  }

  public double getJtysr家庭月收入() {
    return jtysr家庭月收入;
  }

  public void setJtysr家庭月收入(double jtysr家庭月收入) {
    this.jtysr家庭月收入 = jtysr家庭月收入;
  }

  public String getZxbh中心编号() {
    return zxbh中心编号;
  }

  public void setZxbh中心编号(String zxbh中心编号) {
    this.zxbh中心编号 = zxbh中心编号;
  }
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  public LocalDateTime getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

/*  public Timestamp getLastUpdateTime最后更新时间戳() {
    return lastUpdateTime最后更新时间戳;
  }

  public void setLastUpdateTime最后更新时间戳(Timestamp lastUpdateTime最后更新时间戳) {
    this.lastUpdateTime最后更新时间戳 = lastUpdateTime最后更新时间戳;
  }*/
}
