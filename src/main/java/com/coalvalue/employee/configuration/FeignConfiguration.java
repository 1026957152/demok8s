package com.coalvalue.employee.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;  
    }

/*    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }*/
/*    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }*/
    //实例化fallback
/*    @Bean
    public HystrixClientFallback fb(){
        return new HystrixClientFallback();
    }*/

}

