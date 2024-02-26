package org.example;

public class Main {
    public static void main(String[] args) {

        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Jyoti" ,101, 40000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Sipun", 102, 8, 300.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployee();
        System.out.println("Removing Employees ");
        payrollSystem.removeEmployee(102);
        System.out.println("Remaining Employee Details: ");
        payrollSystem.displayEmployee();
    }
}