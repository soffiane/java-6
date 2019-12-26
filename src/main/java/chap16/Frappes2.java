package chap16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MaFenetreChap16Frappes2 extends JFrame {
    public MaFenetreChap16Frappes2() {
        setTitle("Affichage caracteres 2 paneaux");
        setSize(400, 180);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        pan1 = new PaneauChap16Frappes2(Color.yellow);
        contenu.add(pan1);
        pan2 = new PaneauChap16Frappes2(Color.cyan);
        contenu.add(pan2);
    }

    private PaneauChap16Frappes2 pan1, pan2;
}

class PaneauChap16Frappes2 extends JPanel {
    public PaneauChap16Frappes2(Color c) {
        setPreferredSize(new Dimension(160, 100));
        setBackground(c);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Graphics g = getGraphics();
                String ch = "" + caractereCourant;
                g.drawString(ch, e.getX(), e.getY());
                g.dispose();
                requestFocus();
            }
        });
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                caractereCourant = e.getKeyChar();
            }
        });
    }

    public boolean isFocusTraversable() {
        return true;
    }

    private char caractereCourant = '*';
}

public class Frappes2 {
    public static void main(String args[]) {
        MaFenetreChap16 fen = new MaFenetreChap16();
        fen.setVisible(true);
    }
}


