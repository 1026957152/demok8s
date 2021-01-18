package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

import java.time.LocalDateTime;

@Entity
@Table(name = "Ln0301")
public class Ln0301_个人住房贷款借款合同信息 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  //comment on table WITHRUN.LN0301 is '个人住房贷款借款合同信息';



/*  comment on table WITHRUN.LN0301 is '个人住房贷款借款合同信息';

  comment on column WITHRUN.LN0301.CONTRACTCODE is '合同代码';

  comment on column WITHRUN.LN0301.JKHTBH is '借款合同编号';

  comment on column WITHRUN.LN0301.GFHTBH is '购房合同编号';

  comment on column WITHRUN.LN0301.SWTYHMC is '受委托银行名称';

  comment on column WITHRUN.LN0301.SWTYHDM is '受委托银行代码';*/

  @Id
  @Column(name = "contractcode")
  private String contractcode合同代码;
  @Column(name = "jkhtbh")
  private String jkhtbh_借款合同编号;
  @Column(name = "gfhtbh")
  private String gfhtbh_购房合同编号;
  @Column(name = "swtyhmc")
  private String swtyhmc_受委托银行名称;
  @Column(name = "swtyhdm")
  private String swtyhdm_受委托银行代码;
  @Column(name = "dkdblx")

/*  comment on column WITHRUN.LN0301.DKDBLX is '贷款担保类型';

  comment on column WITHRUN.LN0301.YDFKRQ is '约定放款日期';

  comment on column WITHRUN.LN0301.YDDQRQ is '约定到期日期';

  comment on column WITHRUN.LN0301.DKHKFS is '贷款还款方式';

  comment on column WITHRUN.LN0301.HKZH is '还款账号';

  comment on column WITHRUN.LN0301.ZHKHYHMC is '账户开户银行名称';

  comment on column WITHRUN.LN0301.ZHKHYHDM is '账户开户银行代码';*/
  private String dkdblx_贷款担保类型;
  @Column(name = "ydfkrq")
  private java.sql.Date ydfkrq_约定放款日期;
  @Column(name = "yddqrq")
  private java.sql.Date yddqrq约定到期日期;
  @Column(name = "dkhkfs")
  private String dkhkfs贷款还款方式;
  @Column(name = "hkzh")
  private String hkzh还款账;
  @Column(name = "zhkhyhmc")
  private String zhkhyhmc账户开户银行名称;
  @Column(name = "zhkhyhdm")
  private String zhkhyhdm账户开户银行代码;

/*  comment on column WITHRUN.LN0301.HTDKJE is '合同贷款金额';

  comment on column WITHRUN.LN0301.DKLX is '贷款类型';

  comment on column WITHRUN.LN0301.DKQS is '贷款期数';

  comment on column WITHRUN.LN0301.FWZL is '房屋坐落';

  comment on column WITHRUN.LN0301.FWJZMJ is '房屋建筑面积';

  comment on column WITHRUN.LN0301.FWTNMJ is '房屋套内面积';

  comment on column WITHRUN.LN0301.FWXZ is '房屋性质';*/
  @Column(name = "htdkje")
  private double htdkje合同贷款金额;
  @Column(name = "dklx")
  private String dklx贷款类型;
  @Column(name = "dkqs")
  private long dkqs贷款期数;
  @Column(name = "fwzl")
  private String fwzl房屋坐落;
  @Column(name = "fwjzmj")
  private double fwjzmj房屋建筑面积;
  @Column(name = "fwtnmj")
  private double fwtnmj房屋套内面积;
  @Column(name = "fwxz")
  private String fwxz房屋性质;


/*  comment on column WITHRUN.LN0301.FWZJ is '房屋总价';

  comment on column WITHRUN.LN0301.JKHTLL is '借款合同利率';

  comment on column WITHRUN.LN0301.LLFDBL is '利率浮动比例';

  comment on column WITHRUN.LN0301.GFSFK is '购房首付款';

  comment on column WITHRUN.LN0301.JKRGJJZH is '借款人公积金账号';

  comment on column WITHRUN.LN0301.JKRXM is '借款人姓名';

  comment on column WITHRUN.LN0301.JKRZJLX is '借款人证件类型';

  comment on column WITHRUN.LN0301.JKRZJH is '借款人证件号';

  comment on column WITHRUN.LN0301.SFRMC is '售房人名称';*/
  @Column(name = "fwzj")
  private double fwzj房屋总价;
  @Column(name = "llfdbl")
  private double jkhtll借款合同利率;
  @Column(name = "transseq")
  private double llfdbl利率浮动比例;
  @Column(name = "gfsfk")
  private double gfsfk购房首付款;
  @Column(name = "jkrgjjzh")
  private String jkrgjjzh借款人公积金账号;
  @Column(name = "jkrxm")
  private String jkrxm借款人姓名;
  @Column(name = "jkrzjlx")
  private String jkrzjlx借款人证件类型;
  @Column(name = "jkrzjh")
  private String jkrzjh借款人证件号;
  @Column(name = "sfrmc")
  private String sfrmc售房人名称;





