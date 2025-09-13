import javax.swing.*;
import java.awt.*;

class Project {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Project!");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Labels
        JLabel nameLabel = new JLabel("Enter Name:");
        JLabel fatherLabel = new JLabel("Enter Father's Name:");
        JLabel ageLabel = new JLabel("Enter Age:");
        JLabel dobLabel = new JLabel("Enter Date of Birth:");
        JLabel cnicLabel = new JLabel("Enter CNIC:");
        JLabel locationLabel = new JLabel("Enter Location:");

        // Text Fields
        JTextField nameField = new JTextField();
        JTextField fatherField = new JTextField();
        JTextField ageField = new JTextField();
        JTextField dobField = new JTextField();
        JTextField cnicField = new JTextField();
        JTextField locationField = new JTextField();

        // Setting Horizontal Layout
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(nameLabel)
                                .addComponent(fatherLabel)
                                .addComponent(ageLabel)
                                .addComponent(dobLabel)
                                .addComponent(cnicLabel)
                                .addComponent(locationLabel))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(nameField)
                                .addComponent(fatherField)
                                .addComponent(ageField)
                                .addComponent(dobField)
                                .addComponent(cnicField)
                                .addComponent(locationField))
        );

        // Setting Vertical Layout
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(nameLabel)
                                .addComponent(nameField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(fatherLabel)
                                .addComponent(fatherField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(ageLabel)
                                .addComponent(ageField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(dobLabel)
                                .addComponent(dobField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(cnicLabel)
                                .addComponent(cnicField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(locationLabel)
                                .addComponent(locationField))
        );

        frame.add(panel);
        frame.setVisible(true);
    }
}
