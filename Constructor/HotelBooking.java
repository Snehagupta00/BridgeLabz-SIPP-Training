public class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    public HotelBooking() {
        guestName = "unknown guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights){
    this.guestName =guestName;
        this.roomType =roomType;
        this.nights =nights;
}

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Display method
    public void displayBookingDetails() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }

    public static void main(String[] args) {
        // Default booking
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 (Default Constructor):");
        booking1.displayBookingDetails();

        System.out.println("\n---------------------------\n");

        // Parameterized booking
        HotelBooking booking2 = new HotelBooking("Sneha Gupta", "Deluxe", 3);
        System.out.println("Booking 2 (Parameterized Constructor):");
        booking2.displayBookingDetails();

        System.out.println("\n---------------------------\n");

        // Copy booking
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Booking 3 (Copy Constructor):");
        booking3.displayBookingDetails();
    }




}
