import java.util.*;

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor to initialize the movie name
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully for seat " + seatNumber + "!");
        } else {
            System.out.println("This ticket is already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("No ticket has been booked yet.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input movie details
        System.out.print("Enter the movie name: ");
        String movieName = input.nextLine();

        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName);

        // Booking the ticket
        System.out.print("Enter seat number: ");
        String seatNumber = input.nextLine();
        System.out.print("Enter ticket price: ");
        double price = input.nextDouble();

        ticket.bookTicket(seatNumber, price);

        // Displaying the ticket details
        System.out.println("\n--- Ticket Details ---");
        ticket.displayTicketDetails();
    }
}

