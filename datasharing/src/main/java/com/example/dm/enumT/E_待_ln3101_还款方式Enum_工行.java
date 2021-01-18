package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_待_ln3101_还款方式Enum_工行 {









    等本等息 ("70", "等本等息",1,""),
    等额本息 ("01", "等额本息",2,""),
    等额本金 ("02", "等额本金",1,""),
    一次还款付息 ("03", "一次还款付息",1,""),


    自由还款方式 ("04", "自由还款方式",1,""),
    其他 ("99", "其他",1,""),
;
    //private String inaccflag;//入账标志
//-,


    //   -
//    -



    private final String statusText;
    private final String displayText;
    private final Integer id;

    private String helpMessage;


    public static E_待_ln3101_还款方式Enum_工行 from(E_待_ln0301_还款方式Enum typeEnum) {



        switch (typeEnum){
            case 等额本息:

                return E_待_ln3101_还款方式Enum_工行.自由还款方式;

            case 等额本金:
                return E_待_ln3101_还款方式Enum_工行.等额本金;


            default:
                return E_待_ln3101_还款方式Enum_工行.其他;

        }


    }

    public String getHelpMessage() {
        return helpMessage;
    }

    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    public String getDisplayText() {
        return displayText;
    }

    private E_待_ln3101_还款方式Enum_工行(String statusText, String displayText, Integer id, String helpMessage) {
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



    public static E_待_ln3101_还款方式Enum_工行 fromString(String text) {
        for (E_待_ln3101_还款方式Enum_工行 status : E_待_ln3101_还款方式Enum_工行.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待_ln3101_还款方式Enum_工行 fromInt(Integer text) {
        for (E_待_ln3101_还款方式Enum_工行 status : E_待_ln3101_还款方式Enum_工行.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
