package chap15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MaFenetreChap15Outils extends JFrame {
    public MaFenetreChap15Outils() {
        setTitle("Emploi d'Actions ");
        setSize(300, 100);
        actionRouge = new MonActionChap15("EN ROUGE",Color.red,"Rouge");
        actionRouge.putValue(Action.SMALL_ICON, new ImageIcon("icone.gif"));
        actionJaune = new MonActionChap15("EN JAUNE", Color.yellow,"Jaune");

        JToolBar barreOutils = new JToolBar();
        getContentPane().add(barreOutils, "South");
        barreOutils.add(actionRouge);
        barreOutils.add(actionJaune);
    }

    private MonActionChap15 actionRouge, actionJaune;
    private JMenuBar menu;
    private JMenu menuCouleur;
    private JMenuItem optionRouge, optionJaune;
}

class MonActionChap15 extends AbstractAction {
    public MonActionChap15(String nom, Color couleur, String explication) {
        super(nom);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("action chaine de commande : "
                + e.getActionCommand());
    }

}

class Outil5Chap15 {
    public static void main(String args[]) {
        MaFenetreChap15Outils fen = new MaFenetreChap15Outils();
        fen.setVisible(true);
    }
}

