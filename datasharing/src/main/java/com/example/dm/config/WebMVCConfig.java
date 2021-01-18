package com.example.dm.config;


/*import com.gjj.api.apidata.PerClientRateLimitInterceptor;
import com.gjj.api.domain_flow.AuthenticationInformation;
import com.gjj.api.repository_flow.AuthenticationInformationRepository;*/
import com.example.dm.apidata.PerClientRateLimitInterceptor;
import com.example.dm.domain_flow.AuthenticationInformation;
import com.example.dm.repository_flow.AuthenticationInformationRepository;
import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ForwardedHeaderFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {


    @Autowired
    private AuthenticationInformationRepository authenticationInformationRepository;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {



        List<AuthenticationInformation> informationList = authenticationInformationRepository.findAll();

        Map<String, Tuple2<AuthenticationInformation, Bucket>> map = informationList.stream().collect(Collectors.toMap(e->e.getAccessKey(), e->{
            return Tuple.of(e,Bucket4j.builder()
                    .addLimit(Bandwidth.classic(e.getRateLimit(), Refill.intervally(e.getRateLimit(), Duration.ofMinutes(1))))
                    .build());
        }));

        System.out.println("=====??????????????==============================="+ map.toString());
        registry.addInterceptor(new PerClientRateLimitInterceptor(map))
                .addPathPatterns("/v1/ccb/**");

/*        registry.addInterceptor(new RateLimitInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/static/**", "/");*/
				//配置限流拦截器拦截以及不拦截的映射
    }


    @Bean
    FilterRegistrationBean<ForwardedHeaderFilter> forwardedHeaderFilter() {
        FilterRegistrationBean<ForwardedHeaderFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new ForwardedHeaderFilter());
        return bean;
    }
}
