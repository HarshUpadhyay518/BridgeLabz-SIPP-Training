package controlFlow;

import java.util.Scanner;

public class question37 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        if (originalNumber % sum == 0)
            System.out.println(originalNumber + " is a Harshad Number.");
        else
            System.out.println(originalNumber + " is NOT a Harshad Number.");
    }
}
