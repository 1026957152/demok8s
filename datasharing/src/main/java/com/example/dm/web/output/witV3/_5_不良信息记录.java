package com.example.dm.web.output.witV3;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
//import lombok.Builder;
//import lombok.Data;

//import io.swagger.annotations.ApiModel;


//@ApiModel("个人贷款明细查询")
//@Builder
//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class _5_不良信息记录 {

    @ApiModelProperty(value="transdate_不可为空_交易日期",name="transdate",example="",position=0)
    @JsonProperty("transdate")
    @JSONField(name="transdate")
    private String transdate_2_transdate_不可为空_交易日期;

    @ApiModelProperty(value="badcretype_不良信用类型 0-提取类造假, 1-贷款类造假,2-信用不良",name="badcretype",example="",position=0)
    @JsonProperty("badcretype")
    @JSONField(name="badcretype")
    private String badcretype_5_badcretype_不可为空_不良信用类型;

    public String getTransdate_2_transdate_不可为空_交易日期() {
        return transdate_2_transdate_不可为空_交易日期;
    }

    public void setTransdate_2_transdate_不可为空_交易日期(String transdate_2_transdate_不可为空_交易日期) {
        this.transdate_2_transdate_不可为空_交易日期 = transdate_2_transdate_不可为空_交易日期;
    }

    public String getBadcretype_5_badcretype_不可为空_不良信用类型() {
        return badcretype_5_badcretype_不可为空_不良信用类型;
    }

    public void setBadcretype_5_badcretype_不可为空_不良信用类型(String badcretype_5_badcretype_不可为空_不良信用类型) {
        this.badcretype_5_badcretype_不可为空_不良信用类型 = badcretype_5_badcretype_不可为空_不良信用类型;
    }
}