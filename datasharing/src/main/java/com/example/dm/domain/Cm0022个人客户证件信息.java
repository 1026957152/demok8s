package com.example.dm.domain;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Cm0022")
public class Cm0022个人客户证件信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*  comment on column WITHRUN.CM0022.CREDID is '证件标识';

  comment on column WITHRUN.CM0022.RELATIONBUSINESSNUM is '关联业务编号';

  comment on column WITHRUN.CM0022.CUSTID is '个人客户号';

  comment on column WITHRUN.CM0022.PERSONCREDTYPE is '个人客户证件类型';

  comment on column WITHRUN.CM0022.OTHERCREDNAME is '其他证件名称';*/

  @Id
  @Column(name = "credid")
  private long credid证件标识;
  @Column(name = "relationbusinessnum")
  private String relationbusinessnum关联业务编号;
  @Column(name = "custid")
  private String custid个人客户号;
  @Column(name = "personcredtype")
  private String personcredtype个人客户证件类型;
  @Column(name = "othercredname")
  private String othercredname其他证件名称;



/*  comment on table WITHRUN.CM0022 is '个人客户证件信息';

  comment on column WITHRUN.CM0022.CREDNUM is '证件号码';

  comment on column WITHRUN.CM0022.CREDORG is '发证机构';

  comment on column WITHRUN.CM0022.CMTERMTYPE is '期限类型';

  comment on column WITHRUN.CM0022.CREDEFFECTIVEDATE is '证件生效日期';

  comment on column WITHRUN.CM0022.CREDEXPIREDDATE is '证件失效日期';*/

  @Column(name = "crednum")
  private String crednum证件号码;
  @Column(name = "credorg")
  private String credorg发证机构;
  @Column(name = "cmtermtype")
  private String cmtermtype期限类型;
  @Column(name = "credeffectivedate")
  private java.sql.Date credeffectivedate证件生效日期;
  @Column(name = "credexpireddate")
  private java.sql.Date credexpireddate证件失效日期;
  @Column(name = "credvalidflag")
  private String credvalidflag证件有效标志;



/*  comment on column WITHRUN.CM0022.CREDVALIDFLAG is '证件有效标志';

  comment on column WITHRUN.CM0022.MAINCREDFLAG is '主辅证件标志';

  comment on column WITHRUN.CM0022.BUILDINFOCREDFLAG is '创建信息证件标志';

  comment on column WITHRUN.CM0022.CITYCODE is '城市代码';

  comment on column WITHRUN.CM0022.MAKERINST is '经办机构';

  comment on column WITHRUN.CM0022.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.CM0022.TRANSDATE is '业务发生日期';*/

  @Column(name = "maincredflag")
  private String maincredflag主辅证件标志;
  @Column(name = "buildinfocredflag")
  private String buildinfocredflag创建信息证件标志;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "makerinst")
  private String makerinst经办机构;
  @Column(name = "makerteller")
  private String makerteller经办柜员;
  @Column(name = "transdate")
  private java.sql.Date transdate业务发生日期;
  @Column(name = "businessseq")
  private String businessseq业务流水号;


/*  comment on column WITHRUN.CM0022.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.CM0022.TRANSSEQ is '交易流水号';

  comment on column WITHRUN.CM0022.CHNL is '渠道';

  comment on column WITHRUN.CM0022.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.CM0022.CREATETIME is '创建时间';

  comment on column WITHRUN.CM0022.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.CM0022.FREEUSECHAR1 is '备用字符1';*/

  @Column(name = "transseq")
  private String transseq交易流水号;
  @Column(name = "chnl")
  private String chnl渠道;
  @Column(name = "chnlseq")
  private String chnlseq渠道流水号;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;

  public long getCredid证件标识() {
    return credid证件标识;
  }

  public void setCredid证件标识(long credid证件标识) {
    this.credid证件标识 = credid证件标识;
  }

  public String getRelationbusinessnum关联业务编号() {
    return relationbusinessnum关联业务编号;
  }

  public void setRelationbusinessnum关联业务编号(String relationbusinessnum关联业务编号) {
    this.relationbusinessnum关联业务编号 = relationbusinessnum关联业务编号;
  }

  public String getCustid个人客户号() {
    return custid个人客户号;
  }

  public void setCustid个人客户号(String custid个人客户号) {
    this.custid个人客户号 = custid个人客户号;
  }

  public String getPersoncredtype个人客户证件类型() {
    return personcredtype个人客户证件类型;
  }

  public void setPersoncredtype个人客户证件类型(String personcredtype个人客户证件类型) {
    this.personcredtype个人客户证件类型 = personcredtype个人客户证件类型;
  }

  public String getOthercredname其他证件名称() {
    return othercredname其他证件名称;
  }

  public void setOthercredname其他证件名称(String othercredname其他证件名称) {
    this.othercredname其他证件名称 = othercredname其他证件名称;
  }

  public String getCrednum证件号码() {
    return crednum证件号码;
  }

  public void setCrednum证件号码(String crednum证件号码) {
    this.crednum证件号码 = crednum证件号码;
  }

  public String getCredorg发证机构() {
    return credorg发证机构;
  }

  public void setCredorg发证机构(String credorg发证机构) {
    this.credorg发证机构 = credorg发证机构;
  }

  public String getCmtermtype期限类型() {
    return cmtermtype期限类型;
  }

  public void setCmtermtype期限类型(String cmtermtype期限类型) {
    this.cmtermtype期限类型 = cmtermtype期限类型;
  }

  public Date getCredeffectivedate证件生效日期() {
    return credeffectivedate证件生效日期;
  }

  public void setCredeffectivedate证件生效日期(Date credeffectivedate证件生效日期) {
    this.credeffectivedate证件生效日期 = credeffectivedate证件生效日期;
  }

  public Date getCredexpireddate证件失效日期() {
    return credexpireddate证件失效日期;
  }

  public void setCredexpireddate证件失效日期(Date credexpireddate证件失效日期) {
    this.credexpireddate证件失效日期 = credexpireddate证件失效日期;
  }

  public String getCredvalidflag证件有效标志() {
    return credvalidflag证件有效标志;
  }

  public void setCredvalidflag证件有效标志(String credvalidflag证件有效标志) {
    this.credvalidflag证件有效标志 = credvalidflag证件有效标志;
  }

  public String getMaincredflag主辅证件标志() {
    return maincredflag主辅证件标志;
  }

  public void setMaincredflag主辅证件标志(String maincredflag主辅证件标志) {
    this.maincredflag主辅证件标志 = maincredflag主辅证件标志;
  }

  public String getBuildinfocredflag创建信息证件标志() {
    return buildinfocredflag创建信息证件标志;
  }

  public void setBuildinfocredflag创建信息证件标志(String buildinfocredflag创建信息证件标志) {
    this.buildinfocredflag创建信息证件标志 = buildinfocredflag创建信息证件标志;
  }

  public String getCitycode城市代码() {
    return citycode城市代码;
  }

  public void setCitycode城市代码(String citycode城市代码) {
    this.citycode城市代码 = citycode城市代码;
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
