package com.coalvalue.employee.feign;




import com.coalvalue.employee.RoleApplication;
import com.coalvalue.employee.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;


/**
 * Created by silence yuan on 2015/6/28.
 */



@FeignClient(value = RoleApplication.no_service, path = "/api/v1", configuration = FeignConfiguration.class, fallback = NoRemoteClientHystrix.class)
public interface NoRemoteClient {




    @RequestMapping(value = "/no/{type}/{uuid}", method = RequestMethod.GET)

    public Map no(@PathVariable(value = "type", required = false) String type
            , @PathVariable(value = "uuid", required = false) String uuid) ;

}