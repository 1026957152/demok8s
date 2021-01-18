package com.example.dm.pojo;

import javax.validation.constraints.NotBlank;

public class CCBExcel {


        String unitaccount; //zjbzxbm	住建部中心编码	String	输入(必传)	  长度：6，举例：C61010
        

        String shtyxydm; //开始日期	String	输入(必传)	长度：10，举例：2019-07-03
        @NotBlank
        String type; //结束日期	String	输入(必传)	长度：10，举例：2019-07-03

    public CCBExcel(String unitaccount, String shtyxydm, @NotBlank String type) {
        this.unitaccount = unitaccount;
        this.shtyxydm = shtyxydm;
        this.type = type;
    }

    public String getUnitaccount() {
        return unitaccount;
    }

    public void setUnitaccount(String unitaccount) {
        this.unitaccount = unitaccount;
    }

    public String getShtyxydm() {
        return shtyxydm;
    }

    public void setShtyxydm(String shtyxydm) {
        this.shtyxydm = shtyxydm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
