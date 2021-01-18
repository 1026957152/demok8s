package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

import com.example.dm.pojo.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_TABLE_HX_证照名称_数据项 {

    E_1_居民身份证 ("居民身份证","个人身份","公安局","姓名、性别、民族、出生日期、住址、公民身份号码、签发机关、有效期限","身份核验"),
    E_2_户口薄 ("户口薄","个人身份","公安局","户主姓名、户号、住址、签发日期、姓名、户主或与户主关系、曾用名、性别、出生日期、公民身份证件编号、婚姻状况、何时由何地迁来本市（县）、何时由何地迁来本址、住址、公民身份号码、签发机关、有效期限","身份核验、住房公积金提取业务核验"),
    E_3_户口迁移证 ("户口迁移证","个人身份","公安局","姓名、性别、出生日期、公民身份证件编号、迁移原因、签发日期","住房公积金提取业务核验"),
    E_4_注销户口通知 ("注销户口通知","个人身份","公安局","姓名、出生日期、护照号码、签发日期、有效期至、签发地、居留事由、备注、性别、受理日期","住房公积金提取业务核验"),
    E_5_外国人永久居留证 ("外国人永久居留证","个人身份","公安局","姓名、性别、出生日期、永久居留证件号码、证件有效期、国籍","身份核验、住房公积金提取业务核验"),
    E_6_劳动能力鉴定结论 ("劳动能力鉴定结论","就业与社会保障","人社局","鉴定流水号、档案号、申请人、被鉴定人、性别、身份证号、工作单位、鉴定结论、落款日期、印章","住房公积金提取业务核验"),
    E_7_失业员工失业保险待遇计发决定书 ("失业员工失业保险待遇计发决定书","就业与社会保障","人社局","失业员工失业保险待遇计发决定书文号、姓名、电脑号、享受按月领取失业保险金的期限、当前月发放标准","住房公积金提取业务核验"),
    E_8_社保信息__停保转保_退休证明_领取养老保险金证明等 ("社保信息（停保转保、退休证明、领取养老保险金证明等）","就业与社会保障","人社局","社保卡编号、初次参加社保的年月日、目前缴纳社保的状态、社会保险参保人员停保、转保信息、社保缴费的基数、社保的险种类型、最近一次缴纳社保所属的期号；是否领取养老金的状态标识","住房公积金提取业务核验"),
    E_9_最低生活保障金领取证明 ("最低生活保障金领取证明","最低生活保障金领取证明","民政局","享受低保金额的所属年月、能享受到的低保金额、享受低保证明的有效期、家庭成员信息","住房公积金提取业务核验"),
    E_10_结婚证 ("结婚证","婚姻登记","民政局","男方姓名、身份证件号、出生日期、国籍；女方姓名、身份证件号出生日期、国籍、登记机关、婚姻登记员、持证人、登记日期、结婚证字号、备注","身份核验"),
    E_11_离婚证 ("离婚证","婚姻登记","民政局","男方姓名、身份证件号、出生日期、国籍；女方姓名、身份证件号出生日期、国籍、登记机关、婚姻登记员、持证人、登记日期、结婚证字号、备注","身份核验"),
    E_12_房产交易__购房合同 ("房产交易（购房合同）","房产交易状况","住建局","商品房销售合同备案信息、房屋买卖合同编号、网签合同号、出让方、出让方编号、受让方、受让方编号、房屋地址、面积、设计用途、签约时间、交易金额、付款方式","住房公积金提取业务提取、贷款业务核验"),
    E_13_房产权属__不动产权登记证书 ("房产权属（不动产权登记证书）","房产权属状况","自然资源和规划局","不动产权证号，权利人、共享情况、坐落、不动产单元号、权利类型、权利性质、用途、面积、使用期限、权利其他登记；不动产登记证明号、证明权利或事项、权利人（申请人）、义务人、坐落、不动产单元号、其他、附记","住房公积金提取、贷款业务核验"),
    E_14_税评系统 ("税评系统","税务登记","税务局","房屋评估基数及完税信息","住房公积金贷款业务核验"),
    E_15_个人征信报告 ("个人征信报告","银行信用","人民","个人信用报告（银行版）记录的信息","住房公积金提取、贷款业务核验"),


            ;





    private final String 数据类;
    private final String 相关信息管理部门;
    private final String 证照名称__数据项;
    private final String 数据信息明细_数据字段;
    private final String 用途;


    public String get数据类() {
        return 数据类;
    }

    public String get相关信息管理部门() {
        return 相关信息管理部门;
    }

    public String get证照名称__数据项() {
        return 证照名称__数据项;
    }

    public String get数据信息明细_数据字段() {
        return 数据信息明细_数据字段;
    }

    public String get用途() {
        return 用途;
    }

    E_TABLE_HX_证照名称_数据项(String 数据类, String 相关信息管理部门, String 证照名称__数据项, String 数据信息明细_数据字段, String 用途) {
        this.数据类 = 数据类;
        this.相关信息管理部门 = 相关信息管理部门;

        this.证照名称__数据项 = 证照名称__数据项;
        this.数据信息明细_数据字段 = 数据信息明细_数据字段;
        this.用途 = 用途;

    }

    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (E_TABLE_HX_证照名称_数据项 status : E_TABLE_HX_证照名称_数据项.values()) {
            ListItem element = new ListItem(status.get证照名称__数据项(), status.get证照名称__数据项(), status.get证照名称__数据项());
            list.add(element);
        }

        return list;

    }
    public static E_TABLE_HX_证照名称_数据项 fromString(String text) {
        for (E_TABLE_HX_证照名称_数据项 status : E_TABLE_HX_证照名称_数据项.values()) {
            if (status.get证照名称__数据项().equals(text) ) {
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
