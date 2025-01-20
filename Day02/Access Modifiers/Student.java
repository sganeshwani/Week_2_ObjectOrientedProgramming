public class Student {
    // Public variable: accessible anywhere
    public int rollNumber;

    // Protected variable: accessible within the same package and subclasses
    protected String name;

    // Private variable: accessible only within the Student class
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter method for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter method for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    // Additional attribute for PostgraduateStudent
    private String thesisTitle;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }

    // Method to display Postgraduate Student details
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // Accessing public variable
        System.out.println("Name: " + name); // Accessing protected variable
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

// Main class
class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a Student instance
        Student student1 = new Student(137, "Sahil", 8.5);
        student1.displayStudentDetails();

        // Modify and access the private CGPA variable via methods
        student1.setCGPA(9.0);
        System.out.println("\nUpdated CGPA: " + student1.getCGPA());

        // Create a PostgraduateStudent instance
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Rahul", 8.8, "AI in Healthcare");
        System.out.println();
        pgStudent.displayPostgraduateDetails();
    }
}
