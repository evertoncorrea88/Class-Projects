// **********************************************************
// CountDownPanel.java
//
// Panel for a digital display that counts down from 10.
// The display can be stopped or reset with a mouse click.
// **********************************************************
//import DigitalDisplay;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CountDownPanel extends JPanel {

    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private final int DISPLAY_WIDTH = 150;
    private final int DISPLAY_HEIGHT = 100;
    private final int DELAY = 1000;
    private final int COUNT_START = 10;
    private DigitalDisplay clock;
    private Timer timer;
    
    // --------------------------------------------------------
    // Set up the applet.
    // --------------------------------------------------------
    public CountDownPanel(Timer countdown, JApplet applet) {
        // Your Code: Set up the timer here
        timer = countdown;
        timer.addActionListener(new CountListener());
        
        applet.addMouseListener(new mouseControl());

        setBackground(Color.blue);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        clock = new DigitalDisplay(COUNT_START, 0, 0, DISPLAY_WIDTH, DISPLAY_HEIGHT);
        timer.start();
    }
    
    // --------------------
    // draw the clock
    // --------------------
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        clock.draw(page);
    }

    // add your code here: implement the inner class listener
    private class CountListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           clock.decrement();
           if(clock.getVal() < 0){
               timer.stop();
           }else{
               repaint();
           }
        }        
    }    
    private class mouseControl implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            if(timer.isRunning()){
                timer.stop();
            }else{
                clock.reset(10);
                timer.start();
                repaint();
            }
        }
        @Override
        public void mousePressed(MouseEvent e) {        
        }
        @Override
        public void mouseReleased(MouseEvent e) {        
        }
        @Override
        public void mouseEntered(MouseEvent e) {        
        }
        @Override
        public void mouseExited(MouseEvent e) {           
        }
    }   
}