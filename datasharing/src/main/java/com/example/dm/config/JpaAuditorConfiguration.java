package com.example.dm.config;

//import com.coalvalue.domain.entity.User;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;

//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by Peter Xu on 01/10/2015.
 */
@Component
public class JpaAuditorConfiguration implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {


        System.out.println("----------------current auditor id is 0 ----------------------------------------------------------");
       Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if(auth != null && auth.isAuthenticated()){
            if(auth.getPrincipal() instanceof  String){
                String user = (String)auth.getPrincipal();
                return Optional.of(user);
            }else {
                return Optional.ofNullable(null);
            }

        }else {
            return Optional.ofNullable(null);
        }


    }

}
