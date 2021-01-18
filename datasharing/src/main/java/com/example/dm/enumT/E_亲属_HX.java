package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

import com.example.dm.pojo.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_亲属_HX {

    husband("husband","丈夫"),
    wife("wife","妻子"),
    son("son","儿子"),
    daughte("daughte","女儿"),
    father("father","父亲"),
    mother("mother","目前"),


            ;





    private final String 编码;
    private final String 名称;


    public String get编码() {
        return 编码;
    }

    public String get名称() {
        return 名称;
    }

    E_亲属_HX(String 编码, String 名称) {
        this.编码 = 编码;
        this.名称 = 名称;


    }

    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (E_亲属_HX status : E_亲属_HX.values()) {
            ListItem element = new ListItem(status.get编码(), status.get名称(), status.get名称());
            list.add(element);
        }

        return list;

    }
    public static E_亲属关系_HX fromString(String text) {
        for (E_亲属关系_HX status : E_亲属关系_HX.values()) {
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
