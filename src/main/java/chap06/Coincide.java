package chap06;

class Pointchap06 {
    public Pointchap06(int abs, int ord) {
        x = abs;
        y = ord;
    }

    public boolean coincide(Pointchap06 pt) {
        return ((pt.x == x) && (pt.y == y));
    }

    private int x, y;
}

public class Coincide {
    public static void main(String args[]) {
        Pointchap06 a = new Pointchap06(1, 3);
        Pointchap06 b = new Pointchap06(2, 5);
        Pointchap06 c = new Pointchap06(1, 3);
        System.out.println("a et b : " + a.coincide(b) + " " + b.coincide(a));
        System.out.println("a et c : " + a.coincide(c) + " " + c.coincide(a));
    }
}
          
