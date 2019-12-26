package chap21;

class CoupleChap21JokerMeth<T> {
    private T x, y;      // les deux elements du couple

    public CoupleChap21JokerMeth(T premier, T second) {
        x = premier;
        y = second;
    }

    public T getPremier() {
        return x;
    }

    public void affiche() {
        System.out.println("premiere valeur : " + x + " - deuxieme valeur : " + y);
    }
}

public class JokerMeth {
    public static void main(String args[]) {
        CoupleChap21JokerMeth<Double> cd = new CoupleChap21JokerMeth<Double>(2.5, 3.5);
        calcul(cd);

    }

    public static void calcul(CoupleChap21JokerMeth<Double> c) {

    }
}

