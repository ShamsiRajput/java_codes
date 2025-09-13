import javax.swing.*;
import java.awt.*;

class ComponentDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Component Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); // Create a panel
        JLabel label = new JLabel("Hello, Swing!"); // Create a label
        JButton button = new JButton("Click Me!"); // Create a button

        panel.add(label); // Add label to panel
        panel.add(button); // Add button to panel

        frame.add(panel); // Add panel to frame
        frame.setLayout(new FlowLayout()); // Set layout manager
        frame.setVisible(true);
    }
}
