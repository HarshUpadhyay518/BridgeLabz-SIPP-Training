package CoreJava.controlFlow;

import java.util.Scanner;

public class question3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        boolean firstLargest = a >= b && a >= c;
        boolean secondLargest = b >= a && b >= c;
        boolean thirdLargest = c >= a && c >= b;

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
    }
}
