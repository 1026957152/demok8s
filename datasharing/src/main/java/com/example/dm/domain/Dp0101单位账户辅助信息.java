package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Dp0101")
public class Dp0101单位账户辅助信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


/*  comment on column WITHRUN.DP0101.ID is '序号';

  comment on column WITHRUN.DP0101.UNITACCNUM is '单位账号';

  comment on column WITHRUN.DP0101.DPINTPARAM is '汇缴额取整参数';

  comment on column WITHRUN.DP0101.DPINTTYPE is '汇缴额取整类型';

  comment on column WITHRUN.DP0101.DPINTWAY is '汇缴额取整方式';

  comment on column WITHRUN.DP0101.FUNDSOURCEFLAG is '资金来源标志';

  comment on column WITHRUN.DP0101.POSTPDPFLAG is '缓缴标志';*/

  @Id
  @Column(name = "id")
  private long id序号;
  @Column(name = "unitaccnum")
  private String unitaccnum单位账号;
  @Column(name = "dpintparam")
  private String dpintparam汇缴额取整参数;
  @Column(name = "dpinttype")
  private String dpinttype汇缴额取整类型;
  @Column(name = "dpintway")
  private String dpintway汇缴额取整方式;
  @Column(name = "fundsourceflag")
  private String fundsourceflag资金来源标志;
  @Column(name = "postpdpflag")
  private String postpdpflag缓缴标志;


  @Column(name = "unitlevelflag")
  private String unitlevelflag单位级别标志;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
  @Column(name = "unitsocialsecurityaccnum")
  private String unitsocialsecurityaccnum单位社保账号;
  @Column(name = "makerdept")
  private String makerdept经办部门;
  @Column(name = "freeusechar1")
  private String freeusechar1备用字符1;

/*    comment on table WITHRUN.DP0101 is '单位账户辅助信息';



    comment on column WITHRUN.DP0101.UNITLEVELFLAG is '单位级别标志';

    comment on column WITHRUN.DP0101.CREATETIME is '创建时间';

    comment on column WITHRUN.DP0101.UPDATETIME is '最后更新时间戳';

    comment on column WITHRUN.DP0101.UNITSOCIALSECURITYACCNUM is '单位社保账号';

    comment on column WITHRUN.DP0101.MAKERDEPT is '经办部门';

    comment on column WITHRUN.DP0101.FREEUSECHAR1 is '备用字符1';*/

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

  public String getDpintparam汇缴额取整参数() {
    return dpintparam汇缴额取整参数;
  }

  public void setDpintparam汇缴额取整参数(String dpintparam汇缴额取整参数) {
    this.dpintparam汇缴额取整参数 = dpintparam汇缴额取整参数;
  }

  public String getDpinttype汇缴额取整类型() {
    return dpinttype汇缴额取整类型;
  }

  public void setDpinttype汇缴额取整类型(String dpinttype汇缴额取整类型) {
    this.dpinttype汇缴额取整类型 = dpinttype汇缴额取整类型;
  }

  public String getDpintway汇缴额取整方式() {
    return dpintway汇缴额取整方式;
  }

  public void setDpintway汇缴额取整方式(String dpintway汇缴额取整方式) {
    this.dpintway汇缴额取整方式 = dpintway汇缴额取整方式;
  }

  public String getFundsourceflag资金来源标志() {
    return fundsourceflag资金来源标志;
  }

  public void setFundsourceflag资金来源标志(String fundsourceflag资金来源标志) {
    this.fundsourceflag资金来源标志 = fundsourceflag资金来源标志;
  }

  public String getPostpdpflag缓缴标志() {
    return postpdpflag缓缴标志;
  }

  public void setPostpdpflag缓缴标志(String postpdpflag缓缴标志) {
    this.postpdpflag缓缴标志 = postpdpflag缓缴标志;
  }

  public String getUnitlevelflag单位级别标志() {
    return unitlevelflag单位级别标志;
  }

  public void setUnitlevelflag单位级别标志(String unitlevelflag单位级别标志) {
    this.unitlevelflag单位级别标志 = unitlevelflag单位级别标志;
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

  public String getUnitsocialsecurityaccnum单位社保账号() {
    return unitsocialsecurityaccnum单位社保账号;
  }

  public void setUnitsocialsecurityaccnum单位社保账号(String unitsocialsecurityaccnum单位社保账号) {
    this.unitsocialsecurityaccnum单位社保账号 = unitsocialsecurityaccnum单位社保账号;
  }

  public String getMakerdept经办部门() {
    return makerdept经办部门;
  }

  public void setMakerdept经办部门(String makerdept经办部门) {
    this.makerdept经办部门 = makerdept经办部门;
  }

  public String getFreeusechar1备用字符1() {
    return freeusechar1备用字符1;
  }

  public void setFreeusechar1备用字符1(String freeusechar1备用字符1) {
    this.freeusechar1备用字符1 = freeusechar1备用字符1;
  }
}
