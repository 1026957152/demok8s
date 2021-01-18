package com.example.dm.domain;



import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Ac0101")
public class Ac0101_客户账户信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  /*  comment on column WITHRUN.AC0101.ID is '序号';

  comment on column WITHRUN.AC0101.CUSTID is '个人客户号';

  comment on column WITHRUN.AC0101.PRODUCTNUM is '产品编码';

  comment on column WITHRUN.AC0101.CUSTACCNUM is '客户账号';

  comment on column WITHRUN.AC0101.CUSTTYPE is '客户类型';

  comment on column WITHRUN.AC0101.EXPIREDATE is '到期日期';*/
  @Id
  @Column(name = "id")
  private long id_序号;
  @Column(name = "custid")
  private String custid_个人客户号;
  @Column(name = "productnum")
  private String productnum_产品编码;
  @Column(name = "custaccnum")
  private String custaccnum_客户账号;
  @Column(name = "custtype")
  private String custtype_客户类型;
  @Column(name = "expiredate")
  private java.sql.Date expiredate_到期日期;

/*  comment on column WITHRUN.AC0101.ACCOUNTSOURCE is '账户来源';

  comment on column WITHRUN.AC0101.ACCOUNTINST is '账户机构';

  comment on column WITHRUN.AC0101.ACCOUNTSTATUS is '账户状态';

  comment on column WITHRUN.AC0101.ACCOUNTNUMBER is '账户数量';

  comment on column WITHRUN.AC0101.VALIDACCOUNTNUMBER is '有效账户数量';

  comment on column WITHRUN.AC0101.INVALIDACCOUNTNUMBER is '无效账户数量';

  comment on column WITHRUN.AC0101.BAL is '余额';
  */
  @Column(name = "accountsource")
  private String accountsource_账户来源;
  @Column(name = "accountinst")
  private String accountinst_账户机构;
  @Column(name = "accountstatus")
  private String accountstatus_账户状态;
  @Column(name = "accountnumber")
  private long accountnumber_账户数量;
  @Column(name = "validaccountnumber")
  private long validaccountnumber_有效账户数量;
  @Column(name = "invalidaccountnumber")
  private long invalidaccountnumber_无效账户数量;
  @Column(name = "bal")
  private double bal_余额;



