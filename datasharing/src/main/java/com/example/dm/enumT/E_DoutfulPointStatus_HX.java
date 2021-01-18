package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_DoutfulPointStatus_HX {

    unrectified ("1", "unrectified",1,""),
    rectified ("2", "rectified",2,""),
    whitelist ("3", "whitelist",3,""),


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

    E_DoutfulPointStatus_HX(String statusText, String displayText, Integer id, String helpMessage) {
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

    public static E_DoutfulPointStatus_HX fromString(String text) {
        for (E_DoutfulPointStatus_HX status : E_DoutfulPointStatus_HX.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_DoutfulPointStatus_HX fromInt(Integer text) {
        for (E_DoutfulPointStatus_HX status : E_DoutfulPointStatus_HX.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
