Objective:
-> The objective of this project is to develop a software system that can efficiently manage employee payroll information for different types of employees, such as full-time or  part-time employees. 

-> This project demonstrates the use of OOP principles like encapsulation, inheritance, polymorphism, and abstraction to create a well-structured and maintainable codebase. 

Key Features:
* Employee Class:-- A base class representing common attributes like employee ID, name, and salary. This class serves as the blueprint for all types of employees.
* Subclasses for Different Employee Types:-- Here we are using Subclasses such as FullTimeEmployee and PartTimeEmployee which all are  inherit from the Employee class.	
* Payroll Calculation Methods:-- Each subclass contains methods to calculate payroll specific to its employee type like a FullTimeEmployee may have a method to calculate monthly salary, 
   while a PartTimeEmployee may have a method to calculate hourly wages. 
* PayrollSystem Class:-- Here we are using payroll class that manages a collection of employees and provides functionalities like adding new employees, removing employees, and generating payroll reports.

Implementation:
* The project is implemented in Java programming language.
* Each class is designed to encapsulate data and behaviour related to a specific entity (e.g., Employee, PayrollSystem).
* Inheritance is used to establish a hierarchy among different types of employees, reducing code duplication and promoting code reuse.
* Polymorphism allows methods to be invoked on objects of different subclasses through a common interface, enhancing flexibility and scalability.
* Abstraction is employed to hide complex implementation details and provide a simplified interface for interacting with the system.
