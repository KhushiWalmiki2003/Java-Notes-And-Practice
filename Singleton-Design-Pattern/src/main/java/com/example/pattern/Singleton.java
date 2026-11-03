package com.example.pattern;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton Object Created.");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello From Singleton Class.");
    }
}
