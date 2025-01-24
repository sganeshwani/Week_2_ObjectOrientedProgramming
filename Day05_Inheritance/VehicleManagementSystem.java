// Superclass representing a generic Vehicle
class Vehicles {
    String model;     // Model of the vehicle
    int maxSpeed;     // Maximum speed of the vehicle in km/h

    // Constructor to initialize Vehicle attributes
    Vehicles(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display basic vehicle details
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface for refuel vehicles
interface Refuel {
    // Abstract method to refuel the vehicle
    void refuel();
}

// Subclass representing an Electric Vehicle, inherits Vehicle
class ElectricVehicle extends Vehicles {
    int batteryCapacity; // Battery capacity in kWh

    // Constructor to initialize ElectricVehicle attributes
    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed); // Call superclass constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    void charge() {
        System.out.println("Charging " + model + " with battery capacity: " + batteryCapacity + " kWh");
    }

    // Override to include electric vehicle-specific details
    @Override
    void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass representing a Petrol Vehicle, inherits Vehicle and implements Refuel
class PetrolVehicle extends Vehicles implements Refuel {
    int fuelTankCapacity; // Fuel tank capacity in liters

    // Constructor to initialize PetrolVehicle attributes
    PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed); // Call superclass constructor
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implementation of the refuel method from the Refuel interface
    @Override
    public void refuel() {
        System.out.println("Refueling " + model + " with tank capacity: " + fuelTankCapacity + " liters");
    }

    // Override to include petrol vehicle-specific details
    @Override
    void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

// Main class to demonstrate hybrid inheritance
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create an ElectricVehicle object
        ElectricVehicle eV = new ElectricVehicle("Tesla Model 3", 200, 75);
        // Create a PetrolVehicle object
        PetrolVehicle pV = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display details and invoke specific behaviors
        System.out.println("Electric Vehicle Details:");
        eV.displayDetails();
        eV.charge();

        System.out.println("\nPetrol Vehicle Details:");
        pV.displayDetails();
        pV.refuel();
    }
}
