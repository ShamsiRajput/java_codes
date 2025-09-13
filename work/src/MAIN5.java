// Base class
class Booking {
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

// Child class for Passenger
class Passenger extends Booking {
    private String passengerName;
    private int age;

    // Constructor
    public Passenger(String bookingId, String date, String passengerName, int age) {
        super(bookingId, date);
        this.passengerName = passengerName;
        this.age = age;
    }

    // Display passenger info
    public void displayPassengerInfo() {
        super.displayBookingInfo();
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Age: " + age);
    }
}

// Child class for Flight
class Flight extends Booking {
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

// Child class for Ticket
class Ticket extends Booking {
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

// Main class
public class MAIN5{
    public static void main(String[] args) {
        // Create objects
        Passenger passenger = new Passenger("B123", "2025-01-10", "John Doe", 28);
        Flight flight = new Flight("F456", "2025-01-10", "AI202", "New York");
        Ticket ticket = new Ticket("T789", "2025-01-10", 350.75);

        // Display details
        System.out.println("Passenger Details:");
        passenger.displayPassengerInfo();

        System.out.println("\nFlight Details:");
        flight.displayFlightInfo();

        System.out.println("\nTicket Details:");
        ticket.displayTicketInfo();
    }
}
