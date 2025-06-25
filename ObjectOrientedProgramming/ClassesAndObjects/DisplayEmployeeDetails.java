package ClassesAndObjects;

public class DisplayEmployeeDetails {
    String name;
    int id;
    double salary;

    public DisplayEmployeeDetails(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        DisplayEmployeeDetails emp1 = new DisplayEmployeeDetails("John", 101, 5000);
        emp1.display();
    }
}
