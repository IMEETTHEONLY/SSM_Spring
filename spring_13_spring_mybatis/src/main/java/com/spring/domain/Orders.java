package com.spring.domain;


import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单
 */

public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    //订单号
    private String number;


    //蛋糕名字
    private String name;

    //蛋糕价格
    private int price;

    //蛋糕描述
    private String description;

    //下单时间
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime orderTime;

    //结账时间
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime checkoutTime;

    //备注
    private String remark;


    //手机号
    private String phone;

    //地址
    private String address;

    //收货人
    private String consignee;

    //消费者id
    private int userID;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", orderTime=" + orderTime +
                ", checkoutTime=" + checkoutTime +
                ", remark='" + remark + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", consignee='" + consignee + '\'' +
                ", userID=" + userID +
                '}';
    }
}
