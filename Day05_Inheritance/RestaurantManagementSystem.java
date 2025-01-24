// Interface: Worker
interface Worker {
    // Abstract method to be implemented by subclasses
    void performDuties();
}

// Superclass: Person
class Persons {
    // Common attributes for all persons
    String name;
    int id;

    // Constructor to initialize name and id
    Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display method for common person information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Subclass: Chef
class Chef extends Persons implements Worker {
    // Additional attribute for Chef
    String specialty;

    // Constructor to initialize Chef attributes
    Chef(String name, int id, String specialty) {
        super(name, id); // Call the Person constructor
        this.specialty = specialty;
    }

    // Implement the performDuties method from Worker interface
    public void performDuties() {
        System.out.println(name + " is cooking " + specialty + ".");
    }

    // Method to display chef-specific details
    void displayChefDetails() {
        displayInfo();
        System.out.println("Specialty: " + specialty);
    }
}

// Subclass: Waiter
class Waiter extends Persons implements Worker {
    // Additional attribute for Waiter
    String section;

    // Constructor to initialize Waiter attributes
    Waiter(String name, int id, String section) {
        super(name, id); // Call the Person constructor
        this.section = section;
    }

    // Implement the performDuties method from Worker interface
    public void performDuties() {
        System.out.println(name + " is serving customers in section " + section + ".");
    }

    // Method to display waiter-specific details
    void displayWaiterDetails() {
        displayInfo();
        System.out.println("Section: " + section);
    }
}

// Main class to test the system
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create objects for Chef and Waiter
        Chef chef = new Chef("Master Chef", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Akshay Kumar", 102, "A");

        // Display details and perform duties for Chef
        chef.displayChefDetails();
        chef.performDuties();

        // Display details and perform duties for Waiter
        waiter.displayWaiterDetails();
        waiter.performDuties();
    }
}

