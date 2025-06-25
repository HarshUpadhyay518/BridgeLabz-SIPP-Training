package thisStaticAndFinalKeyword;

public class Employee {
    static String companyName = "TechVision Pvt. Ltd.";
    static int totalEmployees = 0;

    // Final variable: ID can't be changed once assigned
    public final int id;

    // Instance variables
    private String name;
    private String designation;

    // Constructor using 'this' to resolve ambiguity
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("----------------------------------");
    }

    // Method to display employee details (uses instanceof)
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name : " + companyName);
            System.out.println("Employee ID  : " + id);
            System.out.println("Name         : " + name);
            System.out.println("Designation  : " + designation);
            System.out.println("----------------------------------");
        } else {
            System.out.println("Not a valid Employee object.");
        }
    }
}

// Main class to test the system
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee(101, "Aarav Gupta", "Software Engineer");
        Employee emp2 = new Employee(102, "Diya Patel", "HR Manager");

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Display total employees
        Employee.displayTotalEmployees();

        // instanceof check with a non-Employee object
        Object test = "Just a string";
        if (test instanceof Employee) {
            ((Employee) test).displayEmployeeDetails();
        } else {
            System.out.println("test is NOT an instance of Employee.");
        }
    }
}
