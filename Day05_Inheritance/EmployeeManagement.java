// Superclass represents a Employee
class Employee {
    String name; // Name of the employee
    int Id; // Id of the employee
    double salary; // salary of the employee

    // Constructor to initialize name, id and salary of the employee
    Employee(String name, int Id, double salary) {
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }

    // Method to display the details of the employee
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + Id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    // Constructor to initialize name, id and salary of the manager using the superclass constructor
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding displayDetails() method to include teamSize in the output
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails() method to include programmingLanguage in the output
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int internshipDuration;
    Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    // Overriding displayDetails() method to include internshipDuration in the output
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating objects of Employee, Manager, Developer, and Intern classes
        Manager manager = new Manager("John Doe", 123, 50000.0, 10);
        Developer developer = new Developer("Jane Smith", 456, 30000.0, "Java");
        Intern intern = new Intern("Alice Johnson", 789, 10000.0, 6);

        // Calling the displayDetails method for all
        System.out.println("Manager Details");
        manager.displayDetails();
        System.out.println("Developer Details");
        developer.displayDetails();
        System.out.println("Intern Details");
        intern.displayDetails();
    }
}