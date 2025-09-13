import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class CalculatorGUI implements ActionListener {
    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[8];
    private String[] functionNames = {"+", "-", "*", "/", "=", "C", ".", "DEL"};
    private double num1, num2, result;
    private char operator;

    public CalculatorGUI() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 450);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setBounds(20, 20, 300, 50);
        textField.setEditable(false);
        frame.add(textField);

        //Create number buttons (0-9)
       for (int i = 0; i < 10; i++) {
           numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Create function buttons (+, -, *, /, =, C, ., DEL)
        for (int i = 0; i < functionButtons.length; i++) {
            functionButtons[i] = new JButton(functionNames[i]);
            functionButtons[i].addActionListener(this);
        }

        // Layout for buttons
        JPanel panel = new JPanel();
        panel.setBounds(20, 80, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        // Add buttons to panel
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(functionButtons[3]); // "/"

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(functionButtons[2]); // "*"

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(functionButtons[1]); // "-"

        panel.add(numberButtons[0]);
        panel.add(functionButtons[6]); // "."
        panel.add(functionButtons[4]); // "="
        panel.add(functionButtons[0]); // "+"

        frame.add(panel);

        // Additional buttons outside the grid
        functionButtons[5].setBounds(20, 390, 145, 40); // "C"
        functionButtons[7].setBounds(175, 390, 145, 40); // "DEL"
        frame.add(functionButtons[5]);
        frame.add(functionButtons[7]);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        // Handling operators
        if (e.getSource() == functionButtons[0]) { // "+"
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        } else if (e.getSource() == functionButtons[1]) { // "-"
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        } else if (e.getSource() == functionButtons[2]) { // "*"
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        } else if (e.getSource() == functionButtons[3]) { // "/"
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        } else if (e.getSource() == functionButtons[4]) { // "="
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 != 0) result = num1 / num2;
                    else { textField.setText("Error"); return; }
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result; // Allow continued calculations
        } else if (e.getSource() == functionButtons[5]) { // "C"
            textField.setText("");
        } else if (e.getSource() == functionButtons[6]) { // "."
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
        } else if (e.getSource() == functionButtons[7]) { // "DEL"
            String text = textField.getText();
            if (!text.isEmpty()) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
