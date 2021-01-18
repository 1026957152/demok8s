package com.example.dm.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Cm0001")
public class Cm0001企业客户基本信息表 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  /*  comment on table WITHRUN.CM0001 is '企业客户基本信息表';*/








/*
  comment on column WITHRUN.CM0001.ID is '序号';

  comment on column WITHRUN.CM0001.UNITCUSTID is '单位客户号';

  comment on column WITHRUN.CM0001.UNITNAME is '单位名称';

  comment on column WITHRUN.CM0001.ENTERPRISETYPE is '企业类型';

  comment on column WITHRUN.CM0001.UNITPROPERTY is '单位性质';*/

  @Id
  @Column(name = "id")

  private long id序号;
  @Column(name = "unitcustid")
  private String unitcustid单位客户号;
  @Column(name = "unitname")
  private String unitname单位名称;
  @Column(name = "enterprisetype")
  private String enterprisetype企业类型;
  @Column(name = "unitproperty")
  private String unitproperty单位性质;


/*  comment on column WITHRUN.CM0001.UNITNAMEPINYINFIRST is '单位名称拼音首字母（大写）';

  comment on column WITHRUN.CM0001.UNITNAMEPINYIN is '单位名称拼音（大写）';

  comment on column WITHRUN.CM0001.UNITLEGALPERNAME is '单位法人代表姓名';

  comment on column WITHRUN.CM0001.UNITLEGALPERCREDTYPE is '单位法人代表证件类型';

  comment on column WITHRUN.CM0001.UNITLEGALPERCREDNUM is '单位法人代表证件号码';

  comment on column WITHRUN.CM0001.UNITBELONGRELASHIP is '单位隶属关系';

  comment on column WITHRUN.CM0001.UNITECONOMYTYPE is '单位经济类型';

  comment on column WITHRUN.CM0001.UNITBELONGINDUSTRY is '单位所属行业';*/
  @Column(name = "unitnamepinyinfirst")
  private String unitnamepinyinfirst单位名称拼音首字母_大写;
  @Column(name = "unitnamepinyin")
  private String unitnamepinyin单位名称拼音_大写;
  @Column(name = "unitlegalpername")
  private String unitlegalpername单位法人代表姓名;
  @Column(name = "unitlegalpercredtype")
  private String unitlegalpercredtype单位法人代表证件类型;
  @Column(name = "unitlegalpercrednum")
  private String unitlegalpercrednum单位法人代表证件号码;
  @Column(name = "unitbelongrelaship")
  private String unitbelongrelaship单位隶属关系;
  @Column(name = "uniteconomytype")
  private String uniteconomytype单位经济类型;
  @Column(name = "unitbelongindustry")
  private String unitbelongindustry单位所属行业;

/*  comment on column WITHRUN.CM0001.UNITPAYDAY is '单位发薪日';

  comment on column WITHRUN.CM0001.UNITCREATEDATE is '单位设立日期';

  comment on column WITHRUN.CM0001.REGAMT is '注册资金';

  comment on column WITHRUN.CM0001.CITYCODE is '城市代码';

  comment on column WITHRUN.CM0001.MAKERINST is '经办机构';

  comment on column WITHRUN.CM0001.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.CM0001.TRANSDATE is '业务发生日期';

  comment on column WITHRUN.CM0001.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.CM0001.TRANSSEQ is '交易流水号';*/
  @Column(name = "unitpayday")
  private String unitpayday单位发薪日;
  @Column(name = "unitcreatedate")
  private java.sql.Date unitcreatedate单位设立日期;
  @Column(name = "regamt")
  private double regamt注册资金;
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
  @Column(name = "transseq")
  private String transseq交易流水号;

