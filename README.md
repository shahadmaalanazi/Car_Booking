# Car Booking System 🚗

A Java-based Car Booking System developed using Object-Oriented Programming (OOP) concepts. The system allows customers and employees to interact with a car showroom, check vehicle availability, calculate rental prices, select pickup dates, save booking information, and display car details through a simple JavaFX interface.

## Features

- Customer and Employee registration
- Password validation
- Car selection and booking
- Check car availability
- Price calculation with optional insurance
- Pickup date validation
- Save booking information to a text file
- Read saved information from a file
- JavaFX graphical interface for displaying cars

## Car Types

The system supports three types of vehicles:

- Electric Cars
- Gasoline Cars
- Hybrid Cars

Each type has:
- Different pricing calculations
- Different availability checks
- Specific attributes

## OOP Concepts Implemented

### Encapsulation
Private attributes with getters and setters.

### Inheritance
- Person → Customer, Employee
- Car → ElectricCar, GasolineCar, HybridCar

### Abstraction
- Abstract class `Person`
- Abstract class `Car`

### Polymorphism
Using parent references to interact with child objects.

### Interface
`Payable` interface implemented by classes requiring payment-related functionality.

## File Structure

```
ADDRESS.java
Car.java
Carshowroom.java
Checkout.java
Customer.java
Date.java
ElectricCar.java
Employee.java
GasolineCar.java
HybridCar.java
Payable.java
Person.java
ReadTextFile.java
WriteTextFile.java
Test.java
```

## Technologies Used

- Java
- JavaFX
- Object-Oriented Programming (OOP)
- File Handling
- Exception Handling

## How to Run

1. Open the project in NetBeans or any Java IDE.
2. Ensure JavaFX is configured.
3. Compile all Java files.
4. Run `Test.java`.
5. Follow the console instructions to:
   - Register as a customer or employee
   - Select a vehicle
   - Check availability
   - Complete checkout
   - Save booking information

## Learning Outcomes

This project was developed to practice:

- Object-Oriented Programming principles
- Inheritance and Polymorphism
- Abstract Classes and Interfaces
- File Input/Output
- Exception Handling
- JavaFX GUI Development

## Authors
Developed as a university OOP course project.
