package CoreJava.Methods;

import java.util.Scanner;

public class question15 {
    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            if (isPositive(nums[i])) {
                System.out.println(nums[i] + " is Positive and " + (isEven(nums[i]) ? "Even" : "Odd"));
            } else {
                System.out.println(nums[i] + " is Negative");
            }
        }

        int cmp = compare(nums[0], nums[4]);
        if (cmp == 0) System.out.println("First and last elements are equal");
        else if (cmp > 0) System.out.println("First element is greater than last");
        else System.out.println("First element is less than last");
    }
}
