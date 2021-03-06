package com.example.dm.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

//import org.activiti.spring.boot.ProcessDefinitionResourceFinder;

/**
 * 注入JPA:
 * entityManagerFactory :  entityManagerFactorySecondary
 * transactionManager   :  transactionManagerSecondary
 * basePackages         :  com.example.domain.second
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef="entityManagerFactorySecondary",
        transactionManagerRef="transactionManagerSecondary",
        basePackages= {"com.example.dm.repository_flow"}) //设置Repository所在位置
public class SecondaryConfig  {
    @Primary
    @Bean
    public TaskExecutor primaryTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // add necessary properties to the executor
        return executor;
    }

    /**
     * 自动注入 DataSourceConfig 类中的数据源配置文件secondaryDataSource
     * 实例化DataSource(secondaryDataSource)
     */
    @Autowired
    @Qualifier("secondaryDataSource")
    private DataSource secondaryDataSource;
    @Autowired
    private HibernateProperties hibernateProperties;
    /**
     * 创建 EntityManager :
     *      根据EntityManagerFactoryBuilder 创建 EntityManager
     * @param builder EntityManagerFactoryBuilder
     * @return
     */
    @Bean(name = "entityManagerSecondary")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactorySecondary(builder).getObject().createEntityManager();
    }

    /**
     * 根据当前数据源配置,创建entityManagerFactory
     * @param builder
     * @return
     */
    @Bean(name = "entityManagerFactorySecondary")
    public LocalContainerEntityManagerFactoryBean entityManagerFactorySecondary (EntityManagerFactoryBuilder builder) {


        return builder
                .dataSource(secondaryDataSource)
                .properties(getVendorProperties())
                .packages("com.example.dm.domain_flow") //设置实体类所在位置
                .persistenceUnit("secondaryPersistenceUnit")
                .build();
    }

    @Resource
    private JpaProperties jpaProperties;
  /*  private Map<String, Object> getVendorProperties() {
        return jpaProperties.getHibernateProperties(new HibernateSettings());
    }*/
    private Map<String, Object> getVendorProperties() {
        Map<String, String> properties = jpaProperties.getProperties();
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");

       // spring.jpa.hibernate.hbm2ddl.auto=update
      //  properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto_mysql"));
     //   properties.put("hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect_mysql"));
      //  properties.put("hibernate.show_sql", env.getProperty("spring.jpa.show-sql"));
        return hibernateProperties.determineHibernateProperties(properties, new HibernateSettings());
    }

/*
    private Map<String, String> getVendorProperties(DataSource dataSource) {
        jpaProperties.setDatabase(Database.MYSQL);
        Map<String,String> map = new HashMap<>();
        map.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        map.put("hibernate.hbm2ddl.auto","update");
        map.put("hibernate.physical_naming_strategy","org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl");
        jpaProperties.setProperties(map);
        return  jpaProperties.getHibernateProperties(dataSource);
    }
*/


    /**
     * 根据entityManagerFactory(entityManagerFactorySecondary)生成transactionManager(transactionManagerSecondary)
     * @param builder PlatformTransactionManager
     * @return
     */
    @Bean(name = "transactionManagerSecondary")
    PlatformTransactionManager transactionManagerSecondary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactorySecondary(builder).getObject());
    }















/*


    @Autowired
    @Qualifier("customUserGroupManagerImpl")
    private UserGroupManager userGroupManager;

*/






}