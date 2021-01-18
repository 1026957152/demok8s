package com.example.dm.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Cm0009")
public class Cm0009企业客户联系信息 {
/*  comment on column WITHRUN.CM0009.ID is '序号';

  comment on column WITHRUN.CM0009.LINKNUM is '联系信息编号';

  comment on column WITHRUN.CM0009.RELATIVETYPE is '联系类型';

  comment on column WITHRUN.CM0009.UNITCUSTID is '单位客户号';

  comment on column WITHRUN.CM0009.CMPERSONNUM is '客户人员编号';

  comment on column WITHRUN.CM0009.CONTMETHTYPE is '联系方式类型';

  comment on column WITHRUN.CM0009.CONTMETHINFO is '联系方式内容';

  comment on column WITHRUN.CM0009.ISDEFAULTLINK is '是否为默认联系方式';*/

  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "linknum")
  private String linknum联系信息编号;
  @Column(name = "relativetype")
  private String relativetype联系类型;
  @Column(name = "unitcustid")
  private String unitcustid单位客户号;
  @Column(name = "cmpersonnum")
  private String cmpersonnum客户人员编号;
  @Column(name = "contmethtype")
  private String contmethtype联系方式类型;
  @Column(name = "contmethinfo")
  private String contmethinfo联系方式内容;
  @Column(name = "isdefaultlink")
  private String isdefaultlink是否为默认联系方式;


/*  comment on column WITHRUN.CM0009.REMARK is '备注';

  comment on column WITHRUN.CM0009.CITYCODE is '城市代码';

  comment on column WITHRUN.CM0009.MAKERINST is '经办机构';

  comment on column WITHRUN.CM0009.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.CM0009.TRANSDATE is '业务发生日期';

  comment on column WITHRUN.CM0009.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.CM0009.TRANSSEQ is '交易流水号';

  comment on column WITHRUN.CM0009.CHNL is '渠道';*/
  @Column(name = "remark")
  private String remark备注;
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

/*  comment on table WITHRUN.CM0009 is '企业客户联系信息';



  comment on column WITHRUN.CM0009.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.CM0009.CREATETIME is '创建时间';

  comment on column WITHRUN.CM0009.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.CM0009.FREEUSECHAR1 is '备用字符1';*/

  public long getId序号() {
    return id序号;
  }

  public void setId序号(long id序号) {
    this.id序号 = id序号;
  }

  public String getLinknum联系信息编号() {
    return linknum联系信息编号;
  }

  public void setLinknum联系信息编号(String linknum联系信息编号) {
    this.linknum联系信息编号 = linknum联系信息编号;
  }

  public String getRelativetype联系类型() {
    return relativetype联系类型;
  }

  public void setRelativetype联系类型(String relativetype联系类型) {
    this.relativetype联系类型 = relativetype联系类型;
  }

  public String getUnitcustid单位客户号() {
    return unitcustid单位客户号;
  }

  public void setUnitcustid单位客户号(String unitcustid单位客户号) {
    this.unitcustid单位客户号 = unitcustid单位客户号;
  }

  public String getCmpersonnum客户人员编号() {
    return cmpersonnum客户人员编号;
  }

  public void setCmpersonnum客户人员编号(String cmpersonnum客户人员编号) {
    this.cmpersonnum客户人员编号 = cmpersonnum客户人员编号;
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

  public String getIsdefaultlink是否为默认联系方式() {
    return isdefaultlink是否为默认联系方式;
  }

  public void setIsdefaultlink是否为默认联系方式(String isdefaultlink是否为默认联系方式) {
    this.isdefaultlink是否为默认联系方式 = isdefaultlink是否为默认联系方式;
  }

  public String getRemark备注() {
    return remark备注;
  }

  public void setRemark备注(String remark备注) {
    this.remark备注 = remark备注;
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
