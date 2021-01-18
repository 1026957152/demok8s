package com.example.dm.pojo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Parameter表4检查参数表 {


    String 描述;
    String 参数;
    String 数据类型;
        String 参数值;
    String 参数说明;

    public String get描述() {
        return 描述;
    }

    public void set描述(String 描述) {
        this.描述 = 描述;
    }

    public String get参数() {
        return 参数;
    }

    public void set参数(String 参数) {
        this.参数 = 参数;
    }

    public String get数据类型() {
        return 数据类型;
    }

    public void set数据类型(String 数据类型) {
        this.数据类型 = 数据类型;
    }

    public String get参数值() {
        return 参数值;
    }

    public void set参数值(String 参数值) {
        this.参数值 = 参数值;
    }

    public String get参数说明() {
        return 参数说明;
    }

    public void set参数说明(String 参数说明) {
        this.参数说明 = 参数说明;
    }

    public Parameter表4检查参数表(String 描述, String 参数, String 数据类型, String 参数值, String 参数说明) {
        this.描述 = 描述;
        this.参数 = 参数;
        this.数据类型 = 数据类型;
        this.参数值 = 参数值;
        this.参数说明 = 参数说明;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
