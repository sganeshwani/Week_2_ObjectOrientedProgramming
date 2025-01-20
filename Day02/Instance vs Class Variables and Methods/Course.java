public class Course {
    // Class variable common for all courses
    private static String instituteName = "DefaultInstitute";

    // Instance variables
    private String courseName;
    private int duration;
    private double fee;

    //Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Create course instances
        Course course1 = new Course("Java Programming", 3, 2000);
        Course course2 = new Course("Web Development", 4, 3000);
        // Display course details
        course1.displayCourseDetails();
        // Update the institute name
        Course.updateInstituteName("XYZ University");
        System.out.println();
        course2.displayCourseDetails();
    }
}
