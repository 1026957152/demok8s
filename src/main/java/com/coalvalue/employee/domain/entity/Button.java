package com.coalvalue.employee.domain.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Entity
@Table(name = "button")
public class Button extends BaseDomain {

    @Column(name = "MENU_ID")
    private Integer menuId;

    @Column(name = "BUTTON_NAME")
    private String buttonName;

    @Column(name = "BUTTON_SEQ")
    private Integer buttonSeq;

    @Column(name = "BUTTON_HASH")
    private String buttonHash;

    @Column(name = "BUTTON_DESC")
    private String buttonDesc;

    public Button() {
    }

    public Integer getMenuId() {
        return menuId;
    }

    public String getButtonName() {
        return buttonName;
    }

    public Integer getButtonSeq() {
        return buttonSeq;
    }

    public String getButtonHash() {
        return buttonHash;
    }

    public String getButtonDesc() {
        return buttonDesc;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public void setButtonSeq(Integer buttonSeq) {
        this.buttonSeq = buttonSeq;
    }

    public void setButtonHash(String buttonHash) {
        this.buttonHash = buttonHash;
    }

    public void setButtonDesc(String buttonDesc) {
        this.buttonDesc = buttonDesc;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
