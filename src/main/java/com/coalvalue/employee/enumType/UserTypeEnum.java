package com.coalvalue.employee.enumType;

import com.coalvalue.employee.configuration.CommonConstant;

/**
 * Created by silence on 2016/3/31.
 */
public enum UserTypeEnum {


    买家 (CommonConstant.USER_TYPE_BUYER,"买家",1,"买家"),

    卖家 (CommonConstant.USER_TYPE_SELLER,"卖家", 5,"卖家，卖家，卖家。"),
    买家收货人 (CommonConstant.USER_TYPE_BUYER_CONSIGNEE,"买家收货人",1,"买家收货人"),


    仓库 (CommonConstant.USER_TYPE_WAREHOUSE,"仓库",1,"仓库"),

    物流信息部 (CommonConstant.USER_TYPE_LOGISTICS,"物流信息部", 5,"物流信息部，物流信息部，物流信息部。"),
    物流信息部_业务人员 (CommonConstant.USER_TYPE_LOGISTICS_Sales_Staff,"物流信息部_业务人员", 5,"物流信息部_业务人员"),

    个人客户 (CommonConstant.USER_TYPE_PERSONAL,"个人客户",1,"个人客户"),

    私人运力 (CommonConstant.USER_TYPE_DRIVER,"私人运力", 5,"私人运力息部，私人运力。"),

    中介商 (CommonConstant.USER_TYPE_BROKER,"经销商", 5,"经销商，可发布 煤炭供给，运力需求。"),
    中介商发货员 (CommonConstant.USER_TYPE_SELLER_DELIVER,"经销商发货员", 5,"经销商发货员，可发布 煤炭供给，运力需求。"),

    政府 (CommonConstant.USER_TYPE_GONVERMENT,"政府", 5,"政府，增值税管理者。"),

    煤矿 (CommonConstant.USER_TYPE_COALPIT,"煤矿", 5,"煤矿。"),
    inspection (CommonConstant.USER_TYPE_INSPECTION,"inspection", 5,"inspection。"),


    煤矿发货员 (CommonConstant.USER_TYPE_COALPIT_DELIVER,"煤矿发货员", 5,"煤矿发货员。"),
    卖家发货员 (CommonConstant.USER_TYPE_SELLER_DELIVER,"卖家发货员", 5,"卖家发货员。"),
    买家收货员 (CommonConstant.USER_TYPE_COALPIT_DELIVER,"买家收货员", 5,"买家收货员。"),
    Anonymous(CommonConstant.USER_TYPE_Anonymous,"未知", 5,"未知。"),
    装车员 (CommonConstant.USER_TYPE_COALPIT_porter,"装车员", 5,"装车员。"),

    管理者 (CommonConstant.USER_TYPE_ADMIN,"公司管理者", 5,"公司管理者。"),

    ;



    private final String statusText;
    private final String displayText;

    private final Integer id;
    private final String helpMessage;
    private String tipsMessage;


    public String getDisplayText() {
        return displayText;
    }

