package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

import java.time.LocalDateTime;

@Entity
@Table(name = "Dp2302")
public class Dp2302个人缴存登记簿 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*  comment on table WITHRUN.DP2302 is '个人缴存登记簿';

  comment on column WITHRUN.DP2302.ID is '序号';

  comment on column WITHRUN.DP2302.REGNUM is '登记号';

  comment on column WITHRUN.DP2302.REGDATE is '登记日期';

  comment on column WITHRUN.DP2302.UNITACCNUM is '单位账号';

  comment on column WITHRUN.DP2302.ACCNUM is '个人账号';

  comment on column WITHRUN.DP2302.DPYM is '缴存年月';*/


  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "regnum")
  private String regnum登记号;
  @Column(name = "regdate")
  private java.sql.Date regdate登记日期;
  @Column(name = "unitaccnum")
  private String unitaccnum单位账号;
  @Column(name = "accnum")
  private String accnum个人账号;

  @Column(name = "dpym")
  private String dpym缴存年月;

/*
  comment on column WITHRUN.DP2302.PERSONDPBASENUM is '个人缴存基数';

  comment on column WITHRUN.DP2302.UNITDPRATIO is '单位缴存比例';

  comment on column WITHRUN.DP2302.PERSONDPRATIO is '个人缴存比例';

  comment on column WITHRUN.DP2302.UNITDPAMT is '单位月缴存额';

  comment on column WITHRUN.DP2302.PERSONDPAMT is '个人月缴存额';

  comment on column WITHRUN.DP2302.DPAMT is '缴存金额';
  */


  @Column(name = "persondpbasenum")
  private double persondpbasenum个人缴存基数;
  @Column(name = "unitdpratio")
  private double unitdpratio单位缴存比例;
  @Column(name = "persondpratio")
  private double persondpratio个人缴存比例;
  @Column(name = "unitdpamt")
  private double unitdpamt单位月缴存额;
  @Column(name = "persondpamt")
  private double persondpamt个人月缴存额;
  @Column(name = "dpamt")
  private double dpamt缴存金额;



/*  comment on column WITHRUN.DP2302.FUNDSOURCEFLAG is '资金来源标志';

  comment on column WITHRUN.DP2302.DPTYPE is '缴存类型';

  comment on column WITHRUN.DP2302.NORMALDPTYPE is '汇缴类型';

  comment on column WITHRUN.DP2302.SUPPDPWAY is '补缴方式';

  comment on column WITHRUN.DP2302.INACCOUNTSTATUS is '入账状态';

  comment on column WITHRUN.DP2302.TRANSTYPE is '交易类型';

  comment on column WITHRUN.DP2302.INACCOUNTDATE is '入账日期';

  comment on column WITHRUN.DP2302.DPSTATUS is '缴存状态';

  comment on column WITHRUN.DP2302.DPBACKINCREBAL is '退缴使用增量余额';*/
  @Column(name = "fundsourceflag")
  private String fundsourceflag资金来源标志;
  @Column(name = "dptype")
  private String dptype缴存类型;
  @Column(name = "normaldptype")
  private String normaldptype汇缴类型;
  @Column(name = "suppdpway")
  private String suppdpway补缴方式;
  @Column(name = "inaccountstatus")
  private String inaccountstatus入账状态;
  @Column(name = "transtype")
  private String transtype交易类型;
  @Column(name = "inaccountdate")
  private java.sql.Date inaccountdate入账日期;
  @Column(name = "dpstatus")
  private String dpstatus缴存状态;
  @Column(name = "dpbackincrebal")
  private double dpbackincrebal退缴使用增量余额;


