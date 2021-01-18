package com.example.dm.domain;


import javax.persistence.*;

import java.time.LocalDateTime;

@IdClass(Ln2108_key.class)
@Entity
@Table(name = "Ln2108")
public class Ln2108借款人信息 {


  @Id
  @Column(name = "contractcode")
  private String contractcode合同代码;

  @Id
  @Column(name = "borrowertype")
  private String borrowertype借款人类型;
  @Column(name = "isdp")
  private String isdp是否本地缴存;
  @Column(name = "dpcenter")
  private String dpcenter异地缴存中心;

  @Id
  @Column(name = "custid")
  private String custid个人客户号;

  @Id
  @Column(name = "accnum")
  private String accnum个人账号;
  @Column(name = "lnrelaship")
  private String lnrelaship参贷关系;
  @Column(name = "creditsituation")
  private String creditsituation征信情况;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;

/*  comment on table WITHRUN.LN2108 is '借款人信息';

  comment on column WITHRUN.LN2108.CONTRACTCODE is '合同代码';

  comment on column WITHRUN.LN2108.BORROWERTYPE is '借款人类型';

  comment on column WITHRUN.LN2108.ISDP is '是否本地缴存';

  comment on column WITHRUN.LN2108.DPCENTER is '异地缴存中心';

  comment on column WITHRUN.LN2108.CUSTID is '个人客户号';

  comment on column WITHRUN.LN2108.ACCNUM is '个人账号';

  comment on column WITHRUN.LN2108.LNRELASHIP is '参贷关系';

  comment on column WITHRUN.LN2108.CREDITSITUATION is '征信情况';

  comment on column WITHRUN.LN2108.CITYCODE is '城市代码';

  comment on column WITHRUN.LN2108.CREATETIME is '创建时间';

  comment on column WITHRUN.LN2108.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.LN2108.FREEUSECHAR1 is '备用字符1';*/

  public String getContractcode合同代码() {
    return contractcode合同代码;
  }

  public void setContractcode合同代码(String contractcode合同代码) {
    this.contractcode合同代码 = contractcode合同代码;
  }

  public String getBorrowertype借款人类型() {
    return borrowertype借款人类型;
  }

  public void setBorrowertype借款人类型(String borrowertype借款人类型) {
    this.borrowertype借款人类型 = borrowertype借款人类型;
  }

  public String getIsdp是否本地缴存() {
    return isdp是否本地缴存;
  }

  public void setIsdp是否本地缴存(String isdp是否本地缴存) {
    this.isdp是否本地缴存 = isdp是否本地缴存;
  }

  public String getDpcenter异地缴存中心() {
    return dpcenter异地缴存中心;
  }

  public void setDpcenter异地缴存中心(String dpcenter异地缴存中心) {
    this.dpcenter异地缴存中心 = dpcenter异地缴存中心;
  }

  public String getCustid个人客户号() {
    return custid个人客户号;
  }

  public void setCustid个人客户号(String custid个人客户号) {
    this.custid个人客户号 = custid个人客户号;
  }

  public String getAccnum个人账号() {
    return accnum个人账号;
  }

  public void setAccnum个人账号(String accnum个人账号) {
    this.accnum个人账号 = accnum个人账号;
  }

  public String getLnrelaship参贷关系() {
    return lnrelaship参贷关系;
  }

  public void setLnrelaship参贷关系(String lnrelaship参贷关系) {
    this.lnrelaship参贷关系 = lnrelaship参贷关系;
  }

  public String getCreditsituation征信情况() {
    return creditsituation征信情况;
  }

  public void setCreditsituation征信情况(String creditsituation征信情况) {
    this.creditsituation征信情况 = creditsituation征信情况;
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
