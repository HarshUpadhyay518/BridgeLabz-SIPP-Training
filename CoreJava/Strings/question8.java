package CoreJava.Strings;

import java.util.Scanner;

public class question8 {
    // Method that generates ArrayIndexOutOfBoundsException (without handling)
    public static void generateException(String[] names) {
        System.out.println("\nAccessing array element beyond its length (without try-catch):");
        // This will throw an exception
        System.out.println("Accessing index 10: " + names[10]);  // Deliberate out-of-bounds access
    }

    // Method that handles ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names) {
        System.out.println("\nAccessing array element beyond its length (with try-catch):");
        try {
            System.out.println("Accessing index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name[" + i + "]: ");
            names[i] = sc.nextLine();
        }

        // Try generating exception without handling (commented to allow second method to run)
        try {
            generateException(names); // This will crash if not caught
        } catch (Exception e) {
            System.out.println("Exception caught in main (optional): " + e.getMessage());
        }

        // Handle exception properly
        handleException(names);
    }
}
