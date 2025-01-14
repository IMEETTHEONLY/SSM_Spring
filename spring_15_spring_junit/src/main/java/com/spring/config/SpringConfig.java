package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  //标志为配置类
@ComponentScan("com.spring")  //要扫描哪些类作为ioc容器的bean
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {

}
