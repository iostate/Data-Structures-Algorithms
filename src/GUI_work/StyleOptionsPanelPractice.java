package GUI_work; /**
 * Created by qmtruong92 on 6/8/17.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class StyleOptionsPanelPractice extends JPanel {

    //JLabel
    private JLabel saying;

    private JCheckBox bold, italic;

    //Constructor
    public StyleOptionsPanelPractice() {
        saying = new JLabel("Text here");
        saying.setFont(new Font("Helvetica", 0, 36));

        bold = new JCheckBox("Bold");
        bold.setBackground(Color.cyan);

        italic = new JCheckBox("Italics");
        italic.setBackground(Color.red);

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

            int style = 0;

            if (bold.isSelected()) {
                style = 1;
            }

            if (italic.isSelected()) {
                style += 2;
            }

            saying.setFont(new Font("Helvetica", style, 36));
        }
    }

    //StyleListener
    // - itemStateChanged


    //Use constants


    //if conditional for the checkbox that is clicked
    //button.isSelected()
}
