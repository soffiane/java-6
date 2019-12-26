package chap06;

class ObjChap06TestBis {
    public ObjChap06TestBis() {
        System.out.print("++ creation objet Obj ; ");
        nb++;
        System.out.println("il y en a maintenant " + nb);
    }

    public static long nbObj() {
        return nb;
    }

    private static long nb = 0;
}

public class TstObj2 {
    public static void main(String args[]) {
        ObjChap06TestBis a;
        System.out.println("Main 1 : nb objets = " + ObjChap06TestBis.nbObj());
        a = new ObjChap06TestBis();
        System.out.println("Main 2 : nb objets = " + ObjChap06TestBis.nbObj());
        ObjChap06TestBis b;
        System.out.println("Main 3 : nb objets = " + ObjChap06TestBis.nbObj());
        b = new ObjChap06TestBis();
        ObjChap06TestBis c = new ObjChap06TestBis();
        System.out.println("Main 4 : nb objets = " + ObjChap06TestBis.nbObj());
    }
}

