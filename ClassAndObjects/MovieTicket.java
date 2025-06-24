public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    public void bookTicket(String movie, int seat, double ticketPrice) {
        movieName = movie;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket Booked Successfully!");
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Inception", 12, 250);
        ticket.displayTicket();
    }
}
