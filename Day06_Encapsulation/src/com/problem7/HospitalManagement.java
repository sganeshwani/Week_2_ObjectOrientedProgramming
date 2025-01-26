package com.problem7;

import java.util.*;
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract double calculateBill();
}

// Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient subclass
class InPatient extends Patient implements MedicalRecord {
    List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return 1000; // Flat fee for in-patient services
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String record : records) {
            System.out.println(record);
        }
    }
}

// OutPatient subclass
class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return 200; // Flat fee for outpatient services
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String record : records) {
            System.out.println(record);
        }
    }
}

// Main class for Hospital Management
public class HospitalManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("M10", "Megha", 30);
        Patient outPatient = new OutPatient("R20", "Raju", 21);

        Patient[] patients = {inPatient, outPatient};

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill: " + patient.calculateBill());
            if (patient instanceof MedicalRecord record) {
                record.addRecord("Visit on 2025-01-25");
                record.viewRecords();
            }
            System.out.println();
        }
    }
}