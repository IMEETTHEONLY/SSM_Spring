package com.spring;

import com.spring.config.SpringConfig;
import com.spring.service.RoseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//用于处理 处理密码末尾有空格的情况，用aop去去掉末尾的空格。

public class App {

    public static void main(String[] args) {

    //获取spring的容器
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);

        RoseService rose = (RoseService)applicationContext.getBean("rose");

        Boolean flag = rose.getById("http//:123456","root     ");

        System.out.println(flag);


    }
}
