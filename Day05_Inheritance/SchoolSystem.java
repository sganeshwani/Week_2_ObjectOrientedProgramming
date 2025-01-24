// Superclass: Person
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to be overridden by subclasses
    public void displayRole() {
        System.out.println("Role: Generic Person");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    // Constructor
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayRole method to specify it's a teacher
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    String grade;

    // Constructor
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Overriding displayRole method to specify it's a student
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String position;

    // Constructor
    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    // Overriding displayRole method to specify it's a staff member
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Position: " + position);
    }
}

// Main class to test the school system
public class SchoolSystem {
    public static void main(String[] args) {
        // Create objects for different roles
        Person teacher = new Teacher("Bhuvan", 24, "Computer Science");
        Person student = new Student("Vishnu", 28, "A");
        Person staff = new Staff("Amol", 30, "Mentor");

        // Display information for each person
        System.out.println("Teacher Information:");
        teacher.displayInfo();
        teacher.displayRole();
        System.out.println();

        System.out.println("Student Information:");
        student.displayInfo();
        student.displayRole();
        System.out.println();

        System.out.println("Mentor Information:");
        staff.displayInfo();
        staff.displayRole();
    }
}
