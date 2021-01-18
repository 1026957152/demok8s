package com.example.dm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author lnj
 * createTime 2018-11-07 22:37
 **/
@Component
public class ApplicationRunnerImpl implements ApplicationRunner {

    @Value("${local_ip}")
    private String local_ip;

    @Value("${local_ip_test}")
    private String local_ip_test;
    @Value("${local_port}")
    private String local_port;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("通过实现ApplicationRunner接口，在spring boot项目启动后打印参数");
        String[] sourceArgs = args.getSourceArgs();
        for (String arg : sourceArgs) {
            System.out.print(arg + " ");
        }
        System.out.println();

        String local_ipgetProperty = System.getProperty("local_ip");
        String local_portgetProperty = System.getProperty("local_port");

        System.out.println("==================getProperty=======local_port"+ local_portgetProperty);
        System.out.println("=================getProperty========local_ip"+ local_ipgetProperty);


        System.out.println("=========================local_ip"+ local_ip);
        System.out.println("=========================local_port"+ local_port);
        System.out.println("=========================local_ip_test"+ local_ip_test);


    }
}
