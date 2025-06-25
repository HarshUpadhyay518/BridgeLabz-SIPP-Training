package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class Student {
    public int rollNumber;         // Accessible everywhere
    protected String name;         // Accessible in subclass
    private double CGPA;           // Private, use getter/setter

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
        System.out.println("---------------------------");
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display PG student details
    public void displayPostgraduateDetails() {
        System.out.println("PG Student - Name: " + name); // Accessing protected member
        System.out.println("Specialization    : " + specialization);
        System.out.println("---------------------------");
    }
}

// Main class to test the system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create student object
        Student s1 = new Student(101, "Rahul Verma", 8.5);
        s1.displayStudentDetails();

        // Modify CGPA
        s1.setCGPA(9.1);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();

        // Create PG student object
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Ananya Iyer", 9.2, "Data Science");
        pg1.displayStudentDetails();         // Inherited method
        pg1.displayPostgraduateDetails();    // Subclass method
    }
}
