package com.example.dm.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by yuan zhao  on 08/10/2015.
 */



public class Ln0303_key implements Serializable {
    private static final long serialVersionUID = 1L;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    @Column(name = "contractcode")
    private String contractcode合同代码;

    @Column(name = "custid")
    private String custid个人客户号;



    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }


}
