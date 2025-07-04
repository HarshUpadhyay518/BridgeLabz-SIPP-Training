package DSA.CircularLinkedList.OnlineTicketReservationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 6) {
            System.out.println("\n--- Online Ticket Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket by ID");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search by Customer or Movie");
            System.out.println("5. Count Total Tickets");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Clear newline

            if (choice == 1) {
                System.out.print("Ticket ID: "); int id = sc.nextInt(); sc.nextLine();
                System.out.print("Customer Name: "); String name = sc.nextLine();
                System.out.print("Movie Name: "); String movie = sc.nextLine();
                System.out.print("Seat Number: "); String seat = sc.nextLine();
                System.out.print("Booking Time: "); String time = sc.nextLine();
                trs.addTicket(id, name, movie, seat, time);
            }
            else if (choice == 2) {
                System.out.print("Enter Ticket ID to remove: "); int id = sc.nextInt();
                trs.removeTicket(id);
            }
            else if (choice == 3) {
                trs.displayTickets();
            }
            else if (choice == 4) {
                System.out.print("Enter Customer Name or Movie Name: ");
                String keyword = sc.nextLine();
                trs.search(keyword);
            }
            else if (choice == 5) {
                trs.countTickets();
            }
            else if (choice == 6) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
