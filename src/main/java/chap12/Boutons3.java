package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fen2BoutonsChap12 extends JFrame implements ActionListener {
    public Fen2BoutonsChap12() {
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
        String nom = ev.getActionCommand();
        System.out.println("Action sur bouton " + nom);
    }

    private JButton monBouton1, monBouton2;
}

public class Boutons3 {
    public static void main(String args[]) {
        Fen2BoutonsChap12 fen = new Fen2BoutonsChap12();
        fen.setVisible(true);
    }
}

