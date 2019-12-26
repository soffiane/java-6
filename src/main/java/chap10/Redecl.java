package chap10;

class PointChap10Redecl {
    public PointChap10Redecl(int x, int y) throws ErrConstChap10 {
        if ((x <= 0) || (y <= 0)) throw new ErrConstChap10();
        this.x = x;
        this.y = y;
    }

    public void f() throws ErrConstChap10 {
        try {
            PointChap10 p = new PointChap10(-3, 2);
        } catch (ErrConstChap10 e) {
            System.out.println("dans catch (ErrConst) de f");
            throw e;        // on repasse l'exception � un niveau superieur
        }
    }

    private int x, y;
}

public class Redecl {
    public static void main(String args[]) {
        try {
            PointChap10Redecl a = new PointChap10Redecl(1, 4);
            a.f();
        } catch (ErrConstChap10 e) {
            System.out.println("dans catch (ErrConst) de main");
        }
        System.out.println("apres bloc try main");
    }
}

