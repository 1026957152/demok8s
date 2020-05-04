package com.coalvalue.employee.domain.entity;

import com.coalvalue.employee.configuration.CommonConstant;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yuan zhao  on 08/31/2015.
 */
@Entity
@Table(name = "user_setting")
public class UserSetting  {



    @Id
    @Column(name="user_id")
/*    @GenericGenerator(name="foreignKey", strategy="foreign", parameters=@Parameter(name="property", value="user"))
    @GeneratedValue(generator="foreignKey", strategy=GenerationType.IDENTITY)*/
    private Integer userId;
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
/*

    @OneToOne(cascade = CascadeType.ALL, optional = true,fetch = FetchType.LAZY)
 //   @JoinColumn(name = "user_id",referencedColumnName="id", unique = true)
    @PrimaryKeyJoinColumn(name="user_id", referencedColumnName="id")
    private User user;
*/


    @Column(name = "order_create_notify")
    private Boolean orderCreateNotify;

    @Column(name = "order_approve_notify")
    private Boolean orderApproveNotify;

    @Column(name = "request_trade_notify")
    private Boolean requestTradeNotify;

    @Column(name = "group_buy_approve_notify")
    private Boolean groupBuyApproveNotify;

    @Column(name = "notification_mode")
    private String notificationMode;

    @Column(name = "phone_status")
    private String phoneStatus;

    @Column(name = "mail_status")
    private String mailStatus;



    public String getMailStatus() {
        return mailStatus;
    }

    public void setMailStatus(String mailStatus) {
        this.mailStatus = mailStatus;
    }

    public String getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(String phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    @Transient
    private Set<String> uneditable = new HashSet<String>()
    {{

            this.add("person_certification");
            this.add("company_certification");
            this.add("trade_password");

        }};

/*    @Transient
    private Set<String> uneditable = new HashSet<String>()
    {{
            if(getPhoneStatus().equals(CommonConstant.USER_AUTH_PHONE_STATUS_AUTHED)) {
                this.add("email_binding");
            }
            if(getMailStatus().equals(CommonConstant.USER_AUTH_MAIL_STATUS_AUTHED)) {
                this.add("mobile_phone_binding");
            }
            this.add("person_certification");
            this.add("company_certification");
            this.add("trade_password");

        }};*/

    public Set<String> getUneditable(){

        return  new HashSet<String>()
        {{
                if(getPhoneStatus() == null || getPhoneStatus().equals(CommonConstant.USER_AUTH_PHONE_STATUS_AUTHED)) {
                    this.add("email_binding");
                }
                if(getMailStatus() == null || getMailStatus().equals(CommonConstant.USER_AUTH_MAIL_STATUS_AUTHED)) {
                    this.add("mobile_phone_binding");
                }
                this.add("person_certification");
                this.add("company_certification");
                this.add("trade_password");

            }};



    }

    public UserSetting() {
    }

    public Boolean getOrderCreateNotify() {
        return orderCreateNotify;
    }

    public Boolean getOrderApproveNotify() {
        return orderApproveNotify;
    }

    public Boolean getRequestTradeNotify() {
        return requestTradeNotify;
    }

    public Boolean getGroupBuyApproveNotify() {
        return groupBuyApproveNotify;
    }

    public String getNotificationMode() {
        return notificationMode;
    }


    public void setOrderCreateNotify(Boolean orderCreateNotify) {
        this.orderCreateNotify = orderCreateNotify;
    }

    public void setOrderApproveNotify(Boolean orderApproveNotify) {
        this.orderApproveNotify = orderApproveNotify;
    }

    public void setRequestTradeNotify(Boolean requestTradeNotify) {
        this.requestTradeNotify = requestTradeNotify;
    }

    public void setGroupBuyApproveNotify(Boolean groupBuyApproveNotify) {
        this.groupBuyApproveNotify = groupBuyApproveNotify;
    }

    public void setNotificationMode(String notificationMode) {
        this.notificationMode = notificationMode;
    }


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
