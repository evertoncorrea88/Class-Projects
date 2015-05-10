/*
 * @author Everton
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class CatchTheCreaturePanel extends JPanel {

    private final int WIDTH = 500, HEIGHT = 400, IMAGE_SIZE = 100;

    private ImageIcon image;
    private Timer timer;
    private Random gerador;
    private int x, y, delay = 1000, counter = 0;

    private JLabel lbScore;
    private JButton btStart;
    private JButton btStop;

    public CatchTheCreaturePanel() {
        gerador = new Random();
        timer = new Timer(delay, new TimerListener());
        image = new ImageIcon("happyFace.gif");

        addMouseListener(new ImageListener());

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        setLayout(new BorderLayout());

        lbScore = new JLabel("Score: " + counter);
        btStart = new JButton("Start");
        btStop = new JButton("Stop");

        ButtonListener buttonListener = new ButtonListener();
        btStart.addActionListener(buttonListener);
        btStop.addActionListener(buttonListener);

        JPanel pnControl = new JPanel();
        pnControl.add(lbScore);
        pnControl.add(btStart);
        pnControl.add(btStop);

        add(pnControl, BorderLayout.SOUTH);
    }

    public void paintComponent(Graphics page) {
        super.paintComponent(page);

        x = gerador.nextInt(WIDTH - IMAGE_SIZE);
        y = gerador.nextInt(HEIGHT - IMAGE_SIZE);

        image.paintIcon(this, page, x, y);

        delay = gerador.nextInt(800) + 300;
        timer.setDelay(delay);
    }

    private class TimerListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            repaint();
        }
    }

    private class ImageListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getX() >= x && e.getX() <= (x + IMAGE_SIZE)
                    && e.getY() >= y && e.getY() <= (y + IMAGE_SIZE)) {
                counter++;
                lbScore.setText("Score: " + counter);
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

    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == btStart) {
                counter = 0;
                lbScore.setText("Score: " + counter);
                timer.start();
            } else {
                timer.stop();
            }
        }
    }

}
