package com.example.dm.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

import java.time.LocalDateTime;

@Entity
@Table(name = "Dw0202")
public class Dw0202提取审批信息表 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*
  comment on column WITHRUN.DW0202.ID is '序号';

  comment on column WITHRUN.DW0202.APPRNUM is '审批号';

  comment on column WITHRUN.DW0202.TRANSDATE is '业务发生日期';

  comment on column WITHRUN.DW0202.UNITACCNUM is '单位账号';

  comment on column WITHRUN.DW0202.ACCNUM is '个人账号';

  comment on column WITHRUN.DW0202.ACCNAME is '姓名';
*/



  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "apprnum")
  private String apprnum审批号;
  @Column(name = "transdate")
  private java.sql.Date transdate业务发生日期;
  @Column(name = "unitaccnum")
  private String unitaccnum单位账号;
  @Column(name = "accnum")
  private String accnum个人账号;
  @Column(name = "accname")
  private String accname姓名;

/*  comment on column WITHRUN.DW0202.APPRSTATUS is '审批状态';

  comment on column WITHRUN.DW0202.DRAWREASON is '提取原因';

  comment on column WITHRUN.DW0202.DRAWNUM is '提取依据编码';

  comment on column WITHRUN.DW0202.DRAWDATA is '提取依据号码';

  comment on column WITHRUN.DW0202.DRAWDATATYPE is '提取依据类型';

  comment on column WITHRUN.DW0202.BEGNUM is '开始编号';

  comment on column WITHRUN.DW0202.ENDNUM is '结束编号';*/
  @Column(name = "apprstatus")
  private String apprstatus审批状态;
  @Column(name = "drawreason")
  private String drawreason提取原因;
  @Column(name = "drawnum")
  private String drawnum提取依据编码;
  @Column(name = "drawdata")
  private String drawdata提取依据号码;
  @Column(name = "drawdatatype")
  private String drawdatatype提取依据类型;
  @Column(name = "begnum")
  private long begnum开始编号;
  @Column(name = "endnum")
  private long endnum结束编号;

/*  comment on column WITHRUN.DW0202.DRAWAMT is '提取金额';

  comment on column WITHRUN.DW0202.DRAWINTEREST is '支取利息';

  comment on column WITHRUN.DW0202.DRAWCLOSEFLAG is '提取/销户标志';

  comment on column WITHRUN.DW0202.ISMYSELF is '是否本人办理';

  comment on column WITHRUN.DW0202.AGENTCREDTYPE is '代办人证件类型';

  comment on column WITHRUN.DW0202.AGENTCREDNUM is '代办人证件号码';

  comment on column WITHRUN.DW0202.AGENTNAME is '代办人姓名';

  comment on column WITHRUN.DW0202.RELASHIP is '与提取人关系';*/
  @Column(name = "drawamt")
  private double drawamt提取金额;
  @Column(name = "drawinterest")
  private double drawinterest支取利息;
  @Column(name = "drawcloseflag")
  private String drawcloseflag提取_销户标志;
  @Column(name = "ismyself")
  private String ismyself是否本人办理;
  @Column(name = "agentcredtype")
  private String agentcredtype代办人证件类型;
  @Column(name = "agentcrednum")
  private String agentcrednum代办人证件号码;
  @Column(name = "agentname")
  private String agentname代办人姓名;
  @Column(name = "relaship")
  private String relaship与提取人关系;

/*
  comment on column WITHRUN.DW0202.FIRSTFLAG is '提取依据是否首次办理';

  comment on column WITHRUN.DW0202.INACCOUNTDATE is '入账日期';

  comment on column WITHRUN.DW0202.STMODE is '结算方式';

  comment on column WITHRUN.DW0202.LINKBANKNUM is '银行联行号';

  comment on column WITHRUN.DW0202.RECIVEACCNUMPERSONRELASHIP is '收款账号与提取人关系';

  comment on column WITHRUN.DW0202.PAYMENTBANKCODE is '付款银行代码';

  comment on column WITHRUN.DW0202.PAYMENTBANKACCNUMNAME is '付款银行账户名称';
*/

  @Column(name = "firstflag")
  private String firstflag提取依据是否首次办理;
  @Column(name = "inaccountdate")
  private java.sql.Date inaccountdate入账日期;
  @Column(name = "stmode")
  private String stmode结算方式;
  @Column(name = "linkbanknum")
  private String linkbanknum银行联行号;
  @Column(name = "reciveaccnumpersonrelaship")
  private String reciveaccnumpersonrelaship收款账号与提取人关系;
  @Column(name = "paymentbankcode")
  private String paymentbankcode付款银行代码;
  @Column(name = "paymentbankaccnumname")
  private String paymentbankaccnumname付款银行账户名称;

