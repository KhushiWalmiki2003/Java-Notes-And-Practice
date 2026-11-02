package com.example.Java.Oops;
class Student{
    String name;
    Student(String  name){
        this.name=name;
    }
    void display(){
        System.out.println(this.name);
    }
}
public class thisExample {
    public static void main(String[]args){
        Student s1=new Student("Khushi Walmiki");
        s1.display();
    }
}
