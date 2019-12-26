package chap08;

class PointChap08TabHet2 {
    public PointChap08TabHet2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        identifie();
        System.out.println("  Mes coordonnees sont : " + x + " " + y);
    }

    public void identifie() {
        System.out.println("Je suis un point ");
    }

    private int x, y;
}

class PointcolChap08TabHet2 extends PointChap08TabHet2 {
    public PointcolChap08TabHet2(int x, int y, byte couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    public void identifie() {
        System.out.println("Je suis un point colore de couleur " + couleur);
    }

    private byte couleur;
}

public class TabHet2 {
    public static void main(String args[]) {
        PointChap08[] tabPts = new PointChap08[4];
        tabPts[0] = new PointChap08(0, 2);
        tabPts[1] = new PointcolChap08(1, 5, (byte) 3);
        tabPts[2] = new PointcolChap08(2, 8, (byte) 9);
        tabPts[3] = new PointChap08(1, 2);
        for (int i = 0; i < tabPts.length; i++)
            tabPts[i].affiche();
    }
}

