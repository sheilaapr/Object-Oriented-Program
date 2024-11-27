package LatihanPrakPBO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame {
    private JTextField display;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;

    private double firstOperand;
    private String operator;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new NumberButtonListener());
            buttonPanel.add(numberButtons[i]);
        }

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        addButton.addActionListener(new OperatorButtonListener());
        subtractButton.addActionListener(new OperatorButtonListener());
        multiplyButton.addActionListener(new OperatorButtonListener());
        divideButton.addActionListener(new OperatorButtonListener());
        equalsButton.addActionListener(new EqualsButtonListener());
        clearButton.addActionListener(new ClearButtonListener());

        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(equalsButton);
        buttonPanel.add(clearButton);

        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class NumberButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            display.setText(display.getText() + input);
        }
    }

    private class OperatorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            firstOperand = Double.parseDouble(display.getText());
            operator = e.getActionCommand();
            display.setText("");
        }
    }

    private class EqualsButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double secondOperand = Double.parseDouble(display.getText());
            double result = 0.0;
            switch (operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    if (secondOperand != 0)
                        result = firstOperand / secondOperand;
                    else
                        display.setText("Error");
                    break;
            }
            display.setText(String.valueOf(result));
        }
    }

    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimpleCalculator calculator = new SimpleCalculator();
                calculator.setVisible(true);
            }
        });
    }
}