package chap17;

import javax.swing.*;
import java.awt.*;

class MaFenetreChap17Layout5 extends JFrame {
    public MaFenetreChap17Layout5() {
        setTitle("Exemple BoxLayout horizontal");
        setSize(450, 100);
        Container contenu = getContentPane();

        bHor = Box.createHorizontalBox();
        contenu.add(bHor);
        b1 = new JButton("Bouton1");
        bHor.add(b1);
        txt = new JTextField(20);
        bHor.add(txt);
        coche1 = new JCheckBox("case a cocher");
        bHor.add(coche1);
        etiq = new JLabel("Bonjour");
        bHor.add(etiq);
    }

    private Box bHor;
    private JButton b1;
    private JCheckBox coche1;
    private JTextField txt;
    private JLabel etiq;
}

public class Layout5 {
    public static void main(String args[]) {
        MaFenetreChap17Layout5 fen = new MaFenetreChap17Layout5();
        fen.setVisible(true);
    }
}

