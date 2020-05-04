package com.coalvalue.employee.enumType;



import com.coalvalue.employee.domain.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silence on 2016/1/18.
 */
public enum AuthorizationVerificationStatusEnum {


    Valid ("Valid", "Valid",2,""),
    Unvalid ("Unvalid", "Unvalid",2,""),
    Completed ("Completed", "Completed",2,""),

 ;// 请求结算






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

    private AuthorizationVerificationStatusEnum(String statusText, String displayText, Integer id, String helpMessage) {
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


    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (AuthorizationVerificationStatusEnum status : AuthorizationVerificationStatusEnum.values()) {
            ListItem element = new ListItem(status.getId(), status.getDisplayText(), status.getHelpMessage());
            list.add(element);
        }

        return list;

    }


    public static List<ListItem> retriveTypese(String statusText) {

        List<ListItem> list = new ArrayList<ListItem>();
        for(AuthorizationVerificationStatusEnum status : AuthorizationVerificationStatusEnum.values()) {
            ListItem element = new ListItem(status.getText(), status.getDisplayText());
            if (status.getText().equals(statusText)){
                element.setSelected(true);
            }
            list.add(element);
        }
        return list;

    }
    public static AuthorizationVerificationStatusEnum fromString(String text) {
        for (AuthorizationVerificationStatusEnum status : AuthorizationVerificationStatusEnum.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static List<String> toStringList(List<AuthorizationVerificationStatusEnum> created) {

        List<String> status = new ArrayList<>();
        for(AuthorizationVerificationStatusEnum canvassingStatusEnum : created){
            status.add(canvassingStatusEnum.getText());
        }
        return status;
    }
}
