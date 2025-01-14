package com.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.spring.dao.BookDao;
import com.spring.service.BookService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
//@Configuration
//不建议这里加config注解然后在springConfig当中注入因为这样不利于查看加载了哪些配置类，而是直接导入

public class JdbcConfig {
    //注入简单类型的数据到第三方bean当中，直接在私有变量上面写value属性即可
    @Value("com.mysql.jdbc.Driver")
    private String Driver;
    @Value("jdbc:mysql:aws://localhost:3306/xiaoqing")
    private String data;
    @Value("root")
    private String root;
    @Value("1234")
    private String password;




    //这个bean注解的意思就是说返回一个bean类型的对象，如果说不加的话ioc容器就不回去管理他，即使它返回了一个对象
    //注入引用类型的数据，ioc容器会自动的给你装配(这一点很重要，他在底层给你做好了，记住仅限于第三方bean自动注入，你自己的bean就可以用autowired)
    @Bean
    public DataSource dataSource(@Qualifier("bookDao2")BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName(Driver);
        dataSource.setUrl(data);
        dataSource.setUsername(root);
        dataSource.setPassword(password);
        return dataSource;
    }


}
