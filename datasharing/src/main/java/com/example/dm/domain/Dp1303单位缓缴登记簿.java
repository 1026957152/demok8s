package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Dp1303")
public class Dp1303单位缓缴登记簿 {



  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }






/*  comment on table WITHRUN.DP1303 is '单位缓缴登记簿';

  comment on column WITHRUN.DP1303.ID is '序号';

  comment on column WITHRUN.DP1303.APPRNUM is '审批号';

  comment on column WITHRUN.DP1303.TRANSDATE is '业务发生日期';

  comment on column WITHRUN.DP1303.TRANSSEQ is '交易流水号';

  comment on column WITHRUN.DP1303.UNITACCNUM is '单位账号';

  comment on column WITHRUN.DP1303.POSTPONETERM is '缓缴期限';

  comment on column WITHRUN.DP1303.BEGDATE is '开始日期';

  comment on column WITHRUN.DP1303.ENDDATE is '结束日期';*/

  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "apprnum")
  private String apprnum审批号;
  @Column(name = "transdate")
  private java.sql.Date transdate业务发生日期;
  @Column(name = "transseq")
  private String transseq交易流水号;
  @Column(name = "unitaccnum")
  private String unitaccnum单位账号;
  @Column(name = "postponeterm")
  private long postponeterm缓缴期限;
  @Column(name = "begdate")
  private java.sql.Date begdate开始日期;
  @Column(name = "enddate")
  private java.sql.Date enddate结束日期;
/*  comment on column WITHRUN.DP1303.POSTPDPFLAG is '缓缴标志';

  comment on column WITHRUN.DP1303.APPRFILENUM is '批准文号';

  comment on column WITHRUN.DP1303.REASON is '原因';

  comment on column WITHRUN.DP1303.LASTDPYM is '缴至年月';

  comment on column WITHRUN.DP1303.TRANSTYPE is '交易类型';

  comment on column WITHRUN.DP1303.MAKERNAME is '经办人姓名';

  comment on column WITHRUN.DP1303.MAKERPHONE is '经办人电话';

  comment on column WITHRUN.DP1303.MAKERCREDNUM is '经办人证件号码';*/
  @Column(name = "postpdpflag")
  private String postpdpflag缓缴标志;
  @Column(name = "apprfilenum")
  private String apprfilenum批准文号;
  @Column(name = "reason")
  private String reason原因;
  @Column(name = "lastdpym")
  private String lastdpym缴至年月;
  @Column(name = "transtype")
  private String transtype交易类型;
  @Column(name = "makername")
  private String makername经办人姓名;
  @Column(name = "makerphone")
  private String makerphone经办人电话;
  @Column(name = "makercrednum")
  private String makercrednum经办人证件号码;
/*  comment on column WITHRUN.DP1303.CHNL is '渠道';

  comment on column WITHRUN.DP1303.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.DP1303.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.DP1303.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.DP1303.REVIEWTELLER is '复核柜员';

  comment on column WITHRUN.DP1303.FINJUDTELLER is '终审柜员';

  comment on column WITHRUN.DP1303.AUTHTELLER is '授权柜员';

  comment on column WITHRUN.DP1303.ACCOUNTINST is '账户机构';*/
  @Column(name = "chnl")
  private String chnl渠道;
  @Column(name = "chnlseq")
  private String chnlseq渠道流水号;
  @Column(name = "businessseq")
  private String businessseq业务流水号;
  @Column(name = "makerteller")
  private String makerteller经办柜员;
  @Column(name = "reviewteller")
  private String reviewteller复核柜员;
  @Column(name = "finjudteller")
  private String finjudteller终审柜员;
  @Column(name = "authteller")
  private String authteller授权柜员;
  @Column(name = "accountinst")
  private String accountinst账户机构;

