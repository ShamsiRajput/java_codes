import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {

    private JFrame frame;
    private JTextField txt;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[8];
    private String[] functionNames = {"+", "-", "*", "/", "=", "DEL", "C", "."};

    private double num1, num2, result;
    private char operator;
    JPanel panel ;
    Calculator() {
        frame = new JFrame("Calculator");

        frame.setSize(400, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
       // frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Display field
        txt = new JTextField();
        txt.setBounds(20, 20, 340, 70);
        txt.setFont(new Font("Arial", Font.BOLD, 24));
        txt.setEditable(false);
        frame.add(txt);

        // Button panel
        panel =new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        panel.setBounds(20, 110, 340, 380);

        // Creating number buttons (0-9)
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 22));
            numberButtons[i].addActionListener(this);
        }

        // Creating function buttons (+, -, *, /, etc.)
        for (int i = 0; i < 8; i++) {
            functionButtons[i] = new JButton(functionNames[i]);
            functionButtons[i].setFont(new Font("Arial", Font.BOLD, 22));
            functionButtons[i].addActionListener(this);
        }

        // Adding buttons in an ideal order
        panel.add(numberButtons[7]); panel.add(numberButtons[8]); panel.add(numberButtons[9]); panel.add(functionButtons[0]); // "+"
        panel.add(numberButtons[4]); panel.add(numberButtons[5]); panel.add(numberButtons[6]); panel.add(functionButtons[1]); // "-"
        panel.add(numberButtons[1]); panel.add(numberButtons[2]); panel.add(numberButtons[3]); panel.add(functionButtons[2]); // "*"
        panel.add(numberButtons[0]); panel.add(functionButtons[7]); panel.add(functionButtons[6]); panel.add(functionButtons[3]); // "/"

        frame.add(panel);

        // Extra panel for "=" and delete buttons
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2, 5, 5));
        bottomPanel.setBounds(20, 500, 340, 40);

        bottomPanel.add(functionButtons[4]); // "="
        bottomPanel.add(functionButtons[5]); // "DEL"

        frame.add(bottomPanel);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                txt.setText(txt.getText() + i);
            }
        }

        if (e.getSource() == functionButtons[0]) { // "+"
            num1 = Double.parseDouble(txt.getText());
            operator = '+';
            txt.setText("+");
        } else if (e.getSource() == functionButtons[1]) { // "-"
            num1 = Double.parseDouble(txt.getText());
            operator = '-';
            txt.setText("-");
        } else if (e.getSource() == functionButtons[2]) { // "*"
            num1 = Double.parseDouble(txt.getText());
            operator = '*';
            txt.setText("*");
        } else if (e.getSource() == functionButtons[3]) { // "/"
            num1 = Double.parseDouble(txt.getText());
            operator = '/';
            txt.setText("/");
        } else if (e.getSource() == functionButtons[4]) { // "="
            num2 = Double.parseDouble(txt.getText());





            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            txt.setText(String.valueOf(result));
        } else if (e.getSource() == functionButtons[5]) { // "DEL"
            String text = txt.getText();
            txt.setText(text.isEmpty() ? "" : text.substring(0, text.length() - 1));
        } else if (e.getSource() == functionButtons[6]) { // "C"
            txt.setText("");
        } else if (e.getSource() == functionButtons[7]) { // "."
            if (!txt.getText().contains(".")) {
                txt.setText(txt.getText() + ".");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
