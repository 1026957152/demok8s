package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Cm0020")
public class Cm0020_个人客户基本信息 {
/*  comment on table WITHRUN.CM0020 is '个人客户基本信息';

  comment on column WITHRUN.CM0020.ID is '序号';

  comment on column WITHRUN.CM0020.CUSTID is '个人客户号';

  comment on column WITHRUN.CM0020.NAME is '姓名';

  comment on column WITHRUN.CM0020.NAMEFULLPINYIN is '姓名全拼';

  comment on column WITHRUN.CM0020.NAMEPINYINFIRST is '名称首字母';

  comment on column WITHRUN.CM0020.BIRTHDATE is '出生日期';*/

  @Id
  @Column(name = "id")
  private long id序号;

  @Column(name = "custid")
  private String custid个人客户号;
  @Column(name = "name")
  private String name姓名;
  @Column(name = "namefullpinyin")
  private String namefullpinyin姓名全拼;
  @Column(name = "namepinyinfirst")
  private String namepinyinfirst名称首字母;
  @Column(name = "birthdate")
  private java.sql.Date birthdate出生日期;


/*  comment on column WITHRUN.CM0020.SEX is '性别';

  comment on column WITHRUN.CM0020.AGE is '年龄';

  comment on column WITHRUN.CM0020.NATION is '民族';

  comment on column WITHRUN.CM0020.MARRIAGESITUATION is '婚姻状况';

  comment on column WITHRUN.CM0020.HIGHESTEDU is '最高学历';

  comment on column WITHRUN.CM0020.HIGHESTDEGREE is '最高学位';*/
  @Column(name = "sex")
  private String sex性别;
  @Column(name = "age")
  private Long age年龄;
  @Column(name = "nation")
  private String nation民族;
  @Column(name = "marriagesituation")
  private String marriagesituation婚姻状况;
  @Column(name = "highestedu")
  private String highestedu最高学历;
  @Column(name = "highestdegree")
  private String highestdegree最高学位;

/*  comment on column WITHRUN.CM0020.CAREER is '职业';

  comment on column WITHRUN.CM0020.PROFTITL is '职称';

  comment on column WITHRUN.CM0020.DUTY is '职务';

  comment on column WITHRUN.CM0020.CITYCODE is '城市代码';

  comment on column WITHRUN.CM0020.MAKERINST is '经办机构';

  comment on column WITHRUN.CM0020.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.CM0020.TRANSDATE is '业务发生日期';*/
  @Column(name = "career")
  private String career职业;
  @Column(name = "proftitl")
  private String proftitl职称;
  @Column(name = "duty")
  private String duty职务;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "makerinst")
  private String makerinst经办机构;
  @Column(name = "makerteller")
  private String makerteller经办柜员;
  @Column(name = "transdate")
  private java.sql.Date transdate业务发生日期;


/*  comment on column WITHRUN.CM0020.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.CM0020.CHNL is '渠道';

  comment on column WITHRUN.CM0020.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.CM0020.CREATETIME is '创建时间';

  comment on column WITHRUN.CM0020.UPDATETIME is '最后更新时间戳';

  comment on column WITHRUN.CM0020.FREEUSECHAR1 is '备用字符1';

  comment on column WITHRUN.CM0020.TRANSSEQ is '交易流水号';*/
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

  public String getCustid个人客户号() {
    return custid个人客户号;
  }

  public void setCustid个人客户号(String custid个人客户号) {
    this.custid个人客户号 = custid个人客户号;
  }

  public String getName姓名() {
    return name姓名;
  }

  public void setName姓名(String name姓名) {
    this.name姓名 = name姓名;
  }

  public String getNamefullpinyin姓名全拼() {
    return namefullpinyin姓名全拼;
  }

  public void setNamefullpinyin姓名全拼(String namefullpinyin姓名全拼) {
    this.namefullpinyin姓名全拼 = namefullpinyin姓名全拼;
  }

  public String getNamepinyinfirst名称首字母() {
    return namepinyinfirst名称首字母;
  }

  public void setNamepinyinfirst名称首字母(String namepinyinfirst名称首字母) {
    this.namepinyinfirst名称首字母 = namepinyinfirst名称首字母;
  }

  public Date getBirthdate出生日期() {
    return birthdate出生日期;
  }

  public void setBirthdate出生日期(Date birthdate出生日期) {
    this.birthdate出生日期 = birthdate出生日期;
  }

  public String getSex性别() {
    return sex性别;
  }

  public void setSex性别(String sex性别) {
    this.sex性别 = sex性别;
  }

  public long getAge年龄() {
    return age年龄;
  }

  public void setAge年龄(long age年龄) {
    this.age年龄 = age年龄;
  }

  public String getNation民族() {
    return nation民族;
  }

  public void setNation民族(String nation民族) {
    this.nation民族 = nation民族;
  }

  public String getMarriagesituation婚姻状况() {
    return marriagesituation婚姻状况;
  }

  public void setMarriagesituation婚姻状况(String marriagesituation婚姻状况) {
    this.marriagesituation婚姻状况 = marriagesituation婚姻状况;
  }

  public String getHighestedu最高学历() {
    return highestedu最高学历;
  }

  public void setHighestedu最高学历(String highestedu最高学历) {
    this.highestedu最高学历 = highestedu最高学历;
  }

  public String getHighestdegree最高学位() {
    return highestdegree最高学位;
  }

  public void setHighestdegree最高学位(String highestdegree最高学位) {
    this.highestdegree最高学位 = highestdegree最高学位;
  }

  public String getCareer职业() {
    return career职业;
  }

  public void setCareer职业(String career职业) {
    this.career职业 = career职业;
  }

  public String getProftitl职称() {
    return proftitl职称;
  }

  public void setProftitl职称(String proftitl职称) {
    this.proftitl职称 = proftitl职称;
  }

  public String getDuty职务() {
    return duty职务;
  }

  public void setDuty职务(String duty职务) {
    this.duty职务 = duty职务;
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

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


}