/*  comment on column WITHRUN.DP2302.DPBACKKEEPBAL is '退缴使用存量余额';

  comment on column WITHRUN.DP2302.DPBACKMAP is '退缴个人位图';

  comment on column WITHRUN.DP2302.CHNL is '渠道';

  comment on column WITHRUN.DP2302.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.DP2302.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.DP2302.INACCOUNTSEQ is '入账业务流水号';

  comment on column WITHRUN.DP2302.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.DP2302.REVIEWTELLER is '复核柜员';

  comment on column WITHRUN.DP2302.FINJUDTELLER is '终审柜员';*/
  @Column(name = "dpbackkeepbal")
  private double dpbackkeepbal退缴使用存量余额;
  @Column(name = "dpbackmap")
  private String dpbackmap退缴个人位图;
  @Column(name = "chnl")
  private String chnl渠道;
  @Column(name = "chnlseq")
  private String chnlseq渠道流水号;
  @Column(name = "businessseq")
  private String businessseq业务流水号;
  @Column(name = "inaccountseq")
  private String inaccountseq入账业务流水号;
  @Column(name = "makerteller")
  private String makerteller经办柜员;
  @Column(name = "reviewteller")
  private String reviewteller复核柜员;
  @Column(name = "finjudteller")
  private String finjudteller终审柜员;


