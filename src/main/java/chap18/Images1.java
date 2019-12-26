package chap18;

import javax.swing.*;
import java.awt.*;

class MaFenetreChap18Images1 extends JFrame {
    MaFenetreChap18Images1() {
        setTitle("IMAGES");
        setSize(300, 100);
        pan = new Paneauchap18();
        getContentPane().add(pan);
    }

    private JPanel pan;
}

class PaneauChap18Images1 extends JPanel {
    public PaneauChap18Images1() {
        rouge = new ImageIcon("rouge.gif");
        jaune = new ImageIcon("jaune.gif");
        vert = new ImageIcon("vert.gif");
        largIcon = rouge.getIconHeight();
        hautIcon = rouge.getIconWidth();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension taille = getSize();
        int x = 0, y = 0;
        while (y < taille.height) {
            while (x < taille.width) {
                g.drawImage(rouge.getImage(), x, y, null);
                x += largIcon + 3;
                g.drawImage(vert.getImage(), x, y, null);
                x += largIcon + 3;
                g.drawImage(jaune.getImage(), x, y, null);
                x += largIcon + 3;
            }
            x = 0;
            y += hautIcon + 3;
        }
    }

    private ImageIcon rouge, vert, jaune;
    private int hautIcon, largIcon;
}

public class Images1 {
    public static void main(String args[]) {
        MaFenetrechap18 fen = new MaFenetrechap18();
        fen.setVisible(true);
    }
}



