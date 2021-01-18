package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

import com.example.dm.pojo.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_亲属关系_HX {

    配偶("husband, wife","配偶"),
    子女("son, daughte","子女"),

    父母("father, mother","父母"),

    本人("self","本人"),

            ;





    private final String 编码;
    private final String 名称;


    public String get编码() {
        return 编码;
    }

    public String get名称() {
        return 名称;
    }

    E_亲属关系_HX(String 编码, String 名称) {
        this.编码 = 编码;
        this.名称 = 名称;


    }

    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (E_亲属关系_HX status : E_亲属关系_HX.values()) {
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
