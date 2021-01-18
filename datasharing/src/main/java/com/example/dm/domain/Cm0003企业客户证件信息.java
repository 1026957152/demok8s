package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Cm0003")
public class Cm0003企业客户证件信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  // comment on table WITHRUN.CM0003 is '企业客户证件信息';










/*  comment on column WITHRUN.CM0003.ID is '序号';

  comment on column WITHRUN.CM0003.RELATIONBUSINESSNUM is '关联业务编号';

  comment on column WITHRUN.CM0003.UNITCUSTID is '单位客户号';

  comment on column WITHRUN.CM0003.UNITCREDTYPE is '单位证件类型';

  comment on column WITHRUN.CM0003.UNITCREDNUM is '单位证件号码';

  comment on column WITHRUN.CM0003.CREDORG is '发证机构';*/


  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "relationbusinessnum")
  private String relationbusinessnum关联业务编号;
  @Column(name = "unitcustid")
  private String unitcustid单位客户号;
  @Column(name = "unitcredtype")
  private String unitcredtype单位证件类型;
  @Column(name = "unitcrednum")
  private String unitcrednum单位证件号码;
  @Column(name = "credorg")
  private String credorg发证机构;


/*  comment on column WITHRUN.CM0003.OPENCREDDATE is '发证日期';

  comment on column WITHRUN.CM0003.UNITCREDTERMTYPE is '单位证件期限类型';

  comment on column WITHRUN.CM0003.CREDBEGDATE is '证件开始日期';

  comment on column WITHRUN.CM0003.CREDENDDATE is '证件到期日期';

  comment on column WITHRUN.CM0003.UNITCREDSTATUS is '单位证件状态';

  comment on column WITHRUN.CM0003.CREDINVALIDDATE is '证件失效日期';

  comment on column WITHRUN.CM0003.INVALIDREASON is '失效原因';

  comment on column WITHRUN.CM0003.ISMAINCRED is '是否主证件';*/
  @Column(name = "opencreddate")
  private java.sql.Date opencreddate发证日期;
  @Column(name = "unitcredtermtype")
  private String unitcredtermtype单位证件期限类型;
  @Column(name = "credbegdate")
  private java.sql.Date credbegdate证件开始日期;
  @Column(name = "credenddate")
  private java.sql.Date credenddate证件到期日期;
  @Column(name = "unitcredstatus")
  private String unitcredstatus单位证件状态;
  @Column(name = "credinvaliddate")
  private java.sql.Date credinvaliddate证件失效日期;
  @Column(name = "invalidreason")
  private String invalidreason失效原因;
  @Column(name = "ismaincred")
  private String ismaincred是否主证件;

/*  comment on column WITHRUN.CM0003.ISCREATECUSTCRED is '是否是建立客户信息证件';

  comment on column WITHRUN.CM0003.EDOCFILENUM is '档案文件编号';

  comment on column WITHRUN.CM0003.CITYCODE is '城市代码';

  comment on column WITHRUN.CM0003.MAKERINST is '经办机构';

  comment on column WITHRUN.CM0003.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.CM0003.TRANSDATE is '业务发生日期';

  comment on column WITHRUN.CM0003.BUSINESSSEQ is '业务流水号';*/
  @Column(name = "iscreatecustcred")
  private String iscreatecustcred是否是建立客户信息证件;
  @Column(name = "edocfilenum")
  private String edocfilenum档案文件编号;
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


