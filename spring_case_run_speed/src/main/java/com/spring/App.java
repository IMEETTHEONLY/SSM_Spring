package com.spring;

import com.spring.config.SpringConfig;
import com.spring.dao.OrderDao;
import com.spring.domain.Orders;
import com.spring.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.io.IOException;
import java.io.InputStream;

public class App {
    //mybatis的整合spring开发
    public static void main(String[] args) throws IOException {
        //先获取配置spring
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);

        //获取service的bean，然后调用方法
        OrderService bean = applicationContext.getBean(OrderService.class);

        //调用bean里面的getbyid方法
        Orders orderById = bean.getOrderById(1);

        //打印即可
        System.out.println(orderById);


    }
}
