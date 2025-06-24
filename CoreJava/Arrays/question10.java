package CoreJava.Arrays;

import java.util.Scanner;

public class question10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        String[] result = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) result[i] = "FizzBuzz";
            else if (i % 3 == 0) result[i] = "Fizz";
            else if (i % 5 == 0) result[i] = "Buzz";
            else result[i] = String.valueOf(i);
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}
