package com.coalvalue.employee.feign;


import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class NoRemoteClientHystrix implements NoRemoteClient {


    @Override
    public Map no(String type, String uuid) {
        return null;
    }
}
