package chap21;

public class CoupleM {
    public static void main(String args[]) {
        Integer oi1 = 3;
        Double od1 = 2.5;
        CoupleChap21CoupleM<Integer, Double> ch1 = new CoupleChap21CoupleM<Integer, Double>(oi1, od1);
        ch1.affiche();

        Integer oi2 = 4;
        CoupleChap21CoupleM<Integer, Integer> ch2 = new CoupleChap21CoupleM<Integer, Integer>(oi1, oi2);
        ch2.affiche();

        Integer n = ch1.getPremier();
        System.out.println("premier element du couple ch1 = " + n);
    }
}

class CoupleChap21CoupleM<T, U> {
    private T x;     // le premier element du couple
    private U y;     // le second element du couple

    public CoupleChap21CoupleM(T premier, U second) {
        x = premier;
        y = second;
    }

    public T getPremier() {
        return x;
    }

    public void affiche() {
        System.out.println("premi�re valeur : " + x + " - deuxi�me valeur : " + y);
    }
}

/*
 premi�re valeur : 3 - deuxi�me valeur : 2.5
 premi�re valeur : 3 - deuxi�me valeur : 4
 premier element du couple ch1 = 3
*/
