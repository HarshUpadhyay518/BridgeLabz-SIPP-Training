package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class Book {
    String title;
    String author;
    double price;

    public Book(){
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price); 
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayDetails();

        Book book2 = new Book("The Alchemist","Paulo Coelho",399.0);
        book2.displayDetails();
    }
}
