import java.util.*;

public class celciusToFahreheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        double f = (c*1.8) + 32;
        System.out.println(f);
    }
}