//import javax.swing.*;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//class PanelKeyListenerExample {
//    public static void main(String[] args) {
//        // Create a JFrame
//        JFrame frame = new JFrame("KeyListener for JPanel Example");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Create a JPanel
//        JPanel panel = new JPanel();
//        panel.setFocusable(true); // Make the panel focusable
//        panel.requestFocusInWindow(); // Request focus to receive key events
//
//        // Add a KeyListener to the JPanel
//        panel.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println("Key Pressed: " + e.getKeyChar());
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                System.out.println("Key Released: " + e.getKeyChar());
//            }
//        });
//
//        // Add the panel to the frame
//        frame.add(panel);
//        frame.setVisible(true);
//    }
//}
