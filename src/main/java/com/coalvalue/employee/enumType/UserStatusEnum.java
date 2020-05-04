package com.coalvalue.employee.enumType;

import com.coalvalue.employee.configuration.CommonConstant;

/**
 * Created by silence on 2016/3/31.
 */
public enum UserStatusEnum {

    USER_STATUS_LOCKED (CommonConstant.USER_STATUS_LOCKED,"Locked",1,"Locked"),

    USER_STATUS_UNACTIVATED ("Unactivated","Unactivated", 5,"Unactivated"),
    USER_STATUS_ACTIVE (CommonConstant.USER_STATUS_ACTIVE,"Active",1,"Active"),

;



    private final String statusText;
    private final String displayText;

    private final Integer id;
    private final String helpMessage;
    private String tipsMessage;


    public String getDisplayText() {
        return displayText;
    }

    private UserStatusEnum(String statusText, String displayText, Integer id, String helpMessage) {
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




    public static UserStatusEnum fromString(String text) {
        for (UserStatusEnum status : UserStatusEnum.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }
    public String getTipsMessage() {
        return tipsMessage;
    }

    public void setTipsMessage(String tipsMessage) {
        this.tipsMessage = tipsMessage;
    }

}
