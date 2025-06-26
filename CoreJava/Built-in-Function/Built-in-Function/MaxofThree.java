import java.util.*;
class MaxofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
        int max = maxOfThree(x, y, z);
        
        System.out.println("The maximum of the three numbers is: " + max);
        
        
    }

//Method to find the maximum of three integers
    public static int maxOfThree(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
}