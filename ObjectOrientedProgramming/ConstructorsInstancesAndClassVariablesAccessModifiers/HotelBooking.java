package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
        System.out.println("----------------------------");
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayBooking();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Aryan Gupta", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        booking2.displayBooking();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Copied Booking:");
        booking3.displayBooking();
    }
}
