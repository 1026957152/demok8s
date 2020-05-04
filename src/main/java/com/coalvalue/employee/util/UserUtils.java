package com.coalvalue.employee.util;

/**
 * Created by Administrator on 2015/10/7.
 */

import com.coalvalue.employee.configuration.CommonConstant;
import com.coalvalue.employee.domain.entity.Person;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.enumType.UserRolesEnum;

import java.util.Calendar;

public class UserUtils {
    private static final long ONE_MINUTE = 60;
    private static final long ONE_HOUR = 3600;
    private static final long ONE_DAY = 86400;
    private static final long ONE_MONTH = 2592000;
    private static final long ONE_YEAR = 31104000;

    public static Calendar calendar = Calendar.getInstance();


    public static String getFulName(User user){

        if(user.getPerson() != null){
            if(user.getPerson().getFamilyName() != null && user.getPerson().getGivenName() != null){
                return user.getPerson().getFamilyName() + user.getPerson().getGivenName();
            }
        }else {
            System.out.println(" person is nun null null null null ");
        }

        return user.getEmailAddress();

    }

    public static String getUserType(User user){



        System.out.println(" user roles is:"+ user.getUserRoles().toString());
        if(user.getUserRoles().contains(CommonConstant.USER_ROLE_SELLER)){
            return "供应商";
        }
        if(user.getUserRoles().contains(CommonConstant.USER_ROLE_BUYER)){
            return "需求商";
        }
        if(user.getUserRoles().contains(CommonConstant.USER_ROLE_SELLER_DELIVER)){
            return "发货员";
        }
        if(user.getUserRoles().contains(CommonConstant.USER_ROLE_DRIVER)){
            return "司机";
        }
        if(user.getUserRoles().contains(CommonConstant.USER_ROLE_Consignee)){
            return "收货员";
        }
        if(user.getUserRoles().contains(CommonConstant.USER_ROLE_WAREHOUSE)){
            return "仓库";
        }
        if(user.getUserRoles().contains(CommonConstant.USER_ROLE_LOGISTICS)){
            return "物流公司";
        }
        if(user.getUserRoles().contains(UserRolesEnum.USER_ROLE_BROKER.getText())){
            return UserRolesEnum.USER_TYPE_BROKER.getDisplayText();
        }
        if(user.getUserRoles().contains(UserRolesEnum.USER_ROLE_COALPIT.getText())){
            return UserRolesEnum.USER_ROLE_COALPIT.getDisplayText();
        }

        return "未知用户类型";
    }

    public static String getName(Person supplier, String formal) {

        String name = null;
        if(formal.equals(CommonConstant.NAME_formal)){
            if(supplier.getFamilyName() != null){
                name = supplier.getFamilyName() +"师傅";

            }else if(supplier.getRealName() !=null){
                name = supplier.getRealName();
            }else {
                name = supplier.getNickName();
            }
        }

        if(formal.equals(CommonConstant.NAME_informal)){
            name = supplier.getNickName();

        }


        return name;
    }
}