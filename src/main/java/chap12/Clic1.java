package chap12;

import javax.swing.*;
import java.awt.event.*;   // pour MouseEvent et MouseListener

class MaFenetreChap12Clic1 extends JFrame implements MouseListener {
    public MaFenetreChap12Clic1()    // constructeur
    {
        setTitle("Gestion de clics");
        setBounds(10, 20, 300, 200);
        addMouseListener(this);   // la fenetre sera son propre �couteur
        // d'�v�nements souris
    }

    public void mouseClicked(MouseEvent ev) {
        System.out.println("clic dans fenetre");
    }

    public void mousePressed(MouseEvent ev) {
    }

    public void mouseReleased(MouseEvent ev) {
    }

    public void mouseEntered(MouseEvent ev) {
    }

    public void mouseExited(MouseEvent ev) {
    }
}

public class Clic1 {
    public static void main(String args[]) {
        MaFenetreChap12Clic1 fen = new MaFenetreChap12Clic1();
        fen.setVisible(true);
    }
}

