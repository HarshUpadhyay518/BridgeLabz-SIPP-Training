package ClassesAndObjects;

public class TicketBookingSystem {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    public TicketBookingSystem(String movieName, int seatNumber, double price) {
        this.isBooked = false;
    }

    public void bookTicket(String movieName,int seatNumber,double price) {
        if(!isBooked){
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            isBooked = true;
            System.out.println("Ticket booked successfully");
        }
        else{
            System.out.println("Ticket is already booked");
        }
    }

    public void displayTicket(){
        if(isBooked){
            System.out.println("Movie Name: "+movieName);
            System.out.println("Seat Number: "+seatNumber);
            System.out.println("Price: "+price);
        }
        else{
            System.out.println("No ticket booked");
        }
    }

    public static void main(String[] args) {
        TicketBookingSystem ticket1 = new TicketBookingSystem("Movie1", 1, 100);
        TicketBookingSystem ticket2 = new TicketBookingSystem("Movie2", 2, 200);
        TicketBookingSystem ticket3 = new TicketBookingSystem("Movie3", 3, 300);

        ticket1.bookTicket("Inception",21,250.0);
        ticket1.displayTicket();

        ticket1.bookTicket("Avatar",30,300.0);

        ticket2.bookTicket("Interstellar",15,275.0);
        ticket2.displayTicket();
    }
}
