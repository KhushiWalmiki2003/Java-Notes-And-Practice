package com.example.Factory.Impl;

import com.example.Factory.Service.PaymentParent;
import com.example.Factory.Service.PaymentService;

public class UpiPaymentServiceImpl extends PaymentParent {


    @Override
    public void Process() {
    System.out.println("Process Data for UPI Payement.");
    }

    @Override
    public String Print() {
        System.out.println("UPI Payment Print.");
        return "UPIPayment Done Successfully";
    }
}
