package chap08;

class Achap08 {
    void f() {
        System.out.println("appel f de A");
    }
}

class Bchap08 extends Achap08 {
    void f() {
        System.out.println("appel f de B");
    }

    public void test() {
        Achap08 a = new Achap08();
        a.f();
        super.f();
        this.f();
    }
}

public class Super {
    public static void main(String args[]) {
        Bchap08 b = new Bchap08();
        b.test();
    }
}

