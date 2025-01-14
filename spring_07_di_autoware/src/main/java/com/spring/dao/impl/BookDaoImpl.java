package com.spring.dao.impl;

import com.spring.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
