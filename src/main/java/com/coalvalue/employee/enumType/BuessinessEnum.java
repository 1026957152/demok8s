package com.coalvalue.employee.enumType;




import com.coalvalue.employee.domain.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silence on 2016/1/18.
 */
public enum BuessinessEnum {



    生产业务 ("producer","生产业务", 2,""),




    物流业务 ("logistics","物流业务",3,""),

    贸易业务 ("trader","贸易业务", 2,"") ,// 请求结算
    分销业务 ("distributor","分销业务", 2,"") ;// 请求结算



    private final String statusText;
    private final String displayText;
    private final Integer id;

    private String helpMessage;

    public static String display(String name) {
        return BuessinessEnum.fromString(name).getDisplayText();
    }

    public String getHelpMessage() {
        return helpMessage;
    }

    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    public String getDisplayText() {
        return displayText;
    }

    private BuessinessEnum(String statusText, String displayText, Integer id, String helpMessage) {
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


    public static BuessinessEnum fromString(String text) {
        for (BuessinessEnum status : BuessinessEnum.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static List<String> toStringList(List<BuessinessEnum> created) {
        List<String> status = new ArrayList<>();
        for(BuessinessEnum canvassingStatusEnum : created){
            status.add(canvassingStatusEnum.getText());
        }
        return status;
    }

    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for(BuessinessEnum status : BuessinessEnum.values()) {
            ListItem element = new ListItem(status.getText(), status.getDisplayText());

            list.add(element);
        }
        return list;

    }
    public static List<ListItem> retriveTypese(String statusText) {

        List<ListItem> list = new ArrayList<ListItem>();
        for(BuessinessEnum status : BuessinessEnum.values()) {
            ListItem element = new ListItem(status.getText(), status.getDisplayText());
            if (status.getText().equals(statusText)){
                element.setSelected(true);
            }
            list.add(element);
        }
        return list;

    }

    public static List<ListItem> retriveTypese(List<BuessinessEnum> statusText) {

        List<ListItem> list = new ArrayList<ListItem>();
        for(BuessinessEnum status : statusText) {
            ListItem element = new ListItem(status.getText(), status.getDisplayText());
            if (status.getText().equals(statusText)){
                element.setSelected(true);
            }
            list.add(element);
        }
        return list;

    }
}