    private UserTypeEnum(String statusText, String displayText, Integer id, String helpMessage) {
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


/*    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (UserTypeEnum status : UserTypeEnum.values()) {
            ListItem element = new ListItem(status.getText(), status.getDisplayText(), status.getTipsMessage());
            list.add(element);
        }

        return list;

    }*/

    public static UserTypeEnum fromString(String text) {
        for (UserTypeEnum status : UserTypeEnum.values()) {
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
/*
    public static List<ListItem> retriveTypese(String scene) {
        List<ListItem> list = new ArrayList<ListItem>();

        if(ContextStateEnum.CONTEXT_SCENE_register_general.name().equals(scene)){
            ListItem element = new ListItem(私人运力.getText(), 私人运力.getDisplayText(), 私人运力.getTipsMessage());
            list.add(element);

            element = new ListItem(买家.getText(), 买家.getDisplayText(), 买家.getTipsMessage());
            list.add(element);
            element = new ListItem(煤矿.getText(), 煤矿.getDisplayText(), 煤矿.getTipsMessage());
            list.add(element);
            element = new ListItem(中介商.getText(), 中介商.getDisplayText(), 中介商.getTipsMessage());
            list.add(element);
            element = new ListItem(物流信息部.getText(), 物流信息部.getDisplayText(), 物流信息部.getTipsMessage());
            list.add(element);
        }else
        if(ContextStateEnum.CONTEXT_SCENE_register_hengshan.name().equals(scene)){
            ListItem element = new ListItem(买家收货员.getText(), 买家收货员.getDisplayText(), 买家收货员.getTipsMessage());
            list.add(element);

            element = new ListItem(买家.getText(), 买家.getDisplayText(), 买家.getTipsMessage());
            list.add(element);
            element = new ListItem(煤矿.getText(), 煤矿.getDisplayText(), 煤矿.getTipsMessage());
            list.add(element);
        }else

        if(ContextStateEnum.CONTEXT_SCENE_buyer_create_company_users.name().equals(scene)){
            ListItem element = new ListItem(买家收货员.getText(), 买家收货员.getDisplayText(), 买家收货员.getTipsMessage());
            list.add(element);

            element = new ListItem(买家.getText(), 买家.getDisplayText(), 买家.getTipsMessage());
            list.add(element);
        }else
        if(ContextStateEnum.CONTEXT_SCENE_seller_create_company_users.name().equals(scene)){
            ListItem element = new ListItem(卖家发货员.getText(), 煤矿发货员.getDisplayText(), 煤矿发货员.getTipsMessage());
            list.add(element);

            element = new ListItem(卖家.getText(), 卖家.getDisplayText(), 卖家.getTipsMessage());
            list.add(element);
        }else

        if(ContextStateEnum.CONTEXT_SCENE_broker_create_company_users.name().equals(scene)){
            ListItem element = new ListItem(卖家发货员.getText(), 卖家发货员.getDisplayText(), 卖家发货员.getTipsMessage());
            list.add(element);

            element = new ListItem(中介商.getText(), 中介商.getDisplayText(), 中介商.getTipsMessage());
            list.add(element);
        }else
        if(ContextStateEnum.CONTEXT_SCENE_coalpit_create_company_users.name().equals(scene)){
            ListItem element = new ListItem(煤矿发货员.getText(), 煤矿发货员.getDisplayText(), 煤矿发货员.getTipsMessage());
            list.add(element);

            element = new ListItem(煤矿.getText(), 煤矿.getDisplayText(), 煤矿.getTipsMessage());
            list.add(element);
        }else

        if(ContextStateEnum.CONTEXT_SCENE_Anonymous_capacity_supply_create_account.name().equals(scene)){
            ListItem element = new ListItem(中介商.getText(), 中介商.getDisplayText(), 中介商.getTipsMessage());
            list.add(element);
            element = new ListItem(买家.getText(), 买家.getDisplayText(), 买家.getTipsMessage());
            list.add(element);
            element = new ListItem(物流信息部.getText(), 物流信息部.getDisplayText(), 物流信息部.getTipsMessage());
            list.add(element);
        }else


        if(ContextStateEnum.CONTEXT_SCENE_Anonymous_purchase_coalpromotion_broker_create_account.name().equals(scene)){
            ListItem element = new ListItem(中介商.getText(), 中介商.getDisplayText(), 中介商.getTipsMessage());
            list.add(element);
        }else

        if(ContextStateEnum.CONTEXT_SCENE_Anonymous_gonverment_create_account.name().equals(scene)){
            ListItem element = new ListItem(政府.getText(), 政府.getDisplayText(), 政府.getTipsMessage());
            list.add(element);
        }else


        if(ContextStateEnum.CONTEXT_SCENE_Anonymous_capacity_apply_canvass_action_scan_driver_create_account.name().equals(scene)){
            ListItem element = new ListItem(私人运力.getText(), 私人运力.getDisplayText(), 私人运力.getTipsMessage());
            list.add(element);
        }else
        if(ContextStateEnum.CONTEXT_SCENE_Anonymous_coalsupply_scan_broker_create_account.name().equals(scene)){
            ListItem element = new ListItem(中介商.getText(), 中介商.getDisplayText(), 中介商.getTipsMessage());
            list.add(element);
        }else
        if(ContextStateEnum.CONTEXT_SCENE_Anonymous_broker_create_account.name().equals(scene)){
            ListItem element = new ListItem(中介商.getText(), 中介商.getDisplayText(), 中介商.getTipsMessage());
            list.add(element);
        }else if(CommonConstant.SCENE_ARRIVAL_STORAGE_HAS_NO_ACCOUNT.equals(scene) || ContextStateEnum.CONTEXT_SCENE_Anonymous_driver_create_account.name().equals(scene)){
            ListItem element = new ListItem(私人运力.getText(), 私人运力.getDisplayText(), 私人运力.getTipsMessage());
            list.add(element);
        }else{
            for (UserTypeEnum status : UserTypeEnum.values()) {

                ListItem element = new ListItem(status.getText(), status.getDisplayText(), status.getTipsMessage());
               // list.add(element);
            }

            ListItem element = new ListItem(买家.getText(), 买家.getDisplayText(), 买家.getTipsMessage());
            list.add(element);
            element = new ListItem(卖家.getText(), 卖家.getDisplayText(), 卖家.getTipsMessage());
            list.add(element);
            element = new ListItem(物流信息部.getText(), 物流信息部.getDisplayText(), 物流信息部.getTipsMessage());
            list.add(element);
            element = new ListItem(私人运力.getText(), 私人运力.getDisplayText(), 私人运力.getTipsMessage());
            list.add(element);
            element = new ListItem(中介商.getText(), 中介商.getDisplayText(), 中介商.getTipsMessage());
            list.add(element);
            element = new ListItem(煤矿.getText(), 煤矿.getDisplayText(), 煤矿.getTipsMessage());
            list.add(element);




        }
        return list;
    }

    public static List<ListItem> retriveTypeseByCompanyType(String companyType) {


        List<ListItem> list = new ArrayList<ListItem>();


        if (CooperationTypeEnum.COALPIT.getText().equals(companyType)) {
            ListItem element = new ListItem(煤矿.getText(), 煤矿.getDisplayText(), 煤矿.getTipsMessage());
            list.add(element);
            element = new ListItem(煤矿发货员.getText(), 煤矿发货员.getDisplayText(), 煤矿发货员.getTipsMessage());

            list.add(element);



        }        if (CooperationTypeEnum.BROKER.getText().equals(companyType)) {
            ListItem element = new ListItem(中介商.getText(), 中介商.getDisplayText(), 中介商.getTipsMessage());
            list.add(element);
            element = new ListItem(中介商发货员.getText(), 中介商发货员.getDisplayText(), 中介商发货员.getTipsMessage());

            list.add(element);




        }else {
            for (UserRolesEnum status : UserRolesEnum.values()) {
                ListItem element = new ListItem(status.getText(), status.getDisplayText(), status.getHelpMessage());
                list.add(element);
            }


        }

        return list;
    }*/
}
