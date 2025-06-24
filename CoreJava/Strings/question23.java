package CoreJava.Strings;

import java.util.Scanner;

public class question23 {
    // Method that causes the exception
    static void generateException(String text) {
        // This will cause StringIndexOutOfBoundsException
        char ch = text.charAt(text.length()); // Index out of bounds
        System.out.println("Character: " + ch); // This won't run
    }

    // Method that handles the exception using try-catch
    static void handleException(String text) {
        try {
            char ch = text.charAt(text.length()); // Index out of bounds
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
        } catch (Exception e) {
            System.out.println("Generic Exception Caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Generate the unhandled exception (commented out to avoid crash)
        // generateException(input);

        // Handle the exception properly
        handleException(input);
    }
}
