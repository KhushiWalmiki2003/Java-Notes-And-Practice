package com.example.Java.Oops;

public class EncapsulationExample {
    public static void main(String[]args){
     EncapsulationExample e=new EncapsulationExample("khushi",39);
     System.out.println(e);
    }
    private String name;
    private int age;
    public EncapsulationExample(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void SetName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void SetAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Name = "+name+", Age = "+age;
    }
}
