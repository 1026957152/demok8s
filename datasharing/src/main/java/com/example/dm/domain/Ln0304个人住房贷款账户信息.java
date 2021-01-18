package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

import java.time.LocalDateTime;

@Entity
@Table(name = "Ln0304")
public class Ln0304个人住房贷款账户信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  // comment on table WITHRUN.LN0304 is '个人住房贷款账户信息';









/*  comment on column WITHRUN.LN0304.CONTRACTCODE is '合同代码';

  comment on column WITHRUN.LN0304.DKZH is '贷款账号';

  comment on column WITHRUN.LN0304.JKHTBH is '借款合同编号';

  comment on column WITHRUN.LN0304.DKFXDJ is '贷款风险等级';

  comment on column WITHRUN.LN0304.DKFFE is '贷款发放额';

  comment on column WITHRUN.LN0304.DKFFRQ is '贷款发放日期';

  comment on column WITHRUN.LN0304.DKYE is '贷款余额';

  comment on column WITHRUN.LN0304.DKLL is '贷款利率';*/
  @Id
  @Column(name = "contractcode")
  private String contractcode合同代码;
  @Column(name = "dkzh")
  private String dkzh贷款账号;
  @Column(name = "jkhtbh")
  private String jkhtbh借款合同编号;
  @Column(name = "dkfxdj")
  private String dkfxdj贷款风险等级;
  @Column(name = "dkffe")
  private double dkffe贷款发放额;
  @Column(name = "dkffrq")
  private java.sql.Date dkffrq贷款发放日期;
  @Column(name = "dkye")
  private double dkye贷款余额;
  @Column(name = "dkll")
  private double dkll贷款利率;

/*  comment on column WITHRUN.LN0304.LLFDBL is '利率浮动比例';

  comment on column WITHRUN.LN0304.DKQS is '贷款期数';

  comment on column WITHRUN.LN0304.DQJHHKJE is '当期计划还款金额';

  comment on column WITHRUN.LN0304.DQJHGHBJ is '当期计划归还本金';

  comment on column WITHRUN.LN0304.DQJHGHLX is '当期计划归还利息';

  comment on column WITHRUN.LN0304.DQYHJE is '当前应还金额';

  comment on column WITHRUN.LN0304.DQYHBJ is '当前应还本金';

  comment on column WITHRUN.LN0304.DQYHLX is '当前应还利息';

  comment on column WITHRUN.LN0304.DQYHFX is '当前应还罚息';*/
  @Column(name = "llfdbl")
  private double llfdbl利率浮动比例;
  @Column(name = "dkqs")
  private long dkqs贷款期数;
  @Column(name = "dqjhhkje")
  private double dqjhhkje当期计划还款金额;
  @Column(name = "dqjhghbj")
  private double dqjhghbj当期计划归还本金;
  @Column(name = "dqjhghlx")
  private double dqjhghlx当期计划归还利息;
  @Column(name = "dqyhje")
  private double dqyhje当前应还金额;
  @Column(name = "dqyhbj")
  private double dqyhbj当前应还本金;
  @Column(name = "dqyhlx")
  private double dqyhlx当前应还利息;
  @Column(name = "dqyhfx")
  private double dqyhfx当前应还罚息;

/*  comment on column WITHRUN.LN0304.DKJQRQ is '贷款结清日期';

  comment on column WITHRUN.LN0304.HSBJZE is '回收本金总额';

  comment on column WITHRUN.LN0304.HSLXZE is '回收利息总额';

  comment on column WITHRUN.LN0304.FXZE is '罚息总额';

  comment on column WITHRUN.LN0304.TQGHBJZE is '提前归还本金总额';

  comment on column WITHRUN.LN0304.YQBJZE is '逾期本金总额';

  comment on column WITHRUN.LN0304.YQLXZE is '逾期利息总额';

  comment on column WITHRUN.LN0304.LJYQQS is '累计逾期期数';*/
  @Column(name = "dkjqrq")
  private java.sql.Date dkjqrq贷款结清日期;
  @Column(name = "hsbjze")
  private double hsbjze回收本金总额;
  @Column(name = "hslxze")
  private double hslxze回收利息总额;
  @Column(name = "fxze")
  private double fxze罚息总额;
  @Column(name = "tqghbjze")
  private double tqghbjze提前归还本金总额;
  @Column(name = "yqbjze")
  private double yqbjze逾期本金总额;
  @Column(name = "yqlxze")
  private double yqlxze逾期利息总额;
  @Column(name = "ljyqqs")
  private long ljyqqs累计逾期期数;

