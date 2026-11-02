package com.example.Java.Oops;
interface Payment{
    void Pay();
}
class GoogplePay implements  Payment{

    @Override
    public void Pay() {
        System.out.println("Payment done Using Google Pay.");
    }
}
public class abstractionUsingInterface {
    public static void main(String[]args){
        Payment p=new GoogplePay();
        p.Pay();
    }

}
