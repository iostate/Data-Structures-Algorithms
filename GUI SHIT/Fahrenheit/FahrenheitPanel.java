package GUI;//********************************************************************
//  FahrenheitPanel.java       Java Foundations
//
//  Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel {
    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField fahrenheit;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the main GUI components.
    //-----------------------------------------------------------------
    public FahrenheitPanel() {

        //Labels
        inputLabel = new JLabel("Enter Fahrenheit temperature:");
        outputLabel = new JLabel("Temperature in Celsius: ");
        resultLabel = new JLabel("---");

        //Text field
        fahrenheit = new JTextField(5);

        //add listener
        fahrenheit.addActionListener(new TempListener());

        //labels
        add(inputLabel);
        add(fahrenheit);
        add(outputLabel);
        add(resultLabel);

        setPreferredSize(new Dimension(800, 300));
        setBackground(Color.orange);
    }

    //*****************************************************************
    //  Represents an action listener for the temperature input field.
    //*****************************************************************
    private class TempListener implements ActionListener {
        //--------------------------------------------------------------
        //  Performs the conversion when the enter key is pressed in
        //  the text field.
        //--------------------------------------------------------------
        public void

        actionPerformed(ActionEvent event) {
            int fahrenheitTemp, celsiusTemp;

            String text = fahrenheit.getText();

            fahrenheitTemp = Integer.parseInt(text);
            celsiusTemp = (fahrenheitTemp - 32) * 5 / 9; //truncate decimal

            resultLabel.setText(Integer.toString(celsiusTemp));
        }
    }
}
