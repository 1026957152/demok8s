package com.coalvalue.employee.enumType;


/**
 * Created by silence on 2016/3/31.
 */
public enum SettlementMethodEnum {


    一票制 ("一票制","场外结算",1,"一票就是将货物的金额和运费的金额合在一起统一出一张增值税专用发票。"),

    两票制 ("两票制","委托交易中心结算", 5,"两票是分开出，货物的发票由销货方出发票，运费由运输方出具发票。");


    private final String statusText;
    private final String displayText;

    private final Integer id;
    private final String helpMessage;
    private String tipsMessage;


    public String getDisplayText() {
        return displayText;
    }

    private SettlementMethodEnum(String statusText, String displayText, Integer id, String helpMessage) {
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



    public String getTipsMessage() {
        return tipsMessage;
    }

    public void setTipsMessage(String tipsMessage) {
        this.tipsMessage = tipsMessage;
    }
}
