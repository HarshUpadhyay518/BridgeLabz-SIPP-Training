package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class Book2 {
    public String ISBN;          // Accessible anywhere
    protected String title;      // Accessible in subclass and same package
    private String author;       // Only accessible through getter/setter

     public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }

    // Method to display book info
    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("----------------------------");
    }
}

// Subclass: EBook2
class EBook2 extends Book2 {
    private double fileSize;

    // Constructor
    public EBook2(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display EBook info
    public void displayEBookDetails() {
        System.out.println("E-Book ISBN   : " + ISBN);       // public
        System.out.println("E-Book Title  : " + title);      // protected
        // System.out.println("E-Book Author : " + author);  // ❌ private: not accessible directly
        System.out.println("File Size     : " + fileSize + " MB");
        System.out.println("----------------------------");
    }
}

// Main class to test the system
public class BookLibrarySystem2 {
    public static void main(String[] args) {
        // Create a Book2 object
        Book2 b1 = new Book2("978-0140449136", "Meditations", "Marcus Aurelius");
        b1.displayBookDetails();

        // Modify and get author using public methods
        b1.setAuthor("M. Aurelius");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();

        // Create an EBook2 object
        EBook2 eb1 = new EBook2("978-0134685991", "Effective Java", "Joshua Bloch", 2.5);
        eb1.displayEBookDetails();
    }
}
