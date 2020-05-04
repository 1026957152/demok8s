package com.coalvalue.employee.domain.pojo;


import com.coalvalue.employee.domain.entity.Menu;
import com.coalvalue.employee.domain.entity.MenuNode;
import com.coalvalue.employee.domain.entity.User;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.security.interfaces.RSAPrivateKey;
import java.util.Set;

/**
 * Created by Peter Xu on 03/12/2015.
 */
public class SessionContext implements Serializable{

    private Integer userId;

    private String userName;

    private String userType;

    private String userStatus;

    private Integer personId;

    private String realName;

    private Integer companyId;

    private String companyName;

    private MenuNode userMenus;

    private UserItems userItems;

    private Set<String> userBtns;

    private Set<String> userRoles;

    private Boolean buyerFlag = false;

    private Boolean sellerFlag = false;





    private Boolean logisticsFlag = false;


    private Integer sessionHistoryId;

    private RSAPrivateKey privateKeyStr;

    private String checkCode;


    private User user;



    private Integer messageCount;


    private String terminalSource;

    public String getTerminalSource() {
        return terminalSource;
    }

    public void setTerminalSource(String terminalSource) {
        this.terminalSource = terminalSource;
    }

    public Integer getMessageCount() {
        if(messageCount == null) {
            messageCount = -10000;
        }
        return messageCount;
    }

    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    public SessionContext() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public MenuNode getUserMenus() {

        getSubMenus(userMenus,userItems);
        return userMenus;
    }


    private MenuNode getSubMenus( MenuNode menuNode, UserItems userItems) {
        MenuNode childs = null;
        for (MenuNode childMenuNode : menuNode.getChilds()) {
            Menu menu = childMenuNode.getCurrent();
            if ("我的资源单".equals(menu.getMenuName())) {
                menu.setUpdate(userItems.isUpdateFlag());
            }
            if ("交易管理".equals(menu.getMenuName())) {
                menu.setUpdate(userItems.isTradingFlag());
            }
            if ("物流管理".equals(menu.getMenuName())) {
                menu.setUpdate(userItems.isCapacityFlag());
            }
            if ("购销合同管理".equals(menu.getMenuName())) {
                menu.setShowCount(true);
                menu.setCount((int)userItems.getTradingDealCount());
            }
            if ("订单".equals(menu.getMenuName())) {
                menu.setShowCount(true);
                menu.setCount((int)userItems.getTradingOrderCount());
            }
            if ("合作申请".equals(menu.getMenuName())) {
                menu.setShowCount(true);
                menu.setCount((int)userItems.getTradingOrderCount());
            }
            if ("私营运力应征申请".equals(menu.getMenuName())) {
                menu.setShowCount(true);
                menu.setCount((int)userItems.getCanvassingCount());
            }
            if ("关注动态".equals(menu.getMenuName())) {
                menu.setShowCount(true);
                menu.setCount((int)userItems.getUpdateCount());
            }
            childs = getSubMenus(childMenuNode, userItems);
        }
        return childs;
    }


    public void setUserMenus(MenuNode userMenus) {
        this.userMenus = userMenus;
    }

    public Set<String> getUserBtns() {
        return userBtns;
    }

    public void setUserBtns(Set<String> userBtns) {
        this.userBtns = userBtns;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Set<String> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<String> userRoles) {
        this.userRoles = userRoles;
        if (userRoles != null) {
            if (userRoles.contains("buyer")) {
                setBuyerFlag(true);
            }
            if (userRoles.contains("seller")) {
                setSellerFlag(true);
            }
            if (userRoles.contains("logistics")) {
                setLogisticsFlag(true);
            }
        }
    }

    private void setLogisticsFlag(Boolean logisticsFlag) {
        this.logisticsFlag = logisticsFlag;

    }

    public Boolean getLogisticsFlag() {
        return logisticsFlag;
    }

    public Integer getSessionHistoryId() {
        return sessionHistoryId;
    }

    public void setSessionHistoryId(Integer sessionHistoryId) {
        this.sessionHistoryId = sessionHistoryId;
    }

    public Boolean getBuyerFlag() {
        return buyerFlag;
    }

    public void setBuyerFlag(Boolean buyerFlag) {
        this.buyerFlag = buyerFlag;
    }

    public Boolean getSellerFlag() {
        return sellerFlag;
    }

    public void setSellerFlag(Boolean sellerFlag) {
        this.sellerFlag = sellerFlag;
    }

    public RSAPrivateKey getPrivateKeyStr() {
        return privateKeyStr;
    }

    public void setPrivateKeyStr(RSAPrivateKey privateKeyStr) {
        this.privateKeyStr = privateKeyStr;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserItems getUserItems() {
        return userItems;
    }

    public void setUserItems(UserItems userItems) {
        this.userItems = userItems;
    }
}
