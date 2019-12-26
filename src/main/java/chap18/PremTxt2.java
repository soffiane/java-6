package chap18;

import javax.swing.*;
import java.awt.*;

class MaFenetreChap18PremTxt2 extends JFrame {
    MaFenetreChap18PremTxt2() {
        setTitle("Essai texte");
        setSize(300, 150);
        pan = new PaneauChap18PremTxt2();
        getContentPane().add(pan);
    }

    private JPanel pan;
}

class PaneauChap18PremTxt2 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 20, y = 30;
        String ch1 = "bonjour";
        String ch2 = "monsieur";
        g.drawString(ch1, x, y);
        FontMetrics fm = g.getFontMetrics();
        y += fm.getHeight();
        g.drawString(ch2, x, y);
    }
}

public class PremTxt2 {
    public static void main(String args[]) {
        MaFenetreChap18PremTxt2 fen = new MaFenetreChap18PremTxt2();
        fen.setVisible(true);
    }
}



