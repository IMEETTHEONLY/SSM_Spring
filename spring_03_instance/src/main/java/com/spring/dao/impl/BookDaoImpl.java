package com.spring.dao.impl;

import com.spring.dao.BookDao;

public class BookDaoImpl implements BookDao {
    //如果说只有有参空参不构造空参，他不会默认有空参构造的，所以说会报错,因为ioc找不到空参构造方法
//    public BookDaoImpl(String i){
//
//    }
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
