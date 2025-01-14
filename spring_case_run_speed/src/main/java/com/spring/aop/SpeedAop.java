package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpeedAop {

    //切入点表达式  匹配service里面的所有方法
    @Pointcut("execution(* com.spring.service.OrderService.*(..))")
    public void pt(){}

    //环绕型的通知类型
    @Around("pt()")
    public Object testSpeed(ProceedingJoinPoint pjp) throws Throwable {
        //计算当前时间的毫秒值
        long start = System.currentTimeMillis();

        //获取接入点的类名
        Class className = pjp.getSignature().getDeclaringType();
        System.out.println(className);

        //方法名字
        String methedName = pjp.getSignature().getName();
        System.out.println(methedName);

        //class org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint，获取的是pjp对象即的代理对象本身的类
        Class<? extends ProceedingJoinPoint> aClass = pjp.getClass();
        System.out.println(aClass);

        //获取的是被代理的对象
        Object target = pjp.getTarget();
        System.out.println(target);

        //定义返回值
        Object proceed=null;

        //调用原始方法,执行一万次
        for (int i = 0; i < 10000; i++) {
             proceed = pjp.proceed();
        }

        //计算执行过后的当前毫秒
        long end = System.currentTimeMillis();

        System.out.println(end-start);
        //这里返回的是最后一次查询结果
        return proceed;

    }
}
