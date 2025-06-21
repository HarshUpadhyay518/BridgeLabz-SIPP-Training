package CoreJava.Methods;

public class question7 {
     public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) {
        double[] results = calculateTrigonometricFunctions(30);
        System.out.printf("Sin: %.2f, Cos: %.2f, Tan: %.2f\n", results[0], results[1], results[2]);
    }
}
