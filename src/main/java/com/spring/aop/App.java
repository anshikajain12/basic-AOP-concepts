package com.spring.aop;


import com.spring.aop.service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.spring.aop/config.xml");
        PaymentService paymentService = context.getBean("paymentService", PaymentService.class);
        paymentService.makePayment(123);
    }
}
