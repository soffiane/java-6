package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fen1BoutonChap12Bouton2 extends JFrame implements ActionListener
        // Attention : ne pas oublier implements
{
    public Fen1BoutonChap12Bouton2() {
        setTitle("Premier bouton");
        setSize(300, 200);
        monBouton = new JButton("ESSAI");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(monBouton);
        monBouton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ev) {
        System.out.println("action sur bouton ESSAI");
    }

    private JButton monBouton;
}

public class Bouton2 {
    public static void main(String args[]) {
        Fen1BoutonChap12Bouton2 fen = new Fen1BoutonChap12Bouton2();
        fen.setVisible(true);
    }
}

