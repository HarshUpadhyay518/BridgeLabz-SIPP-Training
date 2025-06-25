package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class Product {
    String productName;
    double price;

    // Class variable (shared across all instances)
    static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment total product count when a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price       : ₹" + price);
        System.out.println("----------------------------");
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
        System.out.println("============================");
    }

    // Main method to test the class
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 65000.0);
        Product p2 = new Product("Smartphone", 28000.0);
        Product p3 = new Product("Tablet", 19000.0);

        // Display product details
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total products
        Product.displayTotalProducts();
    }
}