//  comment on column WITHRUN.AC0101.ACCOUNTCATEG is '账户分类';
//
//  comment on column WITHRUN.AC0101.OPENDATE is '开户日期';
//
//  comment on column WITHRUN.AC0101.CLOSEDATE is '销户日期';
//
//  comment on column WITHRUN.AC0101.CREATEINST is '建立机构';
//
//  comment on column WITHRUN.AC0101.CREATEUSER is '建立用户';
//
//  comment on column WITHRUN.AC0101.CREATETIME is '创建时间';
//
//  comment on column WITHRUN.AC0101.MAINTAININST is '维护机构';
//
//  comment on column WITHRUN.AC0101.MAINTAINUSER is '维护用户';
//
//  comment on column WITHRUN.AC0101.UPDATETIME is '最后更新时间戳';
  @Column(name = "accountcateg")
  private String accountcateg_账户分类;
  @Column(name = "opendate")
  private java.sql.Date opendate_开户日期;
  @Column(name = "closedate")
  private java.sql.Date closedate_销户日期;
  @Column(name = "createinst")
  private String createinst_建立机构;
  @Column(name = "createuser")
  private String createuser_建立用户;
  @Column(name = "createtime")
  private LocalDateTime createtime_创建时间;
  @Column(name = "maintaininst")
  private String maintaininst_维护机构;
  @Column(name = "maintainuser")
  private String maintainuser_维护用户;
  @Column(name = "updatetime")
  private LocalDateTime updatetime_最后更新时间戳;


  public long getId_序号() {
    return id_序号;
  }

  public void setId_序号(long id_序号) {
    this.id_序号 = id_序号;
  }

  public String getCustid_个人客户号() {
    return custid_个人客户号;
  }

  public void setCustid_个人客户号(String custid_个人客户号) {
    this.custid_个人客户号 = custid_个人客户号;
  }

  public String getProductnum_产品编码() {
    return productnum_产品编码;
  }

  public void setProductnum_产品编码(String productnum_产品编码) {
    this.productnum_产品编码 = productnum_产品编码;
  }

  public String getCustaccnum_客户账号() {
    return custaccnum_客户账号;
  }

  public void setCustaccnum_客户账号(String custaccnum_客户账号) {
    this.custaccnum_客户账号 = custaccnum_客户账号;
  }

  public String getCusttype_客户类型() {
    return custtype_客户类型;
  }

  public void setCusttype_客户类型(String custtype_客户类型) {
    this.custtype_客户类型 = custtype_客户类型;
  }

  public Date getExpiredate_到期日期() {
    return expiredate_到期日期;
  }

  public void setExpiredate_到期日期(Date expiredate_到期日期) {
    this.expiredate_到期日期 = expiredate_到期日期;
  }

  public String getAccountsource_账户来源() {
    return accountsource_账户来源;
  }

  public void setAccountsource_账户来源(String accountsource_账户来源) {
    this.accountsource_账户来源 = accountsource_账户来源;
  }

  public String getAccountinst_账户机构() {
    return accountinst_账户机构;
  }

  public void setAccountinst_账户机构(String accountinst_账户机构) {
    this.accountinst_账户机构 = accountinst_账户机构;
  }

  public String getAccountstatus_账户状态() {
    return accountstatus_账户状态;
  }

  public void setAccountstatus_账户状态(String accountstatus_账户状态) {
    this.accountstatus_账户状态 = accountstatus_账户状态;
  }

  public long getAccountnumber_账户数量() {
    return accountnumber_账户数量;
  }

  public void setAccountnumber_账户数量(long accountnumber_账户数量) {
    this.accountnumber_账户数量 = accountnumber_账户数量;
  }

  public long getValidaccountnumber_有效账户数量() {
    return validaccountnumber_有效账户数量;
  }

  public void setValidaccountnumber_有效账户数量(long validaccountnumber_有效账户数量) {
    this.validaccountnumber_有效账户数量 = validaccountnumber_有效账户数量;
  }

  public long getInvalidaccountnumber_无效账户数量() {
    return invalidaccountnumber_无效账户数量;
  }

  public void setInvalidaccountnumber_无效账户数量(long invalidaccountnumber_无效账户数量) {
    this.invalidaccountnumber_无效账户数量 = invalidaccountnumber_无效账户数量;
  }

  public double getBal_余额() {
    return bal_余额;
  }

  public void setBal_余额(double bal_余额) {
    this.bal_余额 = bal_余额;
  }

  public String getAccountcateg_账户分类() {
    return accountcateg_账户分类;
  }

  public void setAccountcateg_账户分类(String accountcateg_账户分类) {
    this.accountcateg_账户分类 = accountcateg_账户分类;
  }

  public Date getOpendate_开户日期() {
    return opendate_开户日期;
  }

  public void setOpendate_开户日期(Date opendate_开户日期) {
    this.opendate_开户日期 = opendate_开户日期;
  }

  public Date getClosedate_销户日期() {
    return closedate_销户日期;
  }

  public void setClosedate_销户日期(Date closedate_销户日期) {
    this.closedate_销户日期 = closedate_销户日期;
  }

  public String getCreateinst_建立机构() {
    return createinst_建立机构;
  }

  public void setCreateinst_建立机构(String createinst_建立机构) {
    this.createinst_建立机构 = createinst_建立机构;
  }

  public String getCreateuser_建立用户() {
    return createuser_建立用户;
  }

  public void setCreateuser_建立用户(String createuser_建立用户) {
    this.createuser_建立用户 = createuser_建立用户;
  }

  public String getMaintaininst_维护机构() {
    return maintaininst_维护机构;
  }

  public void setMaintaininst_维护机构(String maintaininst_维护机构) {
    this.maintaininst_维护机构 = maintaininst_维护机构;
  }

  public String getMaintainuser_维护用户() {
    return maintainuser_维护用户;
  }

  public void setMaintainuser_维护用户(String maintainuser_维护用户) {
    this.maintainuser_维护用户 = maintainuser_维护用户;
  }

  public LocalDateTime getCreatetime_创建时间() {
    return createtime_创建时间;
  }

  public void setCreatetime_创建时间(LocalDateTime createtime_创建时间) {
    this.createtime_创建时间 = createtime_创建时间;
  }

  public LocalDateTime getUpdatetime_最后更新时间戳() {
    return updatetime_最后更新时间戳;
  }

  public void setUpdatetime_最后更新时间戳(LocalDateTime updatetime_最后更新时间戳) {
    this.updatetime_最后更新时间戳 = updatetime_最后更新时间戳;
  }
}
