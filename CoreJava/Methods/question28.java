package CoreJava.Methods;

public class question28 {
     public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++)
            heights[i] = 150 + (int)(Math.random() * 100); // 150 to 250
        return heights;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        int sum = findSum(heights);
        double mean = sum / 11.0;
        System.out.println("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.printf("\nMean: %.2f\nMin: %d\nMax: %d\n", mean, findMin(heights), findMax(heights));
    }
}
