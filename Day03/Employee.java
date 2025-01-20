public class Employee {
    
    // Static variable to hold the company name shared by all employees
    static String companyName = "XYZ";
    
    // Instance variables for employee details
    String name;
    final int id;  // Final variable for employee ID, it cannot be changed once assigned
    String designation;
    
    // Static variable to keep track of the total number of employees
    static int totalEmployee = 0;

    // Constructor to initialize employee details and increment the totalEmployee count
    Employee(String name, int id, String designation){
        this.name = name;         // Initialize the name of the employee
        this.id = id;             // Initialize the employee ID (final variable)
        this.designation = designation;  // Initialize the employee's designation
        totalEmployee++;          // Increment the static totalEmployee counter each time a new employee is created
    }

    // Static method to display the total number of employees
    public static void getTotalEmployee(){
        // Display the total number of employees using the static variable totalEmployee
        System.out.println("The total no. of employees are : "+totalEmployee);
    }

    // Instance method to display details of a specific employee
    public void getEmployeeDetails(){
        // Check if the current object is an instance of Employee class (although unnecessary in this case)
        if(this instanceof Employee){
            // Display employee details
            System.out.println("Employee Name : "+name);
            System.out.println("Employee id : "+id);
            System.out.println("Employee designation : "+designation);
        }
        else{
            // This block will never be executed because `this` is always an instance of Employee
            System.out.println("Not an employee of this company.");
        }
    }

    // Main method to create Employee objects and display their details
    public static void main(String[] args) {
        // Create two Employee objects with their name, ID, and designation
        Employee e1 = new Employee("Sahil", 21, "Analyst");
        Employee e2 = new Employee("Rahul", 24, "Senior Analyst");

        // Call the static method to display the total number of employees
        getTotalEmployee();

        // Display details of employee e1
        e1.getEmployeeDetails();

        // Display details of employee e2
        e2.getEmployeeDetails();
    }
}
