public class Problem3_HexColorValidation {
    public static void main(String[] args) {
        String[] colors = {"#FFA500", "#ff4500", "#123"};
        String regex = "^#[0-9A-Fa-f]{6}$";

        for (String c : colors) {
            System.out.println(c + " → " + c.matches(regex));
        }
    }
}
