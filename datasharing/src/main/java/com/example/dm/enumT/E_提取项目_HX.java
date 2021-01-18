package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

import com.example.dm.pojo.ListItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_提取项目_HX {




    E_1 ("1","1、购买、建造、翻建、大修、装修自住住房的，职工本人及配偶、子女、父母可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_2 ("2"," 2、偿还自住住房贷款、装修贷款本息的，本人及配偶、子女、父母可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_3 ("3"," 3、交纳维修基金（大修基金）、物业费的，本人及配偶可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_4 ("4"," 4、职工及配偶在工作地或缴存地行政区域内无房产，租住本市住房的，本人及配偶可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_5 ("4"," 5、离、退休的，职工本人可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_6 ("6"," 6、完全丧失劳动能力，并与单位终止劳动关系的，职工本人可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_7 ("7"," 7、与单位终止劳动关系，且半年内未在异地开设公积金账户的，职工本人可以提取",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_8 ("8"," 8、出境定居的，职工本人可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_9 ("9"," 9、灵活就业人员自愿申请销户的，本人可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_10 ("10"," 10、职工死亡或者被宣告死亡的，继承人或受遗赠人可以提取去世职工的住房公积金；；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_11 ("11"," 11、享受城镇居民最低生活保障的，职工本人可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_12 ("12"," 12、连续失业两年以上，家庭人均收入低于本地区最低工资收入标准的，家庭生活严重困难的职工本人可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_13 ("13"," 13、子女上大学的，职工本人及配偶可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_14 ("14"," 14、遇到突发事件、造成家庭生活特别困难的，职工本人及配偶、子女、父母可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_15 ("15"," 15、职工本人或家庭人员因大病住院，造成家庭生活严重困难的，本人、配偶及直系亲属可以提取；",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),
    E_16 ("16"," 16、住房公积金管委会规定的其他情形。",Arrays.asList(E_亲属关系_HX.本人,E_亲属关系_HX.配偶,E_亲属关系_HX.子女,E_亲属关系_HX.父母)),



            ;





    private final List<E_亲属关系_HX> kinship;
    private final String 名称;
    private final String no;

    public String getNo() {
        return no;
    }

    public List<E_亲属关系_HX> getKinship() {
        return kinship;
    }

    public String get名称() {
        return 名称;
    }

    E_提取项目_HX(String no,String 编码,List<E_亲属关系_HX> 名称) {
        this.no = no;
        this.kinship = 名称;
        this.名称 = 编码;


    }

    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (E_提取项目_HX status : E_提取项目_HX.values()) {
            ListItem element = new ListItem(status.get名称(), status.get名称(), status.get名称());
            list.add(element);
        }

        return list;

    }
    public static E_提取项目_HX fromString(String text) {
        for (E_提取项目_HX status : E_提取项目_HX.values()) {
            if (status.getNo().equals(text) ) {
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
