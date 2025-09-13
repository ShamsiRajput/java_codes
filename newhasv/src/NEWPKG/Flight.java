package NEWPKG;

public class Flight extends Booking{
    private String flightNumber;
    private String destination;

    // Constructor
    public Flight(String bookingId, String date, String flightNumber, String destination) {
        super(bookingId, date);
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    // Display flight info
    public void displayFlightInfo() {
        super.displayBookingInfo();
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
    }
}
