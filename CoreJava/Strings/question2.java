package CoreJava.Strings;

import java.util.Scanner;

public class question2 {
    
    // Method to create a substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);  // Appending character-by-character
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string and indices
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using charAt() method
        String manualSub = customSubstring(text, start, end);

        // Substring using built-in method
        String builtInSub = "";
        if (start >= 0 && end <= text.length() && start <= end) {
            builtInSub = text.substring(start, end);
        } else {
            System.out.println("Invalid start or end index for built-in substring.");
        }

        // Compare both substrings
        boolean areEqual = compareStrings(manualSub, builtInSub);

        // Display results
        System.out.println("\nSubstring using charAt(): " + manualSub);
        System.out.println("Substring using built-in substring(): " + builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}
