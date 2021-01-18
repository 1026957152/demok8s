package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_CD003_卡分户信息_ {


    已申请 ("01", "已申请",1,""),
    正常 ("11", "正常",2,""),
    卡未激活 ("21", "卡未激活",1,""),

    卡口头挂失 ("22", "卡口头挂失",1,""),
    卡书面挂失 ("23", "卡书面挂失",2,""),
    卡行政冻结 ("26", "卡行政冻结",1,""),
    卡系统冻结 ("27", "卡系统冻结",2,""),



    作废 ("31", "作废",1,""),
    解除关联 ("32", "解除关联",2,""),




;



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

    E_CD003_卡分户信息_(String statusText, String displayText, Integer id, String helpMessage) {
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




    public static E_CD003_卡分户信息_ fromString(String text) {
        for (E_CD003_卡分户信息_ status : E_CD003_卡分户信息_.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_CD003_卡分户信息_ fromInt(Integer text) {
        for (E_CD003_卡分户信息_ status : E_CD003_卡分户信息_.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
