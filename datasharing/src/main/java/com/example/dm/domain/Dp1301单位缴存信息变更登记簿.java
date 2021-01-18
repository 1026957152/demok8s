package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;


@Entity
@Table(name = "Dp1301")
public class Dp1301单位缴存信息变更登记簿 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  //comment on table WITHRUN.DP1301 is '单位缴存信息变更登记簿';









/*  comment on column WITHRUN.DP1301.ID is '序号';

  comment on column WITHRUN.DP1301.APPRNUM is '审批号';

  comment on column WITHRUN.DP1301.TRANSDATE is '业务发生日期';

  comment on column WITHRUN.DP1301.TRANSSEQ is '交易流水号';

  comment on column WITHRUN.DP1301.UNITACCNUM is '单位账号';

  comment on column WITHRUN.DP1301.LASTDPYM is '缴至年月';

  comment on column WITHRUN.DP1301.CHGTYPE is '变更类型';

  comment on column" WITHRUN.DP1301.VALIDFLAG is '有效标志';*/

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
  @Column(name = "lastdpym")
  private String lastdpym缴至年月;
  @Column(name = "chgtype")
  private String chgtype变更类型;
  @Column(name = "validflag")
  private String validflag有效标志;


/*          comment on column WITHRUN.DP1301.FINCHGNUMBER is '财政变更人数';

          comment on column WITHRUN.DP1301.SELCHGNUMBER is '自筹变更人数';

          comment on column WITHRUN.DP1301.FINCHGAMT is '财政汇缴变更金额';

          comment on column WITHRUN.DP1301.SELCHGAMT is '自筹汇缴变更金额';

          comment on column WITHRUN.DP1301.OLDBASENUM is '变更前基数';

          comment on column WITHRUN.DP1301.NEWBASENUM is '变更后基数';

          comment on column WITHRUN.DP1301.DPRATIONUM is '缴存比例编号';

          comment on column WITHRUN.DP1301.OLDUNITRATIO is '变更前单位比例';*/


  @Column(name = "finchgnumber")
  private long finchgnumber财政变更人数;
  @Column(name = "selchgnumber")
  private long selchgnumber自筹变更人数;
  @Column(name = "finchgamt")
  private double finchgamt财政汇缴变更金额;
  @Column(name = "selchgamt")
  private double selchgamt自筹汇缴变更金额;
  @Column(name = "oldbasenum")
  private double oldbasenum变更前基数;
  @Column(name = "newbasenum")
  private double newbasenum变更后基数;
  @Column(name = "dprationum")
  private String dprationum缴存比例编号;
  @Column(name = "oldunitratio")
  private double oldunitratio变更前单位比例;

/*          comment on column WITHRUN.DP1301.NEWUNITRATIO is '变更后单位比例';

          comment on column WITHRUN.DP1301.OLDPERSONRATIO is '变更前个人比例';

          comment on column WITHRUN.DP1301.NEWPERSONRATIO is '变更后个人比例';

          comment on column WITHRUN.DP1301.OLDDPRATIONUM is '旧缴存比例编号';

          comment on column WITHRUN.DP1301.NEWDPRATIONUM is '新缴存比例编号';

          comment on column WITHRUN.DP1301.RATIOREDUCESTOPYM is '比例调低终止年月';

          comment on column WITHRUN.DP1301.MAKERNAME is '经办人姓名';

          comment on column WITHRUN.DP1301.MAKERPHONE is '经办人电话';

          comment on column WITHRUN.DP1301.MAKERCREDNUM is '经办人证件号码';*/

          @Column(name = "newunitratio")
  private double newunitratio变更后单位比例;
  @Column(name = "oldpersonratio")
  private double oldpersonratio变更前个人比例;
  @Column(name = "newpersonratio")
  private double newpersonratio变更后个人比例;
  @Column(name = "olddprationum")
  private String olddprationum旧缴存比例编号;
  @Column(name = "newdprationum")
  private String newdprationum新缴存比例编号;
  @Column(name = "ratioreducestopym")
  private String ratioreducestopym比例调低终止年月;
  @Column(name = "makername")
  private String makername经办人姓名;
  @Column(name = "makerphone")
  private String makerphone经办人电话;
  @Column(name = "makercrednum")
  private String makercrednum经办人证件号码;

/*          comment on column WITHRUN.DP1301.CHNL is '渠道';

          comment on column WITHRUN.DP1301.CHNLSEQ is '渠道流水号';

          comment on column WITHRUN.DP1301.BUSINESSSEQ is '业务流水号';

          comment on column WITHRUN.DP1301.MAKERTELLER is '经办柜员';

          comment on column WITHRUN.DP1301.REVIEWTELLER is '复核柜员';

          comment on column WITHRUN.DP1301.FINJUDTELLER is '终审柜员';

          comment on column WITHRUN.DP1301.AUTHTELLER is '授权柜员';

          comment on column WITHRUN.DP1301.ACCOUNTINST is '账户机构';

          comment on column WITHRUN.DP1301.ACCOUNTBANK is '账户银行';*/
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
  @Column(name = "accountbank")
  private String accountbank账户银行;
