package com.problem1;
import java.util.*;

// Abstract Class: Employee
abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter and Setter methods (Encapsulation)
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

// Interface: Department
interface Department {
    void assignDepartment(String department);

    String getDepartmentDetails();
}

// Subclass: FullTimeEmployee
class FullTimeEmployee extends Employee implements Department {
    private String department;

    // Constructor
    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Implement calculateSalary for full-time employees (fixed salary)
    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    // Implement Department methods
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Subclass: PartTimeEmployee
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;
    private double hourlyRate;

    // Constructor
    public PartTimeEmployee(String employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    // Getter and Setter for work hours and hourly rate
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Implement calculateSalary for part-time employees
    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }

    // Implement Department methods
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main Class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee and PartTimeEmployee to the list
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("S137", "Sahil", 150000);
        fullTimeEmployee.assignDepartment("IT");
        employees.add(fullTimeEmployee);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("V187", "Vivek", 0, 208, 500);
        partTimeEmployee.assignDepartment("HR");
        employees.add(partTimeEmployee);

        // Display details and calculate salary for each employee
        for (Employee employee : employees) {
            System.out.println("Employee Details:");
            employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());

            // Access department details (Polymorphism via Department interface)
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
