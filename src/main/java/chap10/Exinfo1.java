package chap10;

class PointChap10ExInfo1 {
    public PointChap10ExInfo1(int x, int y) throws ErrConstChap10ExInfo1 {
        if ((x < 0) || (y < 0)) throw new ErrConstChap10ExInfo1(x, y);
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("coordonnees : " + x + " " + y);
    }

    private int x, y;
}

class ErrConstChap10ExInfo1 extends Exception {
    ErrConstChap10ExInfo1(int abs, int ord) {
        this.abs = abs;
        this.ord = ord;
    }

    public int abs, ord;
}

public class Exinfo1 {
    public static void main(String args[]) {
        try {
            PointChap10ExInfo1 a = new PointChap10ExInfo1(1, 4);
            a.affiche();
            a = new PointChap10ExInfo1(-3, 5);
            a.affiche();
        } catch (ErrConstChap10ExInfo1 e) {
            System.out.println("Erreur construction Point");
            System.out.println("  coordonnees souhaitees : " + e.abs + " " + e.ord);
            System.exit(-1);
        }
    }
}
