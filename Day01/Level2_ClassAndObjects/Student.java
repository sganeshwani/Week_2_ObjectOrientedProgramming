import java.util.*;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    //Constructor to initialize attributes
    public Student (String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //Method to calculate grade
    public char calculateGrade() {
        if(marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else if (marks >= 27) {
            return 'D';
        } else {
            return 'F';
        }
    }

    //Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marks);
    }

    //Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input student details
        System.out.println("Enter student's name: ");
        String name = input.nextLine();
        System.out.println("Enter roll number: ");
        int rollNumber = input.nextInt();
        System.out.println("Enter marks: ");
        double marks = input.nextDouble();

        //Create student object using constructor and display details
        Student student = new Student(name, rollNumber, marks);
        student.displayDetails();
    }
}
