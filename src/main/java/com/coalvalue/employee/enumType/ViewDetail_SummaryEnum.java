package com.coalvalue.employee.enumType;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by silence on 2016/1/18.
 */
public enum ViewDetail_SummaryEnum {


    detail ("detail", "detail",2,""),
    summury ("summury", "summury",2,""),

    admin ("admin","admin", 2,""),
    front_general ("front_general","front_general", 2,""),
    front_general_report("front_general_report","front_general_report", 2,"")
    ,    dashbord_detail ("dashbord_detail", "dashbord_detail",2,""),
    search ("search","search", 2,""),

    configuration ("configuration","configuration", 2,""),




    ORDER_summury_ROLE_BUYER ("ORDER_summury_ROLE_BUYER","ORDER_summury_ROLE_BUYER", 2,""),
    ORDER_summury_ROLE_BROKER ("ORDER_summury_ROLE_BROKER","ORDER_summury_ROLE_BROKER", 2,""),

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

    private ViewDetail_SummaryEnum(String statusText, String displayText, Integer id, String helpMessage) {
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


    public static ViewDetail_SummaryEnum fromString(String text) {
        for (ViewDetail_SummaryEnum status : ViewDetail_SummaryEnum.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static List<String> toStringList(List<ViewDetail_SummaryEnum> created) {

        List<String> status = new ArrayList<>();
        for(ViewDetail_SummaryEnum canvassingStatusEnum : created){
            status.add(canvassingStatusEnum.getText());
        }
        return status;
    }
}
