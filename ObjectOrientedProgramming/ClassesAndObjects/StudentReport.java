package ClassesAndObjects;

public class StudentReport {
    String name;
    int rollNumber;
    double marks;

    public StudentReport(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade(){
        if(marks >= 90){
            return "A+";
        }
        else if(marks >=80){
            return "A";
        }
        else if(marks >=70){
            return "B";
        }
        else if(marks >=60){
            return "C";
        }
        else if(marks >=50){
            return "D";
        }
        else{
            return "F";
        }
    } 

    public void displayReport(){
        System.out.println("Student Report");
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+calculateGrade());

    }
    public static void main(String[] args) {
        StudentReport student1 = new StudentReport("John Doe", 1, 85.0);
        StudentReport student2 = new StudentReport("Jane Doe", 2, 92.0);
        StudentReport student3 = new StudentReport("Bob Smith", 3, 78.0);

        student1.displayReport();
        student2.displayReport();
        student3.displayReport();
    }
}