/*  comment on column WITHRUN.DP1303.ACCOUNTBANK is '账户银行';

  comment on column WITHRUN.DP1303.MAKERINST is '经办机构';

  comment on column WITHRUN.DP1303.MAKERBANK is '经办银行';

  comment on column WITHRUN.DP1303.CITYCODE is '城市代码';

  comment on column WITHRUN.DP1303.CREATETIME is '创建时间';

  comment on column WITHRUN.DP1303.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.DP1303.FREEUSECHAR1 is '备用字符1';*/
  @Column(name = "accountbank")
  private String accountbank账户银行;
  @Column(name = "makerinst")
  private String makerinst经办机构;
  @Column(name = "makerbank")
  private String makerbank经办银行;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;

  public void setCreatetime创建时间(LocalDateTime createtime创建时间) {
    this.createtime创建时间 = createtime创建时间;
  }

  public void setUpdatetime最后更新时间戳(LocalDateTime updatetime最后更新时间戳) {
    this.updatetime最后更新时间戳 = updatetime最后更新时间戳;
  }

  public long getId序号() {
    return id序号;
  }

  public void setId序号(long id序号) {
    this.id序号 = id序号;
  }

  public String getApprnum审批号() {
    return apprnum审批号;
  }

  public void setApprnum审批号(String apprnum审批号) {
    this.apprnum审批号 = apprnum审批号;
  }

  public Date getTransdate业务发生日期() {
    return transdate业务发生日期;
  }

  public void setTransdate业务发生日期(Date transdate业务发生日期) {
    this.transdate业务发生日期 = transdate业务发生日期;
  }

  public String getTransseq交易流水号() {
    return transseq交易流水号;
  }

  public void setTransseq交易流水号(String transseq交易流水号) {
    this.transseq交易流水号 = transseq交易流水号;
  }

  public String getUnitaccnum单位账号() {
    return unitaccnum单位账号;
  }

  public void setUnitaccnum单位账号(String unitaccnum单位账号) {
    this.unitaccnum单位账号 = unitaccnum单位账号;
  }

  public long getPostponeterm缓缴期限() {
    return postponeterm缓缴期限;
  }

  public void setPostponeterm缓缴期限(long postponeterm缓缴期限) {
    this.postponeterm缓缴期限 = postponeterm缓缴期限;
  }

  public Date getBegdate开始日期() {
    return begdate开始日期;
  }

  public void setBegdate开始日期(Date begdate开始日期) {
    this.begdate开始日期 = begdate开始日期;
  }

  public Date getEnddate结束日期() {
    return enddate结束日期;
  }

  public void setEnddate结束日期(Date enddate结束日期) {
    this.enddate结束日期 = enddate结束日期;
  }

  public String getPostpdpflag缓缴标志() {
    return postpdpflag缓缴标志;
  }

  public void setPostpdpflag缓缴标志(String postpdpflag缓缴标志) {
    this.postpdpflag缓缴标志 = postpdpflag缓缴标志;
  }

  public String getApprfilenum批准文号() {
    return apprfilenum批准文号;
  }

  public void setApprfilenum批准文号(String apprfilenum批准文号) {
    this.apprfilenum批准文号 = apprfilenum批准文号;
  }

  public String getReason原因() {
    return reason原因;
  }

  public void setReason原因(String reason原因) {
    this.reason原因 = reason原因;
  }

  public String getLastdpym缴至年月() {
    return lastdpym缴至年月;
  }

  public void setLastdpym缴至年月(String lastdpym缴至年月) {
    this.lastdpym缴至年月 = lastdpym缴至年月;
  }

  public String getTranstype交易类型() {
    return transtype交易类型;
  }

  public void setTranstype交易类型(String transtype交易类型) {
    this.transtype交易类型 = transtype交易类型;
  }

  public String getMakername经办人姓名() {
    return makername经办人姓名;
  }

  public void setMakername经办人姓名(String makername经办人姓名) {
    this.makername经办人姓名 = makername经办人姓名;
  }

  public String getMakerphone经办人电话() {
    return makerphone经办人电话;
  }

  public void setMakerphone经办人电话(String makerphone经办人电话) {
    this.makerphone经办人电话 = makerphone经办人电话;
  }

  public String getMakercrednum经办人证件号码() {
    return makercrednum经办人证件号码;
  }

  public void setMakercrednum经办人证件号码(String makercrednum经办人证件号码) {
    this.makercrednum经办人证件号码 = makercrednum经办人证件号码;
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

  public String getBusinessseq业务流水号() {
    return businessseq业务流水号;
  }

  public void setBusinessseq业务流水号(String businessseq业务流水号) {
    this.businessseq业务流水号 = businessseq业务流水号;
  }

  public String getMakerteller经办柜员() {
    return makerteller经办柜员;
  }

  public void setMakerteller经办柜员(String makerteller经办柜员) {
    this.makerteller经办柜员 = makerteller经办柜员;
  }

  public String getReviewteller复核柜员() {
    return reviewteller复核柜员;
  }

  public void setReviewteller复核柜员(String reviewteller复核柜员) {
    this.reviewteller复核柜员 = reviewteller复核柜员;
  }

  public String getFinjudteller终审柜员() {
    return finjudteller终审柜员;
  }

  public void setFinjudteller终审柜员(String finjudteller终审柜员) {
    this.finjudteller终审柜员 = finjudteller终审柜员;
  }

  public String getAuthteller授权柜员() {
    return authteller授权柜员;
  }

  public void setAuthteller授权柜员(String authteller授权柜员) {
    this.authteller授权柜员 = authteller授权柜员;
  }

  public String getAccountinst账户机构() {
    return accountinst账户机构;
  }

  public void setAccountinst账户机构(String accountinst账户机构) {
    this.accountinst账户机构 = accountinst账户机构;
  }

  public String getAccountbank账户银行() {
    return accountbank账户银行;
  }

  public void setAccountbank账户银行(String accountbank账户银行) {
    this.accountbank账户银行 = accountbank账户银行;
  }

  public String getMakerinst经办机构() {
    return makerinst经办机构;
  }

  public void setMakerinst经办机构(String makerinst经办机构) {
    this.makerinst经办机构 = makerinst经办机构;
  }

  public String getMakerbank经办银行() {
    return makerbank经办银行;
  }

  public void setMakerbank经办银行(String makerbank经办银行) {
    this.makerbank经办银行 = makerbank经办银行;
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

  public LocalDateTime getUpdatetime最后更新时间戳() {
    return updatetime最后更新时间戳;
  }

  public String getFreeusechar1备用字符1() {
    return freeusechar1备用字符1;
  }

  public void setFreeusechar1备用字符1(String freeusechar1备用字符1) {
    this.freeusechar1备用字符1 = freeusechar1备用字符1;
  }
}
