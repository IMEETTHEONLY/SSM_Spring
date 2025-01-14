package com.spring;

import com.spring.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {

    public static void main(String[] args) {
       //创建两个同个bean对象看他们的地址是否一样的
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        //创建两个相同bean
       BookServiceImpl bookService1=(BookServiceImpl) applicationContext.getBean("bookServiceImpl");
       BookServiceImpl bookService2=(BookServiceImpl) applicationContext.getBean("bookServiceImpl");
        System.out.println(bookService1);
        System.out.println(bookService2);

        //结果默认是单例模式，但是你可以在配置文件当中使用scope开始非单例模式

    }
}
