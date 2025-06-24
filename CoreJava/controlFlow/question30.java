package CoreJava.controlFlow;

import java.util.Scanner;

public class question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        String grade, remark;
        if (percentage >= 90) {
            grade = "A";
            remark = "Excellent";
        } else if (percentage >= 75) {
            grade = "B";
            remark = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remark = "Average";
        } else if (percentage >= 40) {
            grade = "D";
            remark = "Pass";
        } else {
            grade = "F";
            remark = "Fail";
        }

        System.out.println("Average Marks: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);
    }
}
