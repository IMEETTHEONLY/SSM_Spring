package com.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {

    //注入简单类型的数据到第三方bean当中，直接在私有变量上面写value属性即可
    //这里的值是可以配置在application.properties文件中，可以直接注入
    @Value("com.mysql.jdbc.Driver")
    private String Driver;
    @Value("jdbc:mysql://localhost:3306/order")
    private String data;
    @Value("root")
    private String root;
    @Value("1234")
    private String password;



    //这个bean注解的意思就是说返回一个bean类型的对象，如果说不加的话ioc容器就不回去管理他，即使它返回了一个对象
    //注入引用类型的数据，ioc容器会自动的给你装配(这一点很重要，他在底层给你做好了，记住仅限于第三方bean自动注入，你自己的bean就可以用autowired)
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName(Driver);
        dataSource.setUrl(data);
        dataSource.setUsername(root);
        dataSource.setPassword(password);
        return dataSource;
    }
}
