package chap08;

// classe de base
class PointChap08TestPointCol1 {
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
class PointcolChap08TestPointCol1 extends PointChap08TestPointCol1 {
    public void colore(byte couleur) {
        this.couleur = couleur;
    }

    private byte couleur;
}

// classe utilisant Pointcol
public class TstPcol1 {
    public static void main(String args[]) {
        PointcolChap08TestPointCol1 pc = new PointcolChap08TestPointCol1();
        pc.affiche();
        pc.initialise(3, 5);
        pc.colore((byte) 3);
        pc.affiche();
        pc.deplace(2, -1);
        pc.affiche();
        PointChap08TestPointCol1 p = new PointChap08TestPointCol1();
        p.initialise(6, 9);
        p.affiche();
    }
}

