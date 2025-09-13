//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.TreeMap;
//import java.util.Map;
//
//class Passenger {
//
//    String name;
//    int age;
//    String contact;
//
//    public Passenger(String name, int age, String contact) {
//        this.name = name;
//        this.age = age;
//        this.contact = contact;
//    }
//
//    public String toString() {
//        return "Name: " + name + " | Age: " + age + " | Contact: " + contact;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        TreeMap<Integer, Passenger> booked = new TreeMap<>();
//        TreeMap<Integer, Passenger> available = new TreeMap<>();
//
//        for (int i = 1; i <= 100; i++) {
//            available.put(i, new Passenger("", 0, ""));
//        }
//
//        // Sample bookings
//        booked.put(34, new Passenger("mannat", 1, "0237408273"));
//        booked.put(67, new Passenger("abdullah", 7, "0237408273"));
//        booked.put(1, new Passenger("muddasir", 7, "0237408273"));
//        booked.put(9, new Passenger("zara", 6, "0237408273"));
//        booked.put(4, new Passenger("dua", 1, "0237408273"));
//        available.keySet().removeAll(booked.keySet()); // remove already booked from available
//
//        while (true) {
//            System.out.println("\n-------------------- MENU --------------------");
//            System.out.println("1 -> Add a new booking");
//            System.out.println("2 -> Cancel booking");
//            System.out.println("3 -> Check if a specific booking is available");
//            System.out.println("4 -> Display all bookings");
//            System.out.println("5 -> Find bookings by starting letter");
//            System.out.println("6 -> Update name by ID");
//            System.out.println("7 -> Display all unbooked seats");
//            System.out.println("8 -> Cancel booking by name");
//            System.out.println("0 -> Exit");
//            System.out.print("Enter your choice: ");
//            int type = input.nextInt();
//
//            if (type == 1) {
//                System.out.print("Enter seat number to book (1-100): ");
//                int seat = input.nextInt();
//                if (!available.containsKey(seat)) {
//                    System.out.println("Seat already booked or invalid.");
//                    continue;
//                }
//
//                System.out.print("Enter name: ");
//                String name = input.next();
//                System.out.print("Enter age: ");
//                int age = input.nextInt();
//                System.out.print("Enter contact: ");
//                String contact = input.next();
//
//                booked.put(seat, new Passenger(name, age, contact));
//                available.remove(seat);
//                System.out.println("Booking successful!");
//
//            } else if (type == 2) {
//                System.out.print("Enter seat number to cancel: ");
//                int seat = input.nextInt();
//                if (booked.containsKey(seat)) {
//                    available.put(seat, new Passenger("", 0, ""));
//                    booked.remove(seat);
//                    System.out.println("Booking cancelled for seat " + seat);
//                } else {
//                    System.out.println("No booking found for this seat.");
//                }
//
//            } else if (type == 3) {
//                System.out.print("Enter seat number to check: ");
//                int seat = input.nextInt();
//                if (available.containsKey(seat)) {
//                    System.out.println("Seat " + seat + " is available.");
//                } else {
//                    System.out.println("Seat " + seat + " is already booked.");
//                }
//
//            } else if (type == 4) {
//                System.out.println("\n---- Booked Seats ----");
//                for (Map.Entry<Integer,Passenger> entry:booked.entrySet()) {
//                    System.out.println("Seat: " + entry.getKey() + " -> " + entry.getValue());
//                }
//
//            } else if (type == 5) {
//                System.out.print("Enter starting letter: ");
//                String letter = input.next().toLowerCase();
//
//                System.out.println("\n---- Matching Bookings ----");
//                for (Passenger p : booked.values()) {
//                    if (p.name.toLowerCase().startsWith(letter)) {
//                        System.out.println(p);
//                    }
//                }
//
//            } else if (type == 6) {
//                System.out.print("Enter seat ID to update name: ");
//                int id = input.nextInt();
//                if (booked.containsKey(id)) {
//                    System.out.print("Enter new name: ");
//                    String newName = input.next();
//                    Passenger p = booked.get(id);
//                    booked.put(id, new Passenger(newName, p.age, p.contact));
//                    System.out.println("Name updated successfully.");
//                } else {
//                    System.out.println("No booking found for this ID.");
//                }
//
//            } else if (type == 7) {
//                System.out.println("\n---- Unbooked Seats ----");
//                for (Map.Entry<Integer, Passenger> entry : available.entrySet()) {
//                    System.out.println("Seat: " + entry.getKey() + " -> Available");
//                }
//
//            } else if (type == 8) {
//                System.out.print("Enter passenger name to cancel booking: ");
//                String targetName = input.next().toLowerCase();
//                boolean found = false;
//
//                for (Map.Entry<Integer, Passenger> entry : booked.entrySet()) {
//                    if (entry.getValue().name.toLowerCase().equals(targetName)) {
//                        int seatToRemove = entry.getKey();
//                        booked.remove(seatToRemove);
//                        available.put(seatToRemove, new Passenger("", 0, ""));
//                        System.out.println("Booking cancelled for " + targetName + " at seat " + seatToRemove);
//                        found = true;
//                        break; // remove only the first match
//                    }
//                }
//
//                if (!found) {
//                    System.out.println("No booking found for name: " + targetName);
//                }
//
//            } else if (type == 0) {
//                System.out.println("Exiting...");
//                break;
//            } else {
//                System.out.println("Invalid option.");
//            }
//        }
//    }
//}





