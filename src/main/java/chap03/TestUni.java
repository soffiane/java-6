package chap03;

public class TestUni {
    public static void main(String[] args) {
        final char carDeb = 200, carFin = 300;
        char c;
        for (c = carDeb; c < carFin; c++) {
            System.out.print((int) c + "-");
            System.out.println(c + " ");
        }
    }
}


