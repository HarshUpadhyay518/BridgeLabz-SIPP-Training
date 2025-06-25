package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class Book1 {
    String title;
    String author;
    double price;
    boolean isAvailable;

     public Book1(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

     public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    public void displayBook() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : ₹" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        // Creating book objects
        Book1 book1 = new Book1("1984", "George Orwell", 299.0, true);
        Book1 book2 = new Book1("To Kill a Mockingbird", "Harper Lee", 399.0, false);

        // Displaying book details
        book1.displayBook();
        book2.displayBook();

        // Borrowing books
        book1.borrowBook();  // Should succeed
        book2.borrowBook();  // Should fail

        // Display updated availability
        book1.displayBook();
    }

}
