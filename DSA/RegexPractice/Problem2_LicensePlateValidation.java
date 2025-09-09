public class Problem2_LicensePlateValidation {
    public static void main(String[] args) {
        String[] plates = {"AB1234", "A12345", "XY9999"};
        String regex = "^[A-Z]{2}[0-9]{4}$";

        for (String plate : plates) {
            System.out.println(plate + " → " + plate.matches(regex));
        }
    }
}
