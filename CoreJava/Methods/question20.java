public package CoreJava.Methods;

 publi class question20 {
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[index++] = i;
        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int num : arr) s += num;
        return s;
    }

    public static long product(int[] arr) {
        long p = 1;
        for (int num : arr) p *= num;
        return p;
    }

    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int num : arr) sum += Math.pow(num, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}