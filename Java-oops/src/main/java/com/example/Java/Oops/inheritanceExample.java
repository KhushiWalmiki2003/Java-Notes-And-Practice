package com.example.Java.Oops;

public class inheritanceExample {
    public static void main(String[]args){
       puppy p=new puppy();
       p.eat();
       p.bark();
       p.play();
    }
}

class Animal{
    String name="Animal";
    void eat(){
        System.out.println("Animal is Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking..");
    }
}
class puppy extends Dog{
    void play(){
        System.out.println("Puppy is playing...");
    }
}
