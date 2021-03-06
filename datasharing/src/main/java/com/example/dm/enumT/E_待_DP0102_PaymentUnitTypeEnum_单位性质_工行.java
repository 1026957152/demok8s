package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行 {


    国家机关 ("000001", "国家机关",1,""),

    民办非企业单位_社会团体 ("000006", "民办非企业单位_社会团体",1,""),
    国有企业 ("000002", "国有企业",2,""),

    外资企业 ("000004", "外资企业",2,""),

    城镇集体企业 ("000003", "城镇集体企业",2,""),

    城镇私营企业及其他城镇企业 ("000005", "城镇私营企业及其他城镇企业",2,""),
    其他 ("000007", "其他",1,""),




;


    public static E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行 from(E_待_DP0102_PaymentUnitTypeEnum_单位性质_定 typeEnum) {



        switch (typeEnum){


            default:
                return E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行.其他;

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

    E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行(String statusText, String displayText, Integer id, String helpMessage) {
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



    public static E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行 fromString(String text) {
        for (E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行 status : E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行 fromInt(Integer text) {
        for (E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行 status : E_待_DP0102_PaymentUnitTypeEnum_单位性质_工行.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
