package CoreJava.Methods;

public class question22 {
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Recursive Sum: " + sumRecursive(n));
        System.out.println("Formula Sum: " + sumFormula(n));
    }
}
