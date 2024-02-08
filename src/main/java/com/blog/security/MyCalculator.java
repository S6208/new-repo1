package com.blog.security;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator {
    private JPanel JavaCalculato;
    private JTextField textField1;
    private JButton bntPoint;
    private JButton btnEight;
    private JButton btnFive;
    private JButton btnOne;
    private JButton bntTwo;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnThree;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnPlus;
    private JButton btnDivide;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnEquals;

    public MyCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyCalculator");
        frame.setContentPane(new MyCalculator().JavaCalculato);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
