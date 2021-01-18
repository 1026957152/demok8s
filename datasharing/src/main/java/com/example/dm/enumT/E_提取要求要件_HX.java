package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

import com.example.dm.pojo.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_提取要求要件_HX {

    E_1 ("1","1、购买商品房需提供以下材料：（1）购买预售商品房的需提供已备案《商品房买卖合同》、首付款票据、身份证、本人公积金联名卡或银行卡。   2）购买现房的需提供《商品房买卖合同》、契税完税发票、购房发票、房屋产权证、身份证。"),
    E_2 ("2"," 2、购买二手房：房屋买卖契约、契税完税发票、房屋产权证、身份证。"),	// 如上述1、2情况配偶、子女或父母为购房人，除以上材料外，还需提供结婚证、户口簿或户口所在地户籍管理部门出具亲属关系证明（附户口簿等）。
    E_3 ("3"," 3、职工在城镇国有土地上建造、翻建自住住房的：提供土地使用证（翻建住房的提供原房屋产权证）；城建规划部门建房、翻建批准文件；相关的费用发票、身份证；如房屋所有权人是配偶的提供婚姻关系证明。"),
    E_4 ("4"," 4、职工在农村建造、翻建自住住房的：提供宅基地证（集体土地使用证或宅基地审批表）、居民户口簿、国土资源局出具的建房证明、身份证、婚姻或家庭关系的证明、相关的费用发票。"),
    E_5 ("5"," 5、职工大修自住住房的：应提供房屋产权证，房管部门出具的房屋应大修证明或提供有资质机构出具的房屋安全鉴定证明及相关费用发票或分摊到本户的修缮费用发票；在集体土地上应提供提取者所在乡、镇一级或乡、镇以上的房屋管理部门开具的大修证明、集体土地使用证或宅基地审批表、居民户口簿、身份证、婚姻关系证明。"),
    E_6 ("6"," 6、房屋装修的：应提供房产证或已备案的购房合同；签订日期一年以内的装修合同或者物业公司开具的装修证明及装修相关费用票据，身份证、婚姻或家庭关系的证明。"),
    E_7 ("7"," 7、租赁自住住房的：（1）租住公共租赁住房的单身职工需提供本人身份证、房屋租赁合同；已婚职工申请提取时还需提供配偶身份证、婚姻关系证明。（2）租住商品房的单身职工需提供本人身份证、工作地或缴存地区域内无房产的证明，房屋租赁合同；已婚职工申请提取时还需提供配偶的身份证、在本行政区内无房产的证明、婚姻关系证明。"),
    E_8 ("8"," 8、偿还自住住房贷款、装修贷款本息的提供：借款合同（或借据）和银行出具近期还款证明、身份证。如借款人是配偶的提供结婚证。"),
    E_9 ("9"," 9、享受城镇最低生活保障的、提供民政部门发放的低保证或领取最低生活保障金凭证、身份证。"),
    E_10 ("10"," 10、缴存人及配偶或子女等成员、因患重大疾病或遭遇突发事件导致家庭生活特别困难的应提供医院的诊断证明、病案首页、医疗费支付证明；提供相关部门的证明材料，职工所在单位出具的职工家庭生活特别困难证明以及本人、配偶及子女的身份证。"),
    E_11 ("11"," 11、离、退休：提供离、退休的文件或离、退休证或养老保险机构的退休金申请审批表等任意一项或以身份证件年龄为依据办理。"),
    E_12 ("12"," 12、出国定居：提供户口注销证明或移民签证。"),
    E_13 ("13"," 13、死亡或被宣告死亡其继承人或受遗赠人凭死亡证明、公证部门对该继承权或受遗赠权公证书、对继承人或受遗赠人发生争议的还应提供人民法院的判决、裁定或调解文书及身份证。"),
    E_14 ("14"," 14、完全丧失劳动能力并与单位解除劳动合同的应提供人力资源和社会保障部门出具的劳动能力鉴定证明；单位解除劳动合同手续或相关部门办理的失业证明。"),


    ;
    
    private final String kinship;
    private final String 名称;


    public String getKinship() {
        return kinship;
    }

    public String get名称() {
        return 名称;
    }

    E_提取要求要件_HX(String 编码, String 名称) {
        this.kinship = 名称;
        this.名称 = 编码;


    }

    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (E_提取要求要件_HX status : E_提取要求要件_HX.values()) {
            ListItem element = new ListItem(status.get名称(), status.get名称(), status.get名称());
            list.add(element);
        }

        return list;

    }
    public static E_提取要求要件_HX fromString(String text) {
        for (E_提取要求要件_HX status : E_提取要求要件_HX.values()) {
            if (status.get名称().equals(text) ) {
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
