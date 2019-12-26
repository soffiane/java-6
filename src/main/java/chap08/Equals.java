package chap08;

import chap04.Clavier;

class Point {
    public Point(int abs, int ord) {
        x = abs;
        y = ord;
    }

    public boolean equals(PointChap08 p)      // Point redefinit equals
    {
        return ((p.x == x) && (p.y == y));
    }

    private int x, y;
}

class Entier                           // entier ne redefinit pas equals
{
    public Entier(int n) {
        this.n = n;
    }

    private int n;
}

public class Equals {
    public static void main(String args[]) {
        Object t[] = {new PointChap08(1, 2), new PointChap08(1, 2), new EntierChap08(5),
                new EntierChap08(5)};
        System.out.println("t[0].equals(t[1]) = " + t[0].equals(t[1]));
        System.out.println("t[2].equals(t[3]) = " + t[0].equals(t[1]));
        System.out.println("t[0].equals(t[2]) = " + t[0].equals(t[1]));
        System.out.println("t[2].equals(t[0]) = " + t[0].equals(t[1]));
        Clavier.lireInt();
    }
}

