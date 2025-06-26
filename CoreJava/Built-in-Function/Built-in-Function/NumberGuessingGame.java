import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        System.out.println("Respond with 'high', 'low', or 'correct'.");

        int low = 1;
        int high = 100;
        boolean correct = false;

        while (!correct && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");

            String feedback = getUserFeedback(scanner);

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed your number: " + guess);
                correct = true;
            } else {
                System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }
        }

        if (!correct) {
            System.out.println("Something went wrong. Are you sure you followed the rules?");
        }

        scanner.close();
    }

    // Generate the next guess using mid-point strategy (binary search)
    public static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    // Get feedback from the user
    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Your response: ");
        return scanner.nextLine().trim().toLowerCase();
    }
}
