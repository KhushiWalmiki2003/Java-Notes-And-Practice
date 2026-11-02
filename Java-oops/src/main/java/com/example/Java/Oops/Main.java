package com.example.Java.Oops;
class Teacher{
    String name;
    Teacher(String name){
        this.name=name;
    }
}
class student{
    String name;
    student(String name){
        this.name=name;
    }
}
public class Main {
    public static void main(String[]args){
        Teacher t=new Teacher("John");
        Student s=new Student("Bob");
        System.out.println(t.name+" teaches "+s.name);
    }
}
