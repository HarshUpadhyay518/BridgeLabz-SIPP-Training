package CoreJava.Strings;

import java.util.Scanner;

public class question36 {
    static String getComputerChoice() {
        int rand = (int)(Math.random() * 3);
        return rand == 0 ? "rock" : rand == 1 ? "paper" : "scissors";
    }

    static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock")))
            return "user";
        return "computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games, userWins = 0, compWins = 0;

        System.out.print("Enter number of games: ");
        games = sc.nextInt();

        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);

            System.out.println("Computer chose: " + comp);
            System.out.println("Winner: " + winner);

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;
        }

        System.out.println("\n--- Stats ---");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.printf("User Win %%: %.2f\n", userWins * 100.0 / games);
        System.out.printf("Computer Win %%: %.2f\n", compWins * 100.0 / games);
    }
}
