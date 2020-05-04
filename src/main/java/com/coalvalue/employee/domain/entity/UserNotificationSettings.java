package com.coalvalue.employee.domain.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yuan zhao  on 08/10/2015.
 */

@Entity

@Table(name = "user_notification_settings")

public class UserNotificationSettings extends BaseDomain {

    @Column(name = "page_title")
    private String pageTitle;

    @Column(name = "source")
    private Integer source;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "content")
    private String content;

    public UserNotificationSettings() {
    }


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

;
}
