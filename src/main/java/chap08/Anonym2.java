package chap08;

interface Affichable {
    public void affiche();
}

public class Anonym2 {
    public static void main(String[] args) {
        AffichableChap08 a;
        a = new AffichableChap08() {
            public void affiche() {
                System.out.println("Je suis un anonyme implementant Affichable");
            }
        };
        a.affiche();
    }
}


