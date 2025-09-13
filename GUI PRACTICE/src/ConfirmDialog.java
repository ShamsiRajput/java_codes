//import javax.swing.*;
//
//class ConfirmDialogExample {
//    public static void main(String[] args) {
//        // Display a confirmation dialog asking the user to confirm an action
//        int response = JOptionPane.showConfirmDialog(
//                null,
//                "Do you want to save changes?",
//                "Confirm Dialog Example",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.QUESTION_MESSAGE
//        );
//
//        // Check the user's response
//        if (response == JOptionPane.YES_OPTION) {
//            JOptionPane.showMessageDialog(null, "Changes saved!", "Message", JOptionPane.INFORMATION_MESSAGE);
//        } else if (response == JOptionPane.NO_OPTION) {
//            JOptionPane.showMessageDialog(null, "Changes not saved.", "Message", JOptionPane.INFORMATION_MESSAGE);
//        } else if (response == JOptionPane.CANCEL_OPTION) {
//            JOptionPane.showMessageDialog(null, "Action canceled.", "Message", JOptionPane.INFORMATION_MESSAGE);
//        }
//    }
//}
//

import javax.swing.JOptionPane;
class ConfirmDialogExample {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You selected Yes.");
        } else if (choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You selected No.");
        } else {
            JOptionPane.showMessageDialog(null, "You selected Cancel.");
        }
    }
}
