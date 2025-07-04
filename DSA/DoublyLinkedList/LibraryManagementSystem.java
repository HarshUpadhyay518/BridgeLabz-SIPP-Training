package DSA.DoublyLinkedList;

import java.util.Scanner;

class BookNode {
    String title;
    String author;
    String genre;
    int bookID;
    boolean isAvailable;
    BookNode next;
    BookNode prev;

    public BookNode(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class LibraryManagementSystem {
    BookNode head;
    BookNode tail;

    // Already included: addAtBeginning, addAtEnd, addAtPosition, removeByBookID, searchByTitle

    // --- Continue searchByAuthor
    public void searchByAuthor(String author) {
        boolean found = false;
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No book found by author: " + author);
        }
    }

    // --- Update availability
    public void updateAvailability(int id, boolean available) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookID == id) {
                temp.isAvailable = available;
                System.out.println("Book ID " + id + " availability updated to " + (available ? "Available" : "Not Available"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book ID not found.");
    }

    // --- Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("\nBooks (Forward Order):");
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // --- Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("\nBooks (Reverse Order):");
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // --- Count books
    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // --- Helper to print book
    private void displayBook(BookNode node) {
        System.out.println("-------------------------------");
        System.out.println("Book ID     : " + node.bookID);
        System.out.println("Title       : " + node.title);
        System.out.println("Author      : " + node.author);
        System.out.println("Genre       : " + node.genre);
        System.out.println("Availability: " + (node.isAvailable ? "Available" : "Not Available"));
    }
}
