package chap22;

import java.util.*;

public class EnsPt1 {
    public static void main(String args[]) {
        PointChap22 p1 = new PointChap22(1, 3), p2 = new PointChap22(2, 2);
        PointChap22 p3 = new PointChap22(4, 5), p4 = new PointChap22(1, 8);
        PointChap22 p[] = {p1, p2, p1, p3, p4, p3};
        HashSet<PointChap22> ens = new HashSet<PointChap22>();
        // HashSet ens=new HashSet() ;  <-- avant JDK5.0
        for (PointChap22 px : p)           // for (int i=0 ; i<p.length ; i++)  <-- avant JDK5.0
        {
            System.out.print("le point ");
            px.affiche();                               // p[i].affiche() ; <-- avant JDK5.0
            boolean ajoute = ens.add(px);
            // boolean ajoute = ens.add (p[i]) ; <-- avant JDK5.0
            if (ajoute) System.out.println(" a ete ajoute");
            else System.out.println("est deja present");
            System.out.print("ensemble = ");
            affiche(ens);
        }
    }

    public static void affiche(HashSet<PointChap22> ens)
    //  public static void affiche (HashSet ens) <-- avant JDK5.0
    {
        Iterator<PointChap22> iter = ens.iterator();
        // Iterator iter = ens.iterator() ;  <-- avant JDK5.0
        while (iter.hasNext()) {
            PointChap22 p = iter.next();       // Point p = (Point)iter.next() ;  <-- avant JDK5.0
            p.affiche();
        }
        System.out.println();
    }
}

class PointChap22 {
    PointChap22(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashCode() {
        return x + y;
    }

    public boolean equals(Object pp) {
        PointChap22 p = (PointChap22) pp;
        return ((this.x == p.x) & (this.y == p.y));
    }

    public void affiche() {
        System.out.print("[" + x + " " + y + "] ");
    }

    private int x, y;
}

