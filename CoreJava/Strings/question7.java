package CoreJava.Strings;

import java.util.Scanner;

public class question7 {
     // Method that generates NumberFormatException (without handling)
    public static void generateException(String input) {
        System.out.println("\nTrying to convert text to number without try-catch:");
        // This line will throw NumberFormatException if input is not numeric
        int number = Integer.parseInt(input);
        System.out.println("Converted number: " + number);
    }

    // Method that handles NumberFormatException using try-catch
    public static void handleException(String input) {
        System.out.println("\nTrying to convert text to number with try-catch:");
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text input: ");
        String input = sc.nextLine();

        // First, try generating the exception
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception caught in main (optional): " + e.getMessage());
        }

        // Then, handle the exception properly
        handleException(input);
    }
}
