package com.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class RoseDao {

    public boolean check(String url,String password){
        System.out.println(password.length());
        return password.equals("root");
    }
}
