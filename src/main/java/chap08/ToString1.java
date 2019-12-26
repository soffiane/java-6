package chap08;

class PointChap08ToString {
    public PointChap08ToString(int abs, int ord) {
        x = abs;
        y = ord;
    }

    private int x, y;
}

public class ToString1 {
    public static void main(String args[]) {
        PointChap08ToString a = new PointChap08ToString(1, 2);
        PointChap08ToString b = new PointChap08ToString(5, 6);
        System.out.println("a = " + a.toString());
        System.out.println("b = " + b.toString());
    }
}    

