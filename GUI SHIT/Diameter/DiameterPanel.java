import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 * Description: Provides a GUI that allows for the calculation of the volume
 * and surface area of a sphere. The diameter is provided in the text field
 * by the user.
 */
public class DiameterPanel extends JPanel {

    private JLabel inputLabel, surfAreaLabel, volLabel;
    private JTextField diameter;
    private JButton volumeButton, surfaceAreaButton;


    public DiameterPanel() {

        //Labels
        //This is what is going to be displayed before the calculations

        inputLabel = new JLabel("Enter the diameter of the sphere: ");
        surfAreaLabel = new JLabel("Surface area of the sphere");
        volLabel = new JLabel("Volume of the sphere: ");


        //Buttons that perform the calculations
        volumeButton = new JButton("Perform the volume calculation");
        surfaceAreaButton = new JButton("Perform the surface area " +
                "calculation");

        volumeButton.addActionListener(new ButtonListener());
        surfaceAreaButton.addActionListener(new ButtonListener());

        //Add event listener to the diameter text field
        //TODO: enter functionality


        //Text Field
        //@paremeter is the size of the text field
        diameter = new JTextField(5);
        diameter.addActionListener(new ButtonListener());

        add(diameter);
        add(volumeButton);
        add(surfaceAreaButton);

        //Add labels to the content pane
        add(inputLabel);
        add(surfAreaLabel);
        add(volLabel);

        //Set preferred size
        setPreferredSize(new Dimension(300, 800));

        //Set background size
        setBackground(Color.blue);

    }

    private class ButtonListener implements ActionListener {

        DecimalFormat df3 = new DecimalFormat(".000");
        DecimalFormat df4 = new DecimalFormat(".0000");


        public void actionPerformed(ActionEvent event) {


            //Labels within the Listener will be displayed after calculations
            String text;
            double radius, volumeCalc, surfaceArea;


            //Do volume calculation of the sphere
            if (event.getSource() == volumeButton) {

                text = diameter.getText();

                //Take number as text, convert to Int, then return the calculation
                //Of the number as a double
                radius = Diameter.convertToRadius(text);


                volumeCalc = Diameter.doVolume(radius);

                //Print the volume calculation after pressing the button
                volLabel.setText("Volume of the sphere is: " + volumeCalc);
            }


            //Do the surface area calculation
            else if (event.getSource() == surfaceAreaButton) {

                text = diameter.getText();

                radius = Diameter.convertToRadius(text);

                surfaceArea = Diameter.doSurfaceArea(radius);

                //Replace label with surface area calculation after pressing the
                //button
                surfAreaLabel.setText("Surface area of the sphere is: " +
                        surfaceArea);
            }

        }


    }


}
