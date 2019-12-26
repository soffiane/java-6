package chap04;

import java.math.BigInteger;

public class Conver {
    public static void main(String args[]) {
        byte b1 = 50, b2 = 100;
        int n;
        n = b1 * b2;
        System.out.println(b1 + "*" + b2 + " = " + n);

        int n1 = 100000, n2 = 200000;
        long p;
        p = n1 * n2;
        double q = (double) (n1 * n2);
        System.out.println(n1 + "*" + n2 + " = " + p);
        System.out.println(n1 + "*" + n2 + " = " + q);
    }
}

