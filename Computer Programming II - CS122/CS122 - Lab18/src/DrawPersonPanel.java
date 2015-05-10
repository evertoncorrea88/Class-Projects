// *******************************************************************
// DrawPersonPanel.java
//
// An program that uses the Graphics draw methods to draw a person.
// *******************************************************************

import javax.swing.JPanel;
import java.awt.*;

public class DrawPersonPanel extends JPanel {

    private final int WIDTH = 180;
    private final int HEIGHT = 400;

    private int[] hairX = {65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 105, 100, 77, 69};
    private int[] hairY = {60, 30, 40, 25, 40, 25, 40, 25, 40, 30, 60, 50, 48, 48, 54};

    private int[] shirtX = {60, 0, 20, 60, 50, 130, 120, 160, 180, 120};
    private int[] shirtY = {100, 150, 180, 160, 250, 250, 160, 180, 150, 100};

    private int[] paintsX = {50, 30, 70, 90, 110, 150, 130};
    private int[] paintsY = {250, 400, 400, 290, 400, 400, 250};

    private int[] xPoints = {60, 70, 80, 90, 100, 110, 120};
    private int[] yPoints = {130, 140, 130, 140, 130, 140, 130};
	//--------------------------------------
    // Constructor: Set up the panel.
    //--------------------------------------

    public DrawPersonPanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
	//--------------------------------------
    // Draw person
    //--------------------------------------

    public void paintComponent(Graphics page) {
        page.setColor(Color.yellow);
        page.fillOval(62, 45, 55, 55);

        page.setColor(Color.red);
        page.fillPolygon(hairX, hairY, hairX.length);

        page.setColor(Color.blue);
        page.fillPolygon(shirtX, shirtY, shirtX.length);

        page.setColor(Color.white);
        page.drawPolyline(xPoints, yPoints, xPoints.length);

        page.setColor(Color.black);
        page.fillPolygon(paintsX, paintsY, paintsX.length);
    }
}
