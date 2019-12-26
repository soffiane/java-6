package chap12;

import javax.swing.*;

class MaFenetreChap12PremiereFenetre extends JFrame {
    public MaFenetreChap12PremiereFenetre()   // constructeur
    {
        setTitle("Ma premiere fenetre");
        setSize(300, 150);
    }
}

public class Premfen1 {
    public static void main(String args[]) {
        JFrame fen = new MaFenetreChap12PremiereFenetre();
        fen.setVisible(true);
    }
}

