package chap17;

import javax.swing.*;
import java.awt.*;

class MaFenetreChap17Layout1 extends JFrame {
    public static int NBOUTONS = 5;

    public MaFenetreChap17Layout1() {
        setTitle("Exemple BorderLayout");
        setSize(300, 180);
        Container contenu = getContentPane();
        boutons = new JButton[NBOUTONS];
        for (int i = 0; i < NBOUTONS; i++) {
            boutons[i] = new JButton("Bouton " + i);
        }
        contenu.add(boutons[0]);      // au centre par defaut
        contenu.add(boutons[1], BorderLayout.NORTH);
        contenu.add(boutons[2], BorderLayout.SOUTH);
        contenu.add(boutons[3], BorderLayout.WEST);
        contenu.add(boutons[4], BorderLayout.EAST);
    }

    private JButton boutons[];
}

public class Layout1 {
    public static void main(String args[]) {
        MaFenetreChap17 fen = new MaFenetreChap17();
        fen.setVisible(true);
    }
}

