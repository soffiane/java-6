package chap12;

import javax.swing.*;
import java.awt.event.*;

class MaFenetreChap12Clic3 extends JFrame {
    MaFenetreChap12Clic3()    // constructeur
    {
        setTitle("Gestion de clics");
        setBounds(10, 20, 300, 200);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ev) {
                int x = ev.getX();
                int y = ev.getY();
                System.out.println("clic au point de coordonnees " + x + ", " + y);
            }
        });
    }
}

public class Clic3 {
    public static void main(String args[]) {
        MaFenetreChap12Clic1 fen = new MaFenetreChap12Clic1();
        fen.setVisible(true);
    }
}

