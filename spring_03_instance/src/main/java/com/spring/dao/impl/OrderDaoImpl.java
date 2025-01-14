package com.spring.dao.impl;

import com.spring.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {


    @Override
    public void save() {
        System.out.println("Order Dao save...");
    }
}
