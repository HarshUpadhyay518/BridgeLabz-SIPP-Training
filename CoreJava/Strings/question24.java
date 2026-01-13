package CoreJava.Strings;

import java.util.Scanner;

public class question24 {
    static void generateException(String[] names) {
        // This line will cause ArrayIndexOutOfBoundsException
        String name = names[names.length]; 
        System.out.println("Name: " + name);
    }

    static void handleException(String[] names) {
        try {
            String name = names[names.length]; // Invalid index
            System.out.println("Name: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            names[i] = sc.next();
        }

        // generateException(names); // Uncomment to crash
        handleException(names);
    }
}
