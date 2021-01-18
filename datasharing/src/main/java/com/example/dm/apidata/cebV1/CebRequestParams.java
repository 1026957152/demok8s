package com.example.dm.apidata.cebV1;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.validation.constraints.NotBlank;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;*/


public class CebRequestParams {

    @NotBlank
    String wtrjgh;
    @NotBlank
     String wtrxm;
    @NotBlank
    String zjlx;
    @NotBlank
     String zjhm;
    @NotBlank
    String xm;

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

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }


}