/*  comment on column WITHRUN.LN0301.SFRZHHM is '售房人账户号码';

  comment on column WITHRUN.LN0301.SFRKHYHDM is '售房人开户银行代码';

  comment on column WITHRUN.LN0301.SFRKHYHMC is '售房人开户银行名称';

  comment on column WITHRUN.LN0301.JKHTQDRQ is '借款合同签订日期';

  comment on column WITHRUN.LN0301.YDHKR is '约定还款日';

  comment on column WITHRUN.LN0301.DKZH is '贷款账号';

  comment on column WITHRUN.LN0301.ZXBH is '中心编号';*/
  @Column(name = "sfrzhhm")
  private String sfrzhhm售房人账户号码;
  @Column(name = "sfrkhyhdm")
  private String sfrkhyhdm售房人开户银行代码;
  @Column(name = "sfrkhyhmc")
  private String sfrkhyhmc售房人开户银行名称;
  @Column(name = "jkhtqdrq")
  private java.sql.Date jkhtqdrq借款合同签订日期;
  @Column(name = "ydhkr")
  private String ydhkr约定还款日;
  @Column(name = "dkzh")
  private String dkzh贷款账号;
  @Column(name = "zxbh")
  private String zxbh中心编号;

/*  comment on column WITHRUN.LN0301.LAST_UPDATE_TIME is '最后更新时间戳';

  comment on column WITHRUN.LN0301.SFSC is '是否首次贷款';

  comment on column WITHRUN.LN0301.SFST is '是否为首套住房贷款';

  comment on column WITHRUN.LN0301.SFSB is '是否为首笔住房贷款';

  comment on column WITHRUN.LN0301.FWZSLX is '房屋证书类型';

  comment on column WITHRUN.LN0301.FWZSHM is '房屋证书号码';

  comment on column WITHRUN.LN0301.GFLX is '购房类型';*/
  @Column(name = "last_Update_Time")
  private LocalDateTime lastUpdateTime最后更新时间戳;
  @Column(name = "sfsc")
  private String sfsc是否首次贷款;
  @Column(name = "sfst")
  private String sfst是否为首套住房贷款;
  @Column(name = "sfsb")
  private String sfsb是否为首笔住房贷款;
  @Column(name = "fwzslx")
  private String fwzslx房屋证书类型;
  @Column(name = "fwzshm")
  private String fwzshm房屋证书号码;
  @Column(name = "gflx")
  private String gflx购房类型;


