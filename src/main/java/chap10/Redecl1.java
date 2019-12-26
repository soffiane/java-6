package chap10;

class PointChap10Redecl1 {
    public PointChap10Redecl1(int x, int y) throws ErrConstChap10 {
        if ((x <= 0) || (y <= 0)) throw new ErrConstChap10();
        this.x = x;
        this.y = y;
    }

    public void f() throws ErrConstChap10, ErrBidon {
        try {
            PointChap10 p = new PointChap10(-3, 2);
        } catch (ErrConstChap10 e) {
            System.out.println("dans catch (ErrConst) de f");
            throw new ErrBidon();        // on lance une nouvelle exception
        }
    }

    private int x, y;
}

class ErrBidon extends Exception {
}

public class Redecl1 {
    public static void main(String args[]) {
        try {
            PointChap10Redecl1 a = new PointChap10Redecl1(1, 4);
            a.f();
        } catch (ErrConstChap10 e) {
            System.out.println("dans catch (ErrConst) de main");
        } catch (ErrBidon e) {
            System.out.println("dans catch (ErrBidon) de main");
        }
        System.out.println("apres bloc try main");
    }
}

