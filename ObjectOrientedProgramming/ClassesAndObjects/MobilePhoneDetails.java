package ClassesAndObjects;

public class MobilePhoneDetails {
    String brand;
    String model;
    double price;

    public MobilePhoneDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        MobilePhoneDetails phone1 = new MobilePhoneDetails("Apple", "iPhone 13", 999.99);
        MobilePhoneDetails phone2 = new MobilePhoneDetails("Samsung", "Galaxy S21", 899.99);
        MobilePhoneDetails phone3 = new MobilePhoneDetails("Google", "Pixel 6", 699.99);

        phone1.displayDetails();
        phone2.displayDetails();
        phone3.displayDetails();
    }
}
