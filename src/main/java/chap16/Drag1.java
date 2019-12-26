package chap16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MaFenetreChap16Drag1 extends JFrame {
    MaFenetreChap16Drag1() {
        setTitle("Essais drag souris");
        setSize(300, 200);
        paneau = new PaneauChap16Colore1();
        getContentPane().add(paneau);
    }

    private JPanel paneau;
}

class PaneauChap16Drag1 extends JPanel implements MouseMotionListener {
    PaneauChap16Drag1() {
        addMouseMotionListener(this);
        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                enCours = false;
                System.out.println("Release " + e.getX() + " " + e.getY());
            }
        });
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("Drag " + e.getX() + " " + e.getY());
        if (!enCours) {
            xDeb = e.getX();
            yDeb = e.getY();
            xFin = xDeb;
            yFin = yDeb;
            enCours = true;
        } else {
            xFin = e.getX();
            yFin = e.getY();
        }
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int xd, xf, yd, yf;
        xd = Math.min(xDeb, xFin);
        xf = Math.max(xDeb, xFin);
        yd = Math.min(yDeb, yFin);
        yf = Math.max(yDeb, yFin);
        g.drawRect(xd, yd, xf - xd, yf - yd);
    }

    private boolean enCours = false;
    private int xDeb, yDeb, xFin, yFin;
}

public class Drag1 {
    public static void main(String args[]) {
        MaFenetreChap16 fen = new MaFenetreChap16();
        fen.show();
    }
}