/*  comment on column WITHRUN.LN0304.DKZT is '贷款状态';

  comment on column WITHRUN.LN0304.ZXBH is '中心编号';

  comment on column WITHRUN.LN0304.LAST_UPDATE_TIME is '最后更新时间戳';

  comment on column WITHRUN.LN0304.SCHKFSRQ is '首次还款发生日期';

  comment on column WITHRUN.LN0304.CITYCODE is '城市代码';

  comment on column WITHRUN.LN0304.CREATETIME is '创建时间';*/
  @Column(name = "dkzt")
  private String dkzt贷款状态;
  @Column(name = "zxbh")
  private String zxbh中心编号;
  @Column(name = "last_Update_Time")
  private LocalDateTime lastUpdateTime最后更新时间戳;
  @Column(name = "schkfsrq")
  private Date schkfsrq首次还款发生日期;
  @Column(name = "citycode")
  private String citycode城市代码;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;

  public String getContractcode合同代码() {
    return contractcode合同代码;
  }

  public void setContractcode合同代码(String contractcode合同代码) {
    this.contractcode合同代码 = contractcode合同代码;
  }

  public String getDkzh贷款账号() {
    return dkzh贷款账号;
  }

  public void setDkzh贷款账号(String dkzh贷款账号) {
    this.dkzh贷款账号 = dkzh贷款账号;
  }

  public String getJkhtbh借款合同编号() {
    return jkhtbh借款合同编号;
  }

  public void setJkhtbh借款合同编号(String jkhtbh借款合同编号) {
    this.jkhtbh借款合同编号 = jkhtbh借款合同编号;
  }

  public String getDkfxdj贷款风险等级() {
    return dkfxdj贷款风险等级;
  }

  public void setDkfxdj贷款风险等级(String dkfxdj贷款风险等级) {
    this.dkfxdj贷款风险等级 = dkfxdj贷款风险等级;
  }

  public double getDkffe贷款发放额() {
    return dkffe贷款发放额;
  }

  public void setDkffe贷款发放额(double dkffe贷款发放额) {
    this.dkffe贷款发放额 = dkffe贷款发放额;
  }

  public Date getDkffrq贷款发放日期() {
    return dkffrq贷款发放日期;
  }

  public void setDkffrq贷款发放日期(Date dkffrq贷款发放日期) {
    this.dkffrq贷款发放日期 = dkffrq贷款发放日期;
  }

  public double getDkye贷款余额() {
    return dkye贷款余额;
  }

  public void setDkye贷款余额(double dkye贷款余额) {
    this.dkye贷款余额 = dkye贷款余额;
  }

  public double getDkll贷款利率() {
    return dkll贷款利率;
  }

  public void setDkll贷款利率(double dkll贷款利率) {
    this.dkll贷款利率 = dkll贷款利率;
  }

  public double getLlfdbl利率浮动比例() {
    return llfdbl利率浮动比例;
  }

  public void setLlfdbl利率浮动比例(double llfdbl利率浮动比例) {
    this.llfdbl利率浮动比例 = llfdbl利率浮动比例;
  }

  public long getDkqs贷款期数() {
    return dkqs贷款期数;
  }

  public void setDkqs贷款期数(long dkqs贷款期数) {
    this.dkqs贷款期数 = dkqs贷款期数;
  }

  public double getDqjhhkje当期计划还款金额() {
    return dqjhhkje当期计划还款金额;
  }

  public void setDqjhhkje当期计划还款金额(double dqjhhkje当期计划还款金额) {
    this.dqjhhkje当期计划还款金额 = dqjhhkje当期计划还款金额;
  }

  public double getDqjhghbj当期计划归还本金() {
    return dqjhghbj当期计划归还本金;
  }

  public void setDqjhghbj当期计划归还本金(double dqjhghbj当期计划归还本金) {
    this.dqjhghbj当期计划归还本金 = dqjhghbj当期计划归还本金;
  }

  public double getDqjhghlx当期计划归还利息() {
    return dqjhghlx当期计划归还利息;
  }

  public void setDqjhghlx当期计划归还利息(double dqjhghlx当期计划归还利息) {
    this.dqjhghlx当期计划归还利息 = dqjhghlx当期计划归还利息;
  }

  public double getDqyhje当前应还金额() {
    return dqyhje当前应还金额;
  }

  public void setDqyhje当前应还金额(double dqyhje当前应还金额) {
    this.dqyhje当前应还金额 = dqyhje当前应还金额;
  }

  public double getDqyhbj当前应还本金() {
    return dqyhbj当前应还本金;
  }

  public void setDqyhbj当前应还本金(double dqyhbj当前应还本金) {
    this.dqyhbj当前应还本金 = dqyhbj当前应还本金;
  }

  public double getDqyhlx当前应还利息() {
    return dqyhlx当前应还利息;
  }

  public void setDqyhlx当前应还利息(double dqyhlx当前应还利息) {
    this.dqyhlx当前应还利息 = dqyhlx当前应还利息;
  }

  public double getDqyhfx当前应还罚息() {
    return dqyhfx当前应还罚息;
  }

  public void setDqyhfx当前应还罚息(double dqyhfx当前应还罚息) {
    this.dqyhfx当前应还罚息 = dqyhfx当前应还罚息;
  }

  public Date getDkjqrq贷款结清日期() {
    return dkjqrq贷款结清日期;
  }

  public void setDkjqrq贷款结清日期(Date dkjqrq贷款结清日期) {
    this.dkjqrq贷款结清日期 = dkjqrq贷款结清日期;
  }

  public double getHsbjze回收本金总额() {
    return hsbjze回收本金总额;
  }

  public void setHsbjze回收本金总额(double hsbjze回收本金总额) {
    this.hsbjze回收本金总额 = hsbjze回收本金总额;
  }

  public double getHslxze回收利息总额() {
    return hslxze回收利息总额;
  }

  public void setHslxze回收利息总额(double hslxze回收利息总额) {
    this.hslxze回收利息总额 = hslxze回收利息总额;
  }

  public double getFxze罚息总额() {
    return fxze罚息总额;
  }

  public void setFxze罚息总额(double fxze罚息总额) {
    this.fxze罚息总额 = fxze罚息总额;
  }

  public double getTqghbjze提前归还本金总额() {
    return tqghbjze提前归还本金总额;
  }

  public void setTqghbjze提前归还本金总额(double tqghbjze提前归还本金总额) {
    this.tqghbjze提前归还本金总额 = tqghbjze提前归还本金总额;
  }

  public double getYqbjze逾期本金总额() {
    return yqbjze逾期本金总额;
  }

  public void setYqbjze逾期本金总额(double yqbjze逾期本金总额) {
    this.yqbjze逾期本金总额 = yqbjze逾期本金总额;
  }

  public double getYqlxze逾期利息总额() {
    return yqlxze逾期利息总额;
  }

  public void setYqlxze逾期利息总额(double yqlxze逾期利息总额) {
    this.yqlxze逾期利息总额 = yqlxze逾期利息总额;
  }

  public long getLjyqqs累计逾期期数() {
    return ljyqqs累计逾期期数;
  }

  public void setLjyqqs累计逾期期数(long ljyqqs累计逾期期数) {
    this.ljyqqs累计逾期期数 = ljyqqs累计逾期期数;
  }

  public String getDkzt贷款状态() {
    return dkzt贷款状态;
  }

  public void setDkzt贷款状态(String dkzt贷款状态) {
    this.dkzt贷款状态 = dkzt贷款状态;
  }

  public String getZxbh中心编号() {
    return zxbh中心编号;
  }

  public void setZxbh中心编号(String zxbh中心编号) {
    this.zxbh中心编号 = zxbh中心编号;
  }


  public String getCitycode城市代码() {
    return citycode城市代码;
  }

  public void setCitycode城市代码(String citycode城市代码) {
    this.citycode城市代码 = citycode城市代码;
  }

  public LocalDateTime getLastUpdateTime最后更新时间戳() {
    return lastUpdateTime最后更新时间戳;
  }

  public void setLastUpdateTime最后更新时间戳(LocalDateTime lastUpdateTime最后更新时间戳) {
    this.lastUpdateTime最后更新时间戳 = lastUpdateTime最后更新时间戳;
  }

  public Date getSchkfsrq首次还款发生日期() {
    return schkfsrq首次还款发生日期;
  }

  public void setSchkfsrq首次还款发生日期(Date schkfsrq首次还款发生日期) {
    this.schkfsrq首次还款发生日期 = schkfsrq首次还款发生日期;
  }

  public LocalDateTime getCreatetime创建时间() {
    return createtime创建时间;
  }

  public void setCreatetime创建时间(LocalDateTime createtime创建时间) {
    this.createtime创建时间 = createtime创建时间;
  }
}
