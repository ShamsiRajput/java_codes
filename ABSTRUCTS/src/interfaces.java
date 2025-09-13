//// Interface with abstract and default methods
//interface Vehicle {
//
//
//
//    // Abstract method (no implementation)
//    void start();
//
//    // Default method (with implementation)
//    default void stop() {
//        System.out.println("Vehicle has stopped.");
//    }
//}
//
//// Class implementing the interface
//class Car implements Vehicle {
//    @Override
//
//    public void start() {
//        System.out.println("Car is starting with a key.");
//    }
//}
//
//// Another class implementing the interface
//class Bike implements Vehicle {
//    @Override
//    public void start() {
//        System.out.println("Bike is starting with a kick.");
//    }
//}
//
//public class interfaces {
//    public static void main(String[] args) {
//        Vehicle car = new Car();
//        car.start(); // Output: Car is starting with a key.
//        car.stop();  // Output: Vehicle has stopped.
//
//        Vehicle bike = new Bike();
//        bike.start(); // Output: Bike is starting with a kick.
//        bike.stop();  // Output: Vehicle has stopped.
//}
//}