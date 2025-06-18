package CoreJava.Strings;

import java.util.Scanner;

public class question10 {
    // Method to manually convert text to lowercase
    public static String toLowerManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase using ASCII logic
                result.append((char)(ch + 32));
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
        String builtInLower = input.toLowerCase();

        // Convert using custom method
        String manualLower = toLowerManual(input);

        // Compare both results
        boolean areEqual = compareStrings(builtInLower, manualLower);

        // Display results
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Manual lowercase:   " + manualLower);
        System.out.println("Are both conversions equal? " + areEqual);
    }
}
