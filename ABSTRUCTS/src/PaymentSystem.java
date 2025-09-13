// Abstract Class
abstract class Payment {
    abstract void makePayment(double amount);
}

// Subclass 1
class CreditCardPayment extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

// Subclass 2
class PayPalPayment extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.makePayment(500); // Output: Paid 500.0 using Credit Card.

        Payment payment2 = new PayPalPayment();
        payment2.makePayment(300); // Output: Paid 300.0 using PayPal.
}
}