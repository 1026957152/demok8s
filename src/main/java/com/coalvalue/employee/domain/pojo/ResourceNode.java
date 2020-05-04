package com.coalvalue.employee.domain.pojo;

import com.coalvalue.employee.domain.entity.Button;
import com.coalvalue.employee.domain.entity.Menu;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

/**
 * Created by Peter Xu on 02/05/2015.
 */
public class ResourceNode {

    private List<Menu> menus;

    private List<Button> buttons;

    private List<Boolean> menuStatus;

    private List<Boolean> buttonStatus;

    public ResourceNode() {
    }

    public ResourceNode(List<Menu> menus, List<Button> buttons, List<Boolean> menuStatus, List<Boolean> buttonStatus) {
        this.menus = menus;
        this.buttons = buttons;
        this.menuStatus = menuStatus;
        this.buttonStatus = buttonStatus;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public List<Boolean> getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(List<Boolean> menuStatus) {
        this.menuStatus = menuStatus;
    }

    public List<Boolean> getButtonStatus() {
        return buttonStatus;
    }

    public void setButtonStatus(List<Boolean> buttonStatus) {
        this.buttonStatus = buttonStatus;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
