import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main1 {
    public static void main(String [] args)
    {
        JFrame frame = new JFrame("University course feedback");
        frame.setSize(500,290);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(6));

        frame.setVisible(true);
        JLabel titleLable = new JLabel("University feedback",JLabel.CENTER);

        JLabel studentLabel =new JLabel("Student");
        JLabel IDLabel =new JLabel("Feedback");
        JLabel Label =new JLabel("Course:");

        JTextField studentidTextfield = new JTextField(20);
        JTextField feedbackModel = new JTextField(20);


        String [] courses = {"int to itc", "java","oop"};
        JComboBox<String> course = new JComboBox<>(courses);

        JButton button = new JButton("Submit");
        button.setLayout(new FlowLayout(FlowLayout.CENTER ));





    }
}
