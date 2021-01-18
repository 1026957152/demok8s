package com.example.dm.apidata.cebV1;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
//import lombok.Builder;
////import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;*/


/*//@Data
//@Builder*/
public class Cebdata {

    @ApiModelProperty(value="查询序列号，用于追溯查询",name="seqNo",example="",position=0)
    @JsonProperty("seqNo")
    @JSONField(name="seqNo")
    String seqNo;

    @ApiModelProperty(value="数据结果，list",name="data",example="",position=1)
    @JsonProperty("data")
    @JSONField(name="data")
    CebItem data;
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public CebItem getData() {
        return data;
    }

    public void setData(CebItem data) {
        this.data = data;
    }
}
