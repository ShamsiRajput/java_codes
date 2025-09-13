package NEWPKG;

public class Main {
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


