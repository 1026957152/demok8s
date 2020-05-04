package com.coalvalue.employee.domain.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

public class DashboardDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private int CoalSuppliesCount;
    private int CoalDemandsCount;
    private int CompaniesCount;


    private int SellerCompaniesCount;
    private int BuyerCompaniesCount;
    private int LogisticsCompaniesCount;

    private int WarehouseCompaniesCount;
    private int InspectionCompaniesCount;

    private boolean isCertified;

    public boolean isCertified() {
        return isCertified;
    }

    public boolean getIsCertified() {
        return isCertified;
    }
    public void setCertified(boolean isCertified) {
        this.isCertified = isCertified;
    }

    public int getSellerCompaniesCount() {
        return SellerCompaniesCount;
    }

    public void setSellerCompaniesCount(int sellerCompaniesCount) {
        SellerCompaniesCount = sellerCompaniesCount;
    }

    public int getBuyerCompaniesCount() {
        return BuyerCompaniesCount;
    }

    public void setBuyerCompaniesCount(int buyerCompaniesCount) {
        BuyerCompaniesCount = buyerCompaniesCount;
    }

    public int getLogisticsCompaniesCount() {
        return LogisticsCompaniesCount;
    }

    public void setLogisticsCompaniesCount(int logisticsCompaniesCount) {
        LogisticsCompaniesCount = logisticsCompaniesCount;
    }

    public int getWarehouseCompaniesCount() {
        return WarehouseCompaniesCount;
    }

    public void setWarehouseCompaniesCount(int warehouseCompaniesCount) {
        WarehouseCompaniesCount = warehouseCompaniesCount;
    }

    public int getInspectionCompaniesCount() {
        return InspectionCompaniesCount;
    }

    public void setInspectionCompaniesCount(int inspectionCompaniesCount) {
        InspectionCompaniesCount = inspectionCompaniesCount;
    }

    private int activeGroupsCount;
    private int activeClientsCount;
    private int waitingForApprovalCoalPormostionsCount;
    private int loansInArrearsCount;
    private int loansToBePaidCurrentWeek;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCoalSuppliesCount() {
        return CoalSuppliesCount;
    }

    public void setCoalSuppliesCount(int coalSuppliesCount) {
        CoalSuppliesCount = coalSuppliesCount;
    }

    public int getCoalDemandsCount() {
        return CoalDemandsCount;
    }

    public void setCoalDemandsCount(int coalDemandsCount) {
        CoalDemandsCount = coalDemandsCount;
    }

    public int getCompaniesCount() {
        return CompaniesCount;
    }

    public void setCompaniesCount(int companiesCount) {
        CompaniesCount = companiesCount;
    }

    public int getActiveGroupsCount() {
        return activeGroupsCount;
    }

    public void setActiveGroupsCount(int activeGroupsCount) {
        this.activeGroupsCount = activeGroupsCount;
    }

    public int getActiveClientsCount() {
        return activeClientsCount;
    }

    public void setActiveClientsCount(int activeClientsCount) {
        this.activeClientsCount = activeClientsCount;
    }

    public int getWaitingForApprovalCoalPormostionsCount() {
        return waitingForApprovalCoalPormostionsCount;
    }

    public void setWaitingForApprovalCoalPormostionsCount(int waitingForApprovalCoalPormostionsCount) {
        this.waitingForApprovalCoalPormostionsCount = waitingForApprovalCoalPormostionsCount;
    }

    public int getLoansInArrearsCount() {
        return loansInArrearsCount;
    }

    public void setLoansInArrearsCount(int loansInArrearsCount) {
        this.loansInArrearsCount = loansInArrearsCount;
    }

    public int getLoansToBePaidCurrentWeek() {
        return loansToBePaidCurrentWeek;
    }

    public void setLoansToBePaidCurrentWeek(int loansToBePaidCurrentWeek) {
        this.loansToBePaidCurrentWeek = loansToBePaidCurrentWeek;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
