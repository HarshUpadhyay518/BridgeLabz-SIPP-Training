package CoreJava.Methods;

import java.util.Scanner;

public class question3 {
    public static int maxHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.println("Maximum handshakes: " + maxHandshakes(n));
    }
}