/*  comment on column WITHRUN.LN0301.DKD is '贷款地';

  comment on column WITHRUN.LN0301.CITYCODE is '城市代码';

  comment on column WITHRUN.LN0301.CREATETIME is '创建时间';*/
  @Column(name = "dkd")
  private String dkd贷款地;
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

  public String getJkhtbh_借款合同编号() {
    return jkhtbh_借款合同编号;
  }

  public void setJkhtbh_借款合同编号(String jkhtbh_借款合同编号) {
    this.jkhtbh_借款合同编号 = jkhtbh_借款合同编号;
  }

  public String getGfhtbh_购房合同编号() {
    return gfhtbh_购房合同编号;
  }

  public void setGfhtbh_购房合同编号(String gfhtbh_购房合同编号) {
    this.gfhtbh_购房合同编号 = gfhtbh_购房合同编号;
  }

  public String getSwtyhmc_受委托银行名称() {
    return swtyhmc_受委托银行名称;
  }

  public void setSwtyhmc_受委托银行名称(String swtyhmc_受委托银行名称) {
    this.swtyhmc_受委托银行名称 = swtyhmc_受委托银行名称;
  }

  public String getSwtyhdm_受委托银行代码() {
    return swtyhdm_受委托银行代码;
  }

  public void setSwtyhdm_受委托银行代码(String swtyhdm_受委托银行代码) {
    this.swtyhdm_受委托银行代码 = swtyhdm_受委托银行代码;
  }

  public String getDkdblx_贷款担保类型() {
    return dkdblx_贷款担保类型;
  }

  public void setDkdblx_贷款担保类型(String dkdblx_贷款担保类型) {
    this.dkdblx_贷款担保类型 = dkdblx_贷款担保类型;
  }

  public Date getYdfkrq_约定放款日期() {
    return ydfkrq_约定放款日期;
  }

  public void setYdfkrq_约定放款日期(Date ydfkrq_约定放款日期) {
    this.ydfkrq_约定放款日期 = ydfkrq_约定放款日期;
  }

  public Date getYddqrq约定到期日期() {
    return yddqrq约定到期日期;
  }

  public void setYddqrq约定到期日期(Date yddqrq约定到期日期) {
    this.yddqrq约定到期日期 = yddqrq约定到期日期;
  }

  public String getDkhkfs贷款还款方式() {
    return dkhkfs贷款还款方式;
  }

  public void setDkhkfs贷款还款方式(String dkhkfs贷款还款方式) {
    this.dkhkfs贷款还款方式 = dkhkfs贷款还款方式;
  }

  public String getHkzh还款账() {
    return hkzh还款账;
  }

  public void setHkzh还款账(String hkzh还款账) {
    this.hkzh还款账 = hkzh还款账;
  }

  public String getZhkhyhmc账户开户银行名称() {
    return zhkhyhmc账户开户银行名称;
  }

  public void setZhkhyhmc账户开户银行名称(String zhkhyhmc账户开户银行名称) {
    this.zhkhyhmc账户开户银行名称 = zhkhyhmc账户开户银行名称;
  }

  public String getZhkhyhdm账户开户银行代码() {
    return zhkhyhdm账户开户银行代码;
  }

  public void setZhkhyhdm账户开户银行代码(String zhkhyhdm账户开户银行代码) {
    this.zhkhyhdm账户开户银行代码 = zhkhyhdm账户开户银行代码;
  }

  public double getHtdkje合同贷款金额() {
    return htdkje合同贷款金额;
  }

  public void setHtdkje合同贷款金额(double htdkje合同贷款金额) {
    this.htdkje合同贷款金额 = htdkje合同贷款金额;
  }

  public String getDklx贷款类型() {
    return dklx贷款类型;
  }

  public void setDklx贷款类型(String dklx贷款类型) {
    this.dklx贷款类型 = dklx贷款类型;
  }

  public long getDkqs贷款期数() {
    return dkqs贷款期数;
  }

  public void setDkqs贷款期数(long dkqs贷款期数) {
    this.dkqs贷款期数 = dkqs贷款期数;
  }

  public String getFwzl房屋坐落() {
    return fwzl房屋坐落;
  }

  public void setFwzl房屋坐落(String fwzl房屋坐落) {
    this.fwzl房屋坐落 = fwzl房屋坐落;
  }

  public double getFwjzmj房屋建筑面积() {
    return fwjzmj房屋建筑面积;
  }

  public void setFwjzmj房屋建筑面积(double fwjzmj房屋建筑面积) {
    this.fwjzmj房屋建筑面积 = fwjzmj房屋建筑面积;
  }

  public double getFwtnmj房屋套内面积() {
    return fwtnmj房屋套内面积;
  }

  public void setFwtnmj房屋套内面积(double fwtnmj房屋套内面积) {
    this.fwtnmj房屋套内面积 = fwtnmj房屋套内面积;
  }

  public String getFwxz房屋性质() {
    return fwxz房屋性质;
  }

  public void setFwxz房屋性质(String fwxz房屋性质) {
    this.fwxz房屋性质 = fwxz房屋性质;
  }

  public double getFwzj房屋总价() {
    return fwzj房屋总价;
  }

  public void setFwzj房屋总价(double fwzj房屋总价) {
    this.fwzj房屋总价 = fwzj房屋总价;
  }

  public double getJkhtll借款合同利率() {
    return jkhtll借款合同利率;
  }

  public void setJkhtll借款合同利率(double jkhtll借款合同利率) {
    this.jkhtll借款合同利率 = jkhtll借款合同利率;
  }

  public double getLlfdbl利率浮动比例() {
    return llfdbl利率浮动比例;
  }

  public void setLlfdbl利率浮动比例(double llfdbl利率浮动比例) {
    this.llfdbl利率浮动比例 = llfdbl利率浮动比例;
  }

  public double getGfsfk购房首付款() {
    return gfsfk购房首付款;
  }

  public void setGfsfk购房首付款(double gfsfk购房首付款) {
    this.gfsfk购房首付款 = gfsfk购房首付款;
  }

  public String getJkrgjjzh借款人公积金账号() {
    return jkrgjjzh借款人公积金账号;
  }

  public void setJkrgjjzh借款人公积金账号(String jkrgjjzh借款人公积金账号) {
    this.jkrgjjzh借款人公积金账号 = jkrgjjzh借款人公积金账号;
  }

  public String getJkrxm借款人姓名() {
    return jkrxm借款人姓名;
  }

  public void setJkrxm借款人姓名(String jkrxm借款人姓名) {
    this.jkrxm借款人姓名 = jkrxm借款人姓名;
  }

  public String getJkrzjlx借款人证件类型() {
    return jkrzjlx借款人证件类型;
  }

  public void setJkrzjlx借款人证件类型(String jkrzjlx借款人证件类型) {
    this.jkrzjlx借款人证件类型 = jkrzjlx借款人证件类型;
  }

  public String getJkrzjh借款人证件号() {
    return jkrzjh借款人证件号;
  }

  public void setJkrzjh借款人证件号(String jkrzjh借款人证件号) {
    this.jkrzjh借款人证件号 = jkrzjh借款人证件号;
  }

  public String getSfrmc售房人名称() {
    return sfrmc售房人名称;
  }

  public void setSfrmc售房人名称(String sfrmc售房人名称) {
    this.sfrmc售房人名称 = sfrmc售房人名称;
  }

  public String getSfrzhhm售房人账户号码() {
    return sfrzhhm售房人账户号码;
  }

  public void setSfrzhhm售房人账户号码(String sfrzhhm售房人账户号码) {
    this.sfrzhhm售房人账户号码 = sfrzhhm售房人账户号码;
  }

  public String getSfrkhyhdm售房人开户银行代码() {
    return sfrkhyhdm售房人开户银行代码;
  }

  public void setSfrkhyhdm售房人开户银行代码(String sfrkhyhdm售房人开户银行代码) {
    this.sfrkhyhdm售房人开户银行代码 = sfrkhyhdm售房人开户银行代码;
  }

  public String getSfrkhyhmc售房人开户银行名称() {
    return sfrkhyhmc售房人开户银行名称;
  }

  public void setSfrkhyhmc售房人开户银行名称(String sfrkhyhmc售房人开户银行名称) {
    this.sfrkhyhmc售房人开户银行名称 = sfrkhyhmc售房人开户银行名称;
  }

  public Date getJkhtqdrq借款合同签订日期() {
    return jkhtqdrq借款合同签订日期;
  }

  public void setJkhtqdrq借款合同签订日期(Date jkhtqdrq借款合同签订日期) {
    this.jkhtqdrq借款合同签订日期 = jkhtqdrq借款合同签订日期;
  }

  public String getYdhkr约定还款日() {
    return ydhkr约定还款日;
  }

  public void setYdhkr约定还款日(String ydhkr约定还款日) {
    this.ydhkr约定还款日 = ydhkr约定还款日;
  }

  public String getDkzh贷款账号() {
    return dkzh贷款账号;
  }

  public void setDkzh贷款账号(String dkzh贷款账号) {
    this.dkzh贷款账号 = dkzh贷款账号;
  }

  public String getZxbh中心编号() {
    return zxbh中心编号;
  }

  public void setZxbh中心编号(String zxbh中心编号) {
    this.zxbh中心编号 = zxbh中心编号;
  }

  public void setCreatetime创建时间(LocalDateTime createtime创建时间) {
    this.createtime创建时间 = createtime创建时间;
  }

  public String getSfsc是否首次贷款() {
    return sfsc是否首次贷款;
  }

  public void setSfsc是否首次贷款(String sfsc是否首次贷款) {
    this.sfsc是否首次贷款 = sfsc是否首次贷款;
  }

  public String getSfst是否为首套住房贷款() {
    return sfst是否为首套住房贷款;
  }

  public void setSfst是否为首套住房贷款(String sfst是否为首套住房贷款) {
    this.sfst是否为首套住房贷款 = sfst是否为首套住房贷款;
  }

  public String getSfsb是否为首笔住房贷款() {
    return sfsb是否为首笔住房贷款;
  }

  public void setSfsb是否为首笔住房贷款(String sfsb是否为首笔住房贷款) {
    this.sfsb是否为首笔住房贷款 = sfsb是否为首笔住房贷款;
  }

  public String getFwzslx房屋证书类型() {
    return fwzslx房屋证书类型;
  }

  public void setFwzslx房屋证书类型(String fwzslx房屋证书类型) {
    this.fwzslx房屋证书类型 = fwzslx房屋证书类型;
  }

  public String getFwzshm房屋证书号码() {
    return fwzshm房屋证书号码;
  }

  public void setFwzshm房屋证书号码(String fwzshm房屋证书号码) {
    this.fwzshm房屋证书号码 = fwzshm房屋证书号码;
  }

  public String getGflx购房类型() {
    return gflx购房类型;
  }

  public void setGflx购房类型(String gflx购房类型) {
    this.gflx购房类型 = gflx购房类型;
  }

  public String getDkd贷款地() {
    return dkd贷款地;
  }

  public void setDkd贷款地(String dkd贷款地) {
    this.dkd贷款地 = dkd贷款地;
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

  public LocalDateTime getCreatetime创建时间() {
    return createtime创建时间;
  }
}
