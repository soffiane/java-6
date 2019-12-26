package chap08;

class PointChap08TestPointCol3 {
    public PointChap08TestPointCol3(int x, int y) {
        this.x = x;
        this.y = y;
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

class PointcolChap08TestPointCol3 extends PointChap08TestPointCol3 {
    public PointcolChap08TestPointCol3(int x, int y, byte couleur) {
        super(x, y);               // obligatoirement comme premi�re instruction
        this.couleur = couleur;
    }

    public void affichec() {
        affiche();
        System.out.println("  et ma couleur est : " + couleur);
    }

    private byte couleur;
}

public class TstPcol3 {
    public static void main(String args[]) {
        PointcolChap08TestPointCol3 pc1 = new PointcolChap08TestPointCol3(3, 5, (byte) 3);
        pc1.affiche();   // attention, ici affiche
        pc1.affichec();  // et ici affichec

        PointcolChap08TestPointCol3 pc2 = new PointcolChap08TestPointCol3(5, 8, (byte) 2);
        pc2.affichec();
        pc2.deplace(1, -3);
        pc2.affichec();
    }
}

