# Factory Design Pattern in Java

## 1. Introduction

The Factory Design Pattern is a **Creational Design Pattern** used to create objects without exposing the object creation logic to the client.

Instead of creating objects directly using the `new` keyword in the controller, we use a Factory class to decide which implementation object should be created.

## 2. Project Structure

```text
src/
└── main/
    ├── java/
    │   └── com.example.Factory/
    │       ├── Controller/
    │       │   └── PaymentController.java
    │       ├── factory/
    │       │   └── Factory.java
    │       ├── Impl/
    │       │   ├── GooglePaymentServiceImpl.java
    │       │   ├── PhonePayServiceImpl.java
    │       │   └── UpiPaymentServiceImpl.java
    │       ├── Service/
    │       │   ├── PaymentParent.java
    │       │   └── PaymentService.java
    │       └── FactoryDesignPatternApplication.java
    └── resources/
```

## 3. Components Used

### 1. PaymentService (Interface)
- Defines the common payment operation.
- Provides abstraction for different payment implementations.

### 2. PaymentParent (Parent Class)
- Contains common payment-related functionality.
- Can be extended by payment implementation classes if required.

### 3. Implementation Classes
- `GooglePaymentServiceImpl` – Handles Google Pay payments.
- `PhonePayServiceImpl` – Handles PhonePe payments.
- `UpiPaymentServiceImpl` – Handles UPI payments.

### 4. Factory Class
- Responsible for creating payment service objects.
- Selects the appropriate implementation based on the payment type.
- Hides object creation logic from the controller.

### 5. PaymentController
- Accepts payment requests.
- Uses the Factory class to get the required payment service.
- Calls the payment operation.

## 4. Working Flow

1. Client sends a payment request.
2. PaymentController receives the request.
3. Controller calls the Factory class.
4. Factory checks the requested payment type.
5. Factory creates and returns the corresponding implementation.
6. Controller calls the payment method.
7. The selected payment implementation processes the request.

## 5. Example

Suppose a user wants to make a payment using one of these options:

- Google Pay
- PhonePe
- UPI

The Factory class selects the correct payment implementation based on the payment type.

## 6. Advantages

- **Loose Coupling:** Controller does not need to know how payment objects are created.
- **Code Reusability:** Common payment logic can be reused.
- **Easy Maintenance:** Object creation logic is centralized.
- **Flexibility:** New payment implementations can be added more easily.
- **Abstraction:** Hides implementation details from the client.

## 7. Real-World Use Cases

- Payment gateway systems
- Notification services
- Database connection creation
- Logging systems
- Different types of document creation

## 8. Key Concepts Used

- Interface
- Abstraction
- Inheritance
- Polymorphism
- Object creation
- Loose coupling

## 9. Conclusion

The Factory Design Pattern simplifies object creation by centralizing it in a Factory class. In this project, the Factory class selects the appropriate payment implementation, such as Google Pay, PhonePe, or UPI, without exposing the creation logic to the controller.
