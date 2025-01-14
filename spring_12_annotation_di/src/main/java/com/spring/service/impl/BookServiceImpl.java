package com.spring.service.impl;

import com.spring.dao.BookDao;
import com.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
//交给ioc容器管理
@Service()
public class BookServiceImpl implements BookService {
    @Autowired   //自动注入，这里是根据暴力反射，获取到bookDao然后给它按照类型赋值的，所以说不需要提供set方法
    //这里如果说有多个dao，他会选择取名字为跟bookDao相同的进行注入
    //你也可以根据注解指定注入
    @Qualifier("bookDao2")
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save...");
        //调用dao层保存
        bookDao.save();
    }


}
