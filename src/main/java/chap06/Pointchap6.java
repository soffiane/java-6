package chap06;

class PointChap06 {
    public PointChap06(int abs, int ord) {
        x = abs;
        y = ord;
    }

    public static boolean coincide(PointChap06 p1, PointChap06 p2) {
        return ((p1.x == p2.x) && (p1.y == p2.y));
    }

    private int x, y;
}

class Coincid2 {
    public static void main(String args[]) {
        PointChap06 a = new PointChap06(1, 3);
        PointChap06 b = new PointChap06(2, 5);
        PointChap06 c = new PointChap06(1, 3);
        System.out.println("a et b : " + PointChap06.coincide(a, b));
        System.out.println("a et c : " + PointChap06.coincide(a, c));
    }
}

