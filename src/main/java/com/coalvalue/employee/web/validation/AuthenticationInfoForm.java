package com.coalvalue.employee.web.validation;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by silence on 2016/1/23.
 */
public class AuthenticationInfoForm {


    @NotBlank
    private String cardHolderName;

    @NotBlank
    private String cardNumber;

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
