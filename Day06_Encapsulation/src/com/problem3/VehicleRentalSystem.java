package com.problem3;

// Abstract class representing a generic Vehicle
abstract class Vehicle {
    private String vehicleNumber; // Vehicle number (unique identifier)
    private String type;          // Type of the vehicle (Car, Bike, Truck, etc.)
    private double rentalRate;    // Daily rental rate for the vehicle

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters for private fields
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method to calculate rental cost (to be implemented by subclasses)
    abstract double calculateRentalCost(int days);

    // Method to display basic details of the vehicle
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}

// Interface representing insurance functionality for vehicles
interface Insurable {
    double calculateInsurance(); // Method to calculate insurance cost
    void getInsuranceDetails(); // Method to display insurance details
}

// Subclass for Car, extending Vehicle and implementing Insurable
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate); // Call parent class constructor
    }

    // Implementation of calculateRentalCost for Car
    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days; // Rental cost = rental rate * number of days
    }

    // Implementation of calculateInsurance for Car
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // Insurance is 10% of rental rate
    }

    // Implementation of getInsuranceDetails for Car
    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance: " + calculateInsurance());
    }
}

// Subclass for Bike, extending Vehicle and implementing Insurable
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate); // Call parent class constructor
    }

    // Implementation of calculateRentalCost for Bike
    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days; // Rental cost = rental rate * number of days
    }

    // Implementation of calculateInsurance for Bike
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // Insurance is 5% of rental rate
    }

    // Implementation of getInsuranceDetails for Bike
    @Override
    public void getInsuranceDetails() {
        System.out.println("Bike Insurance: " + calculateInsurance());
    }
}

// Subclass for Truck, extending Vehicle and implementing Insurable
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate); // Call parent class constructor
    }

    // Implementation of calculateRentalCost for Truck
    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days; // Rental cost = rental rate * number of days
    }

    // Implementation of calculateInsurance for Truck
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2; // Insurance is 20% of rental rate
    }

    // Implementation of getInsuranceDetails for Truck
    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance: " + calculateInsurance());
    }
}

// Main class to demonstrate the Vehicle Rental System
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create objects for different types of vehicles
        Vehicle car = new Car("C001", 1000);
        Vehicle bike = new Bike("B001", 500);
        Vehicle truck = new Truck("T001", 2000);

        // Store all vehicles in an array
        Vehicle[] vehicles = {car, bike, truck};

        // Iterate over the array and display details, rental cost, and insurance for each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
            if (vehicle instanceof Insurable) {
                ((Insurable) vehicle).getInsuranceDetails();
            }
            System.out.println();
        }
    }
}
