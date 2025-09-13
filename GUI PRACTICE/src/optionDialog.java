//import javax.swing.*;
//
//class OptionDialogExample {
//    public static void main(String[] args) {
//        // Options to present to the user
//        Object[] options = {"Option 1", "Option 2", "Option 3", "Exit"};
//
//        // Display the option dialog
//        int response = JOptionPane.showOptionDialog(
//                null,
//                "Choose an option:",
//                "Option Dialog Example",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.QUESTION_MESSAGE,
//                null,
//                options,
//                options[0]  // Default selection (Option 1)
//        );
//
//        // Check the user's response
//        if (response == 0) {
//            JOptionPane.showMessageDialog(null, "You selected Option 1.", "Message", JOptionPane.INFORMATION_MESSAGE);
//        } else if (response == 1) {
//            JOptionPane.showMessageDialog(null, "You selected Option 2.", "Message", JOptionPane.INFORMATION_MESSAGE);
//        } else if (response == 2) {
//            JOptionPane.showMessageDialog(null, "You selected Option 3.", "Message", JOptionPane.INFORMATION_MESSAGE);
//        } else if (response == 3) {
//            JOptionPane.showMessageDialog(null, "You selected Exit.", "Message", JOptionPane.INFORMATION_MESSAGE);
//        } else {
//            JOptionPane.showMessageDialog(null, "No option selected.", "Message", JOptionPane.WARNING_MESSAGE);
//        }
//    }
//}
import javax.swing.JOptionPane;
class OptionDialogExample {
    public static void main(String[] args) {
        String[] options = {"Option 1", "Option 2", "Option 3"};
        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Option Dialog",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        JOptionPane.showMessageDialog(null, "You chose: " + options[choice]);
    }
}

