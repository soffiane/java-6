package chap14;

import javax.swing.*;

class MaFenetreChap14Message3 extends JFrame {
    MaFenetreChap14Message3() {
        setTitle("Essai message");
        setSize(400, 170);
    }
}

public class Mess3 {
    public static void main(String args[]) {
        MaFenetreChap14ExDial fen = new MaFenetreChap14ExDial();
        fen.setVisible(true);
        JOptionPane.showMessageDialog(fen, "Mauvais choix", "Message d'avertissement",
                JOptionPane.ERROR_MESSAGE);
    }
}

