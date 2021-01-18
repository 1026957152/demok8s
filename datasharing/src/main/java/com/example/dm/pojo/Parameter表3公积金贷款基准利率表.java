package com.example.dm.pojo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Parameter表3公积金贷款基准利率表 {



        String 贷款年利率;

    public Parameter表3公积金贷款基准利率表(String 贷款年利率) {
        this.贷款年利率 = 贷款年利率;
    }

    public String get贷款年利率() {
        return 贷款年利率;
    }

    public void set贷款年利率(String 贷款年利率) {
        this.贷款年利率 = 贷款年利率;
    }
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
