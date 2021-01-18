package com.example.dm.domain;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Ac2303")
public class Ac2303联名卡状态登记簿 {
  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }


  /*  comment on column WITHRUN.AC2303.ID is 'id';

  comment on column WITHRUN.AC2303.ACCOUNTMEDIUMNUM is '账户介质编号';

  comment on column WITHRUN.AC2303.ACCOUNTMEDIUMTYPE is '账户介质类型';

  comment on column WITHRUN.AC2303.APPACCNUM is '应用账号';

  comment on column WITHRUN.AC2303.ACCOUNTTYPE is '账户类型';

  comment on column WITHRUN.AC2303.JOINTCARDSTATUSCHGTYPE is '联名卡状态变更类型';

  comment on column WITHRUN.AC2303.MEDIUMCHGREASON is '介质变更原因';*/
  @Id
  @Column(name = "id")
  private long id;
  @Column(name = "accountmediumnum")
  private String accountmediumnum账户介质编号;
  @Column(name = "accountmediumtype")
  private String accountmediumtype账户介质类型;
  @Column(name = "appaccnum")
  private String appaccnum应用账号;
  @Column(name = "accounttype")
  private String accounttype账户类型;
  @Column(name = "jointcardstatuschgtype")
  private String jointcardstatuschgtype联名卡状态变更类型;
  @Column(name = "mediumchgreason")
  private String mediumchgreason介质变更原因;

/*  comment on column WITHRUN.AC2303.TRANSDATE is '业务发生日期';

  comment on column WITHRUN.AC2303.BUSINESSSEQ is '业务流水号';

  comment on column WITHRUN.AC2303.MAKERTELLER is '经办柜员';

  comment on column WITHRUN.AC2303.MAKERINST is '经办机构';

  comment on column WITHRUN.AC2303.MAKERBANK is '经办银行';

  comment on column WITHRUN.AC2303.CHNL is '渠道';*/

  @Column(name = "transdate")
  private java.sql.Date transdate业务发生日期;
  @Column(name = "businessseq")
  private String businessseq业务流水号;
  @Column(name = "makerteller")
  private String makerteller经办柜员;
  @Column(name = "makerinst")
  private String makerinst经办机构;
  @Column(name = "makerbank")
  private String makerbank经办银行;
  @Column(name = "chnl")
  private String chnl渠道;


  @Column(name = "chnlseq")
  private String chnlseq渠道流水号;
  @Column(name = "transseq")
  private String transseq交易流水号;
  @Column(name = "createtime")
  private LocalDateTime createtime创建时间;
  @Column(name = "updatetime")
  private LocalDateTime updatetime最后更新时间戳;
 // comment on table WITHRUN.AC2303 is '联名卡状态登记簿';




/*  comment on column WITHRUN.AC2303.CHNLSEQ is '渠道流水号';

  comment on column WITHRUN.AC2303.TRANSSEQ is '交易流水号';

  comment on column WITHRUN.AC2303.CREATETIME is '创建时间';

  comment on column WITHRUN.AC2303.UPDATETIME is '最后更新时间戳'*/

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAccountmediumnum账户介质编号() {
    return accountmediumnum账户介质编号;
  }

  public void setAccountmediumnum账户介质编号(String accountmediumnum账户介质编号) {
    this.accountmediumnum账户介质编号 = accountmediumnum账户介质编号;
  }

  public String getAccountmediumtype账户介质类型() {
    return accountmediumtype账户介质类型;
  }

  public void setAccountmediumtype账户介质类型(String accountmediumtype账户介质类型) {
    this.accountmediumtype账户介质类型 = accountmediumtype账户介质类型;
  }

  public String getAppaccnum应用账号() {
    return appaccnum应用账号;
  }

  public void setAppaccnum应用账号(String appaccnum应用账号) {
    this.appaccnum应用账号 = appaccnum应用账号;
  }

  public String getAccounttype账户类型() {
    return accounttype账户类型;
  }

  public void setAccounttype账户类型(String accounttype账户类型) {
    this.accounttype账户类型 = accounttype账户类型;
  }

  public String getJointcardstatuschgtype联名卡状态变更类型() {
    return jointcardstatuschgtype联名卡状态变更类型;
  }

  public void setJointcardstatuschgtype联名卡状态变更类型(String jointcardstatuschgtype联名卡状态变更类型) {
    this.jointcardstatuschgtype联名卡状态变更类型 = jointcardstatuschgtype联名卡状态变更类型;
  }

  public String getMediumchgreason介质变更原因() {
    return mediumchgreason介质变更原因;
  }

  public void setMediumchgreason介质变更原因(String mediumchgreason介质变更原因) {
    this.mediumchgreason介质变更原因 = mediumchgreason介质变更原因;
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

  public String getMakerteller经办柜员() {
    return makerteller经办柜员;
  }

  public void setMakerteller经办柜员(String makerteller经办柜员) {
    this.makerteller经办柜员 = makerteller经办柜员;
  }

  public String getMakerinst经办机构() {
    return makerinst经办机构;
  }

  public void setMakerinst经办机构(String makerinst经办机构) {
    this.makerinst经办机构 = makerinst经办机构;
  }

  public String getMakerbank经办银行() {
    return makerbank经办银行;
  }

  public void setMakerbank经办银行(String makerbank经办银行) {
    this.makerbank经办银行 = makerbank经办银行;
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

  public String getTransseq交易流水号() {
    return transseq交易流水号;
  }

  public void setTransseq交易流水号(String transseq交易流水号) {
    this.transseq交易流水号 = transseq交易流水号;
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
}
