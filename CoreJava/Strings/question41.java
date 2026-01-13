package CoreJava.Strings;

public class question41 {
    static String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B+";
        if (percentage >= 60) return "B";
        if (percentage >= 50) return "C";
        return "F";
    }

    public static void main(String[] args) {
        int[][] scores = new int[5][3];
        System.out.println("Stu\tPhy\tChem\tMath\t% \tGrade");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + (int)(Math.random() * 61); // 40 to 100
                total += scores[i][j];
            }
            double percent = total / 3.0;
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s\n", i + 1, scores[i][0], scores[i][1], scores[i][2], percent, getGrade(percent));
        }
    }
}
