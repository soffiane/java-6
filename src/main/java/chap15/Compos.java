package chap15;

import javax.swing.*;

class FenMenu extends JFrame {
    public FenMenu() {
        setTitle("Exemple de menus composes");
        setSize(400, 150);
        /* creation barre des menus */
        barreMenus = new JMenuBar();
        setJMenuBar(barreMenus);
        /* creation menu Formes et ses options Arrondi et Rectangle */
        formes = new JMenu("Formes");
        barreMenus.add(formes);
        arrondi = new JMenu("Arrondi");
        formes.add(arrondi);
        cercle = new JMenuItem("Cercle");
        arrondi.add(cercle);
        ovale = new JMenuItem("Ovale");
        arrondi.add(ovale);
        rectangle = new JMenuItem("Rectangle");
        formes.add(rectangle);
    }

    private JMenuBar barreMenus;
    private JMenu formes, arrondi;
    private JMenuItem cercle, ovale, rectangle;
}

public class Compos {
    public static void main(String args[]) {
        FenMenuChap15 fen = new FenMenuChap15();
        fen.setVisible(true);
    }
}

