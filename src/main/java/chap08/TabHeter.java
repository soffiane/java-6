package chap08;

class PointChap08TabHeter {
    public PointChap08TabHeter(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("Je suis en " + x + " " + y);
    }

    private int x, y;
}

class PointcolChap08TabHeter extends PointChap08TabHeter {
    public PointcolChap08TabHeter(int x, int y, byte couleur) {
        super(x, y);               // obligatoirement comme premi�re instruction
        this.couleur = couleur;
    }

    public void affiche() {
        super.affiche();
        System.out.println("  et ma couleur est : " + couleur);
    }

    private byte couleur;
}

public class TabHeter {
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

