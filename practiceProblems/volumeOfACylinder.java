import java.util.Scanner;

public class volumeOfACylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat(); 
        int h = sc.nextInt();
        double volume = 3.14 * r*r*h;
        System.out.println(volume);
    }
    
}
