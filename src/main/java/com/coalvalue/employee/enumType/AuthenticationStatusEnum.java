package com.coalvalue.employee.enumType;


/**
 * Created by silence on 2016/1/18.
 */
public enum AuthenticationStatusEnum {



    completed ("completed","完成", 2,""),




    unCompleted ("unCompleted","未完成",3,""),

    pending ("pending","申请中", 2,"") ;// 请求结算



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

    private AuthenticationStatusEnum(String statusText, String displayText, Integer id, String helpMessage) {
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


    public static AuthenticationStatusEnum fromString(String text) {
        for (AuthenticationStatusEnum status : AuthenticationStatusEnum.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
