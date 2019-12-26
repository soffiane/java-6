package chap08;

// classe de base
class PointChap08TestPointCol2 {
    public void initialise(int abs, int ord) {
        x = abs;
        y = ord;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affiche() {
        System.out.println("Je suis en " + x + " " + y);
    }

    protected int x, y;
}

// classe derivee de Point
class PointcolChap08TestPointCol2 extends PointChap08TestPointCol2 {
    public void colore(byte couleur) {
        this.couleur = couleur;
    }

    public void affichec() {
        affiche();
        System.out.println("  et ma couleur est : " + couleur);
    }

    public void initialisec(int x, int y, byte couleur) {
        initialise(x, y);
        this.couleur = couleur;
    }

    private byte couleur;
}

// classe utilisant Pointcol
public class TstPcol2 {
    public static void main(String args[]) {
        PointcolChap08TestPointCol2 pc1 = new PointcolChap08TestPointCol2();
        pc1.initialise(3, 5);
        pc1.colore((byte) 3);
        pc1.affiche();   // attention, ici affiche
        pc1.affichec();  // et ici affichec

        PointcolChap08TestPointCol2 pc2 = new PointcolChap08TestPointCol2();
        pc2.initialisec(5, 8, (byte) 2);
        pc2.affichec();
        pc2.deplace(1, -3);
        pc2.affichec();
    }
}

