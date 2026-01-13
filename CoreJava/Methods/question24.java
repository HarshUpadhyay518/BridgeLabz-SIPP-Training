package CoreJava.Methods;

public class question24 {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum < n;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (n > 0) {
            int d = n % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
            n /= 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        int n = 145;
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
    }
}
