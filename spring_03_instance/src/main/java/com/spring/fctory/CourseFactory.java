package com.spring.fctory;

import com.spring.dao.impl.CourseDaoImpl;

public class CourseFactory {
    //创建相应的对象即可
    public static CourseDaoImpl getCourseDao(){
        return new CourseDaoImpl();
    }
}
