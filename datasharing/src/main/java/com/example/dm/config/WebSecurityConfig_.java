package com.example.dm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//https://github.com/gexiangdong/spring-sso-sample/blob/master/security-mvc-jwt/src/main/java/cn/devmgr/example/sso/jwt/mvc/config/SecurityConfig.java

/**
 * @author ChengJianSheng
 * @date 2019-03-19
 */

@Configuration
@Order(5)
public class WebSecurityConfig_ extends WebSecurityConfigurerAdapter {





    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/img/**",
                "/components/**",
                "/js/**",
                "/images/**",
                "/api/v1/**",
                //"/api/v1/**",

                "/login/sentSMSCodeToUser",

                "/captch/**",
                "/data/**",
                "/credit/**",
                "/actuator/prometheus"
/*                "/lib/**",
                "/v2/api-docs",
                "/configuration/ui",
                "/swagger-resources/**",
                "/configuration/security",
                "/swagger-ui.html",
                "/webjars/**"*/
        );



    }

    private static final String[] AUTH_WHITELIST = {
            // -- swagger ui
            "/指标明细查询",
            "/指标明细查询",


           // "/",
            "/JG/**",
            "/more_grid_cx.service",

         //   http://192.168.10.127:80/actuator/prometheus

/*           "/v2/api-docs",
            "/swagger-ui.html",*/


            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",

            "/webjars/**",
            "/hello",
            "/data/**",
            "/credit/data",
            "/api/**",
            "/vue/**",
            "/excel/**",
           // "/ccb/**"
            // other public endpoints of your API may be appended to this array
    };


    private static final String[] UNAUTHENTICATED_ROUTES = new String[] {
            "/swagger-ui.html?urls.primaryName=B建行接口V1.0",
    };
    @Override
    protected void configure(HttpSecurity http) throws Exception {


        http

                .authorizeRequests()
                .antMatchers(AUTH_WHITELIST).permitAll()  // whitelist Swagger UI resources
                .antMatchers("/login*").permitAll()
                .regexMatchers( UNAUTHENTICATED_ROUTES ).hasRole("CCB")
/*                .antMatchers( new String[] {
                        "/swagger-ui.html"
                } ).hasRole("WIT")*/
//\/myPage\?param1=tata(&.*|$)
                .regexMatchers("\\/swagger-ui\\.html\\?urls\\.primaryName=B\\w+\\.\\w+").hasRole("CCB")
                .regexMatchers("\\/swagger-ui\\.html\\?urls\\.primaryName=A\\w+\\.\\w+").hasRole("WIT")
                .regexMatchers("\\/swagger-ui\\.html\\?urls\\.primaryName=C\\w+\\.\\w+").hasRole("CEB")

                .regexMatchers("\\/v2\\/api-docs\\?group=B\\w+\\.\\w+").hasRole("CCB")
                .regexMatchers("\\/v2\\/api-docs\\?group=A\\w+\\.\\w+").hasRole("WIT")
                .regexMatchers("\\/v3\\/api-docs\\?group=A\\w+\\.\\w+").hasRole("WIT")

                .regexMatchers("\\/v2\\/api-docs\\?group=CEBV1\\.0").hasRole("CEB")
                //    .regexMatchers("\\/sUrl\\?params=\\{url:\"reports\\/Manager\",subSystem:\"ABS\"\\}").hasRole("WIT")

/*                .regexMatchers( new String[] {
                       "\\/swagger-ui.html\?urls.primaryName=A智慧局接口V1.0",
                } ).hasRole("WIT")*/
               // .regexMatchers(UNAUTHENTICATED_ROUTES).access("hasRole('ROLE_ABS')")

                /*匹配所有路径的*/
                /*level1路径下需要VIP1身份才能访问*/
                .antMatchers("/level1/**").hasRole("VIP1")
                /*level1路径下需要VIP2身份才能访问*/
                .antMatchers("/level2/**").hasRole("VIP2")
                /*level1路径下需要VIP3身份才能访问*/
                .antMatchers("/level3/**").hasRole("VIP3")
                //.antMatchers("/swagger-ui.html").permitAll()
                //  .antMatchers("/**").permitAll()

                // .antMatchers("/JG/**").permitAll()
                .and().authorizeRequests()
                .anyRequest().authenticated()
                .and()


                .formLogin()
             /*   .loginPage("/login")
                .loginProcessingUrl("/perform_login")
                .defaultSuccessUrl("/audit", true)*/
                //.failureUrl("/login.html?error=true")
                //     .failureHandler(authenticationFailureHandler())
                .and()


                .logout()
                .logoutUrl("/perform_logout")
                .deleteCookies("JSESSIONID")
                //     .logoutSuccessHandler(logoutSuccessHandler())



/*                .and()
                .httpBasic()*/
                .and().csrf().disable()


    //    .exceptionHandling().authenticationEntryPoint(unauthenticatedRequestHandler())
        ;
    }


    @Bean
    UnauthenticatedRequestHandler unauthenticatedRequestHandler() {
        return new UnauthenticatedRequestHandler();
    }

   static String LOGIN = "/api/login";
    static class UnauthenticatedRequestHandler implements AuthenticationEntryPoint {
        @Override
        public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, IOException {
            System.out.println("______________________________________"+request.getServletPath());

            if (request.getServletPath().startsWith("/ccb")) {
                response.setStatus(403);
            } else {
                response.sendRedirect(LOGIN);
            }
        }
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {


        auth
                /*从内存中读取认证*/
                .inMemoryAuthentication()
                /*Spring Security 5.0开始必须要设置加密方式*/
                .passwordEncoder(new BCryptPasswordEncoder())

                .withUser("ccb1").password(new BCryptPasswordEncoder().encode("oxd3Ka3l")).roles("CCB")
                .and()
                .withUser("ccb").password(new BCryptPasswordEncoder().encode("RC3GeJlR")).roles("CCB")

                .and()
                .withUser("wit1").password(new BCryptPasswordEncoder().encode("123")).roles("WIT")
                .and()
                .withUser("wit").password(new BCryptPasswordEncoder().encode("FPXpncGk")).roles("WIT")
        .and().withUser("ceb").password(new BCryptPasswordEncoder().encode("123")).roles("CEB");
    }

}