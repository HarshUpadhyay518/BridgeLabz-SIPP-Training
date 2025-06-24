package CoreJava.Methods;

public class question33 {
     public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHarshad(int n) {
        return n % sumOfDigits(n) == 0;
    }

    public static int[][] digitFrequency(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        int[][] result = new int[count][2];
        int idx = 0;
        for (int i = 0; i < 10; i++)
            if (freq[i] > 0) result[idx++] = new int[]{i, freq[i]};
        return result;
    }
}
