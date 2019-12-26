package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fen2BoutonsChap12Boutons2 extends JFrame implements ActionListener {
    public Fen2BoutonsChap12Boutons2() {
        setTitle("Avec deux boutons");
        setSize(300, 200);
        monBouton1 = new JButton("Bouton A");
        monBouton2 = new JButton("Bouton B");
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(monBouton1);
        contenu.add(monBouton2);
        monBouton1.addActionListener(this);
        monBouton2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == monBouton1)
            System.out.println("action sur bouton numero 1");
        if (ev.getSource() == monBouton2)
            System.out.println("action sur bouton numero 2");
    }

    private JButton monBouton1, monBouton2;
}

public class Boutons2 {
    public static void main(String args[]) {
        Fen2BoutonsChap12 fen = new Fen2BoutonsChap12();
        fen.setVisible(true);
    }
}

