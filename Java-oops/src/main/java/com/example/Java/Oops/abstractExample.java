package com.example.Java.Oops;
abstract class vechicle{
    abstract void start();
    void stop(){
        System.out.println("Stopped Vechicle...");
    }
}
class car extends  vechicle{

    @Override
    void start() {
        System.out.println("Car starts with a Key.");
    }
}
public class abstractExample {
    public static void main(String[]args){
        vechicle v=new car();
        v.start();
        v.stop();
    }
}

