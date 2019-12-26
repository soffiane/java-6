package chap10;

class PointChap10Suitex {
    public PointChap10Suitex(int x, int y) throws ErrConstChap10 {
        if ((x <= 0) || (y <= 0)) throw new ErrConstChap10();
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) throws ErrDeplChap10 {
        if (((x + dx) < 0) || ((y + dy) < 0)) throw new ErrDeplChap10();
        x += dx;
        y += dy;
    }

    public void affiche() {
        System.out.println("coordonnees : " + x + " " + y);
    }

    private int x, y;
}


public class Suitex {
    public static void main(String args[]) {
        try {
            PointChap10Suitex a = new PointChap10Suitex(1, 4);
            a.affiche();
            a.deplace(-3, 5);
            a = new PointChap10Suitex(-3, 5);
            a.affiche();
        } catch (ErrConstChap10 e) {
            System.out.println("Erreur construction ");
            System.exit(-1);
        } catch (ErrDeplChap10 e) {
            System.out.println("Erreur deplacement ");
            System.exit(-1);
        }
    }
}

