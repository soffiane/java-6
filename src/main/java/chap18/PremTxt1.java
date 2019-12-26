package chap18;

import javax.swing.*;
import java.awt.*;

class MaFenetreChap18PremTxt extends JFrame {
    MaFenetreChap18PremTxt() {
        setTitle("Essai texte");
        setSize(300, 150);
        pan = new PaneauChap18PremTxt();
        getContentPane().add(pan);
    }

    private JPanel pan;
}

class PaneauChap18PremTxt extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 20, y = 30;
        String ch1 = "bonjour";
        String ch2 = " monsieur"; // espace au debut
        g.drawString(ch1, x, y);
        FontMetrics fm = g.getFontMetrics();
        x += fm.stringWidth(ch1);
        g.drawString(ch2, x, y);
    }
}

public class PremTxt1 {
    public static void main(String args[]) {
        MaFenetreChap18PremTxt fen = new MaFenetreChap18PremTxt();
        fen.setVisible(true);
    }
}



