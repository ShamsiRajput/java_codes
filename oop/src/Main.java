import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Controller {
    private JFrame frame;
    private JLabel label;
    private JButton turnOnButton;
    private JButton turnOffButton;

    public Controller() {
        frame = new JFrame("Smart Home - Light Controller");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        label = new JLabel("Light Status: OFF");
        label.setFont(new Font("Arial", Font.BOLD, 16));

        turnOnButton = new JButton("Turn ON");
        turnOffButton = new JButton("Turn OFF");

        turnOnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Light Status: ON");
                frame.getContentPane().setBackground(Color.RED);
            }
        });

        turnOffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Light Status: OFF");
                frame.getContentPane().setBackground(null);
            }
        });
        frame.add(label);
        frame.add(turnOnButton);
        frame.add(turnOffButton);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
       Controller obj= new Controller();
}
}
