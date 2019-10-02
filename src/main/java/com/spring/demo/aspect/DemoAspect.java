package com.spring.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class DemoAspect {

  /*  @Around("execution(* com.spring.demo.*.*(..))")
    public void logAfterThrowingAllMethods(ProceedingJoinPoint joinPoint) throws Throwable {

        //System.out.println("Logging:"+joinPoint);
    }
*/

    //@Around("execution(public * *(..))")
    @Around("within(com.spring.demo..*)")
    public Object time(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Object value;

        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throw throwable;
        } finally {
            //System.out.println("Logging:"+proceedingJoinPoint);
        }

        return value;
    }

    @AfterThrowing(value = "within(com.spring.demo..*)",throwing = "e")
    public void errorhandling(final JoinPoint joinPoint,Throwable e) throws Throwable {

        System.out.println("Exception thrown in Method="+joinPoint.toString()+":"+e.getMessage());
    }


}