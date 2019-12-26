package chap09;

public class EnumValeurs {
    public static void main(String args[]) {
        System.out.println("Liste des valeurs du type Jour");
        for (JourChap09Lire j : JourChap09Lire.values()) {
            System.out.println(j.toString());
        }
    }
}

enum JourChap09EnumValeurs {lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche}
/*
    Liste des valeurs du type Jour
lundi
mardi
mercredi
jeudi
vendredi
samedi
dimanche

*/
