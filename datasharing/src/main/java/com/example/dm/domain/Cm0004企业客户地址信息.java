package com.example.dm.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Cm0004")
public class Cm0004企业客户地址信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*
  comment on table WITHRUN.CM0004 is '企业客户地址信息';

  comment on column WITHRUN.CM0004.ID is '序号';

  comment on column WITHRUN.CM0004.UNITCUSTADDRNUM is '单位客户地址编号';

  comment on column WITHRUN.CM0004.UNITCUSTID is '单位客户号';

  comment on column WITHRUN.CM0004.PROVINCENAME is '省份名称';
*/




  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "unitcustaddrnum")
  private String unitcustaddrnum单位客户地址编号;
  @Column(name = "unitcustid")
  private String unitcustid单位客户号;
  @Column(name = "provincename")
  private String provincename省份名称;
  @Column(name = "cityname")
  private String cityname城市名称;
  @Column(name = "regionname")
  private String regionname区域名称;
  @Column(name = "streetname")
  private String streetname街道名称;
  @Column(name = "addrdetail")
  private String addrdetail地址详情;
  @Column(name = "postcode")
  private String postcode邮政编码;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "makerinst")
  private String makerinst经办机构;

/*  comment on column WITHRUN.CM0004.CITYNAME is '城市名称';

  comment on column WITHRUN.CM0004.REGIONNAME is '区域名称';

  comment on column WITHRUN.CM0004.STREETNAME is '街道名称';

  comment on column WITHRUN.CM0004.ADDRDETAIL is '地址详情';

  comment on column WITHRUN.CM0004.POSTCODE is '邮政编码';

  comment on column WITHRUN.CM0004.CITYCODE is '城市代码';

  comment on column WITHRUN.CM0004.MAKERINST is '经办机构';*/


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
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;
/*  comment on column WITHRUN.CM0004.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.CM0004.TRANSDATE is '业务发生日期';

  comment on column WITHRUN.CM0004.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.CM0004.TRANSSEQ is '交易流水号';

  comment on column WITHRUN.CM0004.CHNL is '渠道';

  comment on column WITHRUN.CM0004.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.CM0004.CREATETIME is '创建时间';

  comment on column WITHRUN.CM0004.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.CM0004.FREEUSECHAR1 is '备用字符1';*/

  public long getId序号() {
    return id序号;
  }

  public void setId序号(long id序号) {
    this.id序号 = id序号;
  }

  public String getUnitcustaddrnum单位客户地址编号() {
    return unitcustaddrnum单位客户地址编号;
  }

  public void setUnitcustaddrnum单位客户地址编号(String unitcustaddrnum单位客户地址编号) {
    this.unitcustaddrnum单位客户地址编号 = unitcustaddrnum单位客户地址编号;
  }

  public String getUnitcustid单位客户号() {
    return unitcustid单位客户号;
  }

  public void setUnitcustid单位客户号(String unitcustid单位客户号) {
    this.unitcustid单位客户号 = unitcustid单位客户号;
  }

  public String getProvincename省份名称() {
    return provincename省份名称;
  }

  public void setProvincename省份名称(String provincename省份名称) {
    this.provincename省份名称 = provincename省份名称;
  }

  public String getCityname城市名称() {
    return cityname城市名称;
  }

  public void setCityname城市名称(String cityname城市名称) {
    this.cityname城市名称 = cityname城市名称;
  }

  public String getRegionname区域名称() {
    return regionname区域名称;
  }

  public void setRegionname区域名称(String regionname区域名称) {
    this.regionname区域名称 = regionname区域名称;
  }

  public String getStreetname街道名称() {
    return streetname街道名称;
  }

  public void setStreetname街道名称(String streetname街道名称) {
    this.streetname街道名称 = streetname街道名称;
  }

  public String getAddrdetail地址详情() {
    return addrdetail地址详情;
  }

  public void setAddrdetail地址详情(String addrdetail地址详情) {
    this.addrdetail地址详情 = addrdetail地址详情;
  }

  public String getPostcode邮政编码() {
    return postcode邮政编码;
  }

  public void setPostcode邮政编码(String postcode邮政编码) {
    this.postcode邮政编码 = postcode邮政编码;
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
