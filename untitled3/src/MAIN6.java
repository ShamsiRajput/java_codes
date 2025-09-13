//import javax.swing.*;
//import java.awt.*;
//import java.awt.Event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//class main{
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("farme");
//        frame.setSize(555,555);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        JPanel panel= new JPanel();
//        JButton button = new JButton("actionPerformed: Callback method invoked when the button is clicked.");
//        JLabel label = new JLabel("click here");
//        panel.add(button);
//        panel.add(label);
//        frame.add(panel);
//
//
//        button.setBackground(Color.RED);
//
//
//        button.addActionListener(new AbstractAction(){
//
//            public void actionPerformed(ActionEvent e){
//
//                button.setText("click bro!");
//                label.setText("okhhhh click!");
//
//            }
//
//
//
//        });
//        button.addMouseListener(new MouseAdapter(){
//
//@Override
//            public void mouseEntered(MouseEvent E){
//
//
//                button.setText("MOUSE ON BUTTON");
//
//
//            }
//            @Override
//            public void mouseExited(MouseEvent e) {
//                button.setText("Mouse Exited!");
//
//            }
//
//
//            });
//        }
//    }
//
