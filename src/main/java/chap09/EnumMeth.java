package chap09;

public class EnumMeth {
    public static void main(String args[]) {
        System.out.println("Noms des valeurs du type jour");
        for (JourChap09Meth j : JourChap09Meth.values())
            System.out.println(j + " : " + j.affiche());
    }
}

enum JourChap09Meth {
    lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche;

    String affiche() {
        return this.toString();
    }
}
