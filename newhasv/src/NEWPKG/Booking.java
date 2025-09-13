package NEWPKG;

public class Booking {

    private String bookingId;
    private String date;

    // Constructor
    public Booking(String bookingId, String date) {
        this.bookingId = bookingId;
        this.date = date;
    }

    // Getter methods
    public String getBookingId() {
        return bookingId;
    }

    public String getDate() {
        return date;
    }

    // Display booking info
    public void displayBookingInfo() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Date: " + date);
    }

}
