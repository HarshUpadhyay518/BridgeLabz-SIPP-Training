package DSA.SinglyLinkedList.SocialMediaFriendConnection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SocialMediaLinkedList smList = new SocialMediaLinkedList();

        int choice = -1;
        while (choice != 9) {
            System.out.println("\n--- Social Media Friend Connection Menu ---");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Find Mutual Friends");
            System.out.println("5. Display All Friends of a User");
            System.out.println("6. Search User by ID");
            System.out.println("7. Search User by Name");
            System.out.println("8. Count Number of Friends per User");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("User ID: "); int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Age: "); int age = sc.nextInt();
                sc.nextLine();
                smList.addUser(id, name, age);
            }
            else if (choice == 2) {
                System.out.print("Enter User ID 1: "); int id1 = sc.nextInt();
                System.out.print("Enter User ID 2: "); int id2 = sc.nextInt();
                sc.nextLine();
                smList.addFriendConnection(id1, id2);
            }
            else if (choice == 3) {
                System.out.print("Enter User ID 1: "); int id1 = sc.nextInt();
                System.out.print("Enter User ID 2: "); int id2 = sc.nextInt();
                sc.nextLine();
                smList.removeFriendConnection(id1, id2);
            }
            else if (choice == 4) {
                System.out.print("Enter User ID 1: "); int id1 = sc.nextInt();
                System.out.print("Enter User ID 2: "); int id2 = sc.nextInt();
                sc.nextLine();
                smList.findMutualFriends(id1, id2);
            }
            else if (choice == 5) {
                System.out.print("Enter User ID: "); int id = sc.nextInt();
                sc.nextLine();
                smList.displayFriends(id);
            }
            else if (choice == 6) {
                System.out.print("Enter User ID to Search: "); int id = sc.nextInt();
                sc.nextLine();
                smList.searchByID(id);
            }
            else if (choice == 7) {
                System.out.print("Enter User Name to Search: "); String name = sc.nextLine();
                smList.searchByName(name);
            }
            else if (choice == 8) {
                smList.countAllFriends();
            }
            else if (choice == 9) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}

