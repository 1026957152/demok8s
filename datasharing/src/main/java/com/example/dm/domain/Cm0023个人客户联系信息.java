package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Cm0023")
public class Cm0023个人客户联系信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*  comment on column WITHRUN.CM0023.ID is '序号';

  comment on column WITHRUN.CM0023.RELATIVEINFONUM is '联系信息编号';

  comment on column WITHRUN.CM0023.CUSTID is '个人客户号';

  comment on column WITHRUN.CM0023.CUSTRELATIVEINFOTYPE is '个人客户联系信息类型';

  comment on column WITHRUN.CM0023.CONTMETHTYPE is '联系方式类型';

  comment on column WITHRUN.CM0023.CONTMETHINFO is '联系方式内容';

  comment on column WITHRUN.CM0023.ISDEFAULT is '是否默认';*/

  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "relativeinfonum")
  private String relativeinfonum联系信息编号;
  @Column(name = "custid")
  private String custid个人客户号;
  @Column(name = "custrelativeinfotype")
  private String custrelativeinfotype个人客户联系信息类型;
  @Column(name = "contmethtype")
  private String contmethtype联系方式类型;
  @Column(name = "contmethinfo")
  private String contmethinfo联系方式内容;
  @Column(name = "isdefault")
  private String isdefault是否默认;

/*  comment on column WITHRUN.CM0023.CITYCODE is '城市代码';

  comment on column WITHRUN.CM0023.MAKERINST is '经办机构';

  comment on column WITHRUN.CM0023.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.CM0023.TRANSDATE is '业务发生日期';

  comment on column WITHRUN.CM0023.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.CM0023.CHNL is '渠道';

  comment on column WITHRUN.CM0023.CHNLSEQ is '渠道流水号';*/
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
  @Column(name = "transseq")
  private String transseq交易流水号;

/*  comment on table WITHRUN.CM0023 is '个人客户联系信息';




  comment on column WITHRUN.CM0023.CREATETIME is '创建时间';

  comment on column WITHRUN.CM0023.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.CM0023.FREEUSECHAR1 is '备用字符1';

  comment on column WITHRUN.CM0023.TRANSSEQ is '交易流水号';*/

  public long getId序号() {
    return id序号;
  }

  public void setId序号(long id序号) {
    this.id序号 = id序号;
  }

  public String getRelativeinfonum联系信息编号() {
    return relativeinfonum联系信息编号;
  }

  public void setRelativeinfonum联系信息编号(String relativeinfonum联系信息编号) {
    this.relativeinfonum联系信息编号 = relativeinfonum联系信息编号;
  }

  public String getCustid个人客户号() {
    return custid个人客户号;
  }

  public void setCustid个人客户号(String custid个人客户号) {
    this.custid个人客户号 = custid个人客户号;
  }

  public String getCustrelativeinfotype个人客户联系信息类型() {
    return custrelativeinfotype个人客户联系信息类型;
  }

  public void setCustrelativeinfotype个人客户联系信息类型(String custrelativeinfotype个人客户联系信息类型) {
    this.custrelativeinfotype个人客户联系信息类型 = custrelativeinfotype个人客户联系信息类型;
  }

  public String getContmethtype联系方式类型() {
    return contmethtype联系方式类型;
  }

  public void setContmethtype联系方式类型(String contmethtype联系方式类型) {
    this.contmethtype联系方式类型 = contmethtype联系方式类型;
  }

  public String getContmethinfo联系方式内容() {
    return contmethinfo联系方式内容;
  }

  public void setContmethinfo联系方式内容(String contmethinfo联系方式内容) {
    this.contmethinfo联系方式内容 = contmethinfo联系方式内容;
  }

  public String getIsdefault是否默认() {
    return isdefault是否默认;
  }

  public void setIsdefault是否默认(String isdefault是否默认) {
    this.isdefault是否默认 = isdefault是否默认;
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

  public String getTransseq交易流水号() {
    return transseq交易流水号;
  }

  public void setTransseq交易流水号(String transseq交易流水号) {
    this.transseq交易流水号 = transseq交易流水号;
  }
}
