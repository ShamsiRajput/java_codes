import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdvancedGUI{
    private JFrame frame;
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JButton clearButton;
    private JComboBox<String> languageComboBox;
    private JPanel panel;

    public AdvancedGUI() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Advanced GUI");
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        frame.add(panel, BorderLayout.CENTER);

        label = new JLabel("Enter your name:");
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setForeground(Color.DARK_GRAY);

        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.gridx = 0;
        labelConstraints.gridy =0 ;

        labelConstraints.insets = new Insets(10, 10, 10, 10);
        panel.add(label, labelConstraints);

        textField = new JTextField(20);
        textField.setFont(new Font("Arial", Font.PLAIN, 14));

        GridBagConstraints textFieldConstraints = new GridBagConstraints();
        textFieldConstraints.gridx = 1;
        textFieldConstraints.gridy = 0;

        textFieldConstraints.insets = new Insets(10, 10, 10, 10);
        panel.add(textField, textFieldConstraints);

        String[] languages = {"English", "Spanish", "French", "German"};
        languageComboBox = new JComboBox<>(languages);
        GridBagConstraints comboBoxConstraints = new GridBagConstraints();
        comboBoxConstraints.gridx = 0;
        comboBoxConstraints.gridy = 1;
        comboBoxConstraints.gridwidth = 2;

        comboBoxConstraints.insets = new Insets(10, 10, 10, 10);
        panel.add(languageComboBox, comboBoxConstraints);

        button = new JButton("Hello");
        button.setFont(new Font("Arial", Font.BOLD, 10 ));
        button.setBackground(Color.GREEN);
        button.setForeground(Color.WHITE);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String name = textField.getText().trim();
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter your name.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String greeting = getGreeting(languageComboBox.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(frame, greeting + ", " + name + "!");
                }
            }
        });

        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.gridx = 0;
        buttonConstraints.gridy = 2;
        buttonConstraints.gridwidth = 2;

        buttonConstraints.insets = new Insets(10, 10, 10, 10);
        panel.add(button, buttonConstraints);

        // Clear button to reset input
        clearButton = new JButton("Clear" );
        clearButton.setFont(new Font("Arial", Font.BOLD, 10));
        clearButton.setBackground(Color.RED);
        clearButton.setForeground(Color.WHITE);

        clearButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                languageComboBox.setSelectedIndex(0);
            }
        });

        GridBagConstraints clearButtonConstraints = new GridBagConstraints();
        clearButtonConstraints.gridx = 1;
        clearButtonConstraints.gridy = 2;

        clearButtonConstraints.insets = new Insets(10, 10, 10, 10);
        panel.add(clearButton, clearButtonConstraints);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }

    private String getGreeting(String language) {
        switch (language) {
            case "Spanish":
                return "Hola";
            case "French":
                return "Bonjour";
            case "German":
                return "Hallo";
            default:
                return "Hello";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AdvancedGUI();
            }
   });
    }
}
