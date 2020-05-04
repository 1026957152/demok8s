package com.coalvalue.employee.enumType;


/**
 * Created by silence on 2016/1/18.
 */
public enum AuthenticationTypeEnum {



    公司信息认证 ("公司信息未完善","公司信息未完善", 2,""),




    个人信息认证 ("个人信息认证","个人信息认证",3,""),

    个人手机认证 ("个人手机认证","个人手机认证", 2,"") ;// 请求结算



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

    private AuthenticationTypeEnum(String statusText, String displayText, Integer id, String helpMessage) {
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


    public static AuthenticationTypeEnum fromString(String text) {
        for (AuthenticationTypeEnum status : AuthenticationTypeEnum.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
