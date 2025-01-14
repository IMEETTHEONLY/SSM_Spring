package com.spring.dao;

import com.spring.domain.Orders;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
//让核心容器来管理这个类
@Repository
public interface OrderDao {

    //根据id来查询订单数据
    @Select("select * from orders where id=#{id}")
    Orders getOrderById(Integer id);

}
