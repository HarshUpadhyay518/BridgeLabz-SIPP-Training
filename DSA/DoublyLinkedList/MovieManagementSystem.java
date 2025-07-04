package DSA.DoublyLinkedList;

import java.util.Scanner;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieDoublyLinkedList {
    MovieNode head;
    MovieNode tail;

    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Movie added at beginning.");
    }

    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Movie added at end.");
    }

    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }
        temp.next = newNode;
        System.out.println("Movie added at position " + position + ".");
    }

    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        MovieNode current = head;
        while (current != null && !current.title.equalsIgnoreCase(title)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Movie not found: " + title);
            return;
        }
        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        System.out.println("Movie removed: " + title);
    }

    public void searchByDirector(String director) {
        boolean found = false;
        MovieNode current = head;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                if (!found) {
                    System.out.println("Movies by " + director + ":");
                    found = true;
                }
                displayMovie(current);
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movies found by director: " + director);
        }
    }

    public void searchByRating(double threshold) {
        boolean found = false;
        MovieNode current = head;
        while (current != null) {
            if (current.rating >= threshold) {
                if (!found) {
                    System.out.println("Movies with rating >= " + threshold + ":");
                    found = true;
                }
                displayMovie(current);
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movies found with rating >= " + threshold);
        }
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Movies in forward order:");
        MovieNode current = head;
        while (current != null) {
            displayMovie(current);
            current = current.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Movies in reverse order:");
        MovieNode current = tail;
        while (current != null) {
            displayMovie(current);
            current = current.prev;
        }
    }

    public void updateRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Updated rating for \"" + title + "\" to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

    private void displayMovie(MovieNode node) {
        System.out.println("------------------------");
        System.out.println("Title   : " + node.title);
        System.out.println("Director: " + node.director);
        System.out.println("Year    : " + node.year);
        System.out.println("Rating  : " + node.rating);
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        int choice = -1;
        while (choice != 10) {
            System.out.println("\n--- Movie Management Menu ---");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Position");
            System.out.println("4. Remove Movie by Title");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating Threshold");
            System.out.println("7. Display Movies Forward");
            System.out.println("8. Display Movies Reverse");
            System.out.println("9. Update Movie Rating by Title");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Title: "); String title = sc.nextLine();
                System.out.print("Director: "); String director = sc.nextLine();
                System.out.print("Year: "); int year = sc.nextInt();
                System.out.print("Rating: "); double rating = sc.nextDouble();
                sc.nextLine();
                list.addAtBeginning(title, director, year, rating);
            }
            else if (choice == 2) {
                System.out.print("Title: "); String title = sc.nextLine();
                System.out.print("Director: "); String director = sc.nextLine();
                System.out.print("Year: "); int year = sc.nextInt();
                System.out.print("Rating: "); double rating = sc.nextDouble();
                sc.nextLine();
                list.addAtEnd(title, director, year, rating);
            }
            else if (choice == 3) {
                System.out.print("Position: "); int position = sc.nextInt();
                sc.nextLine();
                System.out.print("Title: "); String title = sc.nextLine();
                System.out.print("Director: "); String director = sc.nextLine();
                System.out.print("Year: "); int year = sc.nextInt();
                System.out.print("Rating: "); double rating = sc.nextDouble();
                sc.nextLine();
                list.addAtPosition(position, title, director, year, rating);
            }
            else if (choice == 4) {
                System.out.print("Enter Title to Remove: "); String title = sc.nextLine();
                list.removeByTitle(title);
            }
            else if (choice == 5) {
                System.out.print("Enter Director to Search: "); String director = sc.nextLine();
                list.searchByDirector(director);
            }
            else if (choice == 6) {
                System.out.print("Enter Rating Threshold: "); double threshold = sc.nextDouble();
                sc.nextLine();
                list.searchByRating(threshold);
            }
            else if (choice == 7) {
                list.displayForward();
            }
            else if (choice == 8) {
                list.displayReverse();
            }
            else if (choice == 9) {
                System.out.print("Enter Title to Update: "); String title = sc.nextLine();
                System.out.print("Enter New Rating: "); double newRating = sc.nextDouble();
                sc.nextLine();
                list.updateRating(title, newRating);
            }
            else if (choice == 10) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}

