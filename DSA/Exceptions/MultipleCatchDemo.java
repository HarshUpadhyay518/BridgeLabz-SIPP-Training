package DSA.Exceptions;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter index: ");
        int index = sc.nextInt();
        sc.close();

        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}

