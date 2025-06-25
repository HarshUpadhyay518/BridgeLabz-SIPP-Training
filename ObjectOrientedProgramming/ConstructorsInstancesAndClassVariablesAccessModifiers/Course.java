package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class Course {
    String courseName;
    int duration; // duration in weeks
    double fee;

    // Class variable
    static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " weeks");
        System.out.println("Fee           : ₹" + fee);
        System.out.println("----------------------------");
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
        System.out.println("============================");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Update institute name
        Course.updateInstituteName("CodeAcademy India");

        // Create course objects
        Course c1 = new Course("Java Programming", 12, 5000.0);
        Course c2 = new Course("Web Development", 10, 4500.0);
        Course c3 = new Course("Data Structures", 14, 6000.0);

        // Display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
    }
}
