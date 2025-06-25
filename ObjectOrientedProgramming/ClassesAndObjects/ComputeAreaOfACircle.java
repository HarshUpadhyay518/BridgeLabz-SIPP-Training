package ClassesAndObjects;

public class ComputeAreaOfACircle {
    double radius;

    public ComputeAreaOfACircle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public void displayDetails(){
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + computeArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        ComputeAreaOfACircle circle = new ComputeAreaOfACircle(5.0);
        circle.displayDetails();
    }
}
