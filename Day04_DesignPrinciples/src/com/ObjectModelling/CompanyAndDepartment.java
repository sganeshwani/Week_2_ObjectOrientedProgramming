package com.ObjectModelling;

import java.util.ArrayList;
import java.util.List;

// Class representing an Employee
class Employee {
    String name; // Name of the employee
    String designation; // Designation of the employee
    int salary;
    // Constructor to initialize employee details
    public Employee(String name, String designation,int salary) {
        this.name = name;
        this.designation = designation;
        this.salary=salary;
    }

    // Method to display employee details
    public void showDetails() {
        System.out.println("Employee Name: " + name + ", Designation: " + designation+", Salary: "+salary);
    }
}

// Class representing a Department
class Department {
    String departmentName; // Name of the department
    List<Employee> employees = new ArrayList<>(); // List of employees in the department

    // Constructor to initialize the department name
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display department details and its employees
    public void showDetails() {
        System.out.println("Department Name: " + departmentName);
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }
}

// Class representing a Company
class Company {
    String companyName; // Name of the company
    List<Department> departments = new ArrayList<>(); // List of departments in the company

    // Constructor to initialize the company name
    public Company(String companyName) {
        this.companyName = companyName;
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display company details and its departments
    public void showDetails() {
        System.out.println("Company Name: " + companyName);
        for (Department department : departments) {
            department.showDetails();
        }
    }

    // Method to clear all departments and employees (simulate deletion)
    public void deleteCompany() {
        System.out.println("Deleting company: " + companyName);
        departments.clear(); // Removes all departments and associated employees
        System.out.println("Company and all associated departments and employees deleted.");
    }
}

// Main class to demonstrate the composition relationship
public class CompanyAndDepartment {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("Jio");

        // Create departments
        Department itDepartment = new Department("IT");
        Department hrDepartment = new Department("HR");

        // Add employees to IT department
        itDepartment.addEmployee(new Employee("Mukesh", "Software Engineer",56000));
        itDepartment.addEmployee(new Employee("Nita", "Network Engineer",45000));

        // Add employees to HR department
        hrDepartment.addEmployee(new Employee("Anant","Manager",65000));
        hrDepartment.addEmployee(new Employee("Akash", "Recruiter",59000));

        // Add departments to the company
        company.addDepartment(itDepartment);
        company.addDepartment(hrDepartment);

        // Display the company details
        company.showDetails();

        // Simulate deletion of the company
        company.deleteCompany();
    }
}
