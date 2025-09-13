import java.util.ArrayList;

// Passenger class
class Passenger {
    private String name;
    private String passportNumber;

    public  Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}

// Ticket class
class Ticket {
    private String flightNumber;
    private String seatNumber;
    private Passenger passenger; // Composition: Ticket has a Passenger

    public Ticket(String flightNumber, String seatNumber, Passenger passenger) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.passenger = passenger;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public Passenger getPassenger() {
        return passenger; // Return the associated Passenger
    }

    public void displayTicketInfo() {
        System.out.println("Ticket Info:");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Passport Number: " + passenger.getPassportNumber());
    }
}



// Flight class
class Flight {
    private String flightNumber;
    private ArrayList<Ticket> tickets; // Composition: Flight has Tickets

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
        this.tickets = new ArrayList<>(); // Initialize the ArrayList
    }

    public void setTicket(Ticket ticket) {
        tickets.add(ticket); // Add a Ticket to the flight
    }

    public void displayFlightInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Tickets");
        for (Ticket ticket : tickets) {
            ticket.displayTicketInfo();
            System.out.println(); // New line for better readability
        }
    }


// Main class to demonstrate composition in flight ticket order

    public static void main(String[] args) {
        Flight flight = new Flight("FL123");

        // Create passengers
        Passenger passenger1 = new Passenger("Alice Smith", "P123456789");
        Passenger passenger2 = new Passenger("Bob Johnson", "P987654321");

        // Create tickets for passengers
        Ticket ticket1 = new Ticket(flight.flightNumber, "12A", passenger1);
        Ticket ticket2 = new Ticket(flight.flightNumber, "12B", passenger2);

        // Add tickets to flight
        flight.setTicket(ticket1);
        flight.setTicket(ticket2);

        // Display flight information along with ticket details
        flight.displayFlightInfo();
}
}
