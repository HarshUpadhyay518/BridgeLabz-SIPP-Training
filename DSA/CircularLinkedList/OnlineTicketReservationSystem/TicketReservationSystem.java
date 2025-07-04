package DSA.CircularLinkedList.OnlineTicketReservationSystem;

class TicketReservationSystem {
    private TicketNode head = null;

    // Add at end
    public void addTicket(int id, String customer, String movie, String seat, String time) {
        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }

        System.out.println("Ticket booked successfully for " + customer);
    }

    // Remove ticket by ID
    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode curr = head, prev = null;
        boolean found = false;

        do {
            if (curr.ticketID == id) {
                found = true;
                break;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        if (!found) {
            System.out.println("Ticket ID " + id + " not found.");
            return;
        }

        // If only one node
        if (curr == head && curr.next == head) {
            head = null;
        }
        // If head node
        else if (curr == head) {
            TicketNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
        }
        // Any other node
        else {
            prev.next = curr.next;
        }

        System.out.println("Ticket ID " + id + " removed.");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        System.out.println("\n--- Booked Tickets ---");

        do {
            System.out.println("Ticket ID: " + temp.ticketID);
            System.out.println("Customer : " + temp.customerName);
            System.out.println("Movie    : " + temp.movieName);
            System.out.println("Seat     : " + temp.seatNumber);
            System.out.println("Time     : " + temp.bookingTime);
            System.out.println("----------------------");
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Customer Name or Movie Name
    public void search(String keyword) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Match found:");
                System.out.println("Ticket ID: " + temp.ticketID + " | Customer: " + temp.customerName + " | Movie: " + temp.movieName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for: " + keyword);
        }
    }

    // Count total tickets
    public void countTickets() {
        if (head == null) {
            System.out.println("Total tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total tickets booked: " + count);
    }
}

