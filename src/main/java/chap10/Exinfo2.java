package chap10;

class PointChap10ExInfo2 {
    public PointChap10ExInfo2(int x, int y) throws ErrConstChap10ExInfo2 {
        if ((x < 0) || (y < 0))
            throw new ErrConstChap10ExInfo2("Erreur construction avec coordonnees " + x + " " + y);
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("coordonnees : " + x + " " + y);
    }

    private int x, y;
}

class ErrConstChap10ExInfo2 extends Exception {
    ErrConstChap10ExInfo2(String mes) {
        super(mes);
    }
}

public class Exinfo2 {
    public static void main(String args[]) {
        try {
            PointChap10ExInfo2 a = new PointChap10ExInfo2(1, 4);
            a.affiche();
            a = new PointChap10ExInfo2(-3, 5);
            a.affiche();
        } catch (ErrConstChap10ExInfo2 e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
    }
}

