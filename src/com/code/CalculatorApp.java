package com.code;

import javax.swing.*;
import java.awt.event.*;

public class CalculatorApp {
    private JPanel panel_calc;
    private JButton button_add;
    private JButton button_subtract;
    private JButton button_multiply;
    private JButton button_divide;
    private JTextField input1_field;
    private JTextField input2_field;
    private JTextArea output_area;

    private double input1;
    private double input2;
    private double output;

    public boolean isIntegerForm (double number) {
        return (number - Math.floor(number) < 0.001);
    }
    public CalculatorApp() {
        button_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output = input1 + input2;
                if (isIntegerForm(output)) {
                    output_area.setText(Integer.toString((int) output));
                } else {
                    output_area.setText(Double.toString(output));
                }
            }
        });
        button_subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output = input1 - input2;
                if (isIntegerForm(output)) {
                    output_area.setText(Integer.toString((int) output));
                } else {
                    output_area.setText(Double.toString(output));
                }
            }
        });
        button_multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output = input1 * input2;
                if (isIntegerForm(output)) {
                    output_area.setText(Integer.toString((int) output));
                } else {
                    output_area.setText(Double.toString(output));
                }
            }
        });
        button_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output = input1 / input2;
                if (isIntegerForm(output)) {
                    output_area.setText(Integer.toString((int) output));
                } else {
                    output_area.setText(Double.toString(output));
                }
            }
        });
        input1_field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1 = Double.parseDouble(input1_field.getText());
            }
        });
        input2_field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input2 = Double.parseDouble(input2_field.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorApp().panel_calc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
