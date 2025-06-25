package thisStaticAndFinalKeyword;

public class Product {
    static double discount = 10.0; // in percentage

    // Final variable to uniquely identify a product
    public final String productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize variables
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
            System.out.println("Discount updated to " + discount + "%");
        } else {
            System.out.println("Invalid discount value!");
        }
        System.out.println("------------------------------");
    }

    // Method to calculate final price after discount
    public double getDiscountedPrice() {
        return price * quantity * (1 - discount / 100);
    }

    // Method to display product details with instanceof check
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID     : " + productID);
            System.out.println("Product Name   : " + productName);
            System.out.println("Price per unit : ₹" + price);
            System.out.println("Quantity       : " + quantity);
            System.out.println("Discount       : " + discount + "%");
            System.out.println("Total Price    : ₹" + getDiscountedPrice());
            System.out.println("------------------------------");
        } else {
            System.out.println("Invalid product object.");
        }
    }
}

// Main class to test the system
public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Update global discount
        Product.updateDiscount(15.0);

        // Create Product objects
        Product p1 = new Product("P101", "Bluetooth Speaker", 1500.0, 2);
        Product p2 = new Product("P102", "Wireless Mouse", 800.0, 1);

        // Display product details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // instanceof check with unrelated object
        Object test = "Some string";
        if (test instanceof Product) {
            ((Product) test).displayProductDetails();
        } else {
            System.out.println("test is NOT an instance of Product.");
        }
    }
}
