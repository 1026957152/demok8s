package com.example.dm.config;



import com.example.dm.apidata.witV3.WitItem;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.GitProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;


/**
 * Swagger2配置类
 * 在与spring boot集成时，放在与Application.java同级的目录下。
 * 通过@Configuration注解，让Spring来加载该类配置。
 * 再通过@EnableSwagger2注解来启用Swagger2。
 */

//@SpringBootApplication        //same as @Configuration+@EnableAutoConfiguration+@ComponentScan
@Configuration
@EnableSwagger2  //启动swagger注解
public class SwaggerConfig implements WebMvcConfigurer {


/*
    @Autowired
    private GitProperties git;*/




/**
     * 创建API应用
     * apiInfo() 增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 本例采用指定扫描的包路径来定义指定要建立API的目录。
     *
     * @return
     */


/*@Bean
public Docket app_api() {
    return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.ant("/api/**")).build().groupName("APP接口文档V4.4").pathMapping("/")
            .apiInfo(apiInfo("APP接口文档V4.4及之前","文档中可以查询及测试接口调用参数和结果","4.4"));
}

    @Bean
    public Docket wap_api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/web/**")).build().groupName("WEB接口文档V4.4").pathMapping("/")
                .apiInfo(apiInfo("WEB接口文档V4.4及之前","文档中可以查询及测试接口调用参数和结果","4.4"));
    }*/




    @Bean
    public Docket WitV1Api() {


        //添加header参数
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        ticketPar.name("X-api-key").description("user token")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build(); //header中的ticket参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(witV1ApiInfo())
                .globalOperationParameters(pars)

                .forCodeGeneration(true)
                .groupName("AWITV1.0")
                .ignoredParameterTypes(Errors.class)

                .ignoredParameterTypes(Pageable.class)
                .ignoredParameterTypes(java.sql.Date.class)
                .ignoredParameterTypes(WitItem.class)
                .ignoredParameterTypes(Authentication.class)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))//api接口包扫描路径
               // .paths(PathSelectors.any()) //可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .paths(PathSelectors.ant("/v2/wit/**"))
                .build();
    }
    private ApiInfo witV1ApiInfo() {




        String a=   "";// +git.get("build.version");

        return new ApiInfoBuilder()
                .title("榆林住房公积金省 智慧局 open API ")  //设置文档的标题
                .description(a) //设置文档的描述
                //    .termsOfServiceUrl("http://192.168.10.3/")
                //     .contact(new Contact("神玥软件","","0311-85138610"))
                // modelAndView.addObject("version", git.get("build.version"));
                .version("1.0")
                .build();
    }






    @Bean
    public Docket bbcV1api() {

        //添加header参数
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        ticketPar.name("X-api-key").description("user token")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build(); //header中的ticket参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数


        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
              //  .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .paths(PathSelectors.ant("/v1/ccb/**"))
                .build()
                .groupName("BCCBV1.0").pathMapping("/")
                .ignoredParameterTypes(Errors.class)
                .ignoredParameterTypes(Authentication.class)
                .globalOperationParameters(pars)
                .apiInfo(bbcV1ApiInfo());
    }
/**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://项目实际地址/swagger-ui.html
     * @return
     */
private ApiInfo bbcV1ApiInfo() {




    String a=   "";// +git.get("build.version");
    return new ApiInfoBuilder()
            .title("榆林住房公积金省 榆林市所中国建设银行定制 open API ")  //设置文档的标题
            .description("\n"+a) //设置文档的描述
            //    .termsOfServiceUrl("http://192.168.10.3/")
            //     .contact(new Contact("神玥软件","","0311-85138610"))
            // modelAndView.addObject("version", git.get("build.version"));
            .version("2.0")
            .build();
}












    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://项目实际地址/swagger-ui.html
     * @return
     */
    private ApiInfo CebV1ApiInfo() {




        String a=   "";// +git.get("build.version");
        return new ApiInfoBuilder()
                .title("榆林住房公积金 榆林市光大银行定制 open API ")  //设置文档的标题
                .description("\n"+a) //设置文档的描述
                //    .termsOfServiceUrl("http://192.168.10.3/")
                //     .contact(new Contact("神玥软件","","0311-85138610"))
                // modelAndView.addObject("version", git.get("build.version"));
                .version("2.0")
                .build();
    }
    @Bean
    public Docket CebV1Api() {


        //添加header参数
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        ticketPar.name("X-api-key").description("accessKey(访问密钥)")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(true).build(); //header中的ticket参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数

        ticketPar.name("X-authorization-code").description("客户授权码")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build(); //header中的ticket参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(CebV1ApiInfo())
                .globalOperationParameters(pars)

                .forCodeGeneration(true)
                .groupName("CEBV1.0")
                .ignoredParameterTypes(Errors.class)

                .ignoredParameterTypes(Pageable.class)
                .ignoredParameterTypes(java.sql.Date.class)
                .ignoredParameterTypes(WitItem.class)
                .ignoredParameterTypes(Authentication.class)


                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))//api接口包扫描路径
                // .paths(PathSelectors.any()) //可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .paths(PathSelectors.ant("/v1/ceb/**"))

                .build();
    }





//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//    }


/*    @Bean
    public PluginRegistry<LinkDiscoverer, MediaType> discoverers(
            OrderAwarePluginRegistry<LinkDiscoverer, MediaType> relProviderPluginRegistry) {
        return relProviderPluginRegistry;
    }
    */
















    @Bean
    public Docket witV3Api() {


        //添加header参数
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        ticketPar.name("X-api-key").description("user token")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build(); //header中的ticket参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(witv3ApiInfo())
                .globalOperationParameters(pars)

                .forCodeGeneration(true)
                .groupName("AWITV3.0")
                .ignoredParameterTypes(Errors.class)

                .ignoredParameterTypes(Pageable.class)
                .ignoredParameterTypes(java.sql.Date.class)
                .ignoredParameterTypes(WitItem.class)
                .ignoredParameterTypes(Authentication.class)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))//api接口包扫描路径
                // .paths(PathSelectors.any()) //可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .paths(PathSelectors.ant("/v3/wit/**"))
                .build();
    }

    private ApiInfo witv3ApiInfo() {




        String a=   "" ;//+git.get("build.version");

        return new ApiInfoBuilder()
                .title("榆林住房公积金省 智慧局 open API V3.0")  //设置文档的标题
                .description(a) //设置文档的描述
                //    .termsOfServiceUrl("http://192.168.10.3/")
                //     .contact(new Contact("神玥软件","","0311-85138610"))
                // modelAndView.addObject("version", git.get("build.version"));
                .version("3.0")
                .build();
    }

}
