package chap06;

class PointChap06Permute {
    public PointChap06Permute(int abs, int ord) {
        x = abs;
        y = ord;
    }

    public void permute(PointChap06Permute a)  // methode d'echange les coordonnees
    // du point courant avec celles de a
    {
        PointChap06Permute c = new PointChap06Permute(0, 0);
        c.x = a.x;
        c.y = a.y;  // copie de a dans c
        a.x = x;
        a.y = y;    // copie du point courant dans a
        x = c.x;
        y = c.y;    // copie de c dans le point courant
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    private int x, y;
}

public class Permute {
    public static void main(String args[]) {
        PointChap06Permute a = new PointChap06Permute(1, 2);
        PointChap06Permute b = new PointChap06Permute(5, 6);
        a.affiche();
        b.affiche();
        a.permute(b);
        a.affiche();
        b.affiche();
    }
}

