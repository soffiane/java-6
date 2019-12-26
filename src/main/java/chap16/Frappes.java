package chap16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MaFenetreChap16Frappes extends JFrame {
    public MaFenetreChap16Frappes() {
        setTitle("Affichage caracteres");
        setSize(300, 180);
        Container contenu = getContentPane();
        pan = new PaneauChap16Frappes();
        contenu.add(pan);
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                pan.setCaractereCourant(e.getKeyChar());
            }
        });
    }

    private PaneauChap16Frappes pan;
}

class PaneauChap16Frappes extends JPanel {
    public PaneauChap16Frappes() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Graphics g = getGraphics();
                String ch = "" + caractereCourant;
                g.drawString(ch, e.getX(), e.getY());
                g.dispose();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void setCaractereCourant(char c) {
        caractereCourant = c;
    }

    private char caractereCourant = ' ';
}

public class Frappes {
    public static void main(String args[]) {
        MaFenetreChap16Frappes fen = new MaFenetreChap16Frappes();
        fen.setVisible(true);
    }
}

