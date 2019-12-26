package chap06;

public class TstPnt2 {
    public static void main(String args[]) {
        PointChap06TestPointBis a;
        a = new PointChap06TestPointBis();
        a.initialise(3, 5);
        a.affiche();
        a.deplace(2, 0);
        a.affiche();
        PointChap06TestPointBis b = new PointChap06TestPointBis();
        b.initialise(6, 8);
        b.affiche();
    }
}

class PointChap06TestPointBis {
    public void initialise(int abs, int ord) {
        x = abs;
        y = ord;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affiche() {
        System.out.println("Je suis un point de coordonnees " + x + " " + y);
    }

    private int x;   // abscisse
    private int y;   // ordonnee
}

