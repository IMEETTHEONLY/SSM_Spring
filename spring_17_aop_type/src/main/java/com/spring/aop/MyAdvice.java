package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component  //让spring去加载这个bean
@Aspect  //但是你要让spring知道这不是单单的一个javabean而是一个切面类
public class MyAdvice {
    //定义切面，即绑定通知和切点的关系
    @Pointcut("execution(void com.spring.service.BookService.update())")
    private void pt(){}

    @Pointcut("execution(int com.spring.service.BookService.save())")
    private void pt2(){}

    @Pointcut("execution(int com.spring.service.BookService.save())")
    private void pt3(){}




    //定义抽取出来的通知方法
//    @Before("pt()")
//    @After("pt()")
//    public void method1(){
//        System.out.println("update after run...");
//    }

//    @Around("pt2()")
//    //想要执行原方法就要加入这个参数然后去调用方法即可
//    public Object method2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        //around的前置方法执行
//        System.out.println("around before run...");
//        //这里调用原始方法必须抛出异常，因为aop代理是增强功能，不会帮你捕获异常
//        Integer proceed = (Integer)proceedingJoinPoint.proceed();
//        System.out.println(proceed);
//
//
//        System.out.println("around after run");
//
//        //如果说原方法返回了，这里也要进行返回,可以将原始方法的返回值返回
//        return proceed;
//    }


    //测试afterReturn
    //有异常就不会执行
//    @AfterReturning("pt3()")
//    public void method1(){
//        System.out.println("save AfterReturning run...");
//    }

    //测试afterThrow
    //有异常才会执行
//    @AfterThrowing("pt3()")
//    public void method1(){
//        System.out.println("save AfterReturning run...");
//    }

}
