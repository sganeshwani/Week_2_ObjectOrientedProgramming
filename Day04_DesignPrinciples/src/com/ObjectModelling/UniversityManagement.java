package com.ObjectModelling;

import java.util.ArrayList;
import java.util.List;

// Class representing a Faculty member
class Faculty {
    String name; // Name of the faculty member
    String expertise; // Area of expertise

    // Constructor to initialize faculty details
    public Faculty(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    // Method to display faculty details
    public void showDetails() {
        System.out.println("Faculty Name: " + name + ", Expertise: " + expertise);
    }
}

// Class representing a Department
class Department1 {
    String departmentName; // Name of the department
    List<Faculty> faculties = new ArrayList<>(); // List of faculties in the department

    // Constructor to initialize the department name
    public Department1(String departmentName) {
        this.departmentName = departmentName;
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty); // Aggregation: Faculty can exist outside of a department
    }

    // Method to display department details and its faculty members
    public void showDetails() {
        System.out.println("Department Name: " + departmentName);
        for (Faculty faculty : faculties) {
            faculty.showDetails();
        }
    }
}

// Class representing a University
class University {
    String universityName; // Name of the university
    List<Department1> departments = new ArrayList<>(); // List of departments in the university

    // Constructor to initialize the university name
    public University(String universityName) {
        this.universityName = universityName;
    }

    // Method to add a department to the university
    public void addDepartment(Department1 department) {
        departments.add(department); // Composition: Departments cannot exist outside the university
    }

    // Method to display university details, including its departments
    public void showDetails() {
        System.out.println("University Name: " + universityName);
        for (Department1 department : departments) {
            department.showDetails();
        }
    }

    // Method to simulate deletion of the university and all its departments
    public void deleteUniversity() {
        System.out.println("Deleting University: " + universityName);
        departments.clear(); // Deleting the university also deletes its departments
        System.out.println("All departments associated with the university have been deleted.");
    }
}

// Main class to demonstrate composition and aggregation relationships
public class UniversityManagement {
    public static void main(String[] args) {
        // Create faculty members
        Faculty shubh = new Faculty("Shubh", "Computer Fundamentals");
        Faculty hariom = new Faculty("Hariom", "Machine Learning");
        Faculty karan = new Faculty("Karan", "Digital Electronics");

        // Create departments
        Department1 csDepartment = new Department1("Computer Science");
        Department1 aimlDepartment = new Department1("AIML");

        // Add faculty members to departments
        csDepartment.addFaculty(shubh);
        aimlDepartment.addFaculty(hariom);

        // Create a university
        University university = new University("ABC University");

        // Add departments to the university
        university.addDepartment(csDepartment);
        university.addDepartment(aimlDepartment);

        // Display university details
        university.showDetails();

        // Faculty can exist independently of departments
        System.out.println("Independent Faculty Members:");
        shubh.showDetails();

        // Delete the university
        university.deleteUniversity();
    }
}
