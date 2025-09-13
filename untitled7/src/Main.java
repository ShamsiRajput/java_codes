import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
import javax.swing.*;
class frame extends JFrame{
    frame(){
        JFrame fram=new JFrame("calculater!");
        fram.setVisible(true);
        fram.setSize(400,400);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel=new JPanel();
JButton button=new JButton();
button.add(new JButton("BUTTON1"));
        button.add(new JButton("BUTTON2"));
        button.add(new JButton("BUTTON3"));
        button.setLayout(new GridLayout(4,4,4,4));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("click");

        }});

panel.add(button);
fram.add(panel);
    }




    public static void main(String[] args) {

new frame();


    }


}