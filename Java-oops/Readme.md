# Object-Oriented Programming (OOPS) in Java

## 1. Introduction

Object-Oriented Programming (OOPS) is a programming approach based on **classes and objects**.

Java is an object-oriented programming language that uses OOPS concepts to make applications:
- Reusable
- Secure
- Flexible
- Maintainable
- Easy to understand

OOPS helps us organize code into objects that contain data and methods.

## 2. Four Pillars of OOPS

The four main pillars of OOPS are:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

## 3. Class and Object

### Class

A class is a blueprint or template used to create objects.

It contains:
- Variables (data members)
- Methods (behaviour)
- Constructors

### Object

An object is an instance of a class.

**Example:**

```java
class Student {

    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Khushi";
        s1.age = 23;

        s1.display();
    }
}
```

## 4. Encapsulation

Encapsulation means wrapping data and methods into a single unit (class).

It is achieved by:
- Declaring variables as `private`.
- Providing public getter and setter methods.

**Example:**

```java
class Employee {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

**Advantages:**
- Data hiding
- Better security
- Controlled access to data
- Easy maintenance

## 5. Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

It is implemented using the `extends` keyword.

**Example:**

```java
class Parent {

    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {

    void show() {
        System.out.println("Child class");
    }
}
```

**Types of inheritance:**
1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance
4. Multiple Inheritance (not supported through classes in Java, but achievable through interfaces)
5. Hybrid Inheritance (possible through interfaces)

## 6. Polymorphism

Polymorphism means **one name, many forms**.

It allows the same method name or reference to behave differently in different situations.

### Types of Polymorphism

**1. Compile-Time Polymorphism (Method Overloading)**

Multiple methods have the same name but different parameter lists.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

**2. Runtime Polymorphism (Method Overriding)**

A child class provides its own implementation of a parent class method.

```java
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

## 7. Abstraction

Abstraction means hiding implementation details and showing only essential functionality.

It can be achieved using:
- Abstract classes
- Interfaces

**Example using abstract class:**

```java
abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike started");
    }
}
```

## 8. Method Overloading

Method overloading means defining multiple methods with the same name but different parameters in the same class.

Methods can differ by:
- Number of parameters
- Type of parameters
- Order of parameter types

**Example:**

```java
class Calculator {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }
}
```

## 9. Method Overriding

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

**Example:**

```java
class Parent {

    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    @Override
    void show() {
        System.out.println("Child method");
    }
}
```

## 10. Constructor

A constructor is a special member of a class used to initialize objects.

Important points:
- Constructor name must match the class name.
- It has no return type.
- It is called when an object is created.
- Constructors can be overloaded.

**Example:**

```java
class Student {

    Student() {
        System.out.println("Constructor called");
    }
}
```

## 11. Constructor Overloading

Constructor overloading means defining multiple constructors with different parameter lists.

```java
class Student {

    Student() {
        System.out.println("Default constructor");
    }

    Student(String name) {
        System.out.println(name);
    }
}
```

## 12. This Keyword

The `this` keyword refers to the current object of a class.

Uses:
- Access current class variables.
- Call current class methods.
- Call another constructor using `this()`.
- Pass the current object as an argument.

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}
```

## 13. Super Keyword

The `super` keyword refers to the immediate parent class object.

Uses:
- Access parent class variables.
- Call parent class methods.
- Call parent class constructor using `super()`.

```java
class Parent {

    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {

    void show() {
        super.display();
    }
}
```

## 14. Static Keyword

The `static` keyword belongs to the class rather than individual objects.

It can be used with:
- Variables
- Methods
- Initialization blocks
- Nested classes

```java
class Student {

    static String college = "ABC College";

    static void display() {
        System.out.println(college);
    }
}
```

## 15. Final Keyword

The `final` keyword is used to restrict modification.

It can be used with:

- **Final variable:** Cannot be reassigned.
- **Final method:** Cannot be overridden.
- **Final class:** Cannot be inherited.

```java
final class Demo {
    // This class cannot be extended
}
```

## 16. Association

Association represents a relationship between two independent classes.

Example: A Teacher teaches Students.

## 17. Aggregation

Aggregation is a weak "has-a" relationship.

The child object can exist independently of the parent object.

Example: A Department has Teachers. Teachers can exist even if the Department is removed.

## 18. Composition

Composition is a strong "has-a" relationship.

The contained object is managed as part of the containing object's lifecycle.

Example: A House has Rooms. In a typical composition model, Rooms are created and managed as part of the House.

## 19. Important Differences

### Overloading vs Overriding

| Method Overloading | Method Overriding |
|---|---|
| Same method name | Same method signature |
| Different parameters | Same parameters |
| Usually in the same class | Requires inheritance |
| Compile-time polymorphism | Runtime polymorphism |

### Abstraction vs Encapsulation

| Abstraction | Encapsulation |
|---|---|
| Hides implementation details | Protects and controls access to data |
| Focuses on what an object does | Focuses on how data is bundled and accessed |
| Achieved using abstract classes and interfaces | Achieved using access modifiers and methods |

### Aggregation vs Composition

| Aggregation | Composition |
|---|---|
| Weak relationship | Strong relationship |
| Objects can exist independently | Contained object's lifecycle is managed by the owner |
| Example: Department and Teacher | Example: House and Room |


## 20. Advantages of OOPS

- Code reusability through inheritance.
- Data security through encapsulation.
- Flexibility through polymorphism.
- Hides implementation details through abstraction.
- Makes large applications easier to maintain.
- Improves code organization and modularity.

## 21. Conclusion

OOPS is one of the most important concepts in Java.

Understanding classes, objects, encapsulation, inheritance, polymorphism, and abstraction provides a strong foundation for learning advanced Java concepts such as Collections, Multithreading, Spring Framework, and Spring Boot.
