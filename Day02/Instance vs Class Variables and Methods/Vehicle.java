public class Vehicle {
    private static double registrationFee = 400;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance methods to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    // Main method
    public static void main(String[] args) {
        // Create vehicles and display their details
        Vehicle car = new Vehicle("John Doe", "Car");
        car.displayVehicleDetails();

        Vehicle truck = new Vehicle("Jane Smith", "Truck");
        truck.displayVehicleDetails();

        // Update vehicle registration fee
        Vehicle.updateRegistrationFee(500);

        // Display vehicle details
        car.displayVehicleDetails();
        truck.displayVehicleDetails();
    }
}
