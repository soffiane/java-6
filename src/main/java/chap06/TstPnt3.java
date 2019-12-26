package chap06;

public class TstPnt3 {
    public static void main(String args[]) {
        PointChap06TestPoint3 a;
        a = new PointChap06TestPoint3(3, 5);
        a.affiche();
        a.deplace(2, 0);
        a.affiche();
        PointChap06TestPoint3 b = new PointChap06TestPoint3(6, 8);
        b.affiche();
    }
}

class PointChap06TestPoint3 {
    public PointChap06TestPoint3(int abs, int ord)  // constructeur
    {
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

