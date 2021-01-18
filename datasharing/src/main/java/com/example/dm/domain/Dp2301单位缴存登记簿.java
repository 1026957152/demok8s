package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

import java.time.LocalDateTime;

@Entity
@Table(name = "Dp2301")
public class Dp2301单位缴存登记簿 {

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }














/*  comment on column WITHRUN.DP2301.ID is '序号';

  comment on column WITHRUN.DP2301.REGNUM is '登记号';

  comment on column WITHRUN.DP2301.REGDATE is '登记日期';

  comment on column WITHRUN.DP2301.UNITACCNUM is '单位账号';

  comment on column WITHRUN.DP2301.BEGYM is '开始年月';

  comment on column WITHRUN.DP2301.ENDYM is '截止年月';

  comment on column WITHRUN.DP2301.DPTYPE is '缴存类型';*/


  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "regnum")
  private String regnum登记号;
  @Column(name = "regdate")
  private java.sql.Date regdate登记日期;
  @Column(name = "unitaccnum")
  private String unitaccnum单位账号;
  @Column(name = "begym")
  private String begym开始年月;
  @Column(name = "endym")
  private String endym截止年月;
  @Column(name = "dptype")
  private String dptype缴存类型;
/*  comment on column WITHRUN.DP2301.FUNDSOURCEFLAG is '资金来源标志';

  comment on column WITHRUN.DP2301.PAYMENTWAY is '缴款方式';

  comment on column WITHRUN.DP2301.SUPPDPWAY is '补缴方式';

  comment on column WITHRUN.DP2301.DPCHGFLAG is '汇缴额变化标志';

  comment on column WITHRUN.DP2301.OPERATENUMBER is '操作人数';

  comment on column WITHRUN.DP2301.DPABLEAMT is '月应缴金额';

  comment on column WITHRUN.DP2301.FACTDPAMT is '实际缴款金额';*/

  @Column(name = "fundsourceflag")
  private String fundsourceflag资金来源标志;
  @Column(name = "paymentway")
  private String paymentway缴款方式;
  @Column(name = "suppdpway")
  private String suppdpway补缴方式;
  @Column(name = "dpchgflag")
  private String dpchgflag汇缴额变化标志;
  @Column(name = "operatenumber")
  private long operatenumber操作人数;
  @Column(name = "dpableamt")
  private double dpableamt月应缴金额;
  @Column(name = "factdpamt")
  private double factdpamt实际缴款金额;

/*  comment on column WITHRUN.DP2301.PREPOUTAMT is '预缴户转出金额';

  comment on column WITHRUN.DP2301.PREPINAMT is '预缴户转入金额';

  comment on column WITHRUN.DP2301.SUPUNITACCNUM is '上级单位账号';

  comment on column WITHRUN.DP2301.NORMALDPTYPE is '汇缴类型';

  comment on column WITHRUN.DP2301.TRANSTYPE is '交易类型';

  comment on column WITHRUN.DP2301.PAYMENTCERTIFNUM is '缴款凭证号';

  comment on column WITHRUN.DP2301.INACCOUNTSTATUS is '入账状态';

  comment on column WITHRUN.DP2301.INACCOUNTDATE is '入账日期';*/
  @Column(name = "prepoutamt")
  private double prepoutamt预缴户转出金额;
  @Column(name = "prepinamt")
  private double prepinamt预缴户转入金额;
  @Column(name = "supunitaccnum")
  private String supunitaccnum上级单位账号;
  @Column(name = "normaldptype")
  private String normaldptype汇缴类型;
  @Column(name = "transtype")
  private String transtype交易类型;
  @Column(name = "paymentcertifnum")
  private String paymentcertifnum缴款凭证号;
  @Column(name = "inaccountstatus")
  private String inaccountstatus入账状态;
  @Column(name = "inaccountdate")
  private java.sql.Date inaccountdate入账日期;

