package CoreJava.Methods;

public class question36 {
     public static int[][] generateMarks(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 50 + (int)(Math.random() * 50);
        return scores;
    }

    public static double[][] computeTotals(int[][] marks) {
        int n = marks.length;
        double[][] report = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            report[i][0] = total;
            report[i][1] = Math.round(avg * 100) / 100.0;
            report[i][2] = Math.round(perc * 100) / 100.0;
        }
        return report;
    }
}
