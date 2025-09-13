//import javax.swing.*;
//
// class InputDialogExample {
//    public static void main(String[] args) {
//        // Display an input dialog asking the user for their name
//        String name = JOptionPane.showInputDialog(null, "Enter your name:", "Input Dialog Example", JOptionPane.QUESTION_MESSAGE);
//
//        // Check if the user entered something or canceled the dialog
//        if (name != null && !name.isEmpty()) {
//            // Show a message with the entered name
//            JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
//        } else {
//            // Show a message if no name was entered
//            JOptionPane.showMessageDialog(null, "No name entered!", "Message", JOptionPane.WARNING_MESSAGE);
//        }
//    }
//}

import javax.swing.JOptionPane;
class InputDialogExample {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name:", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}
