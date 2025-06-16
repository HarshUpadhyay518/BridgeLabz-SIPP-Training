import java.util.Scanner;

public class bookStoreBill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int books = input.nextInt();
        System.out.print("Enter cost per book: ");
        double costPerBook = input.nextDouble();

        double total = books * costPerBook;

        System.out.println("The total bill for " + books + " books is INR " + total);
    
    }
}
