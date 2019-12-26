package chap06;

class Obj {
    public Obj() {
        System.out.print("++ creation objet Obj ; ");
        nb++;
        System.out.println("il y en a maintenant " + nb);
    }

    private static long nb = 0;
}

public class TstObj {
    public static void main(String args[]) {
        ObjChap06TestBis a;
        System.out.println("Main 1");
        a = new ObjChap06TestBis();
        System.out.println("Main 2");
        ObjChap06TestBis b;
        System.out.println("Main 3");
        b = new ObjChap06TestBis();
        ObjChap06TestBis c = new ObjChap06TestBis();
        System.out.println("Main 4");
    }
}

