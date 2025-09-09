public class Problem11_ValidateCreditCard {
    public static void main(String[] args) {
        String[] cards = {"4111111111111111", "5111111111111111", "6111111111111111"};
        String visaRegex = "^4[0-9]{15}$";
        String mcRegex = "^5[0-9]{15}$";

        for (String c : cards) {
            if (c.matches(visaRegex)) {
                System.out.println(c + " → Visa (valid)");
            } else if (c.matches(mcRegex)) {
                System.out.println(c + " → MasterCard (valid)");
            } else {
                System.out.println(c + " → Invalid");
            }
        }
    }
}
