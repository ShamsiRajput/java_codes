import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MENU FOR PROJECT!");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();


        JMenuBar bar=new JMenuBar();
        bar.setVisible(true);
        bar.setBackground(Color.red);
        bar.setSize(23,30);
        frame.setJMenuBar(bar);
JMenu edit=new JMenu("edit");
        JMenu save=new JMenu("save");
        JMenu best=new JMenu("best");
        bar.add(edit);
        bar.add(save);
        bar.add(best);

        bar.setLayout(new FlowLayout(FlowLayout.CENTER));
        JMenuItem save01=new JMenuItem("save");
        JMenuItem save02=new JMenuItem("save as");
                JMenuItem edit01=new JMenuItem("edit video");
        JMenuItem edit02=new JMenuItem("edit pic");
        JMenuItem edit03=new JMenuItem("edit text");
        JMenuItem best01=new JMenuItem("no1");
        JMenuItem best02=new JMenuItem("no2");
        JMenuItem best03=new JMenuItem("no3");
edit.add(edit01);

        edit.add(edit02);

        edit.add(edit03);
        save.add(save01);
        save.add(save02);
        best.add(best01);
        best.add(best02);
        best.add(best03);

        // Buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Labels
        JLabel label1 = new JLabel("Click me");
        JLabel label2 = new JLabel("Click me");
        JLabel label3 = new JLabel("Click me");

        // Dropdown (ComboBox)
        String[] box = {"Pakistan", "London", "UAE", "Afghanistan", "Saudi Arabia"};
        JComboBox<String> opt = new JComboBox<>(box);

        // Radio Buttons
        JRadioButton radio1 = new JRadioButton("Male");
        JRadioButton radio2 = new JRadioButton("Female");


        // Group the radio buttons so only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

      //frame.setLayout(new FlowLayout(FlowLayout.CENTER));




        // Adding components to panel
        panel.add(radio1);
        panel.add(radio2);

        panel.add(opt);
        panel.add(label1);
        panel.add(button1);
        panel.add(label2);
        panel.add(button2);
        panel.add(label3);
        panel.add(button3);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);

    }
}
