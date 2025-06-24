package CoreJava.Methods;

public class question16 {
    public static double convertFarhenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("100°F = " + convertFarhenheitToCelsius(100) + "°C");
        System.out.println("37°C = " + convertCelsiusToFarhenheit(37) + "°F");
        System.out.println("10 pounds = " + convertPoundsToKg(10) + " kg");
        System.out.println("5 kg = " + convertKgToPounds(5) + " pounds");
        System.out.println("3 gallons = " + convertGallonsToLiters(3) + " liters");
        System.out.println("2 liters = " + convertLitersToGallons(2) + " gallons");
    }
}
