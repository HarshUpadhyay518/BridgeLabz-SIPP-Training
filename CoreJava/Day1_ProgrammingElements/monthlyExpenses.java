import java.util.Scanner;

public class monthlyExpenses {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter rent: ");
        double rent = input.nextDouble();
        System.out.print("Enter food expense: ");
        double food = input.nextDouble();
        System.out.print("Enter travel expense: ");
        double travel = input.nextDouble();
        System.out.print("Enter others: ");
        double others = input.nextDouble();

        double total = rent + food + travel + others;

        System.out.println("The Total monthly expense is INR " + total);
    }
}
