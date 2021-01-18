package com.example.dm.apidata;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
/*import lombok.Builder;
//import lombok.Data;*/
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;*/


/*//@Data
//@Builder*/
public class Query {

    @JsonProperty("wtrjgh")
    @JSONField(name="wtrjgh")

            String wtrjgh; //pageSize	分页每页显示条数	Int		10

    @JsonProperty("wtrxm")
    @JSONField(name="wtrxm")
            String wtrxm; //pageNumber	分页显示页面	int		1

    @JsonProperty("zjlx")
    @JSONField(name="zjlx")
    String zjlx;


    @JsonProperty("zjhm")
    @JSONField(name="zjhm")
    String zjhm;
/* @ApiParam(name = "pagerows", value = "List of URIs of secured assets on the Secure Download Server", allowMultiple = true,
         required = true)*/
    @JsonProperty("xm")
    @JSONField(name="xm")
    String xm;


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getWtrjgh() {
        return wtrjgh;
    }

    public void setWtrjgh(String wtrjgh) {
        this.wtrjgh = wtrjgh;
    }

    public String getWtrxm() {
        return wtrxm;
    }

    public void setWtrxm(String wtrxm) {
        this.wtrxm = wtrxm;
    }

    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }
}
