package com.example.dm.web.output.witV3;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


//@ApiModel(value = "个人账户明细查询",description="用户对象user")
//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class _3_个人账户明细查询 {



 @ApiModelProperty(value="JZRQ_记账日期",name="jzrq",example="",position=0)
  @JsonProperty("jzrq")
    @JSONField(name="jzrq")
    private String JZRQ_记账日期;


    @ApiModelProperty(value="FSE_发生额",name="fse",example="",position=0)
    @JsonProperty("fse")
    @JSONField(name="fse")
    private String FSE_发生额;


    @ApiModelProperty(value="GRZHYE_个人账户余额",name="grzhye",example="",position=0)
    @JsonProperty("grzhye")
    @JSONField(name="grzhye")
    private String GRZHYE_个人账户余额;


    @ApiModelProperty(value="ZhaiYao_摘要",name="zy",example="",position=0)
    @JsonProperty("zy")
    @JSONField(name="zy")
    private String ZhaiYao_摘要;

  public String getJZRQ_记账日期() {
    return JZRQ_记账日期;
  }

  public void setJZRQ_记账日期(String JZRQ_记账日期) {
    this.JZRQ_记账日期 = JZRQ_记账日期;
  }

  public String getFSE_发生额() {
    return FSE_发生额;
  }

  public void setFSE_发生额(String FSE_发生额) {
    this.FSE_发生额 = FSE_发生额;
  }

  public String getGRZHYE_个人账户余额() {
    return GRZHYE_个人账户余额;
  }

  public void setGRZHYE_个人账户余额(String GRZHYE_个人账户余额) {
    this.GRZHYE_个人账户余额 = GRZHYE_个人账户余额;
  }

  public String getZhaiYao_摘要() {
    return ZhaiYao_摘要;
  }

  public void setZhaiYao_摘要(String zhaiYao_摘要) {
    ZhaiYao_摘要 = zhaiYao_摘要;
  }
}