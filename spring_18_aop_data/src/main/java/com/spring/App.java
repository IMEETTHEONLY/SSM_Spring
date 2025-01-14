package com.spring;

import com.spring.config.SpringConfig;
import com.spring.service.RoseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//用于测试aop获取数据的情况，包括参数，返回值，异常
public class App {

    public static void main(String[] args) {

    //获取spring的容器
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);

        RoseService rose = (RoseService)applicationContext.getBean("rose");

        String string = rose.getById(100);

        System.out.println(string);


    }
}
