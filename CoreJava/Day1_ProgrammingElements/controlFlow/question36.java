package controlFlow;

import java.util.Scanner;

public class question36 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (sum == originalNumber)
            System.out.println(originalNumber + " is an Armstrong Number.");
        else
            System.out.println(originalNumber + " is NOT an Armstrong Number.");
    }
 
}
