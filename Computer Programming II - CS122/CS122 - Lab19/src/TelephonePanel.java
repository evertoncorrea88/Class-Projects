//************************************************************
// TelephonePanel.java
//
// Lays out a (functionless) GUI like a telephone keypad with a title.
// Illustrates use of BorderLayout and GridLayout.
//************************************************************

import java.awt.*;
import javax.swing.*;

public class TelephonePanel extends JPanel {

    public TelephonePanel() {
        //set BorderLayout for this panel
        setLayout(new BorderLayout());                
        //create a JLabel with "Your Telephone" title
        JPanel title = new JPanel();
        title.add(new JLabel("Your Telephone"));
        //add title label to north of this panel
        add (title, BorderLayout.NORTH);
        //create panel to hold keypad and give it a 4x3 GridLayout
        JPanel keypad = new JPanel(new GridLayout(4, 3));
        //add buttons representing keys to key panel
        keypad.add(new JButton("1"));
        keypad.add(new JButton("2"));
        keypad.add(new JButton("3"));
        keypad.add(new JButton("4"));
        keypad.add(new JButton("5"));
        keypad.add(new JButton("6"));
        keypad.add(new JButton("7"));
        keypad.add(new JButton("8"));
        keypad.add(new JButton("9"));
        keypad.add(new JButton("*"));
        keypad.add(new JButton("0"));
        keypad.add(new JButton("#"));
        //add key panel to center of this panel
        add (keypad, BorderLayout.CENTER);
    }
}
