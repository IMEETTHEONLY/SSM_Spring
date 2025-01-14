package com.spring;

import com.spring.config.SpringConfig;
import com.spring.dao.BookDao;
import com.spring.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App2 {
    public static void main(String[] args) {
        //先获取到spring的容器  参数是spring配置文件的名字
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);


    }
}
