class Employee {
    public int employeeID;      // Public attribute
    protected String department; // Protected attribute
    private double salary;       // Private attribute

    // Constructor to initialize Employee
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + this.salary);
        } else {
            System.out.println("Invalid salary. Must be greater than 0.");
        }
    }

    // Public method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}

// Subclass Manager extending Employee
class Manager extends Employee {

    // Constructor to initialize Manager
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary); // Call parent class constructor
    }

    // Method to display manager-specific details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Access public attribute
        System.out.println("Department: " + department); // Access protected attribute
    }
}

// Main class to test Employee and Manager classes
public class EmployeeDetail {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(101, "IT", 50000);
        emp.displayEmployeeDetails();

        System.out.println();

        // Modify the salary
        emp.setSalary(55000);

        System.out.println();

        // Create a Manager object
        Manager mgr = new Manager(102, "HR", 70000);
        mgr.displayManagerDetails();

        System.out.println();

        // Access Manager's salary via Employee method
        mgr.setSalary(75000);
        mgr.displayEmployeeDetails();
    }
}
