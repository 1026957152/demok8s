package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_待_Dw0202_提取审批 {
    E_1_新增个人 ("1", "新增个人",1,""),
    E_2_启封 ("2", "启封",2,""),
    E_3_转入后正常状态 ("3", "转入后正常状态",2,""),
    E_4_封存 ("4", "封存",2,""),
    E_5_正常状态销户 ("5", "正常状态销户",2,""),
    E_6_正常状态转出 ("6", "正常状态转出",2,""),
    E_7_正常状态被合并 ("7", "正常状态被合并",2,""),
    E_8_基数变更 ("8", "基数变更",2,""),
    E_9_比例变更 ("9", "比例变更",2,""),
    新增未知_10_ ("9", "比例变更",2,""),

/*    settlemode		"1-中心内部,
            2-现金,
            3-支票,
            4-委托扣款,
            5-电子转账"	0:不可为空_结算方式*/

;
    //private String inaccflag;//入账标志
//-,


    //   -
//    -



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

    E_待_Dw0202_提取审批(String statusText, String displayText, Integer id, String helpMessage) {
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



    public static E_待_Dw0202_提取审批 fromString(String text) {
        for (E_待_Dw0202_提取审批 status : E_待_Dw0202_提取审批.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待_Dw0202_提取审批 fromInt(Integer text) {
        for (E_待_Dw0202_提取审批 status : E_待_Dw0202_提取审批.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
