package chap11;

import chap04.Clavier;

public class TstInter {
    public static void main(String args[]) {
        EcritChap11TestInter e1 = new EcritChap11TestInter("bonjour ", 5);
        EcritChap11TestInter e2 = new EcritChap11TestInter("bonsoir ", 10);
        EcritChap11TestInter e3 = new EcritChap11TestInter("\n", 35);
        e1.start();
        e2.start();
        e3.start();
        Clavier.lireString();
        e1.interrupt();     // interruption premier thread
        System.out.println("\n*** Arret premier thread ***");
        Clavier.lireString();
        e2.interrupt();     // interruption deuxi�me thread
        e3.interrupt();     // interruption troisi�me thread
        System.out.println("\n*** Arret deux derniers threads ***");
    }
}

class EcritChap11TestInter extends Thread {
    public EcritChap11TestInter(String texte, long attente) {
        this.texte = texte;
        this.attente = attente;
    }

    public void run() {
        try {
            while (true)     // boucle infinie
            {
                if (interrupted()) return;
                System.out.print(texte);
                sleep(attente);
            }
        } catch (InterruptedException e) {
            return;   // on peut omettre return ici
        }
    }

    private String texte;
    private long attente;
}

/*
bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour

bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour
bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour
bonsoir
bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour
bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour
bonjour bonsoir bonjour bonsoir bonjour bonsoir
bonjour bonsoir bonjour bonsoir
bonjour bonsoir bonjour bonjour bonsoir
bonjour bonsoir bonjour bonsoir wbonjour
bonjour bonsoir

*** Arret premier thread ***
bonsoir bonsoir bonsoir
bonsoir bonsoir
bonsoir bonsoir
bonsoir bonsoir
xbonsoir bonsoir
bonsoir bonsoir
bonsoir

*** Arret deux derniers threads ***
*/
