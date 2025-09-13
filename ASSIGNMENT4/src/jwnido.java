import javax.swing.*;
import java.awt.*;

class JWindowExample {
    public static void main(String[] args) {
        // Create a JWindow
        JWindow window = new JWindow();
        window.setSize(300, 200);

        // Add content to the window
        JLabel label = new JLabel("This is a JWindow!", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        window.getContentPane().add(label);

        // Position the window in the center of the screen
        window.setLocationRelativeTo(null);

        // Display the JWindow
        window.setVisible(true);

        // Automatically close the JWindow after 3 seconds
        new Timer(3000, e -> window.dispose()).start();
    }
}
