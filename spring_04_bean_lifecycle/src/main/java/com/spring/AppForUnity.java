package com.spring;

import com.spring.service.impl.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试spring统一的设置初始化和销毁方法
public class AppForUnity {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        BookServiceImpl bookService = (BookServiceImpl)applicationContext.getBean("bookService");

        bookService.save();

        //调用销毁方法
        applicationContext.registerShutdownHook();
    }
}
