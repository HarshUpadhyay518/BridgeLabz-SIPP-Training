package CoreJava.Methods;

import java.util.Scanner;

public class question9 {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + ", Remaining: " + result[1]);
    }
}
