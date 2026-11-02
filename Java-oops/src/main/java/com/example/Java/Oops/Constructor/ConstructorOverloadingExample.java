package com.example.Java.Oops.Constructor;
class Employee{
    String name;
    int age;

    Employee(){
        name="Unknown";
        age=0;
    }
    Employee(String name){
        this.name=name;
    }
    Employee(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+" "+age);
    }
}
public class ConstructorOverloadingExample {
    public static void main(String[]args){
        Employee e1=new Employee();
        Employee e2=new Employee("Khushi");
        Employee e3=new Employee("Sujit",25);
        e1.display();
        e2.display();
        e3.display();
    }
}
