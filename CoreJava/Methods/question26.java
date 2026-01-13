package CoreJava.Methods;

public class question26 {
    ublic static double[][] generateSalaryData() {
        double[][] data = new double[10][2]; // [salary][years]
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + Math.random() * 90000;
            data[i][1] = (int)(Math.random() * 10);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][2]; // [new salary][bonus]
        for (int i = 0; i < 10; i++) {
            double bonus = (data[i][1] > 5 ? 0.05 : 0.02) * data[i][0];
            result[i][0] = data[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] salaryData = generateSalaryData();
        double[][] result = calculateBonus(salaryData);
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Salary\tYears\tNew Salary\tBonus");
        for (int i = 0; i < 10; i++) {
            totalOld += salaryData[i][0];
            totalNew += result[i][0];
            totalBonus += result[i][1];
            System.out.printf("%.2f\t%.0f\t%.2f\t%.2f\n", salaryData[i][0], salaryData[i][1], result[i][0], result[i][1]);
        }
        System.out.printf("Total Old Salary: %.2f\nTotal New Salary: %.2f\nTotal Bonus: %.2f\n", totalOld, totalNew, totalBonus);
    }
}
