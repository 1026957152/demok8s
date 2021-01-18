package com.example.dm.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Ac0103")
public class Ac0103客户与应用账户关联表 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*  comment on column WITHRUN.AC0103.ID is '序号';

  comment on column WITHRUN.AC0103.CUSTACCNUM is '客户账号';

  comment on column WITHRUN.AC0103.APPACCNUM is '应用账号';

  comment on column WITHRUN.AC0103.ACCOUNTTYPE is '账户类型';

  comment on column WITHRUN.AC0103.CUSTID is '个人客户号';

  comment on column WITHRUN.AC0103.EXTACCNUM is '外部账号';

  comment on column WITHRUN.AC0103.ISDEFAULTACCOUNT is '是否默认账户';

  comment on column WITHRUN.AC0103.RESERVECHAR is '预留字符';*/

  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "custaccnum")
  private String custaccnum客户账号;
  @Column(name = "appaccnum")
  private String appaccnum应用账号;
  @Column(name = "accounttype")
  private String accounttype账户类型;
  @Column(name = "custid")
  private String custid个人客户号;
  @Column(name = "extaccnum")
  private String extaccnum外部账号;
  @Column(name = "isdefaultaccount")
  private long isdefaultaccount是否默认账户;
  @Column(name = "reservechar")
  private String reservechar预留字符;
  @Column(name = "createinst")
  private String createinst建立机构;
  @Column(name = "createuser")
  private String createuser建立用户;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "maintaininst")
  private String maintaininst维护机构;
  @Column(name = "maintainuser")
  private String maintainuser维护用户;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;

/*  comment on column WITHRUN.AC0103.CREATEINST is '建立机构';

  comment on column WITHRUN.AC0103.CREATEUSER is '建立用户';

  comment on column WITHRUN.AC0103.CREATETIME is '创建时间';

  comment on column WITHRUN.AC0103.MAINTAININST is '维护机构';

  comment on column WITHRUN.AC0103.MAINTAINUSER is '维护用户';

  comment on column WITHRUN.AC0103.UPDATETIME is '最后更新时间戳';*/

/*  comment on table WITHRUN.AC0103 is '客户与应用账户关联表';



  comment on column WITHRUN.AC0103.CREATEINST is '建立机构';

  comment on column WITHRUN.AC0103.CREATEUSER is '建立用户';

  comment on column WITHRUN.AC0103.CREATETIME is '创建时间';

  comment on column WITHRUN.AC0103.MAINTAININST is '维护机构';

  comment on column WITHRUN.AC0103.MAINTAINUSER is '维护用户';

  comment on column WITHRUN.AC0103.UPDATETIME is '最后更新时间戳';*/

  public long getId序号() {
    return id序号;
  }

  public void setId序号(long id序号) {
    this.id序号 = id序号;
  }

  public String getCustaccnum客户账号() {
    return custaccnum客户账号;
  }

  public void setCustaccnum客户账号(String custaccnum客户账号) {
    this.custaccnum客户账号 = custaccnum客户账号;
  }

  public String getAppaccnum应用账号() {
    return appaccnum应用账号;
  }

  public void setAppaccnum应用账号(String appaccnum应用账号) {
    this.appaccnum应用账号 = appaccnum应用账号;
  }

  public String getAccounttype账户类型() {
    return accounttype账户类型;
  }

  public void setAccounttype账户类型(String accounttype账户类型) {
    this.accounttype账户类型 = accounttype账户类型;
  }

  public String getCustid个人客户号() {
    return custid个人客户号;
  }

  public void setCustid个人客户号(String custid个人客户号) {
    this.custid个人客户号 = custid个人客户号;
  }

  public String getExtaccnum外部账号() {
    return extaccnum外部账号;
  }

  public void setExtaccnum外部账号(String extaccnum外部账号) {
    this.extaccnum外部账号 = extaccnum外部账号;
  }

  public long getIsdefaultaccount是否默认账户() {
    return isdefaultaccount是否默认账户;
  }

  public void setIsdefaultaccount是否默认账户(long isdefaultaccount是否默认账户) {
    this.isdefaultaccount是否默认账户 = isdefaultaccount是否默认账户;
  }

  public String getReservechar预留字符() {
    return reservechar预留字符;
  }

  public void setReservechar预留字符(String reservechar预留字符) {
    this.reservechar预留字符 = reservechar预留字符;
  }

  public String getCreateinst建立机构() {
    return createinst建立机构;
  }

  public void setCreateinst建立机构(String createinst建立机构) {
    this.createinst建立机构 = createinst建立机构;
  }

  public String getCreateuser建立用户() {
    return createuser建立用户;
  }

  public void setCreateuser建立用户(String createuser建立用户) {
    this.createuser建立用户 = createuser建立用户;
  }


  public String getMaintaininst维护机构() {
    return maintaininst维护机构;
  }

  public void setMaintaininst维护机构(String maintaininst维护机构) {
    this.maintaininst维护机构 = maintaininst维护机构;
  }

  public String getMaintainuser维护用户() {
    return maintainuser维护用户;
  }

  public void setMaintainuser维护用户(String maintainuser维护用户) {
    this.maintainuser维护用户 = maintainuser维护用户;
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
}
