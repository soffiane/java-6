package chap21;

public class CoupleHerit {
    public static void main(String args[]) {
        Object o1 = null;
        Integer i1 = 5;
        Object o2 = null;
        Integer i2 = 3;
        Couple1Chap21CoupleHerit co = new Couple1Chap21CoupleHerit(o1, o2);
        Couple1Chap21CoupleHerit<Integer> ci = new Couple1Chap21CoupleHerit(i1, i2);
        Couple1Chap21CoupleHerit<?> cq;
        cq = ci;
        cq.compare(i1);

    }
}

class Couple1Chap21CoupleHerit<T> {
    private T x, y;

    public Couple1Chap21CoupleHerit(T premier, T second) {
        x = premier;
        y = second;
    }

    public T getPremier() {
        return x;
    }

    public boolean comparePremier(T tiers) {
        if (x == tiers) return true;
        else return false;
    }

    public void setPremier(T premier) {
        x = premier;
    }

    public void affiche() {
        System.out.println("premiere valeur : " + x + " - deuxieme valeur : " + y);
    }

    public void compare(Integer i1) {
    }
}
