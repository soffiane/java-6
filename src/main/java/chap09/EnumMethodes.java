package chap09;

public class EnumMethodes {
    public static void main(String args[]) {
        System.out.println("Noms des valeurs du type jour et leurs abreviations");
        for (JourChap09EnumMethods j : JourChap09EnumMethods.values())
            System.out.println(j + " : " + j.abreviation());
    }
}

enum JourChap09EnumMethods {
    lundi("lu"), mardi("ma"), mercredi("me"), jeudi("je"), vendredi("ve"),
    samdei("sa"), dimanche("di");

    private JourChap09EnumMethods(String a)    // constructeur ; en argument, l'abreviation
    {
        abrege = a;
    }

    public String abreviation() {
        return abrege;
    }

    private String abrege;
}
/*
Noms des valeurs du type jour et leurs abreviations
lundi : lu
mardi : ma
mercredi : me
jeudi : je
vendredi : ve
samdei : sa
dimanche : di
*/
