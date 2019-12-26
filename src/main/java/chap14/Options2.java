package chap14;

import javax.swing.*;
import java.awt.event.*;

class FenInputChap14Options2 extends JFrame implements ActionListener {
    String[] couleurs = {"rouge", "vert", "bleu", "jaune", "orange", "blanc"};

    public FenInputChap14Options2() {
        setTitle("Essai options");
        setSize(400, 220);
        JButton saisie = new JButton("CHOIX");
        getContentPane().add(saisie, "South");
        saisie.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("** affichage boite d'options");
        int rang = JOptionPane.showOptionDialog(this, "choisissez une couleur",
                "BOITE D'OPTIONS", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, couleurs, couleurs[1]);
        System.out.println("rang choisi : " + rang);
    }
}

public class Options2 {
    public static void main(String args[]) {
        FenInputChap14Options2 fen = new FenInputChap14Options2();
        fen.setVisible(true);
    }
}

