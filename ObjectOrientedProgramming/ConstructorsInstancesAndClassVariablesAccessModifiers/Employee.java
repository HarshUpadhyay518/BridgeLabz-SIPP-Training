package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class Employee {
    public int employeeID;         // Public - accessible anywhere
    protected String department;   // Protected - accessible in subclass
    private double salary;         // Private - use setter/getter

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to update salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. It must be positive.");
        }
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : ₹" + salary);
        System.out.println("----------------------------");
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String level;

    // Constructor
    public Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    // Display manager-specific details
    public void displayManagerDetails() {
        System.out.println("Manager ID     : " + employeeID);   // public
        System.out.println("Department     : " + department);   // protected
        System.out.println("Manager Level  : " + level);
        System.out.println("----------------------------");
    }
}

// Main class to test the code
public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee e1 = new Employee(101, "Finance", 45000.0);
        e1.displayEmployeeDetails();

        // Updating salary
        e1.setSalary(48000.0);
        System.out.println("Updated Salary: ₹" + e1.getSalary());
        System.out.println();

        // Creating a Manager object
        Manager m1 = new Manager(201, "IT", 75000.0, "Senior");
        m1.displayEmployeeDetails();     // inherited
        m1.displayManagerDetails();      // subclass method
    }
}
