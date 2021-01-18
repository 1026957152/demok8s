package com.example.dm.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfig {
    @Value("${local_ip}")
    private String local_ip;

    @Value("${local_ip_test}")
    private String local_ip_test;
    @Value("${local_port}")
    private String local_port;

    //数据源1-引用配置:spring.datasource.primary
    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource primaryDataSource() {


        System.out.println("========primaryDataSource=================local_ip"+ local_ip);
        System.out.println("=======primaryDataSource==================local_port"+ local_port);
        System.out.println("========primaryDataSource=================local_ip_test"+ local_ip_test);
        return DataSourceBuilder.create().build();

    }



    //数据源2-引用配置:spring.datasource.secondary
    @Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasourcesecondary")
    public DataSource secondaryDataSource() {


        System.out.println("=====datasourcesecondary====================local_ip"+ local_ip);
        System.out.println("=====datasourcesecondary====================local_port"+ local_port);
        System.out.println("=====datasourcesecondary====================local_ip_test"+ local_ip_test);
        return DataSourceBuilder.create().build();
    }




}