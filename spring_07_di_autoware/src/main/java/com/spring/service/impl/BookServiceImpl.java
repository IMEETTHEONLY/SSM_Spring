package com.spring.service.impl;

import com.spring.dao.BookDao;
import com.spring.service.BookService;

public class BookServiceImpl implements BookService {

    //通过自动装配注入,需要给出set方法
    private BookDao bookDao;


    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        //调用dao层保存
        bookDao.save();
    }


}
