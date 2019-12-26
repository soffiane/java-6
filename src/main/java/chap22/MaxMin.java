package chap22;

import java.util.*;

public class MaxMin {
    public static void main(String args[]) {
        PointChap22MaxMin p1 = new PointChap22MaxMin(1, 3);
        PointChap22MaxMin p2 = new PointChap22MaxMin(2, 1);
        PointChap22MaxMin p3 = new PointChap22MaxMin(5, 2);
        PointChap22MaxMin p4 = new PointChap22MaxMin(3, 2);
        LinkedList<PointChap22MaxMin> l = new LinkedList<PointChap22MaxMin>();
        // LinkedList l = new LinkedList() ;  <-- avant JDK5.0
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);

        /* max de l, suivant l'ordre defini par compareTo de Point */
        PointChap22MaxMin pMax1 = Collections.max(l);
        //Point pMax1 = (Point)Collections.max (l) ; <-- avant JDK5.0
        System.out.print("Max suivant compareTo =  ");
        pMax1.affiche();
        System.out.println();

        /* max de l, suivant l'ordre defini par un comparateur anonyme */
        PointChap22MaxMin pMax2 = (PointChap22MaxMin) Collections.max(l, new Comparator() {
            public int compare(Object o1, Object o2) {
                PointChap22MaxMin p1 = (PointChap22MaxMin) o1;
                PointChap22MaxMin p2 = (PointChap22MaxMin) o2;
                if (p1.y < p2.y) return -1;
                else if (p1.y == p2.y) return 0;
                else return 1;
            }
        });
        System.out.print("Max suivant comparator = ");
        pMax2.affiche();
    }
}

class PointChap22MaxMin implements Comparable {
    PointChap22MaxMin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.print("[" + x + " " + y + "] ");
    }

    public int compareTo(Object pp) {
        PointChap22MaxMin p = (PointChap22MaxMin) pp;
        if (this.x < p.x) return -1;
        else if (this.x == p.x) return 0;
        else return 1;
    }

    public int x, y;    // public ici, pour simplifier les choses
}

