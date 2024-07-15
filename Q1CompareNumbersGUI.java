//import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Q1CompareNumbersGUI extends JFrame {

    private JLabel labelResult;
    private JTextField textField1,textField2;
    private JButton compareButton,clearButton,exitButton;

    public Q1CompareNumbersGUI() {
        
        // Set up the JFrame
        setTitle("Number Comparison");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        

        // Initialize components
        labelResult = new JLabel("");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        compareButton = new JButton("Compare");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");

        // Add components to the JFrame
        add(new JLabel("Number 1:"));
        add(textField1);
        add(new JLabel("Number 2:"));
        add(textField2);
        
        add(compareButton);
        add(clearButton);
        
        add(labelResult);

        // Add action listener to the button
        compareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Get the text from text fields and convert to double
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());

                String result="";



                // Compare the numbers
                if (number1 > number2) {
                    result=number1+" is greater than " + number2;

                } else if (number1 < number2) {
                    result=number2+" is greater than " + number1;
                } else {
                    result="They are equal";
                }

                JOptionPane.showMessageDialog(Q1CompareNumbersGUI.this,
                result);

                labelResult.setText(result);








            }
        });


                // Add action listener to the button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText("");
                textField2.setText("");
                labelResult.setText("");


            }
        });
        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        // Display the JFrame
        setVisible(true);
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Q1CompareNumbersGUI();
            }
        });
    }

}