package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

import com.example.dm.pojo.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_提取条件_HX {



    贷款未还清("555	7020","单位托收回单打印"),
    公积金质押贷款及质押担保人("5001","个人账户基本信息查询"),


    共享查询不动产无房("5001","个人账户基本信息查询"),



            ;





    private final String 编码;
    private final String 名称;


    public String get编码() {
        return 编码;
    }

    public String get名称() {
        return 名称;
    }

    E_提取条件_HX(String 编码, String 名称) {
        this.编码 = 编码;
        this.名称 = 名称;


    }

    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (E_提取条件_HX status : E_提取条件_HX.values()) {
            ListItem element = new ListItem(status.get编码(), status.get名称(), status.get名称());
            list.add(element);
        }

        return list;

    }
    public static E_提取条件_HX fromString(String text) {
        for (E_提取条件_HX status : E_提取条件_HX.values()) {
            if (status.get编码().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

/*
    public static 银行编码 fromString(String text) {
        for (银行编码 status : 银行编码.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static 银行编码 fromInt(Integer text) {
        for (银行编码 status : 银行编码.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }*/
}
