package CoreJava.Strings;

import java.util.Scanner;

public class question6 {
      // Method that generates IllegalArgumentException (without handling)
    public static void generateException(String text) {
        System.out.println("\nTrying substring with invalid range (without try-catch):");
        // This will throw IllegalArgumentException if start > end
        String sub = text.substring(5, 2);  // Invalid: start index > end index
        System.out.println("Substring result: " + sub);
    }

    // Method that handles IllegalArgumentException using try-catch
    public static void handleException(String text) {
        System.out.println("\nTrying substring with invalid range (with try-catch):");
        try {
            String sub = text.substring(5, 2);  // Invalid: start index > end index
            System.out.println("Substring result: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // First try to generate the exception
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception caught in main (optional): " + e.getMessage());
        }

        // Now handle it gracefully
        handleException(input);
    }
}
