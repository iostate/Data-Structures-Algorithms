package GUI_work;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Running through practicing for the StyleOptions Panel
 */
public class StyleOptionsPanelPractice1 extends JPanel {

    //JLabel for the words
    private JLabel saying;

    //JCheckBox for bold and italic
    private JCheckBox bold, italic;


    //Constructor
    public StyleOptionsPanelPractice1() {

        saying = new JLabel("Text here");
        saying.setFont(new Font("Helvetica", 0, 36));


        //Add the checkboxes for bold and italic

        bold = new JCheckBox("Bold");

        //Set background color when that checkbox is checked
        bold.setBackground(Color.black);

        italic = new JCheckBox("Italics");
        italic.setBackground(Color.red);

        //Implement the StyleListener
        StyleListener listener = new StyleListener();

        bold.addItemListener(listener);
        italic.addItemListener(listener);

        add(saying);
        add(bold);
        add(italic);

        setBackground(Color.red);
        setPreferredSize(new Dimension(300, 100));



    }


    //Notice that this implements the ItemListener
    //As a side note, it uses the itemStateChanged() method
    //Much like the actionPerformed of the ButtonListener()

    private class StyleListener implements ItemListener {

        public void itemStateChanged(ItemEvent event) {


            //Default style is plain
            int style = Font.PLAIN;

            //If bold is selected, change the font style to bold
            if (bold.isSelected()) {
                style = Font.BOLD;
            }


            //If italic checkbox is selected, change the font style to italics
            if (italic.isSelected()) {
                style += Font.ITALIC;
            }
            saying.setFont(new Font("Helvetica", 0, 36));
        }
    }
}
