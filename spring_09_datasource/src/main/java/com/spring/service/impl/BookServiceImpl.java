package com.spring.service.impl;

import com.spring.dao.BookDao;
import com.spring.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save...");
        //调用dao层保存
        bookDao.save();
    }


}
