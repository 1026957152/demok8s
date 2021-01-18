package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_待_DP0106_单位账户状态Enum_建行 {
/*    登记 ("00", "登记",1,""),
    正常 ("01", "正常",1,""),
    开户 ("02", "开户",2,""),

    缓缴 ("03", "缓缴",1,""),
    销户 ("04", "销户",1,""),
    封存 ("05", "封存",1,""),
    其他 ("99", "其他",1,""),*/
    正常 ("0", "正常",0,""),
    封存 ("1", "封存",1,""),
    空账 ("2", "空账",2,""),
    销户 ("9", "销户",9,""),
;
    //private String inaccflag;//入账标志
//-,


    //   -
//    -


    public static E_待_DP0106_单位账户状态Enum_建行 from(E_待_dp0106_单位账户状态Enum_定 typeEnum) {

        switch (typeEnum){
            case 正常:
                return E_待_DP0106_单位账户状态Enum_建行.正常;
/*            case 封存:
                return E_待_DP0106_单位账户状态Enum_建行.封存;*/
            case 销户:
                return E_待_DP0106_单位账户状态Enum_建行.销户;
            case 其他:
            case 开户:
            case 缓缴:
                return E_待_DP0106_单位账户状态Enum_建行.空账;

            default:
                return E_待_DP0106_单位账户状态Enum_建行.空账;

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

    E_待_DP0106_单位账户状态Enum_建行(String statusText, String displayText, Integer id, String helpMessage) {
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



    public static E_待_DP0106_单位账户状态Enum_建行 fromString(String text) {
        for (E_待_DP0106_单位账户状态Enum_建行 status : E_待_DP0106_单位账户状态Enum_建行.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待_DP0106_单位账户状态Enum_建行 fromInt(Integer text) {
        for (E_待_DP0106_单位账户状态Enum_建行 status : E_待_DP0106_单位账户状态Enum_建行.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
