package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Dp1103")
public class Dp1103单位缴存比例信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  //comment on table WITHRUN.DP1103 is '单位缴存比例信息';

/*    comment on column WITHRUN.DP1103.ID is '序号';

    comment on column WITHRUN.DP1103.UNITACCNUM is '单位账号';

    comment on column WITHRUN.DP1103.DPRATIONUM is '缴存比例编号';

    comment on column WITHRUN.DP1103.DPRATIODESC is '缴存比例描述';

    comment on column WITHRUN.DP1103.ISDEFAULTRATIO is '是否默认比例';

    comment on column WITHRUN.DP1103.RATIOSTATUS is '比例状态';

    comment on column WITHRUN.DP1103.RATIOREDUCESTOPYM is '比例调低终止年月';

    comment on column WITHRUN.DP1103.UNITDPRATIO is '单位缴存比例';

    comment on column WITHRUN.DP1103.PERSONDPRATIO is '个人缴存比例';

    comment on column WITHRUN.DP1103.CREATETIME is '创建时间';

    comment on column WITHRUN.DP1103.UPDATETIME is '最后更新时间戳';

    comment on column WITHRUN.DP1103.FREEUSECHAR1 is '备用字符1';*/


  @Id
  @Column(name = "id")
  private long id序号;
    @Column(name = "unitaccnum")
  private String unitaccnum单位账号;
    @Column(name = "dprationum")
  private String dprationum缴存比例编号;
    @Column(name = "dpratiodesc")
  private String dpratiodesc缴存比例描述;
    @Column(name = "isdefaultratio")
  private String isdefaultratio是否默认比例;
    @Column(name = "ratiostatus")
  private String ratiostatus比例状态;
    @Column(name = "ratioreducestopym")
  private String ratioreducestopym比例调低终止年月;
    @Column(name = "unitdpratio")
  private double unitdpratio单位缴存比例;
    @Column(name = "persondpratio")
  private double persondpratio个人缴存比例;
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

  public String getUnitaccnum单位账号() {
    return unitaccnum单位账号;
  }

  public void setUnitaccnum单位账号(String unitaccnum单位账号) {
    this.unitaccnum单位账号 = unitaccnum单位账号;
  }

  public String getDprationum缴存比例编号() {
    return dprationum缴存比例编号;
  }

  public void setDprationum缴存比例编号(String dprationum缴存比例编号) {
    this.dprationum缴存比例编号 = dprationum缴存比例编号;
  }

  public String getDpratiodesc缴存比例描述() {
    return dpratiodesc缴存比例描述;
  }

  public void setDpratiodesc缴存比例描述(String dpratiodesc缴存比例描述) {
    this.dpratiodesc缴存比例描述 = dpratiodesc缴存比例描述;
  }

  public String getIsdefaultratio是否默认比例() {
    return isdefaultratio是否默认比例;
  }

  public void setIsdefaultratio是否默认比例(String isdefaultratio是否默认比例) {
    this.isdefaultratio是否默认比例 = isdefaultratio是否默认比例;
  }

  public String getRatiostatus比例状态() {
    return ratiostatus比例状态;
  }

  public void setRatiostatus比例状态(String ratiostatus比例状态) {
    this.ratiostatus比例状态 = ratiostatus比例状态;
  }

  public String getRatioreducestopym比例调低终止年月() {
    return ratioreducestopym比例调低终止年月;
  }

  public void setRatioreducestopym比例调低终止年月(String ratioreducestopym比例调低终止年月) {
    this.ratioreducestopym比例调低终止年月 = ratioreducestopym比例调低终止年月;
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
