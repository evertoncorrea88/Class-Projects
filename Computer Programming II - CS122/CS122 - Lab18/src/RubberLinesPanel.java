//********************************************************************
//  RubberLinesPanel.java       Author: Lewis/Loftus
//
//  Represents the primary drawing panel for the RubberLines program.
//********************************************************************

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class RubberLinesPanel extends JPanel {

    private Point point1 = null, point2 = null;
    private ArrayList<Point> point1List, point2List;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this panel to listen for mouse events.
    //-----------------------------------------------------------------
    public RubberLinesPanel() {
        point1List = new ArrayList<Point>();
        point2List = new ArrayList<Point>();

        LineListener listener = new LineListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);

        setBackground(Color.black);
        setPreferredSize(new Dimension(400, 200));
    }
    //-----------------------------------------------------------------
    //  Draws the current line from the initial mouse-pressed point to
    //  the current position of the mouse.
    //-----------------------------------------------------------------

    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        page.setColor(Color.yellow);
        if (point1 != null && point2 != null) {
            page.drawLine(point1.x, point1.y, point2.x, point2.y);
        }
        for (int i = 0; i < point1List.size(); i++) {
            page.drawLine(point1List.get(i).x, point1List.get(i).y, point2List.get(i).x, point2List.get(i).y);
        }
    }

    //*****************************************************************
    //  Represents the listener for all mouse events.
    //*****************************************************************
    private class LineListener implements MouseListener, MouseMotionListener {
        //--------------------------------------------------------------
        //  Captures the initial position at which the mouse button is
        //  pressed.
        //--------------------------------------------------------------

        public void mousePressed(MouseEvent event) {
            point1 = event.getPoint();
        }
        //--------------------------------------------------------------
        //  Gets the current position of the mouse as it is dragged and
        //  redraws the line to create the rubberband effect.
        //--------------------------------------------------------------

        public void mouseDragged(MouseEvent event) {
            point2 = event.getPoint();
            repaint();
        }

        //--------------------------------------------------------------
        //  Provide empty definitions for unused event methods.
        //--------------------------------------------------------------
        public void mouseClicked(MouseEvent event) {
        }

        public void mouseReleased(MouseEvent event) {
            point1List.add(point1);
            point2List.add(point2);
        }

        public void mouseEntered(MouseEvent event) {
        }

        public void mouseExited(MouseEvent event) {
        }

        public void mouseMoved(MouseEvent event) {
        }
    }
}
