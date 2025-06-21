package CoreJava.Methods;

import java.util.Random;

public class question17 {
     public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(9000) + 1000;
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int sum = 0, min = arr[0], max = arr[0];
        for (int num : arr) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return new double[]{sum / (double) arr.length, min, max};
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        double[] stats = findAverageMinMax(nums);
        System.out.println("Average: " + stats[0] + ", Min: " + stats[1] + ", Max: " + stats[2]);
    }
}
