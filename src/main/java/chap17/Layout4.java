package chap17;

import javax.swing.*;
import java.awt.*;

class MaFenetreChap17Layout4 extends JFrame {
    public static int NBOUTONS = 10;

    public MaFenetreChap17Layout4() {
        setTitle("Exemple GridLayout");
        setSize(350, 180);
        Container contenu = getContentPane();
        contenu.setLayout(new GridLayout(4, 3, 6, 4));
        boutons = new JButton[NBOUTONS];
        for (int i = 0; i < NBOUTONS; i++) {
            boutons[i] = new JButton("Bouton " + i);
            contenu.add(boutons[i]);
        }
    }

    private JButton boutons[];
}

public class Layout4 {
    public static void main(String args[]) {
        MaFenetreChap17Layout4 fen = new MaFenetreChap17Layout4();
        fen.setVisible(true);
    }
}

