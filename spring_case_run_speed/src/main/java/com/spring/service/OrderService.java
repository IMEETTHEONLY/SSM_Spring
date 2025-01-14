package com.spring.service;

import com.spring.dao.OrderDao;
import com.spring.domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    //注入dao对象
    @Autowired
    private OrderDao orderDao;

    //调用根据Id查询即可
    public Orders getOrderById(Integer id){
      return  orderDao.getOrderById(id);
    }
}
