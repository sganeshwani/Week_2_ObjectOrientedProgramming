package com.ObjectModelling;

import java.util.ArrayList;
import java.util.List;

// Class representing a Patient entity
class Patient {
    String patientName; // Name of the patient
    int patientId; // Unique identifier for the patient
    List<Doctor> doctorsConsulted = new ArrayList<>(); // List of doctors consulted by the patient

    // Constructor to initialize patient details
    Patient(String patientName, int patientId) {
        this.patientName = patientName;
        this.patientId = patientId;
    }

    // Method to display patient details
    public void patientDetail() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient ID: " + patientId);
        System.out.print("Doctors Consulted: ");
        for (Doctor doctor : doctorsConsulted) {
            System.out.print(doctor.doctorName + ", ");
        }
        System.out.println('\n');
    }
}

// Class representing a Doctor entity
class Doctor {
    String doctorName; // Name of the doctor
    int doctorId; // Unique identifier for the doctor
    List<Patient> patients = new ArrayList<>(); // List of patients consulted by the doctor

    // Constructor to initialize doctor details
    Doctor(String doctorName, int doctorId) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
    }

    // Method to handle consultation with a patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        if (!patient.doctorsConsulted.contains(this)) {
            patient.doctorsConsulted.add(this);
        }
        System.out.println("Consultation: " + doctorName + " is consulting Patient " + patient.patientName);
    }

    // Method to display doctor details
    public void doctorDetail() {
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Doctor ID: " + doctorId);
        System.out.print("Patients Consulted: ");
        for (Patient patient : patients) {
            System.out.print(patient.patientName + ", ");
        }
        System.out.println('\n');
    }
}

// Class representing the Hospital entity
public class Hospital {
    public static void main(String[] args) {
        // Creating doctor instances
        Doctor drAhaan = new Doctor("Dr. Ahaan", 101);
        Doctor drAnuj = new Doctor("Dr. Anuj", 102);
        Doctor drRitu = new Doctor("Dr. Ritu", 103);

        // Creating patient instances
        Patient raju = new Patient("Raju", 201);
        Patient palak = new Patient("Palak", 202);
        Patient tanmay = new Patient("Tanmay", 203);

        // Simulating consultations
        drAhaan.consult(raju);
        drAnuj.consult(palak);
        drRitu.consult(tanmay);
        drAhaan.consult(palak);
        drAnuj.consult(raju);

        // Displaying doctor details
        System.out.println("Doctor Details:");
        drAhaan.doctorDetail();
        drAnuj.doctorDetail();
        drRitu.doctorDetail();

        // Displaying patient details
        System.out.println("Patient Details:");
        raju.patientDetail();
        palak.patientDetail();
        tanmay.patientDetail();
    }
}
