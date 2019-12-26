package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FenBoutonsDynChap12BoutonDynamique extends JFrame implements ActionListener {
    final int NBOUTONS = 5;

    public FenBoutonsDynChap12BoutonDynamique() {
        setTitle("Activation/Desactivation");
        setSize(500, 150);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        tabBout = new JButton[NBOUTONS];
        for (int i = 0; i < NBOUTONS; i++) {
            tabBout[i] = new JButton("BOUTON" + i);
            contenu.add(tabBout[i]);
            tabBout[i].addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent ev) {
        System.out.print("ETAT BOUTONS = ");
        for (int i = 0; i < NBOUTONS; i++)
            System.out.print(tabBout[i].isEnabled() + " ");
        System.out.println();
        JButton source = (JButton) ev.getSource();
        System.out.println("on desactive le bouton : "
                + source.getActionCommand());
        source.setEnabled(false);
    }

    private JButton tabBout[];
}

public class BoutDy1 {
    public static void main(String args[]) {
        FenBoutonsDynChap12BoutonDynamique fen = new FenBoutonsDynChap12BoutonDynamique();
        fen.setVisible(true);
    }
}

