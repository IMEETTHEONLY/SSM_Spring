package com.spring;

import com.spring.config.SpringConfig;
import com.spring.service.BookService;
import com.spring.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//测试，aop的五种类型 即五个注解
public class App2 {
    public static void main(String[] args) {
        //先获取到spring的容器
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);

        //从ioc容器当中获取bean
//        BookService bean = applicationContext.getBean(BookService.class);
        BookService bookService = (BookService)applicationContext.getBean("BookService");


        //调用方法即可
        bookService.save();


    }
}
