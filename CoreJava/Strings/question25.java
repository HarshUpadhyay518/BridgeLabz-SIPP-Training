package CoreJava.Strings;

import java.util.Scanner;

public class question25 {
    static void generateException(String text) {
        int num = Integer.parseInt(text); // May cause exception
        System.out.println("Number: " + num);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String input = sc.nextLine();

        // generateException(input); // Uncomment to see exception
        handleException(input);
    }
}
