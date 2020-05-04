package com.coalvalue.employee.domain.dto;

/**
 * Created by Administrator on 2015/9/22.
 */
public class DashboardInfo {

    private Integer goupbuyInCraftCount;

    private Integer goupbuyInPendingCount;

    private Integer goupbuyInReleaseCount;

    private Integer dealInSendPendingCount;

    private Integer dealInRecievePendingCount;

    private Integer orderInPendingCheckCount;

    private Integer orderInShippingCount;

    private Integer shipmentInNoArrivalCount;

    public Integer getShipmentInNoArrivalCount() {
        return shipmentInNoArrivalCount;
    }

    public void setShipmentInNoArrivalCount(Integer shipmentInNoArrivalCount) {
        this.shipmentInNoArrivalCount = shipmentInNoArrivalCount;
    }

    public Integer getGoupbuyInCraftCount() {
        return goupbuyInCraftCount;
    }

    public void setGoupbuyInCraftCount(Integer goupbuyInCraftCount) {
        this.goupbuyInCraftCount = goupbuyInCraftCount;
    }

    public Integer getGoupbuyInPendingCount() {
        return goupbuyInPendingCount;
    }

    public void setGoupbuyInPendingCount(Integer goupbuyInPendingCount) {
        this.goupbuyInPendingCount = goupbuyInPendingCount;
    }

    public Integer getGoupbuyInReleaseCount() {
        return goupbuyInReleaseCount;
    }

    public void setGoupbuyInReleaseCount(Integer goupbuyInReleaseCount) {
        this.goupbuyInReleaseCount = goupbuyInReleaseCount;
    }

    public Integer getDealInSendPendingCount() {
        return dealInSendPendingCount;
    }

    public void setDealInSendPendingCount(Integer dealInSendPendingCount) {
        this.dealInSendPendingCount = dealInSendPendingCount;
    }

    public Integer getDealInRecievePendingCount() {
        return dealInRecievePendingCount;
    }

    public void setDealInRecievePendingCount(Integer dealInRecievePendingCount) {
        this.dealInRecievePendingCount = dealInRecievePendingCount;
    }

    public Integer getOrderInPendingCheckCount() {
        return orderInPendingCheckCount;
    }

    public void setOrderInPendingCheckCount(Integer orderInPendingCheckCount) {
        this.orderInPendingCheckCount = orderInPendingCheckCount;
    }

    public Integer getOrderInShippingCount() {
        return orderInShippingCount;
    }

    public void setOrderInShippingCount(Integer orderInShippingCount) {
        this.orderInShippingCount = orderInShippingCount;
    }
}
