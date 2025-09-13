public class Main {
    static int counter;
    final static int MAX_LIMIT = 20;

    public static void main(String[] args) {
        if (counter < MAX_LIMIT) {
            counter++;
            displayCounterAndMessage();
        } else {
            displayCounterAndMessage("Limit reached");
        }
    }

    private static void displayCounterAndMessage() {
        System.out.println("Counter: " + counter);
        System.out.println("Message: Counter less than limit");
    }

    private static void displayCounterAndMessage(String message) {
        System.out.println("Counter: " + counter);
        System.out.println("Message: " + message);
    }
}