package CoreJava.Strings;

import java.util.Scanner;

public class question31 {
    static void generateException(String text) {
        String sub = text.substring(5, 2); // Start > End → Exception
        System.out.println("Sub: " + sub);
    }

    static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println("Sub: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // generateException(text); // Uncomment to test
        handleException(text);
    }
}