/*  comment on column WITHRUN.DW0202.FKYHZH is '付款银行账号';

  comment on column WITHRUN.DW0202.SFZHCATEGORY is '收方账号类别';

  comment on column WITHRUN.DW0202.PAYEE is '收款人';

  comment on column WITHRUN.DW0202.PAYEEBANKCODE is '收款银行代码';

  comment on column WITHRUN.DW0202.PAYEEBANKNAME is '收款银行名称';

  comment on column WITHRUN.DW0202.SKYHZH is '收款银行账号';

  comment on column WITHRUN.DW0202.BUSINESSNUM is '业务编号';

  comment on column WITHRUN.DW0202.BATCHNUM is '批量编号';*/
  @Column(name = "fkyhzh")
  private String fkyhzh付款银行账号;
  @Column(name = "sfzhcategory")
  private String sfzhcategory收方账号类别;
  @Column(name = "payee")
  private String payee收款人;
  @Column(name = "payeebankcode")
  private String payeebankcode收款银行代码;
  @Column(name = "payeebankname")
  private String payeebankname收款银行名称;
  @Column(name = "skyhzh")
  private String skyhzh收款银行账号;
  @Column(name = "businessnum")
  private String businessnum业务编号;
  @Column(name = "batchnum")
  private String batchnum批量编号;

/*  comment on column WITHRUN.DW0202.MAKERINST is '经办机构';

  comment on column WITHRUN.DW0202.ACCOUNTINST is '账户机构';

  comment on column WITHRUN.DW0202.CITYCODE is '城市代码';

  comment on column WITHRUN.DW0202.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.DW0202.REVIEWTELLER is '复核柜员';

  comment on column WITHRUN.DW0202.FINJUDTELLER is '终审柜员';

  comment on column WITHRUN.DW0202.AUTHTELLER is '授权柜员';

  comment on column WITHRUN.DW0202.CHNL is '渠道';*/
  @Column(name = "makerinst")
  private String makerinst经办机构;
  @Column(name = "accountinst")
  private String accountinst账户机构;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "makerteller")
  private String makerteller经办柜员;
  @Column(name = "reviewteller")
  private String reviewteller复核柜员;
  @Column(name = "finjudteller")
  private String finjudteller终审柜员;
  @Column(name = "authteller")
  private String authteller授权柜员;
  @Column(name = "chnl")
  private String chnl渠道;


  @Column(name = "chnlseq")
  private String chnlseq渠道流水号;
  @Column(name = "businessseq")
  private String businessseq业务流水号;
  @Column(name = "transseq")
  private String transseq交易流水号;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;

