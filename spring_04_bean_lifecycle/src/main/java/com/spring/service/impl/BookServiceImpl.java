package com.spring.service.impl;

import com.spring.dao.BookDao;
import com.spring.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//spring官方为了统一Init方法名字和destroy名字他的规范就是实现两个接口
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    //这里如果说用new，代码的耦合就很高，所以说要用ioc容器来管理bean(创建对象)这样耦合就低了
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save...");
        //调用dao层保存
        bookDao.save();
    }

    //因为要给bookDao创建对象，要留下一个接口(set方法)给ioc容器，ioc容器才能给你new对象
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    //销毁方法
    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy...");
    }
    //初始化方法，它的时机是在属性设置之后，即可ioc容器调用set方法注入
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init...");
    }
}
