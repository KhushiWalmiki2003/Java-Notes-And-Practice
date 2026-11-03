package com.example.pattern;

public class Main {
    public static void main(String[]args){
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();

        obj1.showMessage();
        obj2.showMessage();
        obj3.showMessage();

//        System.out.println(obj1 == obj2);
//        System.out.println(obj2 == obj3);
    }
}
