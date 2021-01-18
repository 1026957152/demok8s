package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_待_dp0106_单位账户状态Enum_定 {

    正常 ("01", "正常",1,""),
    开户 ("02", "开户",2,""),
    缓缴 ("03", "缓缴",1,""),
    销户 ("04", "销户",1,""),
    其他 ("99", "其他",1,""),

/*01	正常
02	开户
03	缓缴
04	销户
99	其他*/


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

    private E_待_dp0106_单位账户状态Enum_定(String statusText, String displayText, Integer id, String helpMessage) {
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



    public static E_待_dp0106_单位账户状态Enum_定 fromString(String text) {
        for (E_待_dp0106_单位账户状态Enum_定 status : E_待_dp0106_单位账户状态Enum_定.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待_dp0106_单位账户状态Enum_定 fromInt(Integer text) {
        for (E_待_dp0106_单位账户状态Enum_定 status : E_待_dp0106_单位账户状态Enum_定.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
