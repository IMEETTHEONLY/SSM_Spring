package com.spring.dao.impl;

import com.spring.dao.CourseDao;

public class CourseDaoImpl implements CourseDao {
    @Override
    public void save() {
        System.out.println("course dao save...");
    }
}
