package com.ObjectModelling;

import java.util.ArrayList;
import java.util.List;

// Class representing a Course
class Course {
    String courseName; // Name of the course
    List<Student> enrolledStudents = new ArrayList<>(); // List of students enrolled in this course

    // Constructor to initialize the course name
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this); // Ensure association in both directions
        }
    }

    // Method to display all students enrolled in this course
    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.name);
        }
    }
}

// Class representing a Student
class Student {
    String name; // Name of the student
    List<Course> enrolledCourses = new ArrayList<>(); // List of courses the student is enrolled in

    // Constructor to initialize the student's name
    public Student(String name) {
        this.name = name;
    }

    // Method to enroll the student in a course
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this); // Ensure association in both directions
        }
    }

    // Method to display all courses the student is enrolled in
    public void showEnrolledCourses() {
        System.out.println("Student: " + name + " - Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println(" - " + course.courseName);
        }
    }
}

// Class representing a School
class School {
    String schoolName; // Name of the school
    List<Student> students = new ArrayList<>(); // Aggregated list of students in the school

    // Constructor to initialize the school name
    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to display all students in the school
    public void showStudents() {
        System.out.println("School: " + schoolName + " - Students:");
        for (Student student : students) {
            System.out.println(" - " + student.name);
        }
    }
}

// Main class to demonstrate the relationships
public class SchoolManagement {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Maharishi Vidya Mandir");

        // Create students
        Student sahil = new Student("Sahil");
        Student abhi = new Student("Abhishek");
        Student raj = new Student("Raj");

        // Add students to the school
        school.addStudent(sahil);
        school.addStudent(abhi);
        school.addStudent(raj);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Enroll students in courses
        sahil.enrollInCourse(math);
        sahil.enrollInCourse(science);
        abhi.enrollInCourse(math);
        raj.enrollInCourse(history);
        raj.enrollInCourse(science);

        // Display school students
        school.showStudents();

        // Display courses each student is enrolled in
        sahil.showEnrolledCourses();
        abhi.showEnrolledCourses();
        raj.showEnrolledCourses();

        // Display students enrolled in each course
        math.showEnrolledStudents();
        science.showEnrolledStudents();
        history.showEnrolledStudents();
    }
}
