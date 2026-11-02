package com.example.Java.Oops.Constructor;
class student{
    String name;
    int age;
    student(){
        name="Khushi";
        age=23;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class ConstructorExample {
    public static void main(String[]args){
        student s=new student();
        s.display();
    }
}
