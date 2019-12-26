package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FenBoutonsDynChap12BoutonDynamique2 extends JFrame {
    public FenBoutonsDynChap12BoutonDynamique2() {
        setTitle("Boutons dynamiques");
        setSize(500, 200);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        crBouton = new JButton("CREATION BOUTON");
        contenu.add(crBouton);
        EcoutCrChap12BoutonDynamique2 ecoutCr = new EcoutCrChap12BoutonDynamique2(this);
        crBouton.addActionListener(ecoutCr);
    }

    private JButton crBouton;
}

class EcoutCrChap12BoutonDynamique2 implements ActionListener {
    public EcoutCrChap12BoutonDynamique2(JFrame fen) {
        this.fen = fen;
    }

    public void actionPerformed(ActionEvent ev) {
        JButton nouvBout = new JButton("BOUTON");
        fen.getContentPane().add(nouvBout);
        EcoutBout ecoutBout = new EcoutBout();
        nouvBout.addActionListener(ecoutBout);
    }

    private JFrame fen;
}

class EcoutBout implements ActionListener {
    public void actionPerformed(ActionEvent ev) {
        JButton source = (JButton) ev.getSource();
        source.setEnabled(false);
    }
}

public class BoutDyn {
    public static void main(String args[]) {
        FenBoutonsDynChap12BoutonDynamique fen = new FenBoutonsDynChap12BoutonDynamique();
        fen.setVisible(true);
    }
}


