package NEWPKG;

public class Ticket extends Booking{
    private double price;

    // Constructor
    public Ticket(String bookingId, String date, double price) {
        super(bookingId, date);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // Display ticket info
    public void displayTicketInfo() {
        super.displayBookingInfo();
        System.out.println("Price: $" + price);
    }
}
