package CoreJava.BuiltInFunction;

import java.util.Random;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;
        Random rand = new Random();

        System.out.println("Think of a number between 1 and 100.");

        while (true) {
            int guess = low + rand.nextInt(high - low + 1);
            System.out.println("Is your number " + guess + "? (respond: high / low / correct)");
            feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! The computer guessed it.");
                break;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input.");
            }
        }
        sc.close();
    }
}
