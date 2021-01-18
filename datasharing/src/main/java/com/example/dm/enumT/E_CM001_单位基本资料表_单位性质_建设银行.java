package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_CM001_单位基本资料表_单位性质_建设银行 {


    国家行政机关_3200 ("3200", "国家机关",1,""),
    事业单位_2000 ("2000", "事业单位",2,""),
    民办非企业单位_5000 ("5000", "民办非企业单位",1,""),
    国有_1110 ("1110", "国有",2,""),
    集体_1120 ("1120", "集体",1,""),
    外资_1330 ("1330", "股份合作企",2,""),
    私营_1170 ("1170", "股份合作企",2,""),
   私营有限责任公司_1173 ("1173", "有限责任公司",2,""),
    股份有限公司_1160 ("1160", "股份有限公司",2,""),
    军队_6000 ("6000", "部队",2,""),
    其他_9999 ("9999", "其他单位",2,"")


    ;

    public static E_CM001_单位基本资料表_单位性质_建设银行 from_CEB(E_待_DP0102_PaymentUnitTypeEnum_单位性质_定 typeEnum) {


        switch (typeEnum){
            case 国家机关:
                return E_CM001_单位基本资料表_单位性质_建设银行.国家行政机关_3200;
            case 事业单位:
                return E_CM001_单位基本资料表_单位性质_建设银行.事业单位_2000;
            case 国有企业:
                return E_CM001_单位基本资料表_单位性质_建设银行.国有_1110;
            case 城镇集体企业:
                return E_CM001_单位基本资料表_单位性质_建设银行.集体_1120;
            case 外商投资企业:
                return E_CM001_单位基本资料表_单位性质_建设银行.外资_1330;
            case 城镇私营企业:
                return E_CM001_单位基本资料表_单位性质_建设银行.私营_1170;
            case 民办非企业单位:
                return E_CM001_单位基本资料表_单位性质_建设银行.民办非企业单位_5000;
            case 其他城镇企业:
            case 社会团体:
            case 自由职业者:
            case 个体工商户:
            case 其他:
            default:
                return E_CM001_单位基本资料表_单位性质_建设银行.其他_9999;

        }


    }



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

    E_CM001_单位基本资料表_单位性质_建设银行(String statusText, String displayText, Integer id, String helpMessage) {
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



    public static E_CM001_单位基本资料表_单位性质_建设银行 fromString(String text) {
        for (E_CM001_单位基本资料表_单位性质_建设银行 status : E_CM001_单位基本资料表_单位性质_建设银行.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_CM001_单位基本资料表_单位性质_建设银行 fromInt(Integer text) {
        for (E_CM001_单位基本资料表_单位性质_建设银行 status : E_CM001_单位基本资料表_单位性质_建设银行.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
