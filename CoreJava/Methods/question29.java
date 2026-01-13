package CoreJava.Methods;

public class question29 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String str = String.valueOf(n);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) digits[i] = str.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuck(int n) {
        String s = String.valueOf(n);
        return s.contains("0") && s.charAt(0) != '0';
    }

    public static boolean isArmstrong(int n) {
        int[] digits = getDigits(n);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, power);
        return sum == n;
    }

    public static int[] findLargestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }
        return new int[]{max1, max2};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
        }
        return new int[]{min1, min2};
    }
}
