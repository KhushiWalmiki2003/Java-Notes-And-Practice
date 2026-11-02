package com.example.Java.Polymorphism;

public class MethodOverridingExample {
    public static void main(String[]args){
        College c=new College();
        c.friends();

    }
}
class school{
    void friends(){
        System.out.println("School Friends.....");
    }
}
class Coaching extends school{
    @Override
    void friends(){
        System.out.println("Coaching Friends.....");
    }
}
class College extends Coaching{
    @Override
    void friends(){
        System.out.println("College Friends.....");
    }
}