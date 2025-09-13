//import javax.swing.*;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.InputEvent;
//
//class main1 {
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("light system!");
//        JPanel panel = new JPanel();
//        JButton button = new JButton("on");
//        JButton button1 = new JButton("off");
//        JLabel label = new JLabel("light Stats:");
//        JLabel label1 = new JLabel("slider Stats:");
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 400);
//
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setText("light is on!");
//            }
//        });
//        button1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent d) {
//
//                label.setText("light is off!");
//
//            }
//
//
//        });
//
//
//        JSlider slider = new JSlider();
//        slider.setPaintLabels(true);
//        slider.setPaintTicks(true);
//        slider.setVisible(true);
//        slider.setSize(23, 56);
//        slider.setMajorTickSpacing(10);
//
//        slider.addChangeListener(new ChangeListener() {
//            @Override
//            public void stateChanged(ChangeEvent e) {
//                label1.setText("value" + slider.getValue());
//            }
//        });
//        panel.add(label1);
//        panel.add(slider);
//        panel.add(label);
//
//        JRadioButton button2 = new JRadioButton("twer");
//        JRadioButton button3 = new JRadioButton("twer");
//
//        panel.add(button);
//        panel.add(button1);
//        panel.add(button2);
//        panel.add(button3);
//        frame.add(panel);
//
//
//
//
//        class MenuGUI extends JFrame {
//            public MenuGUI() {
//                setTitle("Menu Bar Example");
//                setSize(400, 300);
//                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//                // Create menu bar
//                JMenuBar menuBar = new JMenuBar();
//
//                // Create menus
//                JMenu fileMenu = new JMenu("File");
//                JMenu editMenu = new JMenu("Edit");
//                JMenu helpMenu = new JMenu("Help");
//
//                // Create menu items
//                JMenuItem openItem = new JMenuItem("Open");
//                JMenuItem saveItem = new JMenuItem("Save");
//                JMenuItem exitItem = new JMenuItem("Exit");
//
//                JMenuItem copyItem = new JMenuItem("Copy");
//                JMenuItem pasteItem = new JMenuItem("Paste");
//
//                JMenuItem aboutItem = new JMenuItem("About");
//
//                // Add menu items to menus
//                fileMenu.add(openItem);
//                fileMenu.add(saveItem);
//                fileMenu.addSeparator(); // Adds a line separator
//                fileMenu.add(exitItem);
//
//                editMenu.add(copyItem);
//                editMenu.add(pasteItem);
//
//                helpMenu.add(aboutItem);
//
//                // Add menus to menu bar
//                menuBar.add(fileMenu);
//                menuBar.add(editMenu);
//                menuBar.add(helpMenu);
//
//                // Set menu bar to frame
//                setJMenuBar(menuBar);
//
//                // Action Listeners
//                exitItem.addActionListener(e -> System.exit(0));
//                aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "This is a simple menu bar example."));
//
//                setVisible(true);
//            }
//        }
//
//
////
////                String[] options = {"Option 1", "Option 2", "Option 3"};
////                int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Option Dialog",
////                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
////
////                JOptionPane.showMessageDialog(null, "You chose: " + options[choice]);
////
////
////
////
////        String name = JOptionPane.showInputDialog(null, "Enter your name:", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
////        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
////    }
//
//
//    }
//}
//
//