/*  comment on column WITHRUN.DP2301.UNITCOLLECTIONBANKCODE is '单位托收银行码';

  comment on column WITHRUN.DP2301.UNITCOLLECTIONBANKACCNUM is '单位托收银行账号';

  comment on column WITHRUN.DP2301.UNITCOLLECTIONBANKACCNAME is '单位托收银行账户名称';

  comment on column WITHRUN.DP2301.COLLECTIONSTATUS is '托收状态';

  comment on column WITHRUN.DP2301.COLLECTIONFAILREASON is '托收失败原因';

  comment on column WITHRUN.DP2301.CHECKFLAG is '检查标志';

  comment on column WITHRUN.DP2301.CHECKRESULTSUMMARYCODE is '核对结果摘要码';

  comment on column WITHRUN.DP2301.BANKDEDUCTDATE is '银行划款日期';

  comment on column WITHRUN.DP2301.FILENAME is '文件名称';*/
  @Column(name = "unitcollectionbankcode")
  private String unitcollectionbankcode单位托收银行码;
  @Column(name = "unitcollectionbankaccnum")
  private String unitcollectionbankaccnum单位托收银行账号;
  @Column(name = "unitcollectionbankaccname")
  private String unitcollectionbankaccname单位托收银行账户名称;
  @Column(name = "collectionstatus")
  private String collectionstatus托收状态;
  @Column(name = "collectionfailreason")
  private String collectionfailreason托收失败原因;
  @Column(name = "checkflag")
  private String checkflag检查标志;
  @Column(name = "checkresultsummarycode")
  private String checkresultsummarycode核对结果摘要码;
  @Column(name = "bankdeductdate")
  private java.sql.Date bankdeductdate银行划款日期;
  @Column(name = "filename")
  private String filename文件名称;

/*  comment on column WITHRUN.DP2301.SUPPDPREASON is '补缴原因';

  comment on column WITHRUN.DP2301.SUPPDPAPPLYREASON is '补缴申请原因';

  comment on column WITHRUN.DP2301.CURRENTYEARSUPPDPAMT is '当年补缴额';

  comment on column WITHRUN.DP2301.LASTYEARSUPPDPAMT is '往年补缴额';

  comment on column WITHRUN.DP2301.CHNL is '渠道';

  comment on column WITHRUN.DP2301.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.DP2301.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.DP2301.TRANSSEQ is '交易流水号';*/
  @Column(name = "suppdpreason")
  private String suppdpreason补缴原因;
  @Column(name = "suppdpapplyreason")
  private String suppdpapplyreason补缴申请原因;
  @Column(name = "currentyearsuppdpamt")
  private double currentyearsuppdpamt当年补缴额;
  @Column(name = "lastyearsuppdpamt")
  private double lastyearsuppdpamt往年补缴额;
  @Column(name = "chnl")
  private String chnl渠道;
  @Column(name = "chnlseq")
  private String chnlseq渠道流水号;
  @Column(name = "businessseq")
  private String businessseq业务流水号;
  @Column(name = "transseq")
  private String transseq交易流水号;
/*  comment on column WITHRUN.DP2301.INACCOUNTSEQ is '入账业务流水号';

  comment on column WITHRUN.DP2301.INACCOUNTTRANSSEQ is '入账交易流水号';

  comment on column WITHRUN.DP2301.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.DP2301.REVIEWTELLER is '复核柜员';

  comment on column WITHRUN.DP2301.FINJUDTELLER is '终审柜员';

  comment on column WITHRUN.DP2301.AUTHTELLER is '授权柜员';

  comment on column WITHRUN.DP2301.INACCOUNTTELLER is '入账柜员';

  comment on column WITHRUN.DP2301.STTELLER is '结算柜员';

  comment on column WITHRUN.DP2301.ACCOUNTINST is '账户机构';*/


  @Column(name = "inaccountseq")
  private String inaccountseq入账业务流水号;
  @Column(name = "inaccounttransseq")
  private String inaccounttransseq入账交易流水号;
  @Column(name = "makerteller")
  private String makerteller经办柜员;
  @Column(name = "reviewteller")
  private String reviewteller复核柜员;
  @Column(name = "finjudteller")
  private String finjudteller终审柜员;
  @Column(name = "authteller")
  private String authteller授权柜员;
  @Column(name = "inaccountteller")
  private String inaccountteller入账柜员;
  @Column(name = "stteller")
  private String stteller结算柜员;
  @Column(name = "accountinst")
  private String accountinst账户机构;

