// Superclass representing a generic Course
class Course {
    String courseName;  // Name of the course
    int duration;       // Duration of the course in weeks

    // Constructor to initialize Course attributes
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display basic course details
    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass representing an OnlineCourse, inherits Course
class OnlineCourse extends Course {
    String platform;  // Platform offering the course (e.g., Udemy, Coursera)
    boolean isRecorded;  // Indicates if the course is recorded

    // Constructor to initialize OnlineCourse and base Course attributes
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call superclass constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override to display online course details
    @Override
    void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass representing a PaidOnlineCourse, extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;      // Course fee in dollars
    double discount; // Discount on the course fee in percentage

    // Constructor to initialize PaidOnlineCourse and parent attributes
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call parent constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate the discounted fee
    double getDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    // Override to display paid online course details
    @Override
    void displayDetails() {
        super.displayDetails(); // Call parent method
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Fee: ₹" + getDiscountedFee());
    }
}

// Main class to demonstrate multilevel inheritance
public class EducationalCourse {
    public static void main(String[] args) {
        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidCourse = new PaidOnlineCourse(
                "Java Programming", 6, "Coursera", true, 2000, 20);
        // Display complete details of the paid online course
        paidCourse.displayDetails();
    }
}

