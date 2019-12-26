package chap12;

import javax.swing.*;

class MaFenetreChap12Panneau extends JFrame {
    MaFenetreChap12Panneau() {
        setTitle("Fenetre = paneau jaune");
        setSize(300, 150);
        paneau = new JPanel();
        getContentPane().add(paneau);
    }

    private JPanel paneau;
}

public class PaneauChap12 {
    public static void main(String args[]) {
        MaFenetreChap12Clic1 fen = new MaFenetreChap12Clic1();
        fen.setVisible(true);
    }
}


