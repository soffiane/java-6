package chap09;

public class EnumComp {
    public static void main(String args[]) {
        JourChap09Lire courant;
        courant = JourChap09Lire.mardi;
        if (courant == JourChap09Lire.dimanche) System.out.println("On se repose");
        else System.out.println("On bosse");
        if (courant.equals(JourChap09Lire.dimanche)) System.out.println("On se repose");
        else System.out.println("On bosse");
        if (courant.compareTo(JourChap09Lire.samedi) < 0)
            System.out.println("Ce n'est pas encore le week end");
        if (courant.ordinal() < 5)
            System.out.println("on est encore dans la semaine");
        System.out.println("rang du jour dans la semaine (lundi=1) : " + (courant.ordinal() + 1));
    }
}

enum Jour {lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche}
/*
On bosse
On bosse
Ce n'est pas encore le week end
on est encore dans la semaine
rang du jour dans la semaine (lundi=1) : 2
*/
