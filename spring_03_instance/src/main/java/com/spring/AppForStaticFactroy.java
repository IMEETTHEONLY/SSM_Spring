package com.spring;

import com.spring.dao.impl.CourseDaoImpl;
import com.spring.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForStaticFactroy {

    public static void main(String[] args) {
       //创建两个同个bean对象看他们的地址是否一样的
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        //根据工厂方法获取bean
        CourseDaoImpl courseImpl =(CourseDaoImpl) applicationContext.getBean("courseImpl");

        //调用方法
        courseImpl.save();



    }
}
