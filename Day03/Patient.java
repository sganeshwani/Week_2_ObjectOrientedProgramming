public class Patient {
    // Static variable to hold the hospital name for all patients
    static String hospitalName = "Global Hospital";

    // Static variable to track the total number of patients admitted
    static int totalPatients = 0;

    // Instance variables for patient details
    String name;
    int age;
    String ailment;

    // Final variable for patient ID (cannot be changed)
    final String patientID;

    // Constructor to initialize patient details
    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;  // Increment total number of patients admitted
    }

    // Static method to get the total number of patients
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Invalid patient.");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Sahil", 21, "Flu", "01");
        Patient p2 = new Patient("Rahul", 18, "Cold", "02");

        // Display total number of patients
        Patient.getTotalPatients();

        // Display patient details
        p1.displayPatientDetails();
        p2.displayPatientDetails();
    }
}