package com.example.dm.pojo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Parameter定期存款利率表 {



        String 开始日期;
        

        String 终止日期;

        String 存款期限_月;

    String 存款年利率;

    public Parameter定期存款利率表(String 开始日期, String 终止日期, String 存款期限_月, String 存款年利率) {
        this.开始日期 = 开始日期;
        this.终止日期 = 终止日期;
        this.存款期限_月 = 存款期限_月;
        this.存款年利率 = 存款年利率;
    }

    public String get开始日期() {
        return 开始日期;
    }

    public void set开始日期(String 开始日期) {
        this.开始日期 = 开始日期;
    }

    public String get终止日期() {
        return 终止日期;
    }

    public void set终止日期(String 终止日期) {
        this.终止日期 = 终止日期;
    }

    public String get存款期限_月() {
        return 存款期限_月;
    }

    public void set存款期限_月(String 存款期限_月) {
        this.存款期限_月 = 存款期限_月;
    }

    public String get存款年利率() {
        return 存款年利率;
    }

    public void set存款年利率(String 存款年利率) {
        this.存款年利率 = 存款年利率;
    }
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