/*  comment on column WITHRUN.DP2302.AUTHTELLER is '授权柜员';

  comment on column WITHRUN.DP2302.INACCOUNTTELLER is '入账柜员';

  comment on column WITHRUN.DP2302.STTELLER is '结算柜员';

  comment on column WITHRUN.DP2302.ACCOUNTINST is '账户机构';

  comment on column WITHRUN.DP2302.ACCOUNTBANK is '账户银行';

  comment on column WITHRUN.DP2302.MAKERINST is '经办机构';

  comment on column WITHRUN.DP2302.MAKERBANK is '经办银行';

  comment on column WITHRUN.DP2302.CITYCODE is '城市代码';

  comment on column WITHRUN.DP2302.PERSONDETAILID is '个人明细id';

  comment on column WITHRUN.DP2302.CREATETIME is '创建时间';*/
  @Column(name = "authteller")
  private String authteller授权柜员;
  @Column(name = "inaccountteller")
  private String inaccountteller入账柜员;
  @Column(name = "stteller")
  private String stteller结算柜员;
  @Column(name = "accountinst")
  private String accountinst账户机构;
  @Column(name = "accountbank")
  private String accountbank账户银行;
  @Column(name = "makerinst")
  private String makerinst经办机构;
  @Column(name = "makerbank")
  private String makerbank经办银行;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "persondetailid")
  private Long persondetailid个人明细id;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;


  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;
  @Column(name = "transseq")
  private String transseq交易流水号;
  @Column(name = "inaccounttransseq")
  private String inaccounttransseq入账交易流水号;

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

  public String getAccnum个人账号() {
    return accnum个人账号;
  }

  public void setAccnum个人账号(String accnum个人账号) {
    this.accnum个人账号 = accnum个人账号;
  }

  public String getDpym缴存年月() {
    return dpym缴存年月;
  }

  public void setDpym缴存年月(String dpym缴存年月) {
    this.dpym缴存年月 = dpym缴存年月;
  }

  public double getPersondpbasenum个人缴存基数() {
    return persondpbasenum个人缴存基数;
  }

  public void setPersondpbasenum个人缴存基数(double persondpbasenum个人缴存基数) {
    this.persondpbasenum个人缴存基数 = persondpbasenum个人缴存基数;
  }

  public double getUnitdpratio单位缴存比例() {
    return unitdpratio单位缴存比例;
  }

  public void setUnitdpratio单位缴存比例(double unitdpratio单位缴存比例) {
    this.unitdpratio单位缴存比例 = unitdpratio单位缴存比例;
  }

  public double getPersondpratio个人缴存比例() {
    return persondpratio个人缴存比例;
  }

  public void setPersondpratio个人缴存比例(double persondpratio个人缴存比例) {
    this.persondpratio个人缴存比例 = persondpratio个人缴存比例;
  }

  public double getUnitdpamt单位月缴存额() {
    return unitdpamt单位月缴存额;
  }

  public void setUnitdpamt单位月缴存额(double unitdpamt单位月缴存额) {
    this.unitdpamt单位月缴存额 = unitdpamt单位月缴存额;
  }

  public double getPersondpamt个人月缴存额() {
    return persondpamt个人月缴存额;
  }

  public void setPersondpamt个人月缴存额(double persondpamt个人月缴存额) {
    this.persondpamt个人月缴存额 = persondpamt个人月缴存额;
  }

  public double getDpamt缴存金额() {
    return dpamt缴存金额;
  }

  public void setDpamt缴存金额(double dpamt缴存金额) {
    this.dpamt缴存金额 = dpamt缴存金额;
  }

  public String getFundsourceflag资金来源标志() {
    return fundsourceflag资金来源标志;
  }

  public void setFundsourceflag资金来源标志(String fundsourceflag资金来源标志) {
    this.fundsourceflag资金来源标志 = fundsourceflag资金来源标志;
  }

  public String getDptype缴存类型() {
    return dptype缴存类型;
  }

  public void setDptype缴存类型(String dptype缴存类型) {
    this.dptype缴存类型 = dptype缴存类型;
  }

  public String getNormaldptype汇缴类型() {
    return normaldptype汇缴类型;
  }

  public void setNormaldptype汇缴类型(String normaldptype汇缴类型) {
    this.normaldptype汇缴类型 = normaldptype汇缴类型;
  }

  public String getSuppdpway补缴方式() {
    return suppdpway补缴方式;
  }

  public void setSuppdpway补缴方式(String suppdpway补缴方式) {
    this.suppdpway补缴方式 = suppdpway补缴方式;
  }

  public String getInaccountstatus入账状态() {
    return inaccountstatus入账状态;
  }

  public void setInaccountstatus入账状态(String inaccountstatus入账状态) {
    this.inaccountstatus入账状态 = inaccountstatus入账状态;
  }

  public String getTranstype交易类型() {
    return transtype交易类型;
  }

  public void setTranstype交易类型(String transtype交易类型) {
    this.transtype交易类型 = transtype交易类型;
  }

  public Date getInaccountdate入账日期() {
    return inaccountdate入账日期;
  }

  public void setInaccountdate入账日期(Date inaccountdate入账日期) {
    this.inaccountdate入账日期 = inaccountdate入账日期;
  }

  public String getDpstatus缴存状态() {
    return dpstatus缴存状态;
  }

  public void setDpstatus缴存状态(String dpstatus缴存状态) {
    this.dpstatus缴存状态 = dpstatus缴存状态;
  }

  public double getDpbackincrebal退缴使用增量余额() {
    return dpbackincrebal退缴使用增量余额;
  }

  public void setDpbackincrebal退缴使用增量余额(double dpbackincrebal退缴使用增量余额) {
    this.dpbackincrebal退缴使用增量余额 = dpbackincrebal退缴使用增量余额;
  }

  public double getDpbackkeepbal退缴使用存量余额() {
    return dpbackkeepbal退缴使用存量余额;
  }

  public void setDpbackkeepbal退缴使用存量余额(double dpbackkeepbal退缴使用存量余额) {
    this.dpbackkeepbal退缴使用存量余额 = dpbackkeepbal退缴使用存量余额;
  }

  public String getDpbackmap退缴个人位图() {
    return dpbackmap退缴个人位图;
  }

  public void setDpbackmap退缴个人位图(String dpbackmap退缴个人位图) {
    this.dpbackmap退缴个人位图 = dpbackmap退缴个人位图;
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

  public String getInaccountseq入账业务流水号() {
    return inaccountseq入账业务流水号;
  }

  public void setInaccountseq入账业务流水号(String inaccountseq入账业务流水号) {
    this.inaccountseq入账业务流水号 = inaccountseq入账业务流水号;
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

  public long getPersondetailid个人明细id() {
    return persondetailid个人明细id;
  }

  public void setPersondetailid个人明细id(long persondetailid个人明细id) {
    this.persondetailid个人明细id = persondetailid个人明细id;
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

  public String getTransseq交易流水号() {
    return transseq交易流水号;
  }

  public void setTransseq交易流水号(String transseq交易流水号) {
    this.transseq交易流水号 = transseq交易流水号;
  }

  public String getInaccounttransseq入账交易流水号() {
    return inaccounttransseq入账交易流水号;
  }

  public void setInaccounttransseq入账交易流水号(String inaccounttransseq入账交易流水号) {
    this.inaccounttransseq入账交易流水号 = inaccounttransseq入账交易流水号;
  }






/*  comment on column WITHRUN.DP2302.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.DP2302.FREEUSECHAR1 is '备用字符1';

  comment on column WITHRUN.DP2302.TRANSSEQ is '交易流水号';

  comment on column WITHRUN.DP2302.INACCOUNTTRANSSEQ is '入账交易流水号';*/

}
