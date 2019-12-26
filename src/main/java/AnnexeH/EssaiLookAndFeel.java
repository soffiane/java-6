package AnnexeH;

import chap04.Clavier;

import javax.swing.*;

public class EssaiLookAndFeel {
    public static void main(String args[]) throws ClassNotFoundException,
            UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        JFrame fen = new JFrame();
        fen.setVisible(true);
        UIManager.LookAndFeelInfo laf[] = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo l : laf) {
            System.out.println(l);
            UIManager.setLookAndFeel((String) l.getClassName());
            SwingUtilities.updateComponentTreeUI(fen);
            Clavier.lireString(); // pour une attente
        }
    }
}
