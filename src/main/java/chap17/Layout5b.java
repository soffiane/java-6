package chap17;

import javax.swing.*;
import java.awt.*;

class MaFenetreChap17Layout5b extends JFrame {
    public MaFenetreChap17Layout5b() {
        setTitle("Exemple BoxLayout horizontal");
        setSize(200, 150);
        Container contenu = getContentPane();

        bVert = Box.createVerticalBox();
        contenu.add(bVert);
        b1 = new JButton("Bouton1");
        bVert.add(b1);
        txt = new JTextField(20);
        bVert.add(txt);
        coche1 = new JCheckBox("case a cocher");
        bVert.add(coche1);
        etiq = new JLabel("Bonjour");
        bVert.add(etiq);
    }

    private Box bVert;
    private JButton b1;
    private JCheckBox coche1;
    private JTextField txt;
    private JLabel etiq;
}

public class Layout5b {
    public static void main(String args[]) {
        MaFenetreChap17Layout5b fen = new MaFenetreChap17Layout5b();
        fen.setVisible(true);
    }
}

