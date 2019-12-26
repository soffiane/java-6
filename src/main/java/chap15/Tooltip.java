package chap15;

import java.awt.event.*;
import javax.swing.*;

class FenMenuChap15ToolTip extends JFrame implements ActionListener {
    public FenMenuChap15ToolTip() {
        setTitle("Exemple de menu");
        setSize(300, 150);
        /* creation barre des menus */
        barreMenus = new JMenuBar();
        setJMenuBar(barreMenus);
        /* creation menu Couleur et ses options Rouge et Vert */
        couleur = new JMenu("Couleur");
        barreMenus.add(couleur);
        rouge = new JMenuItem("Rouge");
        rouge.setToolTipText("fond rouge");
        couleur.add(rouge);
        rouge.addActionListener(this);
        vert = new JMenuItem("Vert");
        vert.setToolTipText("fond vert");
        couleur.add(vert);
        vert.addActionListener(this);
        /* creation menu Dimensions et ses options Hauteur et Largeur */
        dimensions = new JMenu("Dimensions");
        barreMenus.add(dimensions);
        largeur = new JMenuItem("Largeur");
        dimensions.add(largeur);
        largeur.addActionListener(this);
        hauteur = new JMenuItem("Hauteur");
        dimensions.add(hauteur);
        hauteur.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        System.out.println("Action avec chaine de commande = "
                + e.getActionCommand());
        if (source == rouge) System.out.println("** Action option rouge");
        if (source == vert) System.out.println("** Action option vert");
        if (source == largeur) System.out.println("** Action option largeur");
        if (source == hauteur) System.out.println("** Action option hauteur");
    }

    private JMenuBar barreMenus;
    private JMenu couleur, dimensions;
    private JMenuItem rouge, vert, largeur, hauteur;
}

public class Tooltip {
    public static void main(String args[]) {
        FenMenuChap15 fen = new FenMenuChap15();
        fen.setVisible(true);
    }
}

