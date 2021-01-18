package com.example.dm.domain;



import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Cm0011")
public class Cm0011企业客户银行账户信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  // comment on table WITHRUN.CM0011 is '企业客户银行账户信息';



/*


  comment on column WITHRUN.CM0011.ID is '序号';

  comment on column WITHRUN.CM0011.ACCOUNTNUM is '账户编号';

  comment on column WITHRUN.CM0011.UNITCUSTID is '单位客户号';

  comment on column WITHRUN.CM0011.ACCOUNTNAME is '账户户名';

  comment on column WITHRUN.CM0011.BANKACCNUM is '银行账号';

  comment on column WITHRUN.CM0011.BANKNAME is '银行名称';

  comment on column WITHRUN.CM0011.SUPBANKCODE is '大行代码';*/

  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "accountnum")
  private String accountnum账户编号;
  @Column(name = "unitcustid")
  private String unitcustid单位客户号;
  @Column(name = "accountname")
  private String accountname账户户名;
  @Column(name = "bankaccnum")
  private String bankaccnum银行账号;
  @Column(name = "bankname")
  private String bankname银行名称;
  @Column(name = "supbankcode")
  private String supbankcode大行代码;
//  comment on column WITHRUN.CM0011.LINKBANKNUM is '银行联行号';
//
//  comment on column WITHRUN.CM0011.ISVALID is '是否有效';
//
//  comment on column WITHRUN.CM0011.OPENDATE is '开户日期';
//
//  comment on column WITHRUN.CM0011.REMARK is '备注';
//
//  comment on column WITHRUN.CM0011.CITYCODE is '城市代码';
//
//  comment on column WITHRUN.CM0011.CREATETIME is '创建时间';
//
//  comment on column WITHRUN.CM0011.UPDATETIME is '最后更新时间戳';
//
//  comment on column WITHRUN.CM0011.MAKERINST is '经办机构';
  @Column(name = "linkbanknum")
  private String linkbanknum银行联行号;
  @Column(name = "isvalid")
  private long isvalid是否有效;
  @Column(name = "opendate")
  private java.sql.Date opendate开户日期;
  @Column(name = "remark")
  private String remark备注;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "makerinst")
  private String makerinst经办机构;


/*  comment on column WITHRUN.CM0011.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.CM0011.TRANSDATE is '业务发生日期';

  comment on column WITHRUN.CM0011.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.CM0011.TRANSSEQ is '交易流水号';

  comment on column WITHRUN.CM0011.CHNL is '渠道';

  comment on column WITHRUN.CM0011.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.CM0011.FREEUSECHAR1 is '备用字符1';*/
  @Column(name = "makerteller")
  private String makerteller经办柜员;
  @Column(name = "transdate")
  private java.sql.Date transdate业务发生日期;
  @Column(name = "businessseq")
  private String businessseq业务流水号;
  @Column(name = "transseq")
  private String transseq交易流水号;
  @Column(name = "chnl")
  private String chnl渠道;
  @Column(name = "chnlseq")
  private String chnlseq渠道流水号;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;

  public long getId序号() {
    return id序号;
  }

  public void setId序号(long id序号) {
    this.id序号 = id序号;
  }

  public String getAccountnum账户编号() {
    return accountnum账户编号;
  }

  public void setAccountnum账户编号(String accountnum账户编号) {
    this.accountnum账户编号 = accountnum账户编号;
  }

  public String getUnitcustid单位客户号() {
    return unitcustid单位客户号;
  }

  public void setUnitcustid单位客户号(String unitcustid单位客户号) {
    this.unitcustid单位客户号 = unitcustid单位客户号;
  }

  public String getAccountname账户户名() {
    return accountname账户户名;
  }

  public void setAccountname账户户名(String accountname账户户名) {
    this.accountname账户户名 = accountname账户户名;
  }

  public String getBankaccnum银行账号() {
    return bankaccnum银行账号;
  }

  public void setBankaccnum银行账号(String bankaccnum银行账号) {
    this.bankaccnum银行账号 = bankaccnum银行账号;
  }

  public String getBankname银行名称() {
    return bankname银行名称;
  }

  public void setBankname银行名称(String bankname银行名称) {
    this.bankname银行名称 = bankname银行名称;
  }

  public String getSupbankcode大行代码() {
    return supbankcode大行代码;
  }

  public void setSupbankcode大行代码(String supbankcode大行代码) {
    this.supbankcode大行代码 = supbankcode大行代码;
  }

  public String getLinkbanknum银行联行号() {
    return linkbanknum银行联行号;
  }

  public void setLinkbanknum银行联行号(String linkbanknum银行联行号) {
    this.linkbanknum银行联行号 = linkbanknum银行联行号;
  }

  public long getIsvalid是否有效() {
    return isvalid是否有效;
  }

  public void setIsvalid是否有效(long isvalid是否有效) {
    this.isvalid是否有效 = isvalid是否有效;
  }

  public Date getOpendate开户日期() {
    return opendate开户日期;
  }

  public void setOpendate开户日期(Date opendate开户日期) {
    this.opendate开户日期 = opendate开户日期;
  }

  public String getRemark备注() {
    return remark备注;
  }

  public void setRemark备注(String remark备注) {
    this.remark备注 = remark备注;
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

  public String getMakerinst经办机构() {
    return makerinst经办机构;
  }

  public void setMakerinst经办机构(String makerinst经办机构) {
    this.makerinst经办机构 = makerinst经办机构;
  }

  public String getMakerteller经办柜员() {
    return makerteller经办柜员;
  }

  public void setMakerteller经办柜员(String makerteller经办柜员) {
    this.makerteller经办柜员 = makerteller经办柜员;
  }

  public Date getTransdate业务发生日期() {
    return transdate业务发生日期;
  }

  public void setTransdate业务发生日期(Date transdate业务发生日期) {
    this.transdate业务发生日期 = transdate业务发生日期;
  }

  public String getBusinessseq业务流水号() {
    return businessseq业务流水号;
  }

  public void setBusinessseq业务流水号(String businessseq业务流水号) {
    this.businessseq业务流水号 = businessseq业务流水号;
  }

  public String getTransseq交易流水号() {
    return transseq交易流水号;
  }

  public void setTransseq交易流水号(String transseq交易流水号) {
    this.transseq交易流水号 = transseq交易流水号;
  }

  public String getChnl渠道() {
    return chnl渠道;
  }

  public void setChnl渠道(String chnl渠道) {
    this.chnl渠道 = chnl渠道;
  }

  public String getChnlseq渠道流水号() {
    return chnlseq渠道流水号;
  }

  public void setChnlseq渠道流水号(String chnlseq渠道流水号) {
    this.chnlseq渠道流水号 = chnlseq渠道流水号;
  }

  public String getFreeusechar1备用字符1() {
    return freeusechar1备用字符1;
  }

  public void setFreeusechar1备用字符1(String freeusechar1备用字符1) {
    this.freeusechar1备用字符1 = freeusechar1备用字符1;
  }
}
