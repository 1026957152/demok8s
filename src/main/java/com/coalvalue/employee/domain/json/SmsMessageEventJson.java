package com.coalvalue.employee.domain.json;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SmsMessageEventJson {

    /** Id of the order filed */
   public String Phone;
    /** Totla number of items in the order */
    public String Type;
    /** Id of the customer */
    public String Text;
    public String Behavior;
    ;     // 用户行为, 包括("pv", "buy", "cart", "fav")
    public Long Timestamp;

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getBehavior() {
        return Behavior;
    }

    public void setBehavior(String behavior) {
        Behavior = behavior;
    }

    public Long getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Long timestamp) {
        Timestamp = timestamp;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
