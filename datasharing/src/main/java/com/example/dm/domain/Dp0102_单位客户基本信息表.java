
package com.example.dm.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;


@Entity
@Table(name = "Dp0102")
public class Dp0102_单位客户基本信息表 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*  comment on column WITHRUN.DP0102.ID is 'id';

  comment on column WITHRUN.DP0102.DWMC is '单位名称';

  comment on column WITHRUN.DP0102.DWZH is '单位账号（外部）';

  comment on column WITHRUN.DP0102.UNITACCNUM is '单位账号';

  comment on column WITHRUN.DP0102.DWDZ is '单位地址';

  comment on column WITHRUN.DP0102.SOCIETYCREDITCODE is '统一社会信用代码';

  comment on column WITHRUN.DP0102.UNITPROPERTY is '单位性质';

  comment on column WITHRUN.DP0102.DWFRDBXM is '单位法人代表姓名';*/

  @Id
  @Column(name = "id")
  private long id;
  @Column(name = "dwmc")
  private String dwmc单位名称;
  @Column(name = "dwzh")
  private String dwzh单位账号_外部;
  @Column(name = "unitaccnum")
  private String unitaccnum单位账号;
  @Column(name = "dwdz")
  private String dwdz单位地址;
  @Column(name = "societycreditcode")
  private String societycreditcode统一社会信用代码;
  @Column(name = "unitproperty")
  private String unitproperty单位性质;
  @Column(name = "dwfrdbxm")
  private String dwfrdbxm单位法人代表姓名;

/*  comment on column WITHRUN.DP0102.DWFRDBZJLX is '单位法人代表证件类型';

  comment on column WITHRUN.DP0102.DWFRDBZJHM is '单位法人代表证件号码';

  comment on column WITHRUN.DP0102.DWLSGX is '单位隶属关系';

  comment on column WITHRUN.DP0102.DWJJLX is '单位经济类型';

  comment on column WITHRUN.DP0102.DWSSHY is '单位所属行业';

  comment on column WITHRUN.DP0102.DWYB is '单位邮编';

  comment on column WITHRUN.DP0102.DWDZXX is '单位电子信箱';*/
  @Column(name = "dwfrdbzjlx")
  private String dwfrdbzjlx单位法人代表证件类型;
  @Column(name = "dwfrdbzjhm")
  private String dwfrdbzjhm单位法人代表证件号码;
  @Column(name = "dwlsgx")
  private String dwlsgx单位隶属关系;
  @Column(name = "dwjjlx")
  private String dwjjlx单位经济类型;
  @Column(name = "dwsshy")
  private String dwsshy单位所属行业;
  @Column(name = "dwyb")
  private String dwyb单位邮编;
  @Column(name = "dwdzxx")
  private String dwdzxx单位电子信箱;








/*  comment on column WITHRUN.DP0102.DWFXR is '单位发薪日';

  comment on column WITHRUN.DP0102.JBRXM is '经办人姓名';

  comment on column WITHRUN.DP0102.JBRGDDHHM is '经办人固定电话号码';

  comment on column WITHRUN.DP0102.JBRSJHM is '经办人手机号码';

  comment on column WITHRUN.DP0102.JBRZJLX is '经办人证件类型';

  comment on column WITHRUN.DP0102.JBRZJHM is '经办人证件号码';*/
  @Column(name = "dwfxr")
  private String dwfxr单位发薪日;
  @Column(name = "jbrxm")
  private String jbrxm经办人姓名;
  @Column(name = "jbrgddhhm")
  private String jbrgddhhm经办人固定电话号码;
  @Column(name = "jbrsjhm")
  private String jbrsjhm经办人手机号码;
  @Column(name = "jbrzjlx")
  private String jbrzjlx经办人证件类型;
  @Column(name = "jbrzjhm")
  private String jbrzjhm经办人证件号码;

