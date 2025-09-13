//// Project Title: Dynamic Ticket Reservation and Cancellation System
//// Author: [Your Name Here]
//// Description:
//// This Java program simulates a scalable and dynamic ticket booking and cancellation system.
//// It utilizes a Binary Search Tree (BST) to manage seat categories, a HashMap for O(1) seat lookup,
//// and Stacks to manage undo operations for both booking and cancellation.
//// GUI integration using Java Swing for seat booking UI.
//
//import java.util.*;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//
//class Seat {
//    String seatNumber;
//    String category;
//    boolean isBooked;
//    String customerName;
//
//    Seat(String seatNumber, String category) {
//        this.seatNumber = seatNumber;
//        this.category = category;
//        this.isBooked = false;
//        this.customerName = "";
//    }
//
//    @Override
//    public String toString() {
//        return seatNumber + " (" + category + ") - " + (isBooked ? ("Booked by " + customerName) : "Available");
//    }
//}
//
//// BST Node for Seat Category
//class CategoryNode {
//    String category;
//    int price;
//    CategoryNode left, right;
//
//    CategoryNode(String category, int price) {
//        this.category = category;
//        this.price = price;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//// Binary Search Tree for managing seat categories
//class SeatCategoryTree {
//    CategoryNode root;
//
//    void insert(String category, int price) {
//        root = insertRec(root, category, price);
//    }
//
//    private CategoryNode insertRec(CategoryNode root, String category, int price) {
//        if (root == null) return new CategoryNode(category, price);
//        if (category.compareTo(root.category) < 0)
//            root.left = insertRec(root.left, category, price);
//        else if (category.compareTo(root.category) > 0)
//            root.right = insertRec(root.right, category, price);
//        return root;
//    }
//
//    CategoryNode search(String category) {
//        return searchRec(root, category);
//    }
//
//    private CategoryNode searchRec(CategoryNode root, String category) {
//        if (root == null || root.category.equals(category)) return root;
//        if (category.compareTo(root.category) < 0)
//            return searchRec(root.left, category);
//        return searchRec(root.right, category);
//    }
//}
//
//// Action class for Undo Stack
//class Action {
//    enum Type { BOOK, CANCEL }
//    Type type;
//    Seat seat;
//
//    Action(Type type, Seat seat) {
//        this.type = type;
//        this.seat = seat;
//    }
//}
//
//class TicketReservationSystem {
//
//    static SeatCategoryTree categoryTree = new SeatCategoryTree();
//    static HashMap<String, Seat> seatMap = new HashMap<>();
//    static Stack<Action> bookingStack = new Stack<>();
//    static Stack<Action> cancellationStack = new Stack<>();
//
//    public static void main(String[] args) {
//        initializeCategories();
//        initializeSeats();
//        createGUI();
//    }
//
//    static void initializeCategories() {
//        categoryTree.insert("VIP", 1000);
//        categoryTree.insert("Premium", 700);
//        categoryTree.insert("Economy", 400);
//    }
//
//    static void initializeSeats() {
//        for (int i = 1; i <= 5; i++) {
//            seatMap.put("A10" + i, new Seat("A10" + i, "Economy"));
//            seatMap.put("B10" + i, new Seat("B10" + i, "Premium"));
//            seatMap.put("C10" + i, new Seat("C10" + i, "VIP"));
//        }
//    }
//
//    static void createGUI() {
//        JFrame frame = new JFrame("Ticket Reservation System");
//        frame.setSize(600, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JTextField seatField = new JTextField(5);
//        JTextField nameField = new JTextField(10);
//        JComboBox<String> categoryBox = new JComboBox<>(new String[]{"Economy", "Premium", "VIP"});
//        JTextArea output = new JTextArea(10, 40);
//        output.setEditable(false);
//
//        JButton bookBtn = new JButton("Book Seat");
//        JButton cancelBtn = new JButton("Cancel Seat");
//        JButton undoBookBtn = new JButton("Undo Booking");
//        JButton undoCancelBtn = new JButton("Undo Cancellation");
//        JButton lookupBtn = new JButton("Lookup Seat");
//
//        JPanel panel = new JPanel();
//        panel.add(new JLabel("Category:"));
//        panel.add(categoryBox);
//        panel.add(new JLabel("Seat #:"));
//        panel.add(seatField);
//        panel.add(new JLabel("Name:"));
//        panel.add(nameField);
//        panel.add(bookBtn);
//        panel.add(cancelBtn);
//        panel.add(undoBookBtn);
//        panel.add(undoCancelBtn);
//        panel.add(lookupBtn);
//        panel.add(new JScrollPane(output));
//
//        bookBtn.addActionListener(e -> {
//            String category = (String) categoryBox.getSelectedItem();
//            String seat = seatField.getText();
//            String name = nameField.getText();
//            bookSeat(category, seat, name, output);
//        });
//
//        cancelBtn.addActionListener(e -> {
//            String seat = seatField.getText();
//            cancelSeat(seat, output);
//        });
//
//        undoBookBtn.addActionListener(e -> undoLastBooking(output));
//        undoCancelBtn.addActionListener(e -> undoLastCancellation(output));
//
//        lookupBtn.addActionListener(e -> {
//            String seat = seatField.getText();
//            lookupSeat(seat, output);
//        });
//
//        frame.add(panel);
//        frame.setVisible(true);
//    }
//
//    static void bookSeat(String category, String seatNumber, String customerName, JTextArea output) {
//        CategoryNode cat = categoryTree.search(category);
//        if (cat == null) {
//            output.append("Category not found.\n");
//            return;
//        }
//
//        Seat seat = seatMap.get(seatNumber);
//        if (seat == null || seat.isBooked || !seat.category.equals(category)) {
//            output.append("Seat unavailable or invalid category.\n");
//            return;
//        }
//
//        seat.isBooked = true;
//        seat.customerName = customerName;
//        bookingStack.push(new Action(Action.Type.BOOK, seat));
//        output.append("Seat " + seatNumber + " booked successfully by " + customerName + "\n");
//    }
//
//    static void cancelSeat(String seatNumber, JTextArea output) {
//        Seat seat = seatMap.get(seatNumber);
//        if (seat == null || !seat.isBooked) {
//            output.append("Seat not currently booked.\n");
//            return;
//        }
//
//        String customer = seat.customerName;
//        seat.isBooked = false;
//        seat.customerName = "";
//        cancellationStack.push(new Action(Action.Type.CANCEL, seat));
//        output.append("Seat " + seatNumber + " cancelled (was booked by " + customer + ")\n");
//    }
//
//    static void undoLastBooking(JTextArea output) {
//        if (bookingStack.isEmpty()) {
//            output.append("No bookings to undo.\n");
//            return;
//        }
//        Action last = bookingStack.pop();
//        last.seat.isBooked = false;
//        last.seat.customerName = "";
//        output.append("Undo booking: Seat " + last.seat.seatNumber + " is now available.\n");
//    }
//
//    static void undoLastCancellation(JTextArea output) {
//        if (cancellationStack.isEmpty()) {
//            output.append("No cancellations to undo.\n");
//            return;
//        }
//        Action last = cancellationStack.pop();
//        last.seat.isBooked = true;
//        output.append("Undo cancellation: Seat " + last.seat.seatNumber + " re-booked.\n");
//    }
//
//    static void lookupSeat(String seatNumber, JTextArea output) {
//        Seat seat = seatMap.get(seatNumber);
//        if (seat == null) {
//            output.append("Seat not found.\n");
//        } else {
//            output.append(seat.toString() + "\n");
//        }
//    }
//}