/*  comment on column WITHRUN.CM0001.CHNL is '渠道';

  comment on column WITHRUN.CM0001.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.CM0001.CREATETIME is '创建时间';

  comment on column WITHRUN.CM0001.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.CM0001.FREEUSECHAR1 is '备用字符1';*/
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

  public long getId序号() {
    return id序号;
  }

  public void setId序号(long id序号) {
    this.id序号 = id序号;
  }

  public String getUnitcustid单位客户号() {
    return unitcustid单位客户号;
  }

  public void setUnitcustid单位客户号(String unitcustid单位客户号) {
    this.unitcustid单位客户号 = unitcustid单位客户号;
  }

  public String getUnitname单位名称() {
    return unitname单位名称;
  }

  public void setUnitname单位名称(String unitname单位名称) {
    this.unitname单位名称 = unitname单位名称;
  }

  public String getEnterprisetype企业类型() {
    return enterprisetype企业类型;
  }

  public void setEnterprisetype企业类型(String enterprisetype企业类型) {
    this.enterprisetype企业类型 = enterprisetype企业类型;
  }

  public String getUnitproperty单位性质() {
    return unitproperty单位性质;
  }

  public void setUnitproperty单位性质(String unitproperty单位性质) {
    this.unitproperty单位性质 = unitproperty单位性质;
  }

  public String getUnitnamepinyinfirst单位名称拼音首字母_大写() {
    return unitnamepinyinfirst单位名称拼音首字母_大写;
  }

  public void setUnitnamepinyinfirst单位名称拼音首字母_大写(String unitnamepinyinfirst单位名称拼音首字母_大写) {
    this.unitnamepinyinfirst单位名称拼音首字母_大写 = unitnamepinyinfirst单位名称拼音首字母_大写;
  }

  public String getUnitnamepinyin单位名称拼音_大写() {
    return unitnamepinyin单位名称拼音_大写;
  }

  public void setUnitnamepinyin单位名称拼音_大写(String unitnamepinyin单位名称拼音_大写) {
    this.unitnamepinyin单位名称拼音_大写 = unitnamepinyin单位名称拼音_大写;
  }

  public String getUnitlegalpername单位法人代表姓名() {
    return unitlegalpername单位法人代表姓名;
  }

  public void setUnitlegalpername单位法人代表姓名(String unitlegalpername单位法人代表姓名) {
    this.unitlegalpername单位法人代表姓名 = unitlegalpername单位法人代表姓名;
  }

  public String getUnitlegalpercredtype单位法人代表证件类型() {
    return unitlegalpercredtype单位法人代表证件类型;
  }

  public void setUnitlegalpercredtype单位法人代表证件类型(String unitlegalpercredtype单位法人代表证件类型) {
    this.unitlegalpercredtype单位法人代表证件类型 = unitlegalpercredtype单位法人代表证件类型;
  }

  public String getUnitlegalpercrednum单位法人代表证件号码() {
    return unitlegalpercrednum单位法人代表证件号码;
  }

  public void setUnitlegalpercrednum单位法人代表证件号码(String unitlegalpercrednum单位法人代表证件号码) {
    this.unitlegalpercrednum单位法人代表证件号码 = unitlegalpercrednum单位法人代表证件号码;
  }

  public String getUnitbelongrelaship单位隶属关系() {
    return unitbelongrelaship单位隶属关系;
  }

  public void setUnitbelongrelaship单位隶属关系(String unitbelongrelaship单位隶属关系) {
    this.unitbelongrelaship单位隶属关系 = unitbelongrelaship单位隶属关系;
  }

  public String getUniteconomytype单位经济类型() {
    return uniteconomytype单位经济类型;
  }

  public void setUniteconomytype单位经济类型(String uniteconomytype单位经济类型) {
    this.uniteconomytype单位经济类型 = uniteconomytype单位经济类型;
  }

  public String getUnitbelongindustry单位所属行业() {
    return unitbelongindustry单位所属行业;
  }

  public void setUnitbelongindustry单位所属行业(String unitbelongindustry单位所属行业) {
    this.unitbelongindustry单位所属行业 = unitbelongindustry单位所属行业;
  }

  public String getUnitpayday单位发薪日() {
    return unitpayday单位发薪日;
  }

  public void setUnitpayday单位发薪日(String unitpayday单位发薪日) {
    this.unitpayday单位发薪日 = unitpayday单位发薪日;
  }

  public Date getUnitcreatedate单位设立日期() {
    return unitcreatedate单位设立日期;
  }

  public void setUnitcreatedate单位设立日期(Date unitcreatedate单位设立日期) {
    this.unitcreatedate单位设立日期 = unitcreatedate单位设立日期;
  }

  public double getRegamt注册资金() {
    return regamt注册资金;
  }

  public void setRegamt注册资金(double regamt注册资金) {
    this.regamt注册资金 = regamt注册资金;
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


  public String getFreeusechar1备用字符1() {
    return freeusechar1备用字符1;
  }

  public void setFreeusechar1备用字符1(String freeusechar1备用字符1) {
    this.freeusechar1备用字符1 = freeusechar1备用字符1;
  }
}