/*  comment on column WITHRUN.DW0202.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.DW0202.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.DW0202.TRANSSEQ is '交易流水号';

  comment on column WITHRUN.DW0202.CREATETIME is '创建时间';

  comment on column WITHRUN.DW0202.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.DW0202.FREEUSECHAR1 is '备用字符1';*/

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

  public String getUnitaccnum单位账号() {
    return unitaccnum单位账号;
  }

  public void setUnitaccnum单位账号(String unitaccnum单位账号) {
    this.unitaccnum单位账号 = unitaccnum单位账号;
  }

  public String getAccnum个人账号() {
    return accnum个人账号;
  }

  public void setAccnum个人账号(String accnum个人账号) {
    this.accnum个人账号 = accnum个人账号;
  }

  public String getAccname姓名() {
    return accname姓名;
  }

  public void setAccname姓名(String accname姓名) {
    this.accname姓名 = accname姓名;
  }

  public String getApprstatus审批状态() {
    return apprstatus审批状态;
  }

  public void setApprstatus审批状态(String apprstatus审批状态) {
    this.apprstatus审批状态 = apprstatus审批状态;
  }

  public String getDrawreason提取原因() {
    return drawreason提取原因;
  }

  public void setDrawreason提取原因(String drawreason提取原因) {
    this.drawreason提取原因 = drawreason提取原因;
  }

  public String getDrawnum提取依据编码() {
    return drawnum提取依据编码;
  }

  public void setDrawnum提取依据编码(String drawnum提取依据编码) {
    this.drawnum提取依据编码 = drawnum提取依据编码;
  }

  public String getDrawdata提取依据号码() {
    return drawdata提取依据号码;
  }

  public void setDrawdata提取依据号码(String drawdata提取依据号码) {
    this.drawdata提取依据号码 = drawdata提取依据号码;
  }

  public String getDrawdatatype提取依据类型() {
    return drawdatatype提取依据类型;
  }

  public void setDrawdatatype提取依据类型(String drawdatatype提取依据类型) {
    this.drawdatatype提取依据类型 = drawdatatype提取依据类型;
  }

  public long getBegnum开始编号() {
    return begnum开始编号;
  }

  public void setBegnum开始编号(long begnum开始编号) {
    this.begnum开始编号 = begnum开始编号;
  }

  public long getEndnum结束编号() {
    return endnum结束编号;
  }

  public void setEndnum结束编号(long endnum结束编号) {
    this.endnum结束编号 = endnum结束编号;
  }

  public double getDrawamt提取金额() {
    return drawamt提取金额;
  }

  public void setDrawamt提取金额(double drawamt提取金额) {
    this.drawamt提取金额 = drawamt提取金额;
  }

  public double getDrawinterest支取利息() {
    return drawinterest支取利息;
  }

  public void setDrawinterest支取利息(double drawinterest支取利息) {
    this.drawinterest支取利息 = drawinterest支取利息;
  }

  public String getDrawcloseflag提取_销户标志() {
    return drawcloseflag提取_销户标志;
  }

  public void setDrawcloseflag提取_销户标志(String drawcloseflag提取_销户标志) {
    this.drawcloseflag提取_销户标志 = drawcloseflag提取_销户标志;
  }

  public String getIsmyself是否本人办理() {
    return ismyself是否本人办理;
  }

  public void setIsmyself是否本人办理(String ismyself是否本人办理) {
    this.ismyself是否本人办理 = ismyself是否本人办理;
  }

  public String getAgentcredtype代办人证件类型() {
    return agentcredtype代办人证件类型;
  }

  public void setAgentcredtype代办人证件类型(String agentcredtype代办人证件类型) {
    this.agentcredtype代办人证件类型 = agentcredtype代办人证件类型;
  }

  public String getAgentcrednum代办人证件号码() {
    return agentcrednum代办人证件号码;
  }

  public void setAgentcrednum代办人证件号码(String agentcrednum代办人证件号码) {
    this.agentcrednum代办人证件号码 = agentcrednum代办人证件号码;
  }

  public String getAgentname代办人姓名() {
    return agentname代办人姓名;
  }

  public void setAgentname代办人姓名(String agentname代办人姓名) {
    this.agentname代办人姓名 = agentname代办人姓名;
  }

  public String getRelaship与提取人关系() {
    return relaship与提取人关系;
  }

  public void setRelaship与提取人关系(String relaship与提取人关系) {
    this.relaship与提取人关系 = relaship与提取人关系;
  }

  public String getFirstflag提取依据是否首次办理() {
    return firstflag提取依据是否首次办理;
  }

  public void setFirstflag提取依据是否首次办理(String firstflag提取依据是否首次办理) {
    this.firstflag提取依据是否首次办理 = firstflag提取依据是否首次办理;
  }

  public Date getInaccountdate入账日期() {
    return inaccountdate入账日期;
  }

  public void setInaccountdate入账日期(Date inaccountdate入账日期) {
    this.inaccountdate入账日期 = inaccountdate入账日期;
  }

  public String getStmode结算方式() {
    return stmode结算方式;
  }

  public void setStmode结算方式(String stmode结算方式) {
    this.stmode结算方式 = stmode结算方式;
  }

  public String getLinkbanknum银行联行号() {
    return linkbanknum银行联行号;
  }

  public void setLinkbanknum银行联行号(String linkbanknum银行联行号) {
    this.linkbanknum银行联行号 = linkbanknum银行联行号;
  }

  public String getReciveaccnumpersonrelaship收款账号与提取人关系() {
    return reciveaccnumpersonrelaship收款账号与提取人关系;
  }

  public void setReciveaccnumpersonrelaship收款账号与提取人关系(String reciveaccnumpersonrelaship收款账号与提取人关系) {
    this.reciveaccnumpersonrelaship收款账号与提取人关系 = reciveaccnumpersonrelaship收款账号与提取人关系;
  }

  public String getPaymentbankcode付款银行代码() {
    return paymentbankcode付款银行代码;
  }

  public void setPaymentbankcode付款银行代码(String paymentbankcode付款银行代码) {
    this.paymentbankcode付款银行代码 = paymentbankcode付款银行代码;
  }

  public String getPaymentbankaccnumname付款银行账户名称() {
    return paymentbankaccnumname付款银行账户名称;
  }

  public void setPaymentbankaccnumname付款银行账户名称(String paymentbankaccnumname付款银行账户名称) {
    this.paymentbankaccnumname付款银行账户名称 = paymentbankaccnumname付款银行账户名称;
  }

  public String getFkyhzh付款银行账号() {
    return fkyhzh付款银行账号;
  }

  public void setFkyhzh付款银行账号(String fkyhzh付款银行账号) {
    this.fkyhzh付款银行账号 = fkyhzh付款银行账号;
  }

  public String getSfzhcategory收方账号类别() {
    return sfzhcategory收方账号类别;
  }

  public void setSfzhcategory收方账号类别(String sfzhcategory收方账号类别) {
    this.sfzhcategory收方账号类别 = sfzhcategory收方账号类别;
  }

  public String getPayee收款人() {
    return payee收款人;
  }

  public void setPayee收款人(String payee收款人) {
    this.payee收款人 = payee收款人;
  }

  public String getPayeebankcode收款银行代码() {
    return payeebankcode收款银行代码;
  }

  public void setPayeebankcode收款银行代码(String payeebankcode收款银行代码) {
    this.payeebankcode收款银行代码 = payeebankcode收款银行代码;
  }

  public String getPayeebankname收款银行名称() {
    return payeebankname收款银行名称;
  }

  public void setPayeebankname收款银行名称(String payeebankname收款银行名称) {
    this.payeebankname收款银行名称 = payeebankname收款银行名称;
  }

  public String getSkyhzh收款银行账号() {
    return skyhzh收款银行账号;
  }

  public void setSkyhzh收款银行账号(String skyhzh收款银行账号) {
    this.skyhzh收款银行账号 = skyhzh收款银行账号;
  }

  public String getBusinessnum业务编号() {
    return businessnum业务编号;
  }

  public void setBusinessnum业务编号(String businessnum业务编号) {
    this.businessnum业务编号 = businessnum业务编号;
  }

  public String getBatchnum批量编号() {
    return batchnum批量编号;
  }

  public void setBatchnum批量编号(String batchnum批量编号) {
    this.batchnum批量编号 = batchnum批量编号;
  }

  public String getMakerinst经办机构() {
    return makerinst经办机构;
  }

  public void setMakerinst经办机构(String makerinst经办机构) {
    this.makerinst经办机构 = makerinst经办机构;
  }

  public String getAccountinst账户机构() {
    return accountinst账户机构;
  }

  public void setAccountinst账户机构(String accountinst账户机构) {
    this.accountinst账户机构 = accountinst账户机构;
  }

  public String getCitycode城市代码() {
    return citycode城市代码;
  }

  public void setCitycode城市代码(String citycode城市代码) {
    this.citycode城市代码 = citycode城市代码;
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

  public String getTransseq交易流水号() {
    return transseq交易流水号;
  }

  public void setTransseq交易流水号(String transseq交易流水号) {
    this.transseq交易流水号 = transseq交易流水号;
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
