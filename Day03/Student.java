public class Student {
    // Static variable to hold the university name for all students
    static String universityName = "XYZ University";

    // Static variable to track the total number of students
    static int totalStudents = 0;

    // Instance variables for student details
    String name;
    final int rollNumber;  // Final variable for roll number (cannot be changed)
    String grade;

    // Constructor to initialize student details
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;  // Increment total number of students
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("Not a valid student.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sahil", 137, "A");
        Student s2 = new Student("Rahul", 456, "B");

        // Display total number of students
        Student.displayTotalStudents();

        // Display student details
        s1.displayStudentDetails();
        s2.displayStudentDetails();
    }
}
