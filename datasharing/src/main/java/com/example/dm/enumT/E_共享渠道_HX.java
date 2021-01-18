package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

import com.example.dm.pojo.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_共享渠道_HX {

    不动产_产权登记("husband, wife","不动产_产权登记"),
    五证企业基本信息("son, daughte","五证企业基本信息"),

    人社局_企业退休("father, mother","人社局_企业退休"),

    信用办_自然人红名单("self","信用办_自然人红名单"),
    信用办_自然人黑名单("self","信用办_自然人黑名单"),
    市医保_大病理赔("self","信用办_自然人黑名单"),

            ;





    private final String 编码;
    private final String 名称;


    public String get编码() {
        return 编码;
    }

    public String get名称() {
        return 名称;
    }

    E_共享渠道_HX(String 编码, String 名称) {
        this.编码 = 编码;
        this.名称 = 名称;


    }

    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (E_共享渠道_HX status : E_共享渠道_HX.values()) {
            ListItem element = new ListItem(status.get编码(), status.get名称(), status.get名称());
            list.add(element);
        }

        return list;

    }
    public static E_共享渠道_HX fromString(String text) {
        for (E_共享渠道_HX status : E_共享渠道_HX.values()) {
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
