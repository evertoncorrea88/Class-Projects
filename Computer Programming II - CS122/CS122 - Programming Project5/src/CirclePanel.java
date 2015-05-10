//************************************************************************
// CirclePanel.java
//
// Represents the primary panel for the Circles program on which the
// circles are drawn. Derived from the Lewis and Loftus DotsPanel class.
//************************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CirclePanel extends JPanel {

    private final int WIDTH = 600, HEIGHT = 400;
    private Circle circle;

    //-------------------------------------------------------------------
    // Sets up this panel to listen for mouse events.
    //-------------------------------------------------------------------
    public CirclePanel() {
        CirclesListener listener = new CirclesListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    //-------------------------------------------------------------------
    // Draws the current circle, if any.
    //-------------------------------------------------------------------
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        if (circle != null) {
            circle.draw(page);
        }
    }

    //******************************************************************
    // Represents the listener for mouse events.
    //******************************************************************
    private class CirclesListener implements MouseListener, MouseMotionListener {

        //---------------------------------------------------------------
        // Creates a new circle at the current location whenever the
        // mouse button is pressed and repaints.
        //---------------------------------------------------------------
        public void mousePressed(MouseEvent event) {
            Point p = event.getPoint();
            if (circle == null) {
                circle = new Circle(p);
            } else if (circle.isInside(p)) {
                circle = null;
            } else {
                circle.move(p);
            }
            repaint();
        }

        //-----------------------------------------------------------------
        // Provide empty definitions for unused event methods.
        //-----------------------------------------------------------------
        public void mouseClicked(MouseEvent event) {
        }

        public void mouseReleased(MouseEvent event) {
        }

        public void mouseEntered(MouseEvent event) {
            setBackground(Color.WHITE);
        }

        public void mouseExited(MouseEvent event) {
            setBackground(Color.BLUE);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            Point p = e.getPoint();
            if (circle != null) {
                circle.move(p);
            }
            repaint();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }
}
