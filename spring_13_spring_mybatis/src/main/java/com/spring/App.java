package com.spring;

import com.spring.dao.OrderDao;
import com.spring.domain.Orders;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

public class App {
    //mybatis的原始开发流程
    public static void main(String[] args) throws IOException {
        //1.创建builder对象，这个对象是用来加载配置文件的  这个包在于依赖mybatis下面(jar包)
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        //2.用Resource对象读取配置文件
        InputStream inputStearm = Resources.getResourceAsStream("SqlMapConfig.xml");
        //3.创建创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStearm);
        //4.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5.连接dao层获取查询语句
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);

        //调用mapper里面的方法
        Orders orderById = mapper.getOrderById(1);
        System.out.println(orderById);

        //释放资源
        sqlSession.close();


    }
}
