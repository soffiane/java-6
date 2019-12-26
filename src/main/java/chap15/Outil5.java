package chap15;

import javax.swing.*;
import java.awt.event.*;

class MaFenetreChap15Outil5 extends JFrame {
    public MaFenetreChap15Outil5() {
        setTitle("Emploi d'Actions ");
        setSize(300, 100);
        actionRouge = new MonActionChap15Outil5();
        actionRouge.putValue(Action.SMALL_ICON, new ImageIcon("rouge.gif"));
        actionVert = new MonActionChap15Outil5();
        actionVert.putValue(Action.SMALL_ICON, new ImageIcon("vert.gif"));

        barreOutils = new JToolBar();
        getContentPane().add(barreOutils, "North");
        barreOutils.add(actionRouge);
        barreOutils.add(actionVert);
    }

    private MonActionChap15Outil5 actionRouge, actionVert;
    private JToolBar barreOutils;
}

class MonActionChap15Outil5 extends AbstractAction {
    public void actionPerformed(ActionEvent e) {
        System.out.println("action chaine de commande : "
                + e.getActionCommand());
    }
}

public class Outil5 {
    public static void main(String args[]) {
        MaFenetreChap15Outil5 fen = new MaFenetreChap15Outil5();
        fen.setVisible(true);
    }
}

