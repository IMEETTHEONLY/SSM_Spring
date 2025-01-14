package com.spring.service.impl;

import com.spring.dao.BookDao;
import com.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service("BookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book service save...");
        //调用dao层保存
        bookDao.save();
    }

    @Override
    public void update() {
        System.out.println("book service update...");
    }


}
