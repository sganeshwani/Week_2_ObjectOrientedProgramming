class Subject {
    String subjectName;
    int marks;
    // Constructor 
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }
    // Method to get the subject name
    public String getSubjectName() {
        return subjectName;
    }
    // Method to get the marks for the subject
    public int getMarks() {
        return marks;
    }
}
class GradeCalculator {
    public String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "F";
        }
    }
}
class Student {
    String studentName;
    Subject subject1;
    Subject subject2;

    // Constructor created
    public Student(String studentName, Subject subject1, Subject subject2) {
        this.studentName = studentName;
        this.subject1 = subject1;
        this.subject2 = subject2;
    }
    // Method to get the student's name
    public String getStudentName() {
        return studentName;
    }
    // Method to print student's subjects and their grades
    public void showResults() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        
        // For Subject 1
        String grade1 = gradeCalculator.calculateGrade(subject1.getMarks());
        System.out.println("Subject: " + subject1.getSubjectName() + " - Marks: " + subject1.getMarks() + " - Grade: " + grade1);
        
        // For Subject 2
        String grade2 = gradeCalculator.calculateGrade(subject2.getMarks());
        System.out.println("Subject: " + subject2.getSubjectName() + " - Marks: " + subject2.getMarks() + " - Grade: " + grade2);
    }
}
public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Create Subject objects
        Subject maths = new Subject("Maths", 85);
        Subject science = new Subject("Science", 95);
        // Student object 
        Student student1 = new Student("Sahil", maths, science);
        // Display the student's name and results
        System.out.println("Student: " + student1.getStudentName());
        student1.showResults(); // Call method to display results
    }
}
