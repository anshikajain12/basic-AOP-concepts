package com.spring.aop.aspect;


import org.aspectj.lang.annotation.*;
import org.aspectj.lang.JoinPoint;

@Aspect
public class MyAspect {

    //(..) describes the arguments
    @Pointcut("execution(* com.spring.aop.service.PaymentServiceImpl.makePayment(..))")
    public void paymentPointCut(){}


    //Advice
    @Before("paymentPointCut()")
    public void printBefore() {
        System.out.println("Payment started...");
    }

    //Advice
    @After("paymentPointCut()")
    public void printAfter() {
        System.out.println("Payment Done...");
    }

    @AfterReturning("paymentPointCut()")
    public void printJointPoint(JoinPoint joinPoint){
        System.out.println("Join point called...."+ joinPoint.getSignature()+"\n" +joinPoint.getKind());
    }
}
