package com.example.Factory.Impl;

import com.example.Factory.Service.PaymentParent;
import com.example.Factory.Service.PaymentService;

public class GooglePaymentServiceImpl extends PaymentParent {

    @Override
    public void Process() {
    System.out.println("Process Data for GooglePay Payment.");
    }

    @Override
    public String Print() {
        System.out.println("GooglePay Payment Print.");
        return "GooglePay Done Successfully..";
    }
}
