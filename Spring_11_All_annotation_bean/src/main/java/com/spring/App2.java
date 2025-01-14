package com.spring;

import com.spring.config.SpringConfig;
import com.spring.dao.BookDao;
import com.spring.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //通过配置类和注解的配置这样就完全抛弃掉了配置文件

        //这里通过配置类获取到ioc容器
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringConfig.class);  //通过反射得到信息
        //从ioc容器当中获取bean
        BookServiceImpl bookServiceImpl = (BookServiceImpl) applicationContext.getBean("bookServiceImpl");
        BookDao bean = applicationContext.getBean(BookDao.class);

        //调用方法即可
        System.out.println(bookServiceImpl);
        System.out.println(bean);



    }
}
