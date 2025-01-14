package com.spring;

import com.spring.dao.impl.BookDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForConfig {

    public static void main(String[] args) {

        //获取bean
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
            //通过非实例化的工厂方法获取
        BookDaoImpl bookDaoImpl = (BookDaoImpl)applicationContext.getBean("bookdaoImpl");
        //调用方法
        bookDaoImpl.save();

        //由于虚拟机退出了，容器未关闭，所以说它不会显示destroy，所以说你要再虚拟机关闭前自己关闭容器

        //方法一:暴力关闭
       // applicationContext.close();  //ClassPathXmlApplicationContext这个实现类才有close

        //方法二:注册一个关闭钩子  容器关闭的时候自动关闭
        applicationContext.registerShutdownHook();




    }
}
