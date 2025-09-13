import java.util.ArrayList;
import java.util.List;

// Interface for Booking System
interface BookingSystem {
    void bookTicket(String passengerName);
    void cancelTicket(String passengerName);
    void displayPassengers();
}

// Abstract Class Flight
abstract class Flight implements BookingSystem {
    protected String flightNumber;
    protected String destination;
    protected int availableSeats;
    protected List<String> passengers;

    public Flight(String flightNumber, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.passengers = new ArrayList<>();
    }

    // Abstract method to be implemented by subclasses
    public abstract double getTicketPrice();

    // Common method for all flights
    public void showFlightDetails() {
        System.out.println("Flight No: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Available Seats: " + availableSeats);
    }

    // Implementing interface methods
    @Override
    public void bookTicket(String passengerName) {
        if (availableSeats > 0) {
            passengers.add(passengerName);
            availableSeats--;
            System.out.println(passengerName + " booked a ticket on flight " + flightNumber);
        } else {
            System.out.println("No seats available on flight " + flightNumber);
        }
    }

    @Override
    public void cancelTicket(String passengerName) {
        if (passengers.remove(passengerName)) {
            availableSeats++;
            System.out.println(passengerName + " canceled their ticket on flight " + flightNumber);
        } else {
            System.out.println("Passenger not found on flight " + flightNumber);
        }
    }

    @Override
    public void displayPassengers() {
        System.out.println("Passengers on Flight " + flightNumber + ": " + passengers);
    }
}

// Economy Flight (Child Class)
class EconomyFlight extends Flight {
    private double basePrice;

    public EconomyFlight(String flightNumber, String destination, int availableSeats, double basePrice) {
        super(flightNumber, destination, availableSeats);
        this.basePrice = basePrice;
    }

    @Override
    public double getTicketPrice() {
        return basePrice; // Fixed price for economy class
    }
}

// Business Flight (Child Class)
class BusinessFlight extends Flight {
    private double basePrice;

    public BusinessFlight(String flightNumber, String destination, int availableSeats, double basePrice) {
        super(flightNumber, destination, availableSeats);
        this.basePrice = basePrice;
    }

    @Override
    public double getTicketPrice() {
        return basePrice * 1.5; // Business class is 1.5 times economy price
    }
}

// Main Class to Run the System
class FlightBookingSystem {
    public static void main(String[] args) {
        // Create flights
        EconomyFlight ecoFlight = new EconomyFlight("ECO123", "New York", 5, 300);
        BusinessFlight bizFlight = new BusinessFlight("BUS456", "London", 3, 500);

        // Booking tickets
        ecoFlight.bookTicket("Alice");
        ecoFlight.bookTicket("Bob");
        bizFlight.bookTicket("Charlie");

        // Display passengers
        ecoFlight.displayPassengers();
        bizFlight.displayPassengers();

        // Show flight details
        ecoFlight.showFlightDetails();
        bizFlight.showFlightDetails();

        // Cancel a ticket
        ecoFlight.cancelTicket("Alice");
        ecoFlight.displayPassengers();

        // Show ticket prices
        System.out.println("Economy Flight Price: $" + ecoFlight.getTicketPrice());
        System.out.println("Business Flight Price: $" + bizFlight.getTicketPrice());
    }
}
