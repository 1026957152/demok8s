package com.coalvalue.employee.domain.json;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Map;

public class MessageTemplateEventJson {

    /** Id of the order filed */
   public String Phone;
    /** Totla number of items in the order */
    public String Type;
    public String Behavior;
    ;     // 用户行为, 包括("pv", "buy", "cart", "fav")
    public Long Timestamp;
    private Map content;

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

    public void setContent(Map content) {
        this.content = content;
    }

    public Map getContent() {
        return content;
    }
}
