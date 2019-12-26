package chap06;

class PointChap06Surdef2 {
    public PointChap06Surdef2()                  // constructeur 1 (sans argument)
    {
        x = 0;
        y = 0;
    }

    public PointChap06Surdef2(int abs)           // constructeur 2 (un argument)
    {
        x = y = abs;
    }

    public PointChap06Surdef2(int abs, int ord) // constructeur 3 (deux arguments)
    {
        x = abs;
        y = ord;
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    private int x, y;
}

public class Surdef2 {
    public static void main(String args[]) {
        PointChap06Surdef2 a = new PointChap06Surdef2();      // appelle constructeur 1
        a.affiche();
        PointChap06Surdef2 b = new PointChap06Surdef2(5);     // appelle constructeur 2
        b.affiche();
        PointChap06Surdef2 c = new PointChap06Surdef2(3, 9);  // appelle constructeur 3
        c.affiche();
    }
}

