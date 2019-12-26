package chap10;

class Point {
    public Point(int x, int y) throws ErrConstChap10 {
        if ((x < 0) || (y < 0)) throw new ErrConstChap10();
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println("coordonnees : " + x + " " + y);
    }

    private int x, y;
}

class ErrConst extends Exception {
}

public class Except1 {
    public static void main(String args[]) {
        try {
            PointChap10 a = new PointChap10(1, 4);
            a.affiche();
            a = new PointChap10(-3, 5);
            a.affiche();
        } catch (ErrConstChap10 e) {
            System.out.println("Erreur construction ");
            System.exit(-1);
        }
    }
}

