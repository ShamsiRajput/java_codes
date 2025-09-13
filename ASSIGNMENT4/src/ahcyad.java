import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ComboBoxItemListenerExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("ItemListener Example - JComboBox");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JComboBox
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Add an ItemListener to the JComboBox
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Selected: " + e.getItem());
                }
            }
        });

        // Add the JComboBox to the frame
        frame.add(comboBox);
        frame.setVisible(true);
    }
}