/*  comment on column WITHRUN.DP0102.ZZJGDM is '组织机构代码';

  comment on column WITHRUN.DP0102.DWSLRQ is '单位设立日期';

  comment on column WITHRUN.DP0102.DWKHRQ is '单位开户日期';

  comment on column WITHRUN.DP0102.STYHMC is '受托银行名称';

  comment on column WITHRUN.DP0102.STYHDM is '受托银行代码';

  comment on column WITHRUN.DP0102.ZXBH is '中心编号';

  comment on column WITHRUN.DP0102.LAST_UPDATE_TIME is '最后更新时间戳';*/
  @Column(name = "zzjgdm")
  private String zzjgdm组织机构代码;
  @Column(name = "dwslrq")
  private java.sql.Date dwslrq单位设立日期;
  @Column(name = "dwkhrq")
  private java.sql.Date dwkhrq单位开户日期;
  @Column(name = "styhmc")
  private String styhmc受托银行名称;
  @Column(name = "styhdm")
  private String styhdm受托银行代码;
  @Column(name = "zxbh")
  private String zxbh中心编号;
  @Column(name = "last_Update_Time")
  private LocalDateTime lastUpdateTime最后更新时间戳;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDwmc单位名称() {
    return dwmc单位名称;
  }

  public void setDwmc单位名称(String dwmc单位名称) {
    this.dwmc单位名称 = dwmc单位名称;
  }

  public String getDwzh单位账号_外部() {
    return dwzh单位账号_外部;
  }

  public void setDwzh单位账号_外部(String dwzh单位账号_外部) {
    this.dwzh单位账号_外部 = dwzh单位账号_外部;
  }

  public String getUnitaccnum单位账号() {
    return unitaccnum单位账号;
  }

  public void setUnitaccnum单位账号(String unitaccnum单位账号) {
    this.unitaccnum单位账号 = unitaccnum单位账号;
  }

  public String getDwdz单位地址() {
    return dwdz单位地址;
  }

  public void setDwdz单位地址(String dwdz单位地址) {
    this.dwdz单位地址 = dwdz单位地址;
  }

  public String getSocietycreditcode统一社会信用代码() {
    return societycreditcode统一社会信用代码;
  }

  public void setSocietycreditcode统一社会信用代码(String societycreditcode统一社会信用代码) {
    this.societycreditcode统一社会信用代码 = societycreditcode统一社会信用代码;
  }

  public String getUnitproperty单位性质() {
    return unitproperty单位性质;
  }

  public void setUnitproperty单位性质(String unitproperty单位性质) {
    this.unitproperty单位性质 = unitproperty单位性质;
  }

  public String getDwfrdbxm单位法人代表姓名() {
    return dwfrdbxm单位法人代表姓名;
  }

  public void setDwfrdbxm单位法人代表姓名(String dwfrdbxm单位法人代表姓名) {
    this.dwfrdbxm单位法人代表姓名 = dwfrdbxm单位法人代表姓名;
  }


  public String getDwfrdbzjlx单位法人代表证件类型() {
    return dwfrdbzjlx单位法人代表证件类型;
  }

  public void setDwfrdbzjlx单位法人代表证件类型(String dwfrdbzjlx单位法人代表证件类型) {
    this.dwfrdbzjlx单位法人代表证件类型 = dwfrdbzjlx单位法人代表证件类型;
  }

  public String getDwfrdbzjhm单位法人代表证件号码() {
    return dwfrdbzjhm单位法人代表证件号码;
  }

  public void setDwfrdbzjhm单位法人代表证件号码(String dwfrdbzjhm单位法人代表证件号码) {
    this.dwfrdbzjhm单位法人代表证件号码 = dwfrdbzjhm单位法人代表证件号码;
  }

  public String getDwlsgx单位隶属关系() {
    return dwlsgx单位隶属关系;
  }

  public void setDwlsgx单位隶属关系(String dwlsgx单位隶属关系) {
    this.dwlsgx单位隶属关系 = dwlsgx单位隶属关系;
  }

  public String getDwjjlx单位经济类型() {
    return dwjjlx单位经济类型;
  }

  public void setDwjjlx单位经济类型(String dwjjlx单位经济类型) {
    this.dwjjlx单位经济类型 = dwjjlx单位经济类型;
  }

  public String getDwsshy单位所属行业() {
    return dwsshy单位所属行业;
  }

  public void setDwsshy单位所属行业(String dwsshy单位所属行业) {
    this.dwsshy单位所属行业 = dwsshy单位所属行业;
  }

  public String getDwyb单位邮编() {
    return dwyb单位邮编;
  }

  public void setDwyb单位邮编(String dwyb单位邮编) {
    this.dwyb单位邮编 = dwyb单位邮编;
  }

  public String getDwdzxx单位电子信箱() {
    return dwdzxx单位电子信箱;
  }

  public void setDwdzxx单位电子信箱(String dwdzxx单位电子信箱) {
    this.dwdzxx单位电子信箱 = dwdzxx单位电子信箱;
  }

  public String getDwfxr单位发薪日() {
    return dwfxr单位发薪日;
  }

  public void setDwfxr单位发薪日(String dwfxr单位发薪日) {
    this.dwfxr单位发薪日 = dwfxr单位发薪日;
  }

  public String getJbrxm经办人姓名() {
    return jbrxm经办人姓名;
  }

  public void setJbrxm经办人姓名(String jbrxm经办人姓名) {
    this.jbrxm经办人姓名 = jbrxm经办人姓名;
  }

  public String getJbrgddhhm经办人固定电话号码() {
    return jbrgddhhm经办人固定电话号码;
  }

  public void setJbrgddhhm经办人固定电话号码(String jbrgddhhm经办人固定电话号码) {
    this.jbrgddhhm经办人固定电话号码 = jbrgddhhm经办人固定电话号码;
  }

  public String getJbrsjhm经办人手机号码() {
    return jbrsjhm经办人手机号码;
  }

  public void setJbrsjhm经办人手机号码(String jbrsjhm经办人手机号码) {
    this.jbrsjhm经办人手机号码 = jbrsjhm经办人手机号码;
  }

  public String getJbrzjlx经办人证件类型() {
    return jbrzjlx经办人证件类型;
  }

  public void setJbrzjlx经办人证件类型(String jbrzjlx经办人证件类型) {
    this.jbrzjlx经办人证件类型 = jbrzjlx经办人证件类型;
  }

  public String getJbrzjhm经办人证件号码() {
    return jbrzjhm经办人证件号码;
  }

  public void setJbrzjhm经办人证件号码(String jbrzjhm经办人证件号码) {
    this.jbrzjhm经办人证件号码 = jbrzjhm经办人证件号码;
  }

  public String getZzjgdm组织机构代码() {
    return zzjgdm组织机构代码;
  }

  public void setZzjgdm组织机构代码(String zzjgdm组织机构代码) {
    this.zzjgdm组织机构代码 = zzjgdm组织机构代码;
  }

  public Date getDwslrq单位设立日期() {
    return dwslrq单位设立日期;
  }

  public void setDwslrq单位设立日期(Date dwslrq单位设立日期) {
    this.dwslrq单位设立日期 = dwslrq单位设立日期;
  }

  public Date getDwkhrq单位开户日期() {
    return dwkhrq单位开户日期;
  }

  public void setDwkhrq单位开户日期(Date dwkhrq单位开户日期) {
    this.dwkhrq单位开户日期 = dwkhrq单位开户日期;
  }

  public String getStyhmc受托银行名称() {
    return styhmc受托银行名称;
  }

  public void setStyhmc受托银行名称(String styhmc受托银行名称) {
    this.styhmc受托银行名称 = styhmc受托银行名称;
  }

  public String getStyhdm受托银行代码() {
    return styhdm受托银行代码;
  }

  public void setStyhdm受托银行代码(String styhdm受托银行代码) {
    this.styhdm受托银行代码 = styhdm受托银行代码;
  }

  public String getZxbh中心编号() {
    return zxbh中心编号;
  }

  public void setZxbh中心编号(String zxbh中心编号) {
    this.zxbh中心编号 = zxbh中心编号;
  }

  public LocalDateTime getLastUpdateTime最后更新时间戳() {
    return lastUpdateTime最后更新时间戳;
  }

  public void setLastUpdateTime最后更新时间戳(LocalDateTime lastUpdateTime最后更新时间戳) {
    this.lastUpdateTime最后更新时间戳 = lastUpdateTime最后更新时间戳;
  }
}
