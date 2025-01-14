package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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
    @Around("pt()")
    public Object trim(ProceedingJoinPoint pjp) throws Throwable {
        //先获取到参数
        Object[] args = pjp.getArgs();

        //遍历数组，去掉空格
        for (int i = 0; i < args.length; i++) {
            //先判断该参数是不是字符串，都不是字符串就不处理
            if(args[i].getClass().equals(String.class)){
                //参数是object的对象，所以说我要先转为字符串
                args[i]=args[i].toString().trim();
            }
        }
        //调用原方法即可
        Object proceed = pjp.proceed(args);

        return proceed;

    }


}
