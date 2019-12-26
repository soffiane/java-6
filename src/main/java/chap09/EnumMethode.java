package chap09;

public class EnumMethode {
    public static void main(String args[]) {
        System.out.println("Noms des valeurs du type jour");
        for (JourChap09EnumMethod j : JourChap09EnumMethod.values()) j.affiche();
    }
}

enum JourChap09EnumMethod {
    lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche;

    public void affiche() {
        System.out.println(this.toString());
    }
}
/*
Noms des valeurs du type jour
lundi
mardi
mercredi
jeudi
vendredi
samedi
dimanche
*/
