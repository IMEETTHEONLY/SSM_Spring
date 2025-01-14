package com.spring.fctory;

import com.spring.dao.impl.OrderDaoImpl;

public class OrderFactory {

    //工厂方法为非静态方法
    public  OrderDaoImpl getOrderDao(){
        return new OrderDaoImpl();
    }
}
