package com.spring.fctory;

import com.spring.dao.OrderDao;
import com.spring.dao.impl.OrderDaoImpl;
import org.springframework.beans.factory.FactoryBean;
//这个泛型是要创建出来的对象的类型，可以是接口，多态的表现
public class OrderFactoryBean implements FactoryBean<OrderDao> {
    //这个方法就是你要创建出来的对象的具体细节
    @Override
    public OrderDao getObject() throws Exception {
        return new OrderDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        //这里是该bean的类型，返回字节码文件  与接口的泛型一致
        return OrderDao.class;
    }
}
