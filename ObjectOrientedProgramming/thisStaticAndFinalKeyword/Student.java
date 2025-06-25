package thisStaticAndFinalKeyword;

public class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    // Final variable - rollNumber cannot be changed after assignment
    public final int rollNumber;

    // Instance variables
    private String name;
    private char grade;

    // Constructor using 'this' keyword
    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++; // Increment total students when new student is created
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Enrolled Students: " + totalStudents);
        System.out.println("-------------------------------");
    }

    // Method to update grade with instanceof check
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Invalid student object.");
        }
    }

    // Method to display student details with instanceof check
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name : " + universityName);
            System.out.println("Roll Number     : " + rollNumber);
            System.out.println("Name            : " + name);
            System.out.println("Grade           : " + grade);
            System.out.println("-------------------------------");
        } else {
            System.out.println("Invalid student object.");
        }
    }
}

// Main class to test the system
public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Create student objects
        Student s1 = new Student(101, "Riya Sen", 'A');
        Student s2 = new Student(102, "Karan Mehta", 'B');

        // Display student details
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        // Update grade
        s2.updateGrade('A');
        s2.displayStudentDetails();

        // Show total students
        Student.displayTotalStudents();

        // instanceof check with non-student object
        Object test = "Not a Student";
        if (test instanceof Student) {
            ((Student) test).displayStudentDetails();
        } else {
            System.out.println("test is NOT an instance of Student.");
        }
    }
}
