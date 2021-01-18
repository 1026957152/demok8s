package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_CM001_单位基本资料表_单位性质_光大银行 {


    国家机关 ("A1", "国家机关",1,""),
    事业单位 ("B1", "事业单位",2,""),

    民办非企业单位 ("C1", "民办非企业单位",1,""),

    社会团体 ("D1", "社会团体",2,""),

    国有 ("E1", "国有",2,""),
    集体 ("E2", "集体",1,""),
    外资企业 ("E3", "股份合作企",2,""),
    联营 ("E4", "联营",1,""),


    有限责任公司 ("E5", "有限责任公司",2,""),

    股份有限公司 ("E6", "股份有限公司",2,""),
    与港澳台商合资经营 ("F1", "与港澳台商合资经营",1,""),
    与港澳台商合作经营 ("F2", "与港澳台商合作经营",2,""),
    港澳台商独资 ("F3", "港澳台商独资",2,""),
    港澳台商投资股份有限公司 ("E8", "港澳台商投资股份有限公司",2,""),
    中外合资经营 ("G1", "中外合资经营",2,""),
    中外合作经营 ("G2", "中外合作经营",2,""),
    外商独资 ("G4", "外商独资",2,""),
    部队 ("H1", "部队",2,""),
    其他单位 ("I1", "其他单位",2,"")


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

    E_CM001_单位基本资料表_单位性质_光大银行(String statusText, String displayText, Integer id, String helpMessage) {
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



    public static E_CM001_单位基本资料表_单位性质_光大银行 fromString(String text) {
        for (E_CM001_单位基本资料表_单位性质_光大银行 status : E_CM001_单位基本资料表_单位性质_光大银行.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_CM001_单位基本资料表_单位性质_光大银行 fromInt(Integer text) {
        for (E_CM001_单位基本资料表_单位性质_光大银行 status : E_CM001_单位基本资料表_单位性质_光大银行.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
