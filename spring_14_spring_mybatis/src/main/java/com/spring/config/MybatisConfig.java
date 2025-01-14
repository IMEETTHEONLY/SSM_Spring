package com.spring.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//这个就是spring整合mybatis的核心类，有了这个代码，当你去调用mapper的方法的时候，就会自动生成原始代码的架构然后自动注入，这样就省去了所有的配置代码

public class MybatisConfig {
    //定义bean，SqlSessionFactoryBean(工厂来产生bean)，
    // 用于产生SqlSessionFactory对象(这个对象在原始开发当中充当核心的bean所以说需要被管理这是一个规范)
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        //这个是一个工厂类，点金源码可以看见专门返回一个用于产生SqlSessionFactory对象对象
        SqlSessionFactoryBean ssfb=new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.spring.domain");  //设置配置文件当中对应用来接收的类
        ssfb.setDataSource(dataSource);
        //返回这个bean即可
        return ssfb;
    }

    //定义bean，返回MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer=new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.spring.dao");
        return mapperScannerConfigurer;
    }

}
