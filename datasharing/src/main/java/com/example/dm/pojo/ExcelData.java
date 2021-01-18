package com.example.dm.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Excel封装类
 * @author lemon
 * @since 2019/11/1 0001
 */
public class ExcelData implements Serializable {
 
    // 表头
    private List<String> titles;
 
    // 数据
    private List<List<Object>> rows;
 
    // 页签名称
    private String name;
 
    public List<String> getTitles() {
        return titles;
    }
 
    public void setTitles(List<String> titles) {
        this.titles = titles;
    }
 
    public List<List<Object>> getRows() {
        return rows;
    }
 
    public void setRows(List<List<Object>> rows) {
        this.rows = rows;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}
