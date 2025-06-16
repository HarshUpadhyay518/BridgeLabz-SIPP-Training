package controlFlow;

import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age and height for Amar:");
        int age1 = sc.nextInt(), height1 = sc.nextInt();

        System.out.println("Enter age and height for Akbar:");
        int age2 = sc.nextInt(), height2 = sc.nextInt();

        System.out.println("Enter age and height for Anthony:");
        int age3 = sc.nextInt(), height3 = sc.nextInt();

        // Youngest
        String youngest;
        int minAge = Math.min(age1, Math.min(age2, age3));
        if (minAge == age1) youngest = "Amar";
        else if (minAge == age2) youngest = "Akbar";
        else youngest = "Anthony";

        // Tallest
        String tallest;
        int maxHeight = Math.max(height1, Math.max(height2, height3));
        if (maxHeight == height1) tallest = "Amar";
        else if (maxHeight == height2) tallest = "Akbar";
        else tallest = "Anthony";

        System.out.println("Youngest friend is: " + youngest);
        System.out.println("Tallest friend is: " + tallest);
    }
}
