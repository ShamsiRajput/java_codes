


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

 class mouse {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Button not clicked yet");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);

        frame.setVisible(true);


        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited!");
            }
        });
    }}