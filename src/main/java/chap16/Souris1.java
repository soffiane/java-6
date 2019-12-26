package chap16;

import javax.swing.*;
import java.awt.event.*;

class MaFenetreChap16 extends JFrame implements MouseListener {
    public MaFenetreChap16() {
        setTitle("Traces souris");
        setSize(300, 180);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked en  " + e.getX() + " " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed en  " + e.getX() + " " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased en " + e.getX() + " " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}

public class Souris1 {
    public static void main(String args[]) {
        MaFenetreChap16 fen = new MaFenetreChap16();
        fen.setVisible(true);
    }
}

