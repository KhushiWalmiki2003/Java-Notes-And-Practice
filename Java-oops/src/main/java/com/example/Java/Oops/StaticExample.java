package com.example.Java.Oops;
class Employee{
    int id;
    static String company=" - ABC Technologies";
    Employee(int id){
        this.id=id;
    }
    void display(){
        System.out.println(id+""+company);
    }
}
public class StaticExample {
    public static void main(String[]args){
        Employee e1=new Employee(101);
        Employee e2=new Employee(102);
        e1.display();
        e2.display();
    }
}
