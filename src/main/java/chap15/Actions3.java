package chap15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MaFenetreChap15Actions3 extends JFrame {
    public MaFenetreChap15Actions3() {
        setTitle("Emploi d'Actions ");
        setSize(300, 100);
        menu = new JMenuBar();
        setJMenuBar(menu);

        menuCouleur = new JMenu("COULEUR");
        menu.add(menuCouleur);
        actionRouge = new MonActionChap15Actions3("EN ROUGE", Color.red);
        actionJaune = new MonActionChap15Actions3("EN JAUNE", Color.yellow);
        menuCouleur.add(actionRouge);
        menuCouleur.add(actionJaune);

        boutonRouge = new JButton((String) actionRouge.getValue(Action.NAME));
        getContentPane().add(boutonRouge, "South");
        boutonRouge.addActionListener(actionRouge);
    }

    private MonActionChap15Actions3 actionRouge, actionJaune;
    private JMenuBar menu;
    private JMenu menuCouleur;
    private JMenuItem optionRouge, optionJaune;
    private JButton boutonRouge;
}

class MonActionChap15Actions3 extends AbstractAction {
    public MonActionChap15Actions3(String nom, Color couleur) {
        super(nom);
        this.couleur = couleur;
    }

    public void actionPerformed(ActionEvent e) {
        if (couleur == Color.red)
            System.out.println("action rouge, chaine de commande : "
                    + e.getActionCommand());
        if (couleur == Color.yellow)
            System.out.println("action jaune, chaine de commande : "
                    + e.getActionCommand());
    }

    private Color couleur;
}

public class Actions3 {
    public static void main(String args[]) {
        MaFenetreChap15Outils fen = new MaFenetreChap15Outils();
        fen.setVisible(true);
    }
}

