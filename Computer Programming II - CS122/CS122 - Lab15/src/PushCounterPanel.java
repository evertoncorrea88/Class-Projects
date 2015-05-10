//********************************************************************
//  PushCounterPanel.java       Authors: Lewis/Loftus
//
//  Demonstrates a graphical user interface and an event listener.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanel extends JPanel {

    private int count;
    private String labelText;
    private JButton push;
    private JLabel label;

    private int joeCount;
    private JButton joeButton;
    private JLabel joeLabel;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public PushCounterPanel() {

        push = new JButton("Vote for Sam");
        push.addActionListener(new ButtonListener());

        count = 0;
        labelText = "Votes: " + count;
        label = new JLabel(labelText);

        add(push);
        add(label);

        joeButton = new JButton("Vote for Joe");
        joeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                joeCount++;
                joeLabel.setText("Votes: " + joeCount);
            }
        });

        joeCount = 0;
        joeLabel = new JLabel("Votes: " + joeCount);

        add(joeButton);
        add(joeLabel);

        setPreferredSize(new Dimension(300, 80));
        setBackground(Color.cyan);            
    }
    
    //*****************************************************************
    //  Represents a listener for button push (action) events.
    //*****************************************************************
    private class ButtonListener implements ActionListener {
        //--------------------------------------------------------------
        //  Updates the counter and label when the button is pushed.
        //--------------------------------------------------------------

        public void actionPerformed(ActionEvent event) {
            count++;
            labelText += count;
            label.setText(labelText);
        }
    }
}
