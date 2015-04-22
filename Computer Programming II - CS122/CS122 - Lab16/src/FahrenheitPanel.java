//********************************************************************
//  FahrenheitPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel {

    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField input;

    //  Constructor: Sets up the main GUI components.
    public FahrenheitPanel() {
        inputLabel = new JLabel("Enter Fahrenheit temperature:");
//        outputLabel = new JLabel("Temperature in Celsius: ");
        resultLabel = new JLabel("xxx degress Fahrenheit = xxx degrees Celsius");

        input = new JTextField(5); //initial width
        input.addActionListener(new TempListener());

        
        add(inputLabel);
        add(input);
//        add(outputLabel);
        add(resultLabel);
        setPreferredSize(new Dimension(300, 75));
        setBackground(Color.yellow);
    }

    //*****************************************************************
    //  Represents an action listener for the temperature input field.
    //*****************************************************************
    private class TempListener implements ActionListener {

        //--------------------------------------------------------------
        //  Performs the conversion when the enter key is pressed in
        //  the text field.
        //--------------------------------------------------------------

        public void actionPerformed(ActionEvent event) {
            int fahrenheitTemp, celsiusTemp;

            String text = input.getText();

            fahrenheitTemp = Integer.parseInt(text);
            celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;

//            resultLabel.setText(Integer.toString(celsiusTemp));
            resultLabel.setText(fahrenheitTemp + " degress Fahrenheit = " + celsiusTemp + "  degrees Celsius");

        }
    }
}
