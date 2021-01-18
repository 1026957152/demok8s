package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_待_证据类型_证件类型_CCB {

    身份证 ("1", "身份证",1,""),
    军官证 ("2", "军官证",2,""),
    护照 ("3", "护照",1,""),
    其他 ("9", "其他",1,""),


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

    E_待_证据类型_证件类型_CCB(String statusText, String displayText, Integer id, String helpMessage) {
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


    public static E_待_证据类型_证件类型_CCB from(E_待_证据类型_证件类型 typeEnum) {



        switch (typeEnum){
            case 身份证:

                return E_待_证据类型_证件类型_CCB.身份证;

            case 军官证:

                return E_待_证据类型_证件类型_CCB.军官证;
            case 护照:
                return E_待_证据类型_证件类型_CCB.护照;


            default:
                return E_待_证据类型_证件类型_CCB.其他;

        }


    }


    public static E_待_证据类型_证件类型_CCB fromString(String text) {
        for (E_待_证据类型_证件类型_CCB status : E_待_证据类型_证件类型_CCB.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待_证据类型_证件类型_CCB fromInt(Integer text) {
        for (E_待_证据类型_证件类型_CCB status : E_待_证据类型_证件类型_CCB.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
