package thisStaticAndFinalKeyword;

public class Vehicle {
    static double registrationFee = 5000.0;

    // Final variable: unique registration number
    public final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' keyword
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to ₹" + registrationFee);
        } else {
            System.out.println("Invalid fee amount.");
        }
        System.out.println("---------------------------------");
    }

    // Method to display vehicle details with instanceof check
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name         : " + ownerName);
            System.out.println("Vehicle Type       : " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee   : ₹" + registrationFee);
            System.out.println("---------------------------------");
        } else {
            System.out.println("Invalid Vehicle object.");
        }
    }
}

// Main class to test the system
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Update registration fee
        Vehicle.updateRegistrationFee(6000.0);

        // Create vehicle objects
        Vehicle v1 = new Vehicle("MH12AB1234", "Arjun Kapoor", "Car");
        Vehicle v2 = new Vehicle("DL05CD5678", "Meera Singh", "Bike");

        // Display vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // instanceof check with non-vehicle object
        Object test = "Not a Vehicle";
        if (test instanceof Vehicle) {
            ((Vehicle) test).displayVehicleDetails();
        } else {
            System.out.println("test is NOT an instance of Vehicle.");
        }
    }
}
