public class Vehicle {
    // Static variable to hold the registration fee for all vehicles
    static double registrationFee = 400;

    // Instance variables for vehicle details
    String ownerName;
    String vehicleType;

    // Final variable for vehicle registration number (cannot be changed)
    final String registrationNumber;

    // Constructor to initialize vehicle details
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle.");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Sahil", "Car", "BMW");
        Vehicle v2 = new Vehicle("Rahul", "Bike", "Ninja");

        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(500);

        // Display vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}