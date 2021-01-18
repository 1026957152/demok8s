package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_待_DP0102_PaymentUnitTypeEnum_单位性质_定 {
/*
10	国家机关
20	事业单位
30	国有企业
31	城镇集体企业
32	外商投资企业
33	城镇私营企业
39	其他城镇企业
40	民办非企业单位
50	社会团体
71	个体工商户
72	自由职业者
90	其他
*/


    国家机关 ("10", "国家机关",1,""),
    事业单位 ("20", "事业单位",2,""),
    国有企业 ("30", "国有企业",1,""),
    城镇集体企业 ("31", "城镇集体企业",2,""),
    外商投资企业 ("32", "外商投资企业",1,""),
    城镇私营企业 ("33", "城镇私营企业",2,""),

    其他城镇企业 ("39", "其他城镇企业",1,""),
    民办非企业单位 ("40", "民办非企业单位",2,""),

    社会团体 ("50", "社会团体",1,""),
    个体工商户 ("71", "个体工商户",2,""),
    自由职业者 ("72", "自由职业者",2,""),
    其他 ("90", "其他",2,""),

;


/*
    public static E_待_DP0102_PaymentUnitTypeEnum_单位性质_建行 from(E_待_DP0102_PaymentUnitTypeEnum_单位性质 typeEnum) {



        //E_待_DP0102_PaymentUnitTypeEnum_单位性质 typeEnum = E_待_DP0102_PaymentUnitTypeEnum_单位性质.fromString(text);
        switch (typeEnum){
            case 国家机关:
            case 差额拨款事业单位:
            case 全额拨款事业单位:
            case 自收自支事业单位:
            case 参公管理事业单位:
            case 企业管理事业单位:
                return E_待_DP0102_PaymentUnitTypeEnum_单位性质_建行.国家机关;

            case 民办非企业单位:
                return E_待_DP0102_PaymentUnitTypeEnum_单位性质_建行.民办非企业单位_社会团体;

            case 国有企业:
                return E_待_DP0102_PaymentUnitTypeEnum_单位性质_建行.国有企业;

            case 城镇集体企业:
                return E_待_DP0102_PaymentUnitTypeEnum_单位性质_建行.城镇集体企业;

            case 外资企业:
                return E_待_DP0102_PaymentUnitTypeEnum_单位性质_建行.外资企业;
            case 城镇私营企业:
                return E_待_DP0102_PaymentUnitTypeEnum_单位性质_建行.城镇私营企业及其他城镇企业;

            default:
                return E_待_DP0102_PaymentUnitTypeEnum_单位性质_建行.其他;

        }


    }*/

    private final String statusText;
    private final String displayText;
    private final Integer id;

    private String helpMessage;

    public String getHelpMessage() {
        return helpMessage;
    }

    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    public String getDisplayText() {
        return displayText;
    }

    private E_待_DP0102_PaymentUnitTypeEnum_单位性质_定(String statusText, String displayText, Integer id, String helpMessage) {
        this.statusText = statusText;
        this.displayText = displayText;

        this.id = id;
        this.helpMessage = helpMessage;
    }
    public String getText() {
        return this.statusText;
    }

    public Integer getId() {
        return this.id;
    }

/*
    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (AccountingVoucherStatusEnum status : AccountingVoucherStatusEnum.values()) {
            ListItem element = new ListItem(status.getId(), status.getDisplayText(), status.getHelpMessage());
            list.add(element);
        }

        return list;

    }


    public static List<ListItem> retriveTypese(String statusText) {

        List<ListItem> list = new ArrayList<ListItem>();
        for(PersonalAccountStatusEnum status : PersonalAccountStatusEnum.values()) {
            ListItem element = new ListItem(status.getText(), status.getDisplayText());
            if (status.getText().equals(statusText)){
                element.setSelected(true);
            }
            list.add(element);
        }
        return list;

    }*/



    public static E_待_DP0102_PaymentUnitTypeEnum_单位性质_定 fromString(String text) {
        for (E_待_DP0102_PaymentUnitTypeEnum_单位性质_定 status : E_待_DP0102_PaymentUnitTypeEnum_单位性质_定.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待_DP0102_PaymentUnitTypeEnum_单位性质_定 fromInt(Integer text) {
        for (E_待_DP0102_PaymentUnitTypeEnum_单位性质_定 status : E_待_DP0102_PaymentUnitTypeEnum_单位性质_定.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
