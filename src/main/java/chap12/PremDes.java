package chap12;

import javax.swing.*;
import java.awt.*;

class MaFenetreChap12PremDes extends JFrame {
    MaFenetreChap12PremDes() {
        setTitle("Essai dessins");
        setSize(300, 150);
        pan = new PaneauChap12PremDes();
        getContentPane().add(pan);
        pan.setBackground(Color.yellow);  // couleur de fond = jaune
    }

    private JPanel pan;
}

class PaneauChap12PremDes extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(15, 10, 100, 50);
    }
}

public class PremDes {
    public static void main(String args[]) {
        MaFenetreChap12Clic1 fen = new MaFenetreChap12Clic1();
        fen.setVisible(true);
    }
}



