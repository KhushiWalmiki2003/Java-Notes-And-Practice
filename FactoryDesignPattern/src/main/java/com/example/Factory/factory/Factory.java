package com.example.Factory.factory;

import com.example.Factory.Impl.GooglePaymentServiceImpl;
import com.example.Factory.Impl.PhonePayServiceImpl;
import com.example.Factory.Impl.UpiPaymentServiceImpl;
import com.example.Factory.Service.PaymentService;

public class Factory {
    public static PaymentService createObject(String type){
        if (type.equals("google"))
            return new GooglePaymentServiceImpl();
        if(type.equals("phone"))
            return new PhonePayServiceImpl();
        if(type.equals("upi"))
            return new UpiPaymentServiceImpl();
        return null;
    }
}
