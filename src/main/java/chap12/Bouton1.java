package chap12;

import javax.swing.*;
import java.awt.*;      // pour FlowLayout


class Fen1Bouton extends JFrame {
    public Fen1Bouton() {
        setTitle("Premier bouton");
        setSize(300, 200);
        monBouton = new JButton("ESSAI");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(monBouton);
    }

    JButton monBouton;
}

public class Bouton1 {
    public static void main(String args[]) {
        Fen1BoutonChap12Bouton2 fen = new Fen1BoutonChap12Bouton2();
        fen.setVisible(true);
    }
}

