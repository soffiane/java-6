package chap11;

import chap04.Clavier;

public class Synchr1a {
    public static void main(String args[]) {
        NombresSynchr1 nomb = new NombresSynchr1();
        Thread calc = new ThrChangeChap04Synchr1(nomb);
        Thread aff = new ThrAffChap04Synchr1(nomb);
        System.out.println("Suite de carres - tapez retour pour arreter");
        calc.start();
        aff.start();
        Clavier.lireString();
        calc.interrupt();
        aff.interrupt();
    }
}

class NombresSynchr1 {
    public /* synchronized */ void calcul() {
        n++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        carre = n * n;
    }

    public /* synchronized */ void affiche() {
        System.out.println(n + " a pour carre " + carre);
    }

    private int n = 0, carre;
}

class ThrChangeChap04Synchr1 extends Thread {
    public ThrChangeChap04Synchr1(NombresSynchr1 nomb) {
        this.nomb = nomb;
    }

    public void run() {
        try {
            while (!interrupted()) {
                nomb.calcul();
                sleep(50);
            }
        } catch (InterruptedException e) {
        }
    }

    private NombresSynchr1 nomb;
}

class ThrAffChap04Synchr1 extends Thread {
    public ThrAffChap04Synchr1(NombresSynchr1 nomb) {
        this.nomb = nomb;
    }

    public void run() {
        try {
            while (!interrupted()) {
                nomb.affiche();
                sleep(75);
            }
        } catch (InterruptedException e) {
        }
    }

    private NombresSynchr1 nomb;
}