/*  comment on column WITHRUN.DP2301.ACCOUNTBANK is '账户银行';

  comment on column WITHRUN.DP2301.MAKERINST is '经办机构';

  comment on column WITHRUN.DP2301.MAKERBANK is '经办银行';

  comment on column WITHRUN.DP2301.CITYCODE is '城市代码';

  comment on column WITHRUN.DP2301.UNITDETAILID is '单位明细id';

  comment on column WITHRUN.DP2301.CREATETIME is '创建时间';

  comment on column WITHRUN.DP2301.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.DP2301.FREEUSECHAR1 is '备用字符1';*/
  @Column(name = "accountbank")
  private String accountbank账户银行;
  @Column(name = "makerinst")
  private String makerinst经办机构;
  @Column(name = "makerbank")
  private String makerbank经办银行;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "unitdetailid")
  private long unitdetailid单位明细id;
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

  public String getRegnum登记号() {
    return regnum登记号;
  }

  public void setRegnum登记号(String regnum登记号) {
    this.regnum登记号 = regnum登记号;
  }

  public Date getRegdate登记日期() {
    return regdate登记日期;
  }

  public void setRegdate登记日期(Date regdate登记日期) {
    this.regdate登记日期 = regdate登记日期;
  }

  public String getUnitaccnum单位账号() {
    return unitaccnum单位账号;
  }

  public void setUnitaccnum单位账号(String unitaccnum单位账号) {
    this.unitaccnum单位账号 = unitaccnum单位账号;
  }

  public String getBegym开始年月() {
    return begym开始年月;
  }

  public void setBegym开始年月(String begym开始年月) {
    this.begym开始年月 = begym开始年月;
  }

  public String getEndym截止年月() {
    return endym截止年月;
  }

  public void setEndym截止年月(String endym截止年月) {
    this.endym截止年月 = endym截止年月;
  }

  public String getDptype缴存类型() {
    return dptype缴存类型;
  }

  public void setDptype缴存类型(String dptype缴存类型) {
    this.dptype缴存类型 = dptype缴存类型;
  }

  public String getFundsourceflag资金来源标志() {
    return fundsourceflag资金来源标志;
  }

  public void setFundsourceflag资金来源标志(String fundsourceflag资金来源标志) {
    this.fundsourceflag资金来源标志 = fundsourceflag资金来源标志;
  }

  public String getPaymentway缴款方式() {
    return paymentway缴款方式;
  }

  public void setPaymentway缴款方式(String paymentway缴款方式) {
    this.paymentway缴款方式 = paymentway缴款方式;
  }

  public String getSuppdpway补缴方式() {
    return suppdpway补缴方式;
  }

  public void setSuppdpway补缴方式(String suppdpway补缴方式) {
    this.suppdpway补缴方式 = suppdpway补缴方式;
  }

  public String getDpchgflag汇缴额变化标志() {
    return dpchgflag汇缴额变化标志;
  }

  public void setDpchgflag汇缴额变化标志(String dpchgflag汇缴额变化标志) {
    this.dpchgflag汇缴额变化标志 = dpchgflag汇缴额变化标志;
  }

  public long getOperatenumber操作人数() {
    return operatenumber操作人数;
  }

  public void setOperatenumber操作人数(long operatenumber操作人数) {
    this.operatenumber操作人数 = operatenumber操作人数;
  }

  public double getDpableamt月应缴金额() {
    return dpableamt月应缴金额;
  }

  public void setDpableamt月应缴金额(double dpableamt月应缴金额) {
    this.dpableamt月应缴金额 = dpableamt月应缴金额;
  }

  public double getFactdpamt实际缴款金额() {
    return factdpamt实际缴款金额;
  }

  public void setFactdpamt实际缴款金额(double factdpamt实际缴款金额) {
    this.factdpamt实际缴款金额 = factdpamt实际缴款金额;
  }

  public double getPrepoutamt预缴户转出金额() {
    return prepoutamt预缴户转出金额;
  }

  public void setPrepoutamt预缴户转出金额(double prepoutamt预缴户转出金额) {
    this.prepoutamt预缴户转出金额 = prepoutamt预缴户转出金额;
  }

  public double getPrepinamt预缴户转入金额() {
    return prepinamt预缴户转入金额;
  }

  public void setPrepinamt预缴户转入金额(double prepinamt预缴户转入金额) {
    this.prepinamt预缴户转入金额 = prepinamt预缴户转入金额;
  }

  public String getSupunitaccnum上级单位账号() {
    return supunitaccnum上级单位账号;
  }

  public void setSupunitaccnum上级单位账号(String supunitaccnum上级单位账号) {
    this.supunitaccnum上级单位账号 = supunitaccnum上级单位账号;
  }

  public String getNormaldptype汇缴类型() {
    return normaldptype汇缴类型;
  }

  public void setNormaldptype汇缴类型(String normaldptype汇缴类型) {
    this.normaldptype汇缴类型 = normaldptype汇缴类型;
  }

  public String getTranstype交易类型() {
    return transtype交易类型;
  }

  public void setTranstype交易类型(String transtype交易类型) {
    this.transtype交易类型 = transtype交易类型;
  }

  public String getPaymentcertifnum缴款凭证号() {
    return paymentcertifnum缴款凭证号;
  }

  public void setPaymentcertifnum缴款凭证号(String paymentcertifnum缴款凭证号) {
    this.paymentcertifnum缴款凭证号 = paymentcertifnum缴款凭证号;
  }

  public String getInaccountstatus入账状态() {
    return inaccountstatus入账状态;
  }

  public void setInaccountstatus入账状态(String inaccountstatus入账状态) {
    this.inaccountstatus入账状态 = inaccountstatus入账状态;
  }

  public Date getInaccountdate入账日期() {
    return inaccountdate入账日期;
  }

  public void setInaccountdate入账日期(Date inaccountdate入账日期) {
    this.inaccountdate入账日期 = inaccountdate入账日期;
  }

  public String getUnitcollectionbankcode单位托收银行码() {
    return unitcollectionbankcode单位托收银行码;
  }

  public void setUnitcollectionbankcode单位托收银行码(String unitcollectionbankcode单位托收银行码) {
    this.unitcollectionbankcode单位托收银行码 = unitcollectionbankcode单位托收银行码;
  }

  public String getUnitcollectionbankaccnum单位托收银行账号() {
    return unitcollectionbankaccnum单位托收银行账号;
  }

  public void setUnitcollectionbankaccnum单位托收银行账号(String unitcollectionbankaccnum单位托收银行账号) {
    this.unitcollectionbankaccnum单位托收银行账号 = unitcollectionbankaccnum单位托收银行账号;
  }

  public String getUnitcollectionbankaccname单位托收银行账户名称() {
    return unitcollectionbankaccname单位托收银行账户名称;
  }

  public void setUnitcollectionbankaccname单位托收银行账户名称(String unitcollectionbankaccname单位托收银行账户名称) {
    this.unitcollectionbankaccname单位托收银行账户名称 = unitcollectionbankaccname单位托收银行账户名称;
  }

  public String getCollectionstatus托收状态() {
    return collectionstatus托收状态;
  }

  public void setCollectionstatus托收状态(String collectionstatus托收状态) {
    this.collectionstatus托收状态 = collectionstatus托收状态;
  }

  public String getCollectionfailreason托收失败原因() {
    return collectionfailreason托收失败原因;
  }

  public void setCollectionfailreason托收失败原因(String collectionfailreason托收失败原因) {
    this.collectionfailreason托收失败原因 = collectionfailreason托收失败原因;
  }

  public String getCheckflag检查标志() {
    return checkflag检查标志;
  }

  public void setCheckflag检查标志(String checkflag检查标志) {
    this.checkflag检查标志 = checkflag检查标志;
  }

  public String getCheckresultsummarycode核对结果摘要码() {
    return checkresultsummarycode核对结果摘要码;
  }

  public void setCheckresultsummarycode核对结果摘要码(String checkresultsummarycode核对结果摘要码) {
    this.checkresultsummarycode核对结果摘要码 = checkresultsummarycode核对结果摘要码;
  }

  public Date getBankdeductdate银行划款日期() {
    return bankdeductdate银行划款日期;
  }

  public void setBankdeductdate银行划款日期(Date bankdeductdate银行划款日期) {
    this.bankdeductdate银行划款日期 = bankdeductdate银行划款日期;
  }

  public String getFilename文件名称() {
    return filename文件名称;
  }

  public void setFilename文件名称(String filename文件名称) {
    this.filename文件名称 = filename文件名称;
  }

  public String getSuppdpreason补缴原因() {
    return suppdpreason补缴原因;
  }

  public void setSuppdpreason补缴原因(String suppdpreason补缴原因) {
    this.suppdpreason补缴原因 = suppdpreason补缴原因;
  }

  public String getSuppdpapplyreason补缴申请原因() {
    return suppdpapplyreason补缴申请原因;
  }

  public void setSuppdpapplyreason补缴申请原因(String suppdpapplyreason补缴申请原因) {
    this.suppdpapplyreason补缴申请原因 = suppdpapplyreason补缴申请原因;
  }

  public double getCurrentyearsuppdpamt当年补缴额() {
    return currentyearsuppdpamt当年补缴额;
  }

  public void setCurrentyearsuppdpamt当年补缴额(double currentyearsuppdpamt当年补缴额) {
    this.currentyearsuppdpamt当年补缴额 = currentyearsuppdpamt当年补缴额;
  }

  public double getLastyearsuppdpamt往年补缴额() {
    return lastyearsuppdpamt往年补缴额;
  }

  public void setLastyearsuppdpamt往年补缴额(double lastyearsuppdpamt往年补缴额) {
    this.lastyearsuppdpamt往年补缴额 = lastyearsuppdpamt往年补缴额;
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

  public String getInaccountseq入账业务流水号() {
    return inaccountseq入账业务流水号;
  }

  public void setInaccountseq入账业务流水号(String inaccountseq入账业务流水号) {
    this.inaccountseq入账业务流水号 = inaccountseq入账业务流水号;
  }

  public String getInaccounttransseq入账交易流水号() {
    return inaccounttransseq入账交易流水号;
  }

  public void setInaccounttransseq入账交易流水号(String inaccounttransseq入账交易流水号) {
    this.inaccounttransseq入账交易流水号 = inaccounttransseq入账交易流水号;
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

  public String getInaccountteller入账柜员() {
    return inaccountteller入账柜员;
  }

  public void setInaccountteller入账柜员(String inaccountteller入账柜员) {
    this.inaccountteller入账柜员 = inaccountteller入账柜员;
  }

  public String getStteller结算柜员() {
    return stteller结算柜员;
  }

  public void setStteller结算柜员(String stteller结算柜员) {
    this.stteller结算柜员 = stteller结算柜员;
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

  public long getUnitdetailid单位明细id() {
    return unitdetailid单位明细id;
  }

  public void setUnitdetailid单位明细id(long unitdetailid单位明细id) {
    this.unitdetailid单位明细id = unitdetailid单位明细id;
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
