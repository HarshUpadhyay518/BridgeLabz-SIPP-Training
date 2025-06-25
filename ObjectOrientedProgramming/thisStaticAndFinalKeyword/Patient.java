package thisStaticAndFinalKeyword;

public class Patient {
    static String hospitalName = "CityCare Multispeciality Hospital";
    static int totalPatients = 0;

    // Final variable for unique patient ID
    public final int patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' keyword
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment total patients count
    }

    // Static method to get total admitted patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
        System.out.println("----------------------------------");
    }

    // Method to display patient details with instanceof check
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name : " + hospitalName);
            System.out.println("Patient ID    : " + patientID);
            System.out.println("Name          : " + name);
            System.out.println("Age           : " + age);
            System.out.println("Ailment       : " + ailment);
            System.out.println("----------------------------------");
        } else {
            System.out.println("Invalid patient object.");
        }
    }
}

// Main class to test the system
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create Patient objects
        Patient p1 = new Patient(1001, "Rohan Verma", 45, "Diabetes");
        Patient p2 = new Patient(1002, "Sneha Kulkarni", 30, "Flu");

        // Display patient details
        p1.displayPatientDetails();
        p2.displayPatientDetails();

        // Display total patients
        Patient.getTotalPatients();

        // instanceof check with unrelated object
        Object test = "Not a Patient";
        if (test instanceof Patient) {
            ((Patient) test).displayPatientDetails();
        } else {
            System.out.println("test is NOT an instance of Patient.");
        }
    }
}
