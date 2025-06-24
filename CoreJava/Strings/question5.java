package CoreJava.Strings;

import java.util.Scanner;

public class question5 {
      // Method that generates StringIndexOutOfBoundsException (without handling)
    public static void generateException(String text) {
        System.out.println("\nAccessing character beyond string length (without try-catch):");
        // This will throw StringIndexOutOfBoundsException
        char ch = text.charAt(text.length()); // Invalid index: max valid is length - 1
        System.out.println("Character at index " + text.length() + ": " + ch);
    }

    // Method that handles StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        System.out.println("\nAccessing character beyond string length (with try-catch):");
        try {
            char ch = text.charAt(text.length()); // Invalid index
            System.out.println("Character at index " + text.length() + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // First, generate exception
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception caught in main (optional): " + e.getMessage());
        }

        // Then handle exception properly
        handleException(input);
    }
}
