package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_DP022_个人缴存登记簿_汇缴类型_dptype {
    E_0_预缴 ("0", "预缴",1,""),
    E_1_汇缴 ("1", "汇缴",1,""),
    E_2_正常全额补缴 ("2", "正常全额补缴",2,""),
    E_3_正常差额补缴 ("3", "正常差额补缴",2,""),

    E_4_不定额补缴 ("4", "不定额补缴",2,""),
    E_5_退缴 ("5", "退缴",2,""),
/*    dptype		"0-预缴,
            1-汇缴,
            2-正常全额补缴,
            3-正常差额补缴,
            4-不定额补缴,
            5-退缴
        9-异地转入"	0:不可为空	缴存类型*/

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

    E_DP022_个人缴存登记簿_汇缴类型_dptype(String statusText, String displayText, Integer id, String helpMessage) {
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



    public static E_DP022_个人缴存登记簿_汇缴类型_dptype fromString(String text) {
        for (E_DP022_个人缴存登记簿_汇缴类型_dptype status : E_DP022_个人缴存登记簿_汇缴类型_dptype.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_DP022_个人缴存登记簿_汇缴类型_dptype fromInt(Integer text) {
        for (E_DP022_个人缴存登记簿_汇缴类型_dptype status : E_DP022_个人缴存登记簿_汇缴类型_dptype.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
