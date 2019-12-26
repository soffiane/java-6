package chap18;

import javax.swing.*;
import java.awt.*;

class MaFenetreChap18Lignes2 extends JFrame {
    MaFenetreChap18Lignes2() {
        setTitle("Essais coins arrondis");
        setSize(350, 100);
        pan = new PaneauChap18Lignes2();
        getContentPane().add(pan);
    }

    private JPanel pan;
}

class PaneauChap18Lignes2 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int larg = 80, haut = 50;
        g.translate(20, 10);
        g.drawRoundRect(0, 0, larg, haut, 10, 10);
        g.translate(100, 0);
        g.drawRoundRect(0, 0, larg, haut, 40, 25);
        g.translate(100, 0);
        g.drawRoundRect(0, 0, larg, haut, larg, haut);
    }
}

public class Lignes2 {
    public static void main(String args[]) {
        MaFenetreChap18Lignes2 fen = new MaFenetreChap18Lignes2();
        fen.setVisible(true);
    }
}



