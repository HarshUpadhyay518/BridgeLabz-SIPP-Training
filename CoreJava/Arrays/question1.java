package CoreJava.Arrays;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is positive and even");
                else
                    System.out.println(num + " is positive and odd");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }

        if (arr[0] == arr[4]) {
            System.out.println("First and last elements are equal.");
        } else if (arr[0] > arr[4]) {
            System.out.println("First element is greater than last.");
        } else {
            System.out.println("First element is less than last.");
        }
    }
}
