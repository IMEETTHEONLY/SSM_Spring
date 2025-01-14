package com.spring.service.impl;

import com.spring.dao.BookDao;
import com.spring.dao.CourseDao;
import com.spring.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//spring官方为了统一Init方法名字和destroy名字他的规范就是实现两个接口
public class BookServiceImpl implements BookService {
    //这里如果说用new，代码的耦合就很高，所以说要用ioc容器来管理bean(创建对象)这样耦合就低了
    private BookDao bookDao;
    private CourseDao courseDao;

    //构造器注入

    public BookServiceImpl(BookDao bookDao, CourseDao courseDao) {
        this.bookDao = bookDao;
        this.courseDao = courseDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        //调用dao层保存
        bookDao.save();
        courseDao.save();
    }


}
