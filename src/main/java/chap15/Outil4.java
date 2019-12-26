package chap15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FenOutilChap15Outil4 extends JFrame implements ActionListener {
    public FenOutilChap15Outil4() {
        setTitle("Barre d'outils");
        setSize(300, 100);
        Container contenu = getContentPane();
        /* creation barre d'outils couleurs */
        barreOutils = new JToolBar();
        boutonRouge = new JButton(new ImageIcon("rouge.gif"));
        barreOutils.add(boutonRouge);
        boutonVert = new JButton(new ImageIcon("vert.gif"));
        barreOutils.add(boutonVert);
        contenu.add(barreOutils, "North");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boutonRouge) System.out.println("action rouge");
        if (e.getSource() == boutonVert) System.out.println("action vert");
    }

    private JToolBar barreOutils;
    private JButton boutonRouge, boutonVert;
}

public class Outil4 {
    public static void main(String args[]) {
        FenOutilChap15Outil4 fen = new FenOutilChap15Outil4();
        fen.setVisible(true);
    }
}


