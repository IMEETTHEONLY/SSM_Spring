package com.spring;

import com.spring.dao.impl.BookDaoImpl;
import com.spring.service.impl.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //获取bean
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
            //通过非实例化的工厂方法获取
        BookServiceImpl bookService = (BookServiceImpl) applicationContext.getBean("bookService");
        //调用方法
        bookService.save();






    }
}
