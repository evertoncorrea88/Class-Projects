//********************************************************************
//  SlideColor.java       Authors: Lewis/Loftus
//
//  Demonstrates the use slider components.
//********************************************************************

import java.awt.*;
import javax.swing.*;

public class SlideColor {
   //-----------------------------------------------------------------
    //  Presents up a frame with a control panel and a panel that
    //  changes color as the sliders are adjusted.
    //-----------------------------------------------------------------

    public static void main(String[] args) {
        JFrame frame = new JFrame("Slide Colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SlideColorPanel mainPanel = new SlideColorPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        frame.getContentPane().add(mainPanel);

        frame.pack();
        frame.setVisible(true);
    }
}
