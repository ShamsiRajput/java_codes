//import javax.swing.*;
//
// class MessageDialogExample {
//    public static void main(String[] args) {
//        // Display a message dialog with a simple message
//        JOptionPane.showMessageDialog(null, "This is a simple message.", "Message Dialog Example", JOptionPane.INFORMATION_MESSAGE);
//    }
//}
import java.util.Scanner;
import javax.swing.JOptionPane;
class MessageDialogExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        System.out.println("Enter the name :");
        name=input.next();
        JOptionPane.showMessageDialog(null, "Hello,!"+name, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
