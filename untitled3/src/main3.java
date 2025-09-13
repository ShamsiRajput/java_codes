//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//class ActionListenerExample {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("ActionListener Example");
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setFocusable(true);
//        frame.requestFocusInWindow();
//
//        // Key listener
//        frame.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println("Key Pressed: " + e.getKeyChar());
//            }
//        });
//
//        JButton button = new JButton("Click Me");
//        JLabel label = new JLabel("Button not clicked yet");
//
//        // Add ActionListener to the button
//        button.addActionListener(new java.awt.event.ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setText("Button Clicked!");
//            }
//        });
//
//        // Add MouseListener to the button
//        button.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                label.setText("Mouse Entered!");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                label.setText("Mouse Exited!");
//            }
//        });
//
//        frame.setLayout(new FlowLayout());
//        frame.add(button);
//        frame.add(label);
//
//        frame.setVisible(true);
//    }
//}
