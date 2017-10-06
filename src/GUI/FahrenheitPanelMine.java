package GUI;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * Panels create GUI constructors
 * Steps:
 *
 * 1) Add extends JPanel
 * 2) Create Constructor
 *      - Create labels
 *      - Add labels
 *      - Set background size
 *      - Set preferred size
 *      - Create text field
 */

public class FahrenheitPanelMine extends JPanel {

    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField fahrenheit;


    public FahrenheitPanelMine() {

        /**
         * input
         * fahrenheit
         * output
         * result
         */

        //Labels
        inputLabel = new JLabel("Enter Fahrenheit Temperature: ");

        outputLabel = new JLabel("Temperature in Celsius: ");

        resultLabel = new JLabel("---");

        // TEXT FIELD -
        // @parameter Size of text field
        fahrenheit = new JTextField(5);


        //labels
        add(inputLabel);
        add(fahrenheit);
        add(outputLabel);
        add(resultLabel);

        // Set the preferred size
        setPreferredSize(new Dimension(800, 300));

        //Set the background color
        setBackground(Color.blue);
    }

    private class TempListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            int fahrenheitTemp, celsiusTemp;


            //this method call retrieves the text from textfield
            String text = fahrenheit.getText();

            //Convert the text from text field to an integer
            fahrenheitTemp = Integer.parseInt(text);

            //Perform the celsius calculation
            celsiusTemp = (fahrenheitTemp-32) * 5/9;

            //Convert the celsius temperature to String and print to screen
            resultLabel.setText(Integer.toString(celsiusTemp));



        }
    }



}
