package com.spring;

import com.spring.service.impl.BookServiceImpl;

public class App {

    public static void main(String[] args) {
        //创建service实现类并调用save方法
        BookServiceImpl bsl=new BookServiceImpl();
        bsl.save();
    }
}
