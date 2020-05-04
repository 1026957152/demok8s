package com.coalvalue.employee.service.more;

import com.coalvalue.employee.enumType.ViewDetail_SummaryEnum;

/**
 * Created by RGOVIND on 10/20/2016.
 */

public class ViewCondition {


    private ViewDetail_SummaryEnum detailOrSummaryEnum;
    private Boolean mobile;

    public void setDetailOrSummaryEnum(ViewDetail_SummaryEnum detailOrSummaryEnum) {
        this.detailOrSummaryEnum = detailOrSummaryEnum;
    }

    public ViewDetail_SummaryEnum getDetailOrSummaryEnum() {
        return detailOrSummaryEnum;
    }

    public void setMobile(Boolean mobile) {
        this.mobile = mobile;
    }

    public Boolean getMobile() {
        return mobile;
    }

    public boolean isMobile() {
        return mobile;
    }
}