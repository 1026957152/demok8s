package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */


public enum E_待_CM0001_单位所属行业 {


    //A+农、林、牧、渔业；B+采矿业；C+制造业；D+电力、热力、燃气及水生产和供应业；
    // E+建筑业；F+批发和零售业；G+交通运输、仓储和邮政业；+H+住宿和餐饮业
    // ；I+信息传输、软件和信息技术服务业；J+金融业；K+房地产业；L+租赁和商务服务业；
    // M+科学研究和技术服务业；N+水利、环境和公共设施管理业；O+居民服务、修理和其他服务业；P+教育；Q+卫生和社会工



    A_农_林_牧_渔业("A", "农、林、牧、渔业",1,""),
    B_采矿业("B", "采矿业",2,""),

    C_制造业("C", "制造业",1,""),
    D_电力_热力_燃气及水生产和供应业("D", "电力、热力、燃气及水生产和供应业",2,""),
    E_建筑业("E", "建筑业",1,""),
    F_交通运输_仓储和邮政业("F", "交通运输、仓储和邮政业",2,""),
    G_信息传输_计算机服务和软件业("G", "信息传输、计算机服务和软件业",2,""),


    H_批发和零售业("H", "批发和零售业",1,""),
    I_住宿和餐饮业("I", "住宿和餐饮业",1,""),

    J_金融业("i", "金融业",2,""),



    K_房地产业("K", "房地产业",1,""),
    L_租赁和商务服务业("L", "租赁和商务服务业",2,""),
    M_科学研究_技术服务和地质勘查业("M", "科学研究、技术服务和地质勘查业",1,""),
    N_水利_环境和公共设施管理业("N", "水利、环境和公共设施管理业",2,""),

    O_居民服务和其他服务业("O", "居民服务和其他服务业",2,""),
    P_教育("P", "教育",1,""),
    R_文化_体育和娱乐业("R", "文化、体育和娱乐业",2,""),
    S_公共管理和社会组织("S", "公共管理和社会组织",2,""),
    Unknown("Unknown", "未知",2,""),

    ;



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

    E_待_CM0001_单位所属行业(String statusText, String displayText, Integer id, String helpMessage) {
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



    public static E_待_CM0001_单位所属行业 fromString(String text) {
        for (E_待_CM0001_单位所属行业 status : E_待_CM0001_单位所属行业.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待_CM0001_单位所属行业 fromInt(Integer text) {
        for (E_待_CM0001_单位所属行业 status : E_待_CM0001_单位所属行业.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
