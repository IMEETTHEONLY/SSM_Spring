package com.spring;

import com.spring.dao.impl.BookDaoImpl;
import com.spring.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceBook {
    public static void main(String[] args) {
        //这个主方法是用来测试通过构造方法进行bean实例化的,必须是有空参否则就要报错

        //先获取到spring的容器  参数是spring配置文件的名字
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        //从ioc容器当中获取bean
        BookDaoImpl bookdaoImpl =(BookDaoImpl) applicationContext.getBean("bookdaoImpl");

        //调用方法即可
        bookdaoImpl.save();

    }
}
