package CoreJava.Methods;

public class question32 {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areUnique(int[] otps) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }
}
