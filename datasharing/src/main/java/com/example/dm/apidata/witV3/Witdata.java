package com.example.dm.apidata.witV3;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
////import lombok.Data;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;*/





public class Witdata<T> {

    @ApiModelProperty(value="查询序列号，用于追溯查询",name="seqNo",example="",position=0)
    @JsonProperty("seqNo")
    @JSONField(name="seqNo")
    Long seqNo;

    @ApiModelProperty(value="数据结果，list",name="data",example="",position=1)
    @JsonProperty("data")
    @JSONField(name="data")
    List<T> data;

    @ApiModelProperty(value="totalcount，list",name="totalcount",example="",position=1)
    @JsonProperty("totalcount")
    @JSONField(name="totalcount")
    private long totalcount;


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public Witdata() {
    }

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(long totalcount) {
        this.totalcount = totalcount;
    }
}
