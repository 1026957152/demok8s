package com.coalvalue.employee.domain.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Entity
@Table(name = "menu")
public class Menu extends BaseDomain {

    @Column(name = "PARENT_ID")
    private Integer parentId;

    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_SEQ")
    private Integer menuSeq;

    @Column(name = "MENU_DESC")
    private String menuDesc;

    @Column(name = "MENU_URL")
    private String menuUrl;

    @Column(name = "MENU_SHOW")
    private Boolean menuShow;

    @Column(name = "IS_LEAF")
    private Boolean isLeaf;


    @javax.persistence.Transient
    private Boolean showCount = false;
    @javax.persistence.Transient
    private boolean update;

    public Boolean getShowCount() {
        return showCount;
    }

    public void setShowCount(Boolean showCount) {
        this.showCount = showCount;
    }

    @javax.persistence.Transient
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Menu() {
    }

    public Integer getParentId() {
        return parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public Integer getMenuSeq() {
        return menuSeq;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public Boolean getMenuShow() {
        return menuShow;
    }

    public Boolean getLeaf() {
        return isLeaf;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuSeq(Integer menuSeq) {
        this.menuSeq = menuSeq;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public void setMenuShow(Boolean menuShow) {
        this.menuShow = menuShow;
    }

    public void setLeaf(Boolean leaf) {
        isLeaf = leaf;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isUpdate() {
        return update;
    }
}
