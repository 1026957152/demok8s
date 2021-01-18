package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_待_证据类型_证件类型 {

    身份证 ("01", "身份证",1,""),
    军官证 ("02", "军官证",2,""),
    护照 ("03", "护照",1,""),
    外国人永久居留证 ("04", "其他",1,""),
    其他_ ("99", "其他",1,""),
/*01	身份证
02	军官证
03	护照
04	外国人永久居留证
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

    E_待_证据类型_证件类型(String statusText, String displayText, Integer id, String helpMessage) {
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


    public static E_待_证据类型_证件类型 from(E_待_证据类型_证件类型_CCB typeEnum) {

        switch (typeEnum){
            case 身份证:
                return E_待_证据类型_证件类型.身份证;
            case 军官证:
                return E_待_证据类型_证件类型.军官证;
            case 护照:
                return E_待_证据类型_证件类型.护照;
            case 其他:
              return E_待_证据类型_证件类型.其他_;
            default:
                return E_待_证据类型_证件类型.其他_;

        }


    }


    public static E_待_证据类型_证件类型 fromString(String text) {
        for (E_待_证据类型_证件类型 status : E_待_证据类型_证件类型.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待_证据类型_证件类型 fromInt(Integer text) {
        for (E_待_证据类型_证件类型 status : E_待_证据类型_证件类型.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
