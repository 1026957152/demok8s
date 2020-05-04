package com.coalvalue.employee.enumType;

/**
 * Created by silence on 2016/3/31.
 */
public enum EmployeeStatusEnum {

    LOCKED("Locked","Locked",1,"Locked"),

    UNACTIVATED("Unactivated","Unactivated", 5,"Unactivated"),
    ACTIVE("Active","Active",1,"Active"),
    Terminated ("Terminated","Active",1,"Active"),
    INITIAL("INITIAL","INITIAL", 5,"INITIAL"),

    WaitingBinding  ("WaitingBinding","WaitingBinding",1,"WaitingBinding"),

;



    private final String statusText;
    private final String displayText;

    private final Integer id;
    private final String helpMessage;
    private String tipsMessage;


    public String getDisplayText() {
        return displayText;
    }

    private EmployeeStatusEnum(String statusText, String displayText, Integer id, String helpMessage) {
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




    public static EmployeeStatusEnum fromString(String text) {
        for (EmployeeStatusEnum status : EmployeeStatusEnum.values()) {
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
