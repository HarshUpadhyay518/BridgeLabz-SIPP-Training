package CoreJava.controlFlow;

import java.util.Scanner;

public class question28 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Enter a number between 1 and 99");
            return;
        }

        int counter = 99;
        while (counter > 1) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}
