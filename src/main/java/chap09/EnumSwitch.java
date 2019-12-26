package chap09;

public class EnumSwitch {
    public static void main(String args[]) {
        JourChap09Lire courant;
        courant = JourChap09Lire.vendredi;
        switch (courant) {
            case lundi:           // attention Jour.lundi serait une erreur
            case mardi:
            case mercredi:
            case jeudi:
                System.out.println("On bosse");
                break;
            case vendredi:
                System.out.println("Bientot le we");
                break;
            case samedi:
            case dimanche:
                System.out.println("c'est le week end");
        }
    }
}

enum JourChap09EnumSwitch {lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche}
/*
Bientot le we
*/
