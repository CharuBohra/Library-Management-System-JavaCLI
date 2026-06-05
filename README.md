# Library Management System

A console-based Library Management System developed using Core Java and Object-Oriented Programming principles. This application provides role-based access for Administrators and Users, enabling efficient management of books, orders, borrowing operations, and fine calculations through a menu-driven interface.

---

## Features

### User Management

* User Registration
* User Login
* Role-Based Access Control (Admin and Normal User)

### Book Management

* Add Books
* Delete Books
* View Available Books
* Search Books

### Order Management

* Place Orders
* View Orders

### Borrowing Management

* Borrow Books
* Return Books
* Fine Calculation for Late Returns

### Data Management

* Delete All Stored Data
* Persistent Storage Using Files
* Automatic Data Loading on Application Startup

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* File Handling
* Collections Framework (ArrayList)
* IntelliJ IDEA
* Git & GitHub

---

## Project Structure

```text
LibraryManagementSystem
│
├── src
│   ├── data
│   │   ├── Books
│   │   ├── Users
│   │   └── Orders
│   │
│   └── Library
│       ├── Main.java
│       ├── Database.java
│       ├── User.java
│       ├── Admin.java
│       ├── NormalUser.java
│       ├── Book.java
│       ├── Order.java
│       ├── Borrowing.java
│       │
│       ├── IOOperation.java
│       │
│       ├── AddBook.java
│       ├── DeleteBook.java
│       ├── Search.java
│       ├── ViewBooks.java
│       ├── ViewOrders.java
│       ├── PlaceOrder.java
│       ├── BorrowBook.java
│       ├── ReturnBook.java
│       ├── CalculateFine.java
│       ├── DeleteAllData.java
│       └── Exit.java
│
├── .gitignore
└── README.md
```

---

## Object-Oriented Programming Concepts Implemented

* Classes and Objects
* Inheritance
* Abstract Classes
* Interfaces
* Constructor Overloading
* Method Overriding
* Encapsulation
* Polymorphism

---

## Java Concepts Used

* File Handling
* Exception Handling
* ArrayList Collections
* Scanner Class
* String Manipulation
* Menu-Driven Programming
* Data Persistence

---

## How to Run

1. Clone the repository:

```bash
git clone <repository-url>
```

2. Open the project in IntelliJ IDEA.

3. Configure JDK 21 (or compatible Java version).

4. Run:

```text
Main.java
```

5. Use the console menu to interact with the application.

---

## Sample Functionalities

### Admin

* Add Books
* Delete Books
* Search Books
* View Books
* View Orders
* Delete All Data

### Normal User

* View Books
* Search Books
* Place Orders
* Borrow Books
* Return Books
* Calculate Fine

---

## Future Enhancements

* MySQL Database Integration
* Spring Boot Backend
* REST APIs
* JWT Authentication
* Graphical User Interface
* Book Availability Reports
* Email Notifications
* Enhanced Validation and Error Handling

---

## Learning Outcomes

This project helped in understanding:

* Java Project Structure
* Object-Oriented Design
* File-Based Data Persistence
* Interface-Based Design
* Debugging Runtime Exceptions
* Building Menu-Driven CLI Applications
* Git and GitHub Workflow

---

## Author

**Charu N Bohra**
