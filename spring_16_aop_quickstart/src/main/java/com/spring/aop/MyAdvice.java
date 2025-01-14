package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component  //让spring去加载这个bean
@Aspect  //但是你要让spring知道这不是单单的一个javabean而是一个切面类
public class MyAdvice {
    //定义切面，即绑定通知和切点的关系
    @Pointcut("execution(void com.spring.service.BookService.update())")
    private void pt(){}


    //定义抽取出来的通知方法
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

}
