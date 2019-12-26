package chap10;

import chap04.Clavier;

class PointChap04Finally {
    public PointChap04Finally(int x, int y) throws ErrConstChap10 {
        if ((x < 0) || (y < 0)) throw new ErrConstChap10();
        this.x = x;
        this.y = y;
    }

    private int x, y;
}

public class Finally {
    public static void main(String args[]) {
        try {
            System.out.println("debut bloc try du main");
            System.out.print("donnez un entier : ");
            int n = Clavier.lireInt();
            PointChap10 a = new PointChap10(n, n);
            System.out.println("fin bloc try du main");
        } catch (ErrConstChap10 e) {
            System.out.println("dans catch (ErrConst) de main");
        } finally {
            System.out.println("execution du bloc finally");
        }
        System.out.println("apres bloc try main");
    }
}

