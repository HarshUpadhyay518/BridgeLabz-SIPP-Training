package thisStaticAndFinalKeyword;

public class Book {
    static String libraryName = "Central City Library";

    // Final variable: ISBN is a unique identifier and cannot be changed
    public final String isbn;

    // Instance variables
    private String title;
    private String author;

    // Constructor using 'this' to resolve ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("-----------------------------");
    }

    // Method to display book details with instanceof check
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title       : " + title);
            System.out.println("Author      : " + author);
            System.out.println("ISBN        : " + isbn);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Invalid book object.");
        }
    }
}

// Main class to test the system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Display library name
        Book.displayLibraryName();

        // Create Book objects
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
        Book b2 = new Book("Atomic Habits", "James Clear", "ISBN002");

        // Display book details
        b1.displayBookDetails();
        b2.displayBookDetails();

        // instanceof test with unrelated object
        Object test = "Just a string";
        if (test instanceof Book) {
            ((Book) test).displayBookDetails();
        } else {
            System.out.println("test is NOT an instance of Book.");
        }
    }
}
