package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  //这个注解就是代表你在配置文件当中写的一大堆配置信息(就是哪个模板，命名空间呀配置类啊之类的)
//@ComponentScan({"com.spring.config"})   //这个注解就是配置ioc容器去扫描的路径的地方,它要的参数是一个{}(数组)
@Import(JdbcConfig.class)
@ComponentScan("com.spring.dao")
public class SpringConfig {
}
