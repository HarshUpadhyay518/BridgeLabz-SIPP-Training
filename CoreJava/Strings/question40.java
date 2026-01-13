package CoreJava.Strings;

public class question40 {
    static int[] getAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + (int)(Math.random() * 40); // Age 10-49
        }
        return ages;
    }

    public static void main(String[] args) {
        int[] ages = getAges(10);
        System.out.println("Age\tCan Vote?");
        for (int age : ages) {
            boolean canVote = age >= 18;
            System.out.println(age + "\t" + (canVote ? "Yes" : "No"));
        }
    }

}
