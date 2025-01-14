package com.spring;

import com.spring.dao.impl.OrderDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForFactroy {

    public static void main(String[] args) {
        //通过非静态化的工厂方法进行bean的获取

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
            //通过非实例化的工厂方法获取
//        OrderDaoImpl orderDaoImpl = (OrderDaoImpl)applicationContext.getBean("orderDaoImpl");
        //调用方法
//        orderDaoImpl.save();

        //通过spring规范化的非实例化的工厂方法获取
        OrderDaoImpl orderDaoFactroyBean = (OrderDaoImpl)applicationContext.getBean("orderDaoFactroyBean");

        orderDaoFactroyBean.save();

    }
}
