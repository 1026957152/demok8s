package com.coalvalue.employee.domain.dto;

/**
 * Created by Administrator on 2015/10/19.
 */
public class UserUpdateDto {

    private String smallImage;

    private Integer type;

    private Integer companyId;

    private String companyName;
    private Integer userId;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }
}
