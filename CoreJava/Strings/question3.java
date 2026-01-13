package CoreJava.Strings;

import java.util.Scanner;

public class question3 {
    // User-defined method to convert string to char array (without using toCharArray())
    public static char[] customToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next(); // Using next() as per hint

        // Convert using custom method
        char[] customArray = customToCharArray(input);

        // Convert using built-in method
        char[] builtInArray = input.toCharArray();

        // Compare both arrays
        boolean areEqual = compareCharArrays(customArray, builtInArray);

        // Display result
        System.out.println("\nCustom Character Array:");
        for (char c : customArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nBuilt-in Character Array:");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + areEqual);
    }
}
