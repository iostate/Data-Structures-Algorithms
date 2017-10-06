package GUI_work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Practice using checkboxes.
 */
public class StyleOptionsPanel extends JPanel {

    private JLabel saying;
    private JCheckBox bold, italic;

    //Constructor that constructs the GUI

    public StyleOptionsPanel() {
        saying = new JLabel("Say it with style!");



        //Font(MagicConstant, style, size)
        saying.setFont(new Font("Helvetica", 0, 36));


        //Checkboxes
        bold = new JCheckBox("Bold");
        bold.setBackground(Color.cyan);

        //Checkboxes
        italic = new JCheckBox("Italic");
        italic.setBackground(Color.cyan); //backgronund of GUI when checkbox is clicked

        StyleListener listener = new StyleListener();

        bold.addItemListener(listener);
        italic.addItemListener(listener);

        add(saying);
        add(bold);
        add(italic);

        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 100));


    }

    private class StyleListener implements ItemListener {

        public void itemStateChanged(ItemEvent event) {

            int style = Font.PLAIN; //constant can be replaced with number 0

            if (bold.isSelected()) {
                style = Font.BOLD; //constant can represent the number 1
            }

            if (italic.isSelected()){
                style += Font.ITALIC; //constant can represent the number 3
            }

            saying.setFont(new Font("Helvetica", style, 36));

        }
    }


}
