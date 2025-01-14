package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AopDate {

    //切入点
    @Pointcut("execution(* com.spring.service.*.*(..))")
    public void pt(){};

    //通知方法

    //获取参数的测试
//    @Before("pt()")
    public void method1(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        //遍历数据
        System.out.println(Arrays.toString(args));
    }

    //测试获取返回值
    @AfterReturning(value = "pt()",returning = "value")
    public void method2(Object value){
        System.out.println("AfterReturning的值是"+value);
    }

    //测试获取异常的值
//    @AfterThrowing(value = "pt()",throwing = "value")
//    public void method3(Throwable value){
//        System.out.println("AfterThrowing的值是"+value);
//    }


}
