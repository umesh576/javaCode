package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame {
    private JTextField num1Field, num2Field;
    private JButton addButton, subtractButton;

    public CalculatorGUI() {
        // Set frame properties
        setTitle("Sum and Difference Calculator");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns

        // Create components
        num1Field = new JTextField();
        num2Field = new JTextField();
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");

        // Add components to frame
        add(new JLabel("Enter first number:"));
        add(num1Field);
        add(new JLabel("Enter second number:"));
        add(num2Field);
        add(addButton);
        add(subtractButton);

        // Action listeners
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("add");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("subtract");
            }
        });
    }

    // Method to perform calculation and show result
    private void calculate(String operation) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result;

            if (operation.equals("add")) {
                result = num1 + num2;
                JOptionPane.showMessageDialog(this, "Sum is: " + result);
            } else {
                result = num1 - num2;
                JOptionPane.showMessageDialog(this, "Difference is: " + result);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
        }
    }

    // Main method to run the GUI
    public static void main(String[] args) {
        CalculatorGUI calculator = new CalculatorGUI();
        calculator.setVisible(true);
    }
}
