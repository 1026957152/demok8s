package com.example.dm.config;

import com.google.common.collect.ImmutableMap;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

public class APIKeyAuthFilter extends AbstractPreAuthenticatedProcessingFilter {

    private String principalRequestHeader;
    private Map<String,User> keys = ImmutableMap.of("123456",new User("FUCKFILTER","", Arrays.asList(new SimpleGrantedAuthority("ROLE_CCB"))));

    public APIKeyAuthFilter(String principalRequestHeader) {
        this.principalRequestHeader = principalRequestHeader;
    }

    @Override
    protected Object getPreAuthenticatedPrincipal(HttpServletRequest request) {
        System.out.println("==================== HEADER "+principalRequestHeader);
        String req = request.getHeader(principalRequestHeader);
        request.getRemoteAddr();
      //  User user = keys.get(request.getHeader(req));

        return req+":"+request.getRemoteAddr();
    }

    @Override
    protected Object getPreAuthenticatedCredentials(HttpServletRequest request) {
        return "N/A";
    }

}