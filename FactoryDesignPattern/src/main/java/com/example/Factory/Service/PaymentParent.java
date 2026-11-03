package com.example.Factory.Service;

abstract public class PaymentParent implements PaymentService {
    @Override
    public void ReadDataFromInDB() {
        System.out.println("Read Data From DB.");

    }
}
