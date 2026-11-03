# Singleton Design Pattern in Java

## 1. Introduction

The **Singleton Design Pattern** is a Creational Design Pattern that ensures a class has only one instance throughout the application and provides a global access point to that instance.

It is useful when we want to maintain a single shared object instead of creating multiple objects.

### Real-Life Examples
- Database Configuration Manager
- Logger
- Application Configuration
- Cache Manager

## 2. Key Concepts

The Singleton Design Pattern mainly uses three concepts:

1. **Private Constructor:** Prevents object creation from outside the class.
2. **Static Instance Variable:** Stores the single instance of the class.
3. **Public Static Method:** Provides global access to the instance.

## 3. Project Structure

```text
SingletonDesignPattern/
│
├── src/
│   └── com/
│       └── example/
│           └── pattern/
│               ├── Singleton.java
│               └── Main.java
│
└── README.md
```

## 4. Implementation

### Singleton.java

```java
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

    public void showMessage() {
        System.out.println("Hello From Singleton Class.");
    }
}
```

### Main.java

```java
package com.example.pattern;

public class Main {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        obj1.showMessage();
        obj2.showMessage();
        obj3.showMessage();

        System.out.println(obj1 == obj2);
        System.out.println(obj2 == obj3);
    }
}
```

## 5. Code Explanation

| Component | Description |
|---|---|
| `private static Singleton instance` | Stores the single instance of the class. |
| `private Singleton()` | Prevents creating objects using the new keyword from outside the class. |
| `synchronized` | Ensures thread-safe access to the instance creation method. |
| `getInstance()` | Creates the instance if it does not exist; otherwise, returns the existing instance. |
| `showMessage()` | Demonstrates the functionality of the Singleton object. |

## 6. Output

```text
Singleton Object Created.
Hello From Singleton Class.
Hello From Singleton Class.
Hello From Singleton Class.
true
true
```

### Output Explanation

- The constructor executes only once.
- All three references point to the same object.
- `obj1 == obj2` returns `true`.
- `obj2 == obj3` returns `true`.

This confirms that only one instance is created.

## 7. Types of Singleton Implementation

1. Eager Initialization Singleton
2. Lazy Initialization Singleton
3. Thread-Safe Singleton
4. Double-Checked Locking Singleton
5. Bill Pugh Singleton
6. Enum Singleton

## 8. Advantages

- Ensures only one instance of a class.
- Provides global access to the instance.
- Avoids unnecessary object creation.
- Useful for shared resources.
- Thread-safe when implemented correctly.

## 9. Disadvantages

- Can introduce global state into an application.
- Can make unit testing difficult.
- Requires careful handling in multithreaded applications.
- Can be misused as a replacement for dependency injection.



## 10. Conclusion

The Singleton Design Pattern ensures that only one instance of a class exists throughout the application.

In this implementation, we used **Lazy Initialization with synchronized method** to achieve thread-safe Singleton object creation.

It is an important Creational Design Pattern in Java and is frequently discussed in technical interviews.

---

**Technologies Used:** Java

**Design Pattern:** Singleton Design Pattern

**Category:** Creational Design Pattern