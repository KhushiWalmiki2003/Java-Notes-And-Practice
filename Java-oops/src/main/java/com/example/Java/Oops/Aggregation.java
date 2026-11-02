package com.example.Java.Oops;
class Teacherr{
    String name;
    Teacherr(String name){
        this.name=name;
    }
}
class Department{
    Teacherr teacher;
    Department(Teacherr teacher){
        this.teacher=teacher;
    }
    void  display(){
        System.out.println(teacher.name);
    }
}
public class Aggregation {
    public static void main(String[]agrs){
        Teacherr t=new Teacherr("Khushi");
        Department d=new Department(t);
        d.display();
    }
}
