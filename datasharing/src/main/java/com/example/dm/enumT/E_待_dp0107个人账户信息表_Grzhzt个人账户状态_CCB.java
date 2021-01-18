package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB {


/*             02
             05
             06
             03*/
    正常 ("0", "正常",0,""),
    封存 ("1", "封存",1,""),

    销户 ("9","销户", 9,""),
    未知 ("7", "未知",7,""),;


/*    正常 ("0", "正常",0,""),
    封存 ("1", "封存",1,""),

    销户 ("9","销户", 9,""),
    未知 ("7", "未知",7,""),;*/



    public static E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB from(E_待_dp0107个人账户信息表_Grzhzt个人账户状态 typeEnum) {




        switch (typeEnum){
            case 正常:

                return E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB.正常;

            case 封存:

                return E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB.封存;
            case 合并销户:
            case 外部转出销户:
            case 提取销户:

                return E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB.销户;
            case 冻结:
            case 其他:

            default:
                return E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB.未知;

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

    private E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB(String statusText, String displayText, Integer id, String helpMessage) {
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


    public static 个人账户状态_PersonalAccountStatusEnum_银行 from(String text) {



        E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB typeEnum = E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB.fromString(text);

        switch (typeEnum){
            case 正常:

                return 个人账户状态_PersonalAccountStatusEnum_银行.正常;

            case 封存:
                return 个人账户状态_PersonalAccountStatusEnum_银行.封存;

            case 销户:

                return 个人账户状态_PersonalAccountStatusEnum_银行.其他;




            default:
                return 个人账户状态_PersonalAccountStatusEnum_银行.其他;


        }


    }

    public static E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB fromString(String text) {
        for (E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB status : E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB fromInt(Integer text) {
        for (E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB status : E_待_dp0107个人账户信息表_Grzhzt个人账户状态_CCB.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
