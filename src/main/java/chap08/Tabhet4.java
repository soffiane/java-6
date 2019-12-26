package chap08;

interface AffichableChap08Tab4 {
    void affiche();
}

class EntierChap08Tab4 implements AffichableChap08Tab4 {
    public EntierChap08Tab4(int n) {
        valeur = n;
    }

    public void affiche() {
        System.out.println("Je suis un entier de valeur " + valeur);
    }

    private int valeur;
}

class Flottant implements AffichableChap08Tab4 {
    public Flottant(float x) {
        valeur = x;
    }

    public void affiche() {
        System.out.println("Je suis un flottant de valeur " + valeur);
    }

    private float valeur;
}

public class Tabhet4 {
    public static void main(String[] args) {
        AffichableChap08[] tab;
        tab = new AffichableChap08[3];
        tab[0] = new EntierChap08(25);
        tab[1] = new FlottantChap08(1.25f);
        ;
        tab[2] = new EntierChap08(42);
        int i;
        for (i = 0; i < 3; i++)
            tab[i].affiche();
    }
}


