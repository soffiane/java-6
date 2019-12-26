package chap11;

public class TstThr2 {
    public static void main(String args[]) {
        EcritChap11TestThread2 e1 = new EcritChap11TestThread2("bonjour ", 10, 5);
        EcritChap11TestThread2 e2 = new EcritChap11TestThread2("bonsoir ", 12, 10);
        EcritChap11TestThread2 e3 = new EcritChap11TestThread2("\n", 5, 15);
        e1.start();
        e2.start();
        e3.start();
    }
}

class EcritChap11TestThread2 implements Runnable {
    public EcritChap11TestThread2(String texte, int nb, long attente) {
        this.texte = texte;
        this.nb = nb;
        this.attente = attente;
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < nb; i++) {
                System.out.print(texte);
                Thread.sleep(attente);
            }
        } catch (InterruptedException e) {
        }  // impose par sleep
    }

    private String texte;
    private int nb;
    private long attente;
}


/*
bonjour bonsoir bonjour
bonjour bonsoir bonjour bonjour bonsoir
bonjour bonjour bonsoir bonjour
bonsoir bonjour bonjour bonsoir
bonsoir
bonsoir bonsoir bonsoir bonsoir bonsoir
*/
