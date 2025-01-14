package com.spring;

import com.spring.dao.BookDao;
import com.spring.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //先获取到spring的容器  参数是spring配置文件的名字
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        //从ioc容器当中获取bean
        BookServiceImpl bookServiceImpl = (BookServiceImpl) applicationContext.getBean("bookServiceImpl");
        BookDao bean = applicationContext.getBean(BookDao.class);

        //调用方法即可
        System.out.println(bookServiceImpl);
        System.out.println(bean);



    }
}
