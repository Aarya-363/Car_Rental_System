# Car Rental System

## 📌 Project Overview

The **Car Rental System** is a console-based Java application designed to manage basic car rental operations.

The system allows users to view available cars, rent a car, calculate the rental price, and return rented cars. It uses object-oriented programming concepts to represent cars, customers, rentals, and the overall rental system.

---

## 🛠️ Technologies Used

* **Java**
* Object-Oriented Programming (OOP)
* Java Collections
* Console-based input/output

---

## ✨ Features

* View available cars
* Rent a car
* Calculate rental price based on rental days
* Generate a customer ID
* Display rental information
* Confirm or cancel a rental
* Return a rented car
* Track car availability
* Display the customer who returned a car
* Interactive console menu

---

## 🧩 Classes

### `Car`

Represents a car in the rental system.

It stores:

* Car ID
* Brand
* Model
* Base price per day
* Availability status

It also provides methods to:

* Calculate rental price
* Check availability
* Rent a car
* Return a car

### `Customer`

Represents a customer using the rental system.

It stores:

* Customer ID
* Customer name

### `Rental`

Represents an active rental.

It connects:

* A car
* A customer
* Number of rental days

### `RentalSystem`

Manages the overall rental operations using lists of:

* Cars
* Customers
* Rentals

It handles adding cars and customers, renting cars, returning cars, and displaying the interactive menu.

### `Main`

Creates the `RentalSystem`, adds the available cars, and starts the application.

---

## 🚗 Available Cars

The program initially contains seven cars:

| ID   | Brand    | Model      | Price/Day |
| ---- | -------- | ---------- | --------: |
| C001 | Toyota   | Fortuner   |   Rs 3000 |
| C002 | Tata     | Nexon      |   Rs 1500 |
| C003 | Mahindra | Thar       |   Rs 2500 |
| C004 | Mahindra | Scorpio-S6 |   Rs 2000 |
| C005 | Suzuki   | Swift      |   Rs 1100 |
| C006 | Jeep     | Wrangler   |   Rs 3200 |
| C007 | Audi     | Q7         |   Rs 4000 |

---

## ▶️ How to Run

### 1. Compile the Java program

```bash
javac Main.java
```

### 2. Run the application

```bash
java Main
```

The application will display a console menu:

```text
===== Car Rental System =====
1. Rent a Car
2. Return a Car
3. Exit
```

---

## 🔄 Rental Process

1. Select **Rent a Car**.
2. Enter the customer's name.
3. View available cars.
4. Enter the desired car ID.
5. Enter the number of rental days.
6. The system calculates the total price.
7. Review the rental information.
8. Confirm or cancel the rental.

The rental price is calculated as:

```text
Total Price = Base Price Per Day × Rental Days
```

---

## 🔁 Return Process

1. Select **Return a Car**.
2. Enter the car ID.
3. The system checks whether the car is currently rented.
4. The car is marked as available again.
5. The system displays the customer who returned the car.

---

## 📁 Project Structure

```text
Car-Rental-System/
│
├── Main.java
├── Car.java
├── rentalsystem.java
├── README.md
└── Workflow.md
```

---

## 🎯 Learning Objectives

This project demonstrates practical implementation of:

* Classes and objects
* Encapsulation
* Constructors
* Private fields
* Getter methods
* Object relationships
* ArrayLists
* Loops and conditional statements
* User input using `Scanner`
* Basic object-oriented system design

---

## 📌 Project Purpose

The project provides a simple implementation of a car rental workflow through a Java console application while demonstrating fundamental object-oriented programming concepts.
