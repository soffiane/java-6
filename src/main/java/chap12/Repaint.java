package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MaFenetreChap12Repaint extends JFrame implements ActionListener {
    MaFenetreChap12Repaint() {
        setTitle("Exemple appel repaint");
        setSize(300, 200);
        Container contenu = getContentPane();
        // creation paneau pour le dessin
        pan = new PaneauChap12Repaint();
        pan.setBackground(Color.cyan);
        contenu.add(pan);
        // creation bouton "rectangle"
        rectangle = new JButton("Rectangle");
        contenu.add(rectangle, "North");
        rectangle.addActionListener(this);
        // cr�ation bouton "ovale"
        ovale = new JButton("Ovale");
        contenu.add(ovale, "South");
        ovale.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == rectangle) pan.setRectangle();
        if (ev.getSource() == ovale) pan.setOvale();
        pan.repaint();   // pour forcer la peinture du paneau des maintenant
    }

    private PaneauChap12Repaint pan;
    private JButton rectangle, ovale;
}

class PaneauChap12Repaint extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (ovale) g.drawOval(80, 20, 120, 60);
        if (rectangle) g.drawRect(80, 20, 120, 60);
    }

    public void setRectangle() {
        rectangle = true;
        ovale = false;
    }

    public void setOvale() {
        rectangle = false;
        ovale = true;
    }

    private boolean rectangle = false, ovale = false;
}

public class Repaint {
    public static void main(String args[]) {
        MaFenetreChap12Clic1 fen = new MaFenetreChap12Clic1();
        fen.setVisible(true);
    }
}

