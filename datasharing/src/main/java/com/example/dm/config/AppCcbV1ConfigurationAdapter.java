package com.example.dm.config;


import com.example.dm.domain_flow.AuthenticationInformation;
import com.example.dm.repository_flow.AuthenticationInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.ExceptionTranslationFilter;
import org.springframework.security.web.authentication.Http403ForbiddenEntryPoint;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)

@Order(0)
public  class AppCcbV1ConfigurationAdapter extends WebSecurityConfigurerAdapter {
    @Value("${yourapp.http.auth-token-header-name:X-api-key}")
    private String principalRequestHeader;

    @Value("${yourapp.http.auth-token:FUCKFILTER}")
    private String principalRequestValue;
    Set<String> whitelist = new HashSet<String>();

    public AppCcbV1ConfigurationAdapter() {
        super();
        whitelist.add("11.11.11.11");
        whitelist.add("127.0.0.2");
    }
    @Autowired
    AuthenticationInformationRepository authenticationInformationRepository;

    protected void configure(HttpSecurity http) throws Exception {





        //http.antMatcher("/guest/**").authorizeRequests().anyRequest().permitAll();
        APIKeyAuthFilter filter = new APIKeyAuthFilter(principalRequestHeader);

        filter.setAuthenticationManager(new AuthenticationManager() {

            @Override
            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
           //     User principal = (User) authentication.getPrincipal();

/*                System.out.println(principalRequestValue+"==============="+"setAuthenticationManager=============="+principal.getUsername());
                if (!principalRequestValue.equals(principal.getUsername()))
                {
                    throw new BadCredentialsException("The API key was not found or not the expected value.");
                }*/
             //   System.out.println("验证通过"+principal.getAuthorities());


                String principal = (String) authentication.getPrincipal();
               String[] pr = principal.split(":");
  /*              if(! whitelist.contains(pr[1])){
                    throw new BadCredentialsException("Invalid IP Address");
                }*/

                AuthenticationInformation authenticationInformation = authenticationInformationRepository.findByAccessKey(pr[0]);
                if (authenticationInformation==null)
                {
                    throw new BadCredentialsException("The API key was not found or not the expected value.");
                }

                authentication = new UsernamePasswordAuthenticationToken(authenticationInformation.getClientId()+":"+authenticationInformation.getAccessKey(), "aa",   Arrays.asList(new SimpleGrantedAuthority("ROLE_CCB")));

             //   authentication.setAuthenticated(true);
                return authentication;
            }
        });





 /*       http
                  .addFilter(filter) //.authorizeRequests().anyRequest().authenticated();; // 调整为让 Spring Security 不创建和使用 session

                .authorizeRequests()

                .antMatchers("/ccb/**").hasRole("CCB")


              //  anyRequest().hasRole("CCB")
                // 允许所有请求通过
                .and()
                .formLogin()
                .and()
                // 禁用 Spring Security 自带的跨域处理
*//*                .sessionManagement()                        // 定制我们自己的 session 策略
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)*//*
              //  .and()
                .csrf()
                .disable()
                .exceptionHandling().authenticationEntryPoint(unauthenticatedRequestHandler())

        ;
*/


        http.
                antMatcher("/v1/ccb/**")
                .csrf()
                .disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .addFilter(filter)
                .addFilterBefore(new ExceptionTranslationFilter(
                                new Http403ForbiddenEntryPoint()),
                        filter.getClass()
                )
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .exceptionHandling().authenticationEntryPoint(unauthorizedEntryPoint());
        ;
    }

    @Bean
    public AuthenticationEntryPoint unauthorizedEntryPoint() {



        return (request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
    }


}