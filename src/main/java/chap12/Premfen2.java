package chap12;

import chap04.Clavier;

import javax.swing.*;

class MaFenetreChap12DeuxiemeFenetre extends JFrame {
    public MaFenetreChap12DeuxiemeFenetre()   // constructeur
    {
        setTitle("Ma premiere fenetre");
        setSize(300, 150);
    }
}

public class Premfen2 {
    public static void main(String args[]) {
        JFrame fen = new MaFenetreChap12Clic1();
        fen.setVisible(true);
        while (true)  // fin sur longueur titre nulle
        {
            System.out.print("nouvelle largeur : ");
            int larg = Clavier.lireInt();
            System.out.print("nouvelle hauteur : ");
            int haut = Clavier.lireInt();
            System.out.print("nouveau titre : (vide pour finir) ");
            String tit = Clavier.lireString();
            if (tit.length() == 0) break;
            fen.setSize(larg, haut);
            fen.setTitle(tit);
        }
    }
}

