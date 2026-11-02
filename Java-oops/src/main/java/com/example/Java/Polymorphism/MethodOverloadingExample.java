package com.example.Java.Polymorphism;

public class MethodOverloadingExample {
   public static void main(String[]args){
       calculator c=new calculator();
     System.out.println(  c.add(100,20));
      System.out.println(c.add(50,100,30));
      System.out.println(c.add(10.5,100.5));
   }
}
class calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a, double b) {
        return a + b;
    }

}