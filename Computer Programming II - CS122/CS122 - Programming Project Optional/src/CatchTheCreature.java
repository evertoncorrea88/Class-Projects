
/**
 * @author Everton
 */

import javax.swing.JFrame;

public class CatchTheCreature {

    public static void main(String[] args) {
        JFrame circlesFrame = new JFrame("Catch-the-Creature");
        circlesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        circlesFrame.getContentPane().add(new CatchTheCreaturePanel());
        circlesFrame.pack();
        circlesFrame.setVisible(true);
    }
}
