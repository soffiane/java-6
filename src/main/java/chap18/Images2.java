package chap18;

import javax.swing.*;
import java.awt.*;

class MaFenetreChap18Images2 extends JFrame {
    MaFenetreChap18Images2() {
        setTitle("IMAGES");
        setSize(300, 100);
        pan = new PaneauChap18Images2();
        getContentPane().add(pan);
    }

    private JPanel pan;
}

class PaneauChap18Images2 extends JPanel {
    public PaneauChap18Images2() {
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
                g.drawImage(rouge.getImage(), x, y, this);
                x += largIcon + 3;
                g.drawImage(vert.getImage(), x, y, this);
                x += largIcon + 3;
                g.drawImage(jaune.getImage(), x, y, this);
                x += largIcon + 3;
            }
            x = 0;
            y += hautIcon + 3;
        }
    }

    private ImageIcon rouge, vert, jaune;
    private int hautIcon, largIcon;
}

public class Images2 {
    public static void main(String args[]) {
        MaFenetreChap18Images2 fen = new MaFenetreChap18Images2();
        fen.setVisible(true);
    }
}



