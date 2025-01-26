package com.problem8;

//Abstract class
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters and setters to ensure encapsulation of private fields
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Concrete method to display vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    // Abstract method to calculate fare based on distance
    public abstract double calculateFare(double distance);
}

// Interface GPS defining location-related methods
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Subclass Car extending Vehicle and implementing GPS
class Car extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor to initialize Car-specific details
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass Bike extending Vehicle and implementing GPS
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass Auto extending Vehicle and implementing GPS
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Main class to demonstrate polymorphism and functionality of the system
public class RideHailing {
    public static void main(String[] args) {
        // Create instances of different vehicle types
        Vehicle car = new Car("C10", "Roopchand", 15.0, "Amravati");
        Vehicle bike = new Bike("B20", "Sahil", 10.0, "Mumbai");
        Vehicle auto = new Auto("A30", "Mohan", 12.0, "Bhopal");

        // Array of vehicles to demonstrate polymorphism
        Vehicle[] vehicles = {car, bike, auto};

        // Process each vehicle and calculate fares for a given distance
        double distance = 10.5; // Example distance in kilometers
        for (Vehicle vehicle : vehicles) {
            System.out.println("\nVehicle Details:");
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

            // Demonstrating GPS functionality if applicable
            if (vehicle instanceof GPS gps) {
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("TIT");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
        }
    }
}