import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Passenger {

    String name;
    int age;
    String contact;

    public Passenger(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public String toString() {
        return "Name: " + name + " | Age: " + age + " | Contact: " + contact;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<Integer, Passenger> booked = new HashMap<>();
        HashMap<Integer, Passenger> available = new HashMap<>();

        for (int i = 1; i <= 100; i++) {
            available.put(i, new Passenger("", 0, ""));
        }

        // Sample bookings
        booked.put(34, new Passenger("mannat", 1, "0237408273"));
        booked.put(67, new Passenger("abdullah", 7, "0237408273"));
        booked.put(1, new Passenger("muddasir", 7, "0237408273"));
        booked.put(9, new Passenger("zara", 6, "0237408273"));
        booked.put(4, new Passenger("dua", 1, "0237408273"));

        for (Integer seat : booked.keySet()) {
            available.remove(seat); // remove booked seats from available
        }

        while (true) {
            System.out.println("\n-------------------- MENU --------------------");
            System.out.println("1 -> Add a new booking");
            System.out.println("2 -> Cancel booking");
            System.out.println("3 -> Check if a specific booking is available");
            System.out.println("4 -> Display all bookings");
            System.out.println("5 -> Find bookings by starting letter");
            System.out.println("6 -> Update name by ID");
            System.out.println("7 -> Display all unbooked seats");
            System.out.println("8 -> Cancel booking by name");
            System.out.println("0 -> Exit");
            System.out.print("Enter your choice: ");
            int type = input.nextInt();

            if (type == 1) {
                System.out.print("Enter seat number to book (1-100): ");
                int seat = input.nextInt();
                if (!available.containsKey(seat)) {
                    System.out.println("Seat already booked or invalid.");
                    continue;
                }

                System.out.print("Enter name: ");
                String name = input.next();
                System.out.print("Enter age: ");
                int age = input.nextInt();
                System.out.print("Enter contact: ");
                String contact = input.next();

                booked.put(seat, new Passenger(name, age, contact));
                available.remove(seat);
                System.out.println("Booking successful!");

            } else if (type == 2) {
                System.out.print("Enter seat number to cancel: ");
                int seat = input.nextInt();
                if (booked.containsKey(seat)) {
                    available.put(seat, new Passenger("", 0, ""));
                    booked.remove(seat);
                    System.out.println("Booking cancelled for seat " + seat);
                } else {
                    System.out.println("No booking found for this seat.");
                }

            } else if (type == 3) {
                System.out.print("Enter seat number to check: ");
                int seat = input.nextInt();
                if (available.containsKey(seat)) {
                    System.out.println("Seat " + seat + " is available.");
                } else {
                    System.out.println("Seat " + seat + " is already booked.");
                }

            } else if (type == 4) {
                System.out.println("\n---- Booked Seats ----");
                for (Map.Entry<Integer, Passenger> entry : booked.entrySet()) {
                    System.out.println("Seat: " + entry.getKey() + " -> " + entry.getValue());
                }

            } else if (type == 5) {
                System.out.print("Enter starting letter: ");
                String letter = input.next().toLowerCase();

                System.out.println("\n---- Matching Bookings ----");
                for (Passenger p : booked.values()) {
                    if (p.name.toLowerCase().startsWith(letter)) {
                        System.out.println(p);
                    }
                }

            } else if (type == 6) {
                System.out.print("Enter seat ID to update name: ");
                int id = input.nextInt();
                if (booked.containsKey(id)) {
                    System.out.print("Enter new name: ");
                    String newName = input.next();
                    Passenger p = booked.get(id);
                    booked.put(id, new Passenger(newName, p.age, p.contact));
                    System.out.println("Name updated successfully.");
                } else {
                    System.out.println("No booking found for this ID.");
                }

            } else if (type == 7) {
                System.out.println("\n---- Unbooked Seats ----");
                for (Map.Entry<Integer, Passenger> entry : available.entrySet()) {
                    System.out.println("Seat: " + entry.getKey() + " -> Available");
                }

            } else if (type == 8) {
                System.out.print("Enter passenger name to cancel booking: ");
                String targetName = input.next().toLowerCase();
                boolean found = false;

                for (Map.Entry<Integer, Passenger> entry : booked.entrySet()) {
                    if (entry.getValue().name.toLowerCase().equals(targetName)) {
                        int seatToRemove = entry.getKey();
                        booked.remove(seatToRemove);
                        available.put(seatToRemove, new Passenger("", 0, ""));
                        System.out.println("Booking cancelled for " + targetName + " at seat " + seatToRemove);
                        found = true;
                        break; // remove only first match
                    }
                }

                if (!found) {
                    System.out.println("No booking found for name: " + targetName);
                }

            } else if (type == 0) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}
