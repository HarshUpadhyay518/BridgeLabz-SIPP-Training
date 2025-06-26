import java.util.*;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = scanner.nextInt();
        fibonacci(n);
        
    }
    public static void fibonacci(int n) {
        
       int a=0,b=1;
       for(int i=0;i<n;i++){
        int next=a+b;
        a=b;
        b=next;
       }
       System.out.println();
    }
}
