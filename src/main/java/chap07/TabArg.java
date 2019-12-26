package chap07;

public class TabArg {
    public static void main(String args[]) {
        int t[] = {1, 3, 5, 7};
        System.out.print("t avant : ");
        UtilChap07TableauArguments.affiche(t);
        UtilChap07TableauArguments.raz(t);
        System.out.print("\nt apres : ");
        UtilChap07TableauArguments.affiche(t);
    }
}

class UtilChap07TableauArguments {
    static void raz(int t[]) {
        for (int i = 0; i < t.length; i++)   // ici for... each pas appicable
            t[i] = 0;
    }

    static void affiche(int t[]) {
        for (int i = 0; i < t.length; i++)   // ou (depuis JDK5.0) :
            System.out.print(t[i] + " ");  // for (int v : t) System.out.print (v + " ") ;
    }
}
