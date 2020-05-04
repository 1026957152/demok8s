package com.coalvalue.employee.domain.pojo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by silence on 2016/1/16.
 */
public class UserItems implements Serializable{


    private Integer messageCount;

    private long shopCartItemCount;
    private long updateCount;
    private boolean tradingFlag;

    private boolean updateFlag;

    private long tradingDealCount;
    private long tradingOrderCount;
    private boolean capacityFlag;
    private int capacityCount;
    private long canvassingCount;
    private long pendingCanvassingCount;
    private Date lastLoginDate;
    private String lastLoginIp;

    public Integer getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    public long getShopCartItemCount() {
        return shopCartItemCount;
    }

    public void setShopCartItemCount(long shopCartItemCount) {
        this.shopCartItemCount = shopCartItemCount;
    }

    public void setUpdateCount(long updateCount) {
        this.updateCount = updateCount;
    }

    public long getUpdateCount() {
        return updateCount;
    }

    public void setTradingFlag(boolean tradingFlag) {
        this.tradingFlag = tradingFlag;
    }

    public boolean isTradingFlag() {
        return tradingFlag;
    }

    public void setTradingDealCount(long tradingDealCount) {
        this.tradingDealCount = tradingDealCount;
    }

    public long getTradingDealCount() {
        return tradingDealCount;
    }

    public void setTradingOrderCount(long tradingOrderCount) {
        this.tradingOrderCount = tradingOrderCount;
    }

    public long getTradingOrderCount() {
        return tradingOrderCount;
    }

    public void setCapacityFlag(boolean capacityFlag) {
        this.capacityFlag = capacityFlag;
    }

    public boolean isCapacityFlag() {
        return capacityFlag;
    }

    public void setCapacityCount(int capacityCount) {
        this.capacityCount = capacityCount;
    }

    public int getCapacityCount() {
        return capacityCount;
    }

    public void setCanvassingCount(long canvassingCount) {
        this.canvassingCount = canvassingCount;
    }

    public long getCanvassingCount() {
        return -10;
    }

    public long getPendingCanvassingCount() {

        return -10;
    }

    public void setPendingCanvassingCount(long pendingCanvassingCount) {
        this.pendingCanvassingCount = pendingCanvassingCount;
    }

    public boolean isUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(boolean updateFlag) {
        this.updateFlag = updateFlag;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }




    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
