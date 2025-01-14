package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.spring")
@EnableAspectJAutoProxy  //让spring能够去发现你开发的aspect类
public class SpringConfig {
}
