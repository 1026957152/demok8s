package com.example.dm.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.*;
import java.sql.Date;

import java.time.LocalDateTime;

@IdClass(Ln0303_key.class)
@Entity
@Table(name = "Ln0303")
public class Ln0303共同借款人信息 {

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  @Id
  @Column(name = "contractcode")
  private String contractcode合同代码;

  @Id
  @Column(name = "custid")
  private String custid个人客户号;

  @Column(name = "gtjkrgjjzh")
  private String gtjkrgjjzh共同借款人公积金账号;
  @Column(name = "jkhtbh")
  private String jkhtbh借款合同编号;
  @Column(name = "gtjkrxm")
  private String gtjkrxm共同借款人姓名;
  @Column(name = "gtjkrzjlx")
  private String gtjkrzjlx共同借款人证件类型;
  @Column(name = "gtjkrzjhm")
  private String gtjkrzjhm共同借款人证件号码;
  @Column(name = "ysr")
  private double ysr月收入;
  @Column(name = "cdgx")
  private String cdgx参贷关系;
  @Column(name = "sjhm")
  private String sjhm手机号码;
  @Column(name = "zxbh")
  private String zxbh中心编号;
  @Column(name = "last_Update_Time")
  private LocalDateTime lastUpdateTime最后更新时间戳;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;

  public void setLastUpdateTime最后更新时间戳(LocalDateTime lastUpdateTime最后更新时间戳) {
    this.lastUpdateTime最后更新时间戳 = lastUpdateTime最后更新时间戳;
  }

  public LocalDateTime getCreatetime创建时间() {
    return createtime创建时间;
  }

  public void setCreatetime创建时间(LocalDateTime createtime创建时间) {
    this.createtime创建时间 = createtime创建时间;
  }

  /*
  comment on table WITHRUN.LN0303 is '共同借款人信息';

  comment on column WITHRUN.LN0303.CONTRACTCODE is '合同代码';

  comment on column WITHRUN.LN0303.CUSTID is '个人客户号';

  comment on column WITHRUN.LN0303.GTJKRGJJZH is '共同借款人公积金账号';

  comment on column WITHRUN.LN0303.JKHTBH is '借款合同编号';

  comment on column WITHRUN.LN0303.GTJKRXM is '共同借款人姓名';

  comment on column WITHRUN.LN0303.GTJKRZJLX is '共同借款人证件类型';

  comment on column WITHRUN.LN0303.GTJKRZJHM is '共同借款人证件号码';

  comment on column WITHRUN.LN0303.YSR is '月收入';

  comment on column WITHRUN.LN0303.CDGX is '参贷关系';

  comment on column WITHRUN.LN0303.SJHM is '手机号码';

  comment on column WITHRUN.LN0303.ZXBH is '中心编号';

  comment on column WITHRUN.LN0303.LAST_UPDATE_TIME is '最后更新时间戳';

  comment on column WITHRUN.LN0303.CITYCODE is '城市代码';

  comment on column WITHRUN.LN0303.CREATETIME is '创建时间';*/

  public String getContractcode合同代码() {
    return contractcode合同代码;
  }

  public void setContractcode合同代码(String contractcode合同代码) {
    this.contractcode合同代码 = contractcode合同代码;
  }

  public String getCustid个人客户号() {
    return custid个人客户号;
  }

  public void setCustid个人客户号(String custid个人客户号) {
    this.custid个人客户号 = custid个人客户号;
  }

  public String getGtjkrgjjzh共同借款人公积金账号() {
    return gtjkrgjjzh共同借款人公积金账号;
  }

  public void setGtjkrgjjzh共同借款人公积金账号(String gtjkrgjjzh共同借款人公积金账号) {
    this.gtjkrgjjzh共同借款人公积金账号 = gtjkrgjjzh共同借款人公积金账号;
  }

  public String getJkhtbh借款合同编号() {
    return jkhtbh借款合同编号;
  }

  public void setJkhtbh借款合同编号(String jkhtbh借款合同编号) {
    this.jkhtbh借款合同编号 = jkhtbh借款合同编号;
  }

  public String getGtjkrxm共同借款人姓名() {
    return gtjkrxm共同借款人姓名;
  }

  public void setGtjkrxm共同借款人姓名(String gtjkrxm共同借款人姓名) {
    this.gtjkrxm共同借款人姓名 = gtjkrxm共同借款人姓名;
  }

  public String getGtjkrzjlx共同借款人证件类型() {
    return gtjkrzjlx共同借款人证件类型;
  }

  public void setGtjkrzjlx共同借款人证件类型(String gtjkrzjlx共同借款人证件类型) {
    this.gtjkrzjlx共同借款人证件类型 = gtjkrzjlx共同借款人证件类型;
  }

  public String getGtjkrzjhm共同借款人证件号码() {
    return gtjkrzjhm共同借款人证件号码;
  }

  public void setGtjkrzjhm共同借款人证件号码(String gtjkrzjhm共同借款人证件号码) {
    this.gtjkrzjhm共同借款人证件号码 = gtjkrzjhm共同借款人证件号码;
  }

  public double getYsr月收入() {
    return ysr月收入;
  }

  public void setYsr月收入(double ysr月收入) {
    this.ysr月收入 = ysr月收入;
  }

  public String getCdgx参贷关系() {
    return cdgx参贷关系;
  }

  public void setCdgx参贷关系(String cdgx参贷关系) {
    this.cdgx参贷关系 = cdgx参贷关系;
  }

  public String getSjhm手机号码() {
    return sjhm手机号码;
  }

  public void setSjhm手机号码(String sjhm手机号码) {
    this.sjhm手机号码 = sjhm手机号码;
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

  public String getCitycode城市代码() {
    return citycode城市代码;
  }

  public void setCitycode城市代码(String citycode城市代码) {
    this.citycode城市代码 = citycode城市代码;
  }


}