/*  comment on column WITHRUN.CM0003.TRANSSEQ is '交易流水号';

  comment on column WITHRUN.CM0003.CHNL is '渠道';

  comment on column WITHRUN.CM0003.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.CM0003.CREATETIME is '创建时间';

  comment on column WITHRUN.CM0003.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.CM0003.FREEUSECHAR1 is '备用字符1';*/
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

  public long getId序号() {
    return id序号;
  }

  public void setId序号(long id序号) {
    this.id序号 = id序号;
  }

  public String getRelationbusinessnum关联业务编号() {
    return relationbusinessnum关联业务编号;
  }

  public void setRelationbusinessnum关联业务编号(String relationbusinessnum关联业务编号) {
    this.relationbusinessnum关联业务编号 = relationbusinessnum关联业务编号;
  }

  public String getUnitcustid单位客户号() {
    return unitcustid单位客户号;
  }

  public void setUnitcustid单位客户号(String unitcustid单位客户号) {
    this.unitcustid单位客户号 = unitcustid单位客户号;
  }

  public String getUnitcredtype单位证件类型() {
    return unitcredtype单位证件类型;
  }

  public void setUnitcredtype单位证件类型(String unitcredtype单位证件类型) {
    this.unitcredtype单位证件类型 = unitcredtype单位证件类型;
  }

  public String getUnitcrednum单位证件号码() {
    return unitcrednum单位证件号码;
  }

  public void setUnitcrednum单位证件号码(String unitcrednum单位证件号码) {
    this.unitcrednum单位证件号码 = unitcrednum单位证件号码;
  }

  public String getCredorg发证机构() {
    return credorg发证机构;
  }

  public void setCredorg发证机构(String credorg发证机构) {
    this.credorg发证机构 = credorg发证机构;
  }

  public Date getOpencreddate发证日期() {
    return opencreddate发证日期;
  }

  public void setOpencreddate发证日期(Date opencreddate发证日期) {
    this.opencreddate发证日期 = opencreddate发证日期;
  }

  public String getUnitcredtermtype单位证件期限类型() {
    return unitcredtermtype单位证件期限类型;
  }

  public void setUnitcredtermtype单位证件期限类型(String unitcredtermtype单位证件期限类型) {
    this.unitcredtermtype单位证件期限类型 = unitcredtermtype单位证件期限类型;
  }

  public Date getCredbegdate证件开始日期() {
    return credbegdate证件开始日期;
  }

  public void setCredbegdate证件开始日期(Date credbegdate证件开始日期) {
    this.credbegdate证件开始日期 = credbegdate证件开始日期;
  }

  public Date getCredenddate证件到期日期() {
    return credenddate证件到期日期;
  }

  public void setCredenddate证件到期日期(Date credenddate证件到期日期) {
    this.credenddate证件到期日期 = credenddate证件到期日期;
  }

  public String getUnitcredstatus单位证件状态() {
    return unitcredstatus单位证件状态;
  }

  public void setUnitcredstatus单位证件状态(String unitcredstatus单位证件状态) {
    this.unitcredstatus单位证件状态 = unitcredstatus单位证件状态;
  }

  public Date getCredinvaliddate证件失效日期() {
    return credinvaliddate证件失效日期;
  }

  public void setCredinvaliddate证件失效日期(Date credinvaliddate证件失效日期) {
    this.credinvaliddate证件失效日期 = credinvaliddate证件失效日期;
  }

  public String getInvalidreason失效原因() {
    return invalidreason失效原因;
  }

  public void setInvalidreason失效原因(String invalidreason失效原因) {
    this.invalidreason失效原因 = invalidreason失效原因;
  }

  public String getIsmaincred是否主证件() {
    return ismaincred是否主证件;
  }

  public void setIsmaincred是否主证件(String ismaincred是否主证件) {
    this.ismaincred是否主证件 = ismaincred是否主证件;
  }

  public String getIscreatecustcred是否是建立客户信息证件() {
    return iscreatecustcred是否是建立客户信息证件;
  }

  public void setIscreatecustcred是否是建立客户信息证件(String iscreatecustcred是否是建立客户信息证件) {
    this.iscreatecustcred是否是建立客户信息证件 = iscreatecustcred是否是建立客户信息证件;
  }

  public String getEdocfilenum档案文件编号() {
    return edocfilenum档案文件编号;
  }

  public void setEdocfilenum档案文件编号(String edocfilenum档案文件编号) {
    this.edocfilenum档案文件编号 = edocfilenum档案文件编号;
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
