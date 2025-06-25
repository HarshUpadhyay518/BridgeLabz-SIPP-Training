package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class CarRental {
     String customerName;
    String carModel;
    int rentalDays;

    // Assuming fixed daily rental rate for simplicity
    double dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard Car";
        this.rentalDays = 1;
        this.dailyRate = 1000.0; // Default rate
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Daily Rate    : ₹" + dailyRate);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
        System.out.println("-------------------------------");
    }

    // Main method to test the system
    public static void main(String[] args) {
        // Using default constructor
        CarRental rental1 = new CarRental();
        System.out.println("Default Rental:");
        rental1.displayRentalDetails();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Simran Kaur", "Toyota Innova", 5, 1800.0);
        System.out.println("Custom Rental:");
        rental2.displayRentalDetails();
    }
}
