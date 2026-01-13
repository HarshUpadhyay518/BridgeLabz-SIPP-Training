package CoreJava.Strings;

import java.util.Scanner;

public class question9 {
    // Method to manually convert text to uppercase
    public static String toUpperManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase using ASCII logic
                result.append((char)(ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Convert using built-in method
        String builtInUpper = input.toUpperCase();

        // Convert using custom method
        String manualUpper = toUpperManual(input);

        // Compare both results
        boolean areEqual = compareStrings(builtInUpper, manualUpper);

        // Display results
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Manual uppercase:   " + manualUpper);
        System.out.println("Are both conversions equal? " + areEqual);
    }
}
