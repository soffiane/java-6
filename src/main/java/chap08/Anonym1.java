package chap08;

class AChap08 {
    public void affiche() {
        System.out.println("Je suis un A");
    }
}

public class Anonym1 {
    public static void main(String[] args) {
        AChap08 a;
        a = new AChap08() {
            public void affiche() {
                System.out.println("Je suis un anonyme derive de A");
            }
        };
        a.affiche();
    }
}


