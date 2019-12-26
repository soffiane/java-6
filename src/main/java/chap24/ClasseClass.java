package chap24;

public class ClasseClass {
    public static void main(String args[]) {
        PointChap24MethodesClass3 p = new PointChap24MethodesClass3();
        Class<?> c = p.getClass(); // ou c = Point.class ;
        System.out.println("classe de c = " + c.getName());
        // affichage de la conversion de c en String (m�tode toString)
        System.out.println("classe de c (obtenue par toString) = " + c);

        Couple<PointChap24MethodesClass3> cp = new Couple<PointChap24MethodesClass3>();
        Couple<?> cj = new Couple<PointChap24MethodesClass3>();
        System.out.println("classe Couple<Point> = " + cp.getClass().getName());
        System.out.println("classe Couple<?> = " + cj.getClass().getName());
    }
}


class Couple<T> {
    private T x, y;
}