// Superclass representing a general Device
class Device {
    String deviceId;  // Unique id for the device
    String status;    // Current status of the device (e.g., ON/OFF)

    // Constructor to initialize Device attributes
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display the general status of the device
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass representing a Thermostat, inherits Device
class Thermostat extends Device {
    double temperatureSetting; // Current temperature setting in Celsius

    // Constructor to initialize Thermostat-specific and general attributes
    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Override to include Thermostat-specific details
    @Override
    void displayStatus() {
        super.displayStatus(); // Call superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to demonstrate single inheritance
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Create a Thermostat object with specific details
        Thermostat thermostat = new Thermostat("T123", "ON", 22.5);
        // Display the status of the Thermostat
        thermostat.displayStatus();
    }
}