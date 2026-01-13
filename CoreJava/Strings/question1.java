package CoreJava.Strings;

import java.util.Scanner;

public class question1 {
     // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input of two strings
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using charAt()
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        // Compare using built-in equals()
        boolean resultEquals = str1.equals(str2);

        // Display results
        System.out.println("\nComparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);

        // Check if both methods give the same result
        if (resultCharAt == resultEquals) {
            System.out.println("✅ Both methods give the same result.");
        } else {
            System.out.println(" The results from both methods do not match.");
        }
    }
}
