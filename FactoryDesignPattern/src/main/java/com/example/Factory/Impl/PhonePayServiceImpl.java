package com.example.Factory.Impl;

import com.example.Factory.Service.PaymentParent;
import com.example.Factory.Service.PaymentService;

public class PhonePayServiceImpl extends PaymentParent {

    @Override
    public void Process() {
        System.out.println("Process Data for PhonePay Payement.");

    }

    @Override
    public String Print() {
        System.out.println("PhonrPay Payment Print. ");
        return "PhonePay Done Successfully..";
    }
}
