// Superclass representing a generic Vehicle
class Vehicle {
    int maxSpeed;
    String fuelType;

    // Constructor to initialize Vehicle attributes
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display general vehicle information
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass for Car, inherits Vehicle
class Car extends Vehicle {
    int seatCapacity;    // Number of seats in the car

    // Constructor to initialize Car attributes
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Call superclass constructor
        this.seatCapacity = seatCapacity;
    }

    // Override to include Car-specific details
    @Override
    void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass for Truck, inherits Vehicle
class Truck extends Vehicle {
    int loadCapacity;    // Load capacity in tons

    // Constructor to initialize Truck attributes
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType); // Call superclass constructor
        this.loadCapacity = loadCapacity;
    }

    // Override to include Truck-specific details
    @Override
    void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass for Motorcycle, inherits Vehicle
class Motorcycle extends Vehicle {
    boolean hasSideCar;  // Indicates if the motorcycle has a sidecar

    // Constructor to initialize Motorcycle attributes
    Motorcycle(int maxSpeed, String fuelType, boolean hasSideCar) {
        super(maxSpeed, fuelType); // Call superclass constructor
        this.hasSideCar = hasSideCar;
    }

    // Override to include Motorcycle-specific details
    @Override
    void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Has Sidecar: " + (hasSideCar ? "Yes" : "No"));
    }
}

// Main class to demonstrate inheritance and polymorphism
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        // Array of Vehicle type to store objects of different subclasses
        Vehicle[] vehicles = new Vehicle[3];

        // Creating and storing subclass objects
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(150, "Petrol", false);

        // Displaying details of each vehicle using polymorphism
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + " Details:");
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