/*          comment on column WITHRUN.DP1301.MAKERINST is '经办机构';

          comment on column WITHRUN.DP1301.MAKERBANK is '经办银行';

          comment on column WITHRUN.DP1301.CITYCODE is '城市代码';

          comment on column WITHRUN.DP1301.CREATETIME is '创建时间';

          comment on column WITHRUN.DP1301.UPDATETIME is '最后更新时间戳';

          comment on column WITHRUN.DP1301.FREEUSECHAR1 is '备用字符1';*/
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

  public String getLastdpym缴至年月() {
    return lastdpym缴至年月;
  }

  public void setLastdpym缴至年月(String lastdpym缴至年月) {
    this.lastdpym缴至年月 = lastdpym缴至年月;
  }

  public String getChgtype变更类型() {
    return chgtype变更类型;
  }

  public void setChgtype变更类型(String chgtype变更类型) {
    this.chgtype变更类型 = chgtype变更类型;
  }

  public String getValidflag有效标志() {
    return validflag有效标志;
  }

  public void setValidflag有效标志(String validflag有效标志) {
    this.validflag有效标志 = validflag有效标志;
  }

  public long getFinchgnumber财政变更人数() {
    return finchgnumber财政变更人数;
  }

  public void setFinchgnumber财政变更人数(long finchgnumber财政变更人数) {
    this.finchgnumber财政变更人数 = finchgnumber财政变更人数;
  }

  public long getSelchgnumber自筹变更人数() {
    return selchgnumber自筹变更人数;
  }

  public void setSelchgnumber自筹变更人数(long selchgnumber自筹变更人数) {
    this.selchgnumber自筹变更人数 = selchgnumber自筹变更人数;
  }

  public double getFinchgamt财政汇缴变更金额() {
    return finchgamt财政汇缴变更金额;
  }

  public void setFinchgamt财政汇缴变更金额(double finchgamt财政汇缴变更金额) {
    this.finchgamt财政汇缴变更金额 = finchgamt财政汇缴变更金额;
  }

  public double getSelchgamt自筹汇缴变更金额() {
    return selchgamt自筹汇缴变更金额;
  }

  public void setSelchgamt自筹汇缴变更金额(double selchgamt自筹汇缴变更金额) {
    this.selchgamt自筹汇缴变更金额 = selchgamt自筹汇缴变更金额;
  }

  public double getOldbasenum变更前基数() {
    return oldbasenum变更前基数;
  }

  public void setOldbasenum变更前基数(double oldbasenum变更前基数) {
    this.oldbasenum变更前基数 = oldbasenum变更前基数;
  }

  public double getNewbasenum变更后基数() {
    return newbasenum变更后基数;
  }

  public void setNewbasenum变更后基数(double newbasenum变更后基数) {
    this.newbasenum变更后基数 = newbasenum变更后基数;
  }

  public String getDprationum缴存比例编号() {
    return dprationum缴存比例编号;
  }

  public void setDprationum缴存比例编号(String dprationum缴存比例编号) {
    this.dprationum缴存比例编号 = dprationum缴存比例编号;
  }

  public double getOldunitratio变更前单位比例() {
    return oldunitratio变更前单位比例;
  }

  public void setOldunitratio变更前单位比例(double oldunitratio变更前单位比例) {
    this.oldunitratio变更前单位比例 = oldunitratio变更前单位比例;
  }

  public double getNewunitratio变更后单位比例() {
    return newunitratio变更后单位比例;
  }

  public void setNewunitratio变更后单位比例(double newunitratio变更后单位比例) {
    this.newunitratio变更后单位比例 = newunitratio变更后单位比例;
  }

  public double getOldpersonratio变更前个人比例() {
    return oldpersonratio变更前个人比例;
  }

  public void setOldpersonratio变更前个人比例(double oldpersonratio变更前个人比例) {
    this.oldpersonratio变更前个人比例 = oldpersonratio变更前个人比例;
  }

  public double getNewpersonratio变更后个人比例() {
    return newpersonratio变更后个人比例;
  }

  public void setNewpersonratio变更后个人比例(double newpersonratio变更后个人比例) {
    this.newpersonratio变更后个人比例 = newpersonratio变更后个人比例;
  }

  public String getOlddprationum旧缴存比例编号() {
    return olddprationum旧缴存比例编号;
  }

  public void setOlddprationum旧缴存比例编号(String olddprationum旧缴存比例编号) {
    this.olddprationum旧缴存比例编号 = olddprationum旧缴存比例编号;
  }

  public String getNewdprationum新缴存比例编号() {
    return newdprationum新缴存比例编号;
  }

  public void setNewdprationum新缴存比例编号(String newdprationum新缴存比例编号) {
    this.newdprationum新缴存比例编号 = newdprationum新缴存比例编号;
  }

  public String getRatioreducestopym比例调低终止年月() {
    return ratioreducestopym比例调低终止年月;
  }

  public void setRatioreducestopym比例调低终止年月(String ratioreducestopym比例调低终止年月) {
    this.ratioreducestopym比例调低终止年月 = ratioreducestopym比例调低终止年月;
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
