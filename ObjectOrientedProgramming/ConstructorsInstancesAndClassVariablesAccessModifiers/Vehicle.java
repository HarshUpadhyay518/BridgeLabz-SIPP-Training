package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class Vehicle {
     String ownerName;
    String vehicleType;

    // Class variable (shared across all vehicles)
    static double registrationFee = 5000.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("------------------------------");
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
        System.out.println("=================================");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Update registration fee
        Vehicle.updateRegistrationFee(6500.0);

        // Create vehicle objects
        Vehicle v1 = new Vehicle("Ritika Sharma", "Car");
        Vehicle v2 = new Vehicle("Ajay Mehta", "Motorbike");
        Vehicle v3 = new Vehicle("Sara Khan", "Truck");

        // Display vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v3.displayVehicleDetails();
    }
}
