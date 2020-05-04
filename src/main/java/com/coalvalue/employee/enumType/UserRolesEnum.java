package com.coalvalue.employee.enumType;

import com.coalvalue.employee.configuration.CommonConstant;

//import com.coalvalue.weixin.robot.service.ContextStateEnum;

/**
 * Created by silence yuan on 2015/8/18.
 */
public enum UserRolesEnum {



    USER_ROLE_SELLER (CommonConstant.USER_ROLE_SELLER,"卖方", CommonConstant.ROLE_ID_SELLER,"采购方到合同约定地点自提货物"),

    USER_ROLE_BUYER (CommonConstant.USER_ROLE_BUYER,"买方", CommonConstant.ROLE_ID_BUYER,"供货方负责将货物送达指定地点"),
    USER_ROLE_BUYER_CONSIGNEE (CommonConstant.USER_ROLE_BUYER_CONSIGNEE,"买方收货人", CommonConstant.ROLE_ID_BUYER_CONSIGNEE,"供货方负责将货物送达指定地点"),


    USER_ROLE_SELLER_DELIVER (CommonConstant.USER_ROLE_SELLER_DELIVER,"发货员", CommonConstant.ROLE_ID_SELLDELIVERY,"采购方到合同约定地点自提货物"),

    USER_ROLE_BROKER (CommonConstant.USER_ROLE_BROKER,"卖方", CommonConstant.ROLE_ID_BROKER_USER,"采购方到合同约定地点自提货物"),



    USER_ROLE_DRIVER (CommonConstant.USER_ROLE_DRIVER,"司机", 5,"供货方负责将货物送达指定地点"),

    USER_ROLE_LOGISTICS (CommonConstant.USER_ROLE_LOGISTICS,"物流", CommonConstant.ROLE_ID_LOGISTICS,"采购方到合同约定地点自提货物"),
    USER_TYPE_BROKER(CommonConstant.USER_ROLE_BROKER,"中介商",1,"采购方到合同约定地点自提货物"),
    USER_ROLE_BROKER_DELIVER(CommonConstant.USER_ROLE_SELLER_DELIVER, "中介商发货员",1,"采购方到合同约定地点自提货物"),


    USER_ROLE_GONVERMENT(CommonConstant.USER_ROLE_GONVERMENT, "政府", CommonConstant.ROLE_ID_GONVERMENT_USER, "采购方到合同约定地点自提货物"),
    USER_ROLE_COALPIT(CommonConstant.USER_ROLE_COALPIT,"煤矿", CommonConstant.ROLE_ID_COALPIT_USER,"煤矿"),
    USER_ROLE_REGISTERED_USER(CommonConstant.ROLE_REGISTERED_USER,"注册用户", CommonConstant.ROLE_ID_REGISTE_USER,"煤矿"),
    USER_ROLE_COALPIT_DELIVER (CommonConstant.USER_ROLE_COALPIT_DELIVER,"煤矿发货员", CommonConstant.ROLE_ID_COALPIT_DELIVER,"采购方到合同约定地点自提货物"),
    USER_ROLE_ADMIN (CommonConstant.USER_ROLE_COMPANY_ADMIN,"公司管理员",1,"公司管理员"),
    ROLE_COMPANY_USER(CommonConstant.USER_ROLE_COMPANY_USER,"公司员工",1,"公司员工");


//take delivery of the goods on time



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

    private UserRolesEnum(String statusText, String displayText, Integer id, String helpMessage) {
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




    public static UserRolesEnum fromString(String text) {
        for (UserRolesEnum status : UserRolesEnum.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
