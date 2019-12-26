package chap18;

import javax.swing.*;
import java.awt.*;

class MaFenetrechap18 extends JFrame {
    MaFenetrechap18() {
        setTitle("Essais lignes");
        setSize(300, 150);
        pan = new Paneauchap18();
        getContentPane().add(pan);
    }

    private JPanel pan;
}

class Paneauchap18 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(20, 10, 60, 40);
        g.drawLine(20, 100, 150, 20);
        g.drawOval(130, 60, 110, 50);
    }
}

public class Lignes1 {
    public static void main(String args[]) {
        MaFenetrechap18 fen = new MaFenetrechap18();
        fen.setVisible(true);
    }
}



