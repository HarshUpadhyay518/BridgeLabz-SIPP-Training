package ObjectOrientedProgramming;

public class Employee {
    public String name;
    public int id;
    public double salary;

    public Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void Display(){
        System.out.println("EmployeeName : " + name );
        System.out.println("EmployeeId : " + id );
        System.out.println("EmployeeSalary : " + salary );
    }

    public static void main(String[] args) {
        Employee obj = new Employee("harsh", 4, 10000);
        obj.Display();
    }
}
