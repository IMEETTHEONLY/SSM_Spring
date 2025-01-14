package com.spring.dao.impl;

import com.spring.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//我要把这个类交给ioc容器管理，那么我就写上component注解，表示配置文件当中的bean
//@Component
@Repository("bookDao")  //这个和component完全等价只是让你知道这个是处理dao层的
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
