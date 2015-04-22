//********************************************************************
//  StyleOptionsPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel {

    private JLabel saying;
    private JCheckBox bold, italic, f10, f30;
    //-----------------------------------------------------------------
    //  Sets up a panel with a label and some check boxes that
    //  control the style of the label's font.
    //-----------------------------------------------------------------

    public StyleOptionsPanel() {
        saying = new JLabel("Say it with style!");
        saying.setFont(new Font("Helvetica", Font.PLAIN, 20));

        bold = new JCheckBox("Bold");
        bold.setBackground(Color.cyan);
        italic = new JCheckBox("Italic");
        italic.setBackground(Color.cyan);

        f10 = new JCheckBox("Font size 10");
        f10.setBackground(Color.cyan);
        f30 = new JCheckBox("Font size 30");
        f30.setBackground(Color.cyan);

        StyleListener listener = new StyleListener();
        bold.addItemListener(listener);
        italic.addItemListener(listener);
        f10.addItemListener(listener);
        f30.addItemListener(listener);
        // bold.setSelected(true);

        JPanel labelPanel = new JPanel();
        labelPanel.setBackground(Color.cyan);
        labelPanel.setPreferredSize(new Dimension(400, 60));
        
        labelPanel.add(saying);

        JPanel optionPanel = new JPanel();
        optionPanel.setBackground(Color.cyan);
        optionPanel.setPreferredSize(new Dimension(400, 50));

        optionPanel.add(bold);
        optionPanel.add(italic);
        optionPanel.add(f10);
        optionPanel.add(f30);


        add(labelPanel);
        add(optionPanel);
        
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(400, 150));
    }
    //*****************************************************************
    //  Represents the listener for both check boxes.
    //*****************************************************************

    private class StyleListener implements ItemListener {
        //--------------------------------------------------------------
        //  Updates the style of the label font style.
        //--------------------------------------------------------------

        public void itemStateChanged(ItemEvent event) {
            int style = Font.PLAIN;
            int size = 0;

            if (bold.isSelected()) {
                style = Font.BOLD;
            }

            if (italic.isSelected()) {
                style += Font.ITALIC;
            }
            
            if (f10.isSelected()) {
                size = 10;
            }
            
            if (f30.isSelected()) {
                size += 30;
            }
            
            if(size == 0){
                size = 20;
            }

            saying.setFont(new Font("Helvetica", style, size));
        }
    }

}
