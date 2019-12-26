package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MaFenetreChap12TrClics2 extends JFrame {
    MaFenetreChap12TrClics2() {
        setTitle("Traces de clics");
        setSize(300, 150);
        pan = new Paneau();
        getContentPane().add(pan);
    }

    private Paneau pan;
}

class Paneau extends JPanel {
    final int MAX = 100;

    public Paneau() {
        abs = new int[MAX];
        ord = new int[MAX];
        nbclics = 0;
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (nbclics < MAX) {
                    abs[nbclics] = e.getX();
                    ord[nbclics] = e.getY();
                    nbclics++;
                    repaint();
                }
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < nbclics; i++)
            g.drawRect(abs[i], ord[i], 5, 5);
    }

    private int abs[], ord[];
    private int nbclics;
}

public class TrClics2 {
    public static void main(String args[]) {
        MaFenetreChap12Clic1 fen = new MaFenetreChap12Clic1();
        fen.setVisible(true);
    }
}



