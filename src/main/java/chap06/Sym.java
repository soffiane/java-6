package chap06;

class PointChap06Sym {
    public PointChap06Sym(int abs, int ord) {
        x = abs;
        y = ord;
    }

    public PointChap06Sym symetrique() {
        return new PointChap06Sym(y, x);
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    private int x, y;
}

public class Sym {
    public static void main(String args[]) {
        PointChap06Sym a = new PointChap06Sym(1, 2);
        a.affiche();
        PointChap06Sym b = a.symetrique();
        b.affiche();
    }
}

