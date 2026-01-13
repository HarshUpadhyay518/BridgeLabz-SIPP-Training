package CoreJava.Arrays;

import java.util.Scanner;

public class question8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flat = new int[rows * cols];
        int index = 0;

        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                flat[index++] = matrix[i][j];
            }
        }

        System.out.println("1D array:");
        for (int i = 0; i < flat.length; i++) {
            System.out.print(flat[i] + " ");
        }
    }
}
