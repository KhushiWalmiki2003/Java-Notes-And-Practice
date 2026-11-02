package com.example.Java.Oops;
class parent{
    String name="Parent";
    void display(){
        System.out.println("Parent Method.");
    }
}
class Child extends parent{
    String name="Child";
    void show(){
        System.out.println(super.name);
        super.display();
    }
}
public class SuperExample {
    public static void main(String[]args){
        Child c=new Child();
        c.show();
    }
}
