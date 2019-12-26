package chap06;

public class TstPoint {
    public static void main(String args[]) {
        PointChap06Point a;
        a = new PointChap06Point();
        a.initialise(3, 5);
        a.affiche();
        a.deplace(2, 0);
        a.affiche();
        PointChap06Point b = new PointChap06Point();
        b.initialise(6, 8);
        b.affiche();
    }
}

