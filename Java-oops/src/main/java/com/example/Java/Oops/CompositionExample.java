package com.example.Java.Oops;
class Engine{
    void start(){
        System.out.println("Engine Started..");
    }
}
class Car {
    private final Engine engine;
    Car(){
        engine=new Engine();
    }
    void startCar(){
        engine.start();
        System.out.println("Car started ..");
    }
}
public class CompositionExample {
    public static void main(String[]args){
       Car c=new Car();
       c.startCar();
    }
}
