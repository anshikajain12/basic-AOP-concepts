package com.spring.aop.service;

public class PaymentServiceImpl implements PaymentService {

    public void makePayment(int amount) {
        //payment code
        System.out.println(amount + " Amount Debited...");
        System.out.println(amount + " Amount credited...");
    }
}
