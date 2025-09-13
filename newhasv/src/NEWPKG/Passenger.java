package NEWPKG;

public class Passenger extends Booking{
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
