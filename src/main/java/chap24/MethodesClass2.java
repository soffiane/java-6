package chap24;

import java.lang.reflect.*;

public class MethodesClass2 {
    public static void main(String args[]) {
        PointChap24MethodesClass3 p = new PointChap24MethodesClass3();
        Class<?> c = p.getClass();
        Field champs[] = c.getDeclaredFields();
        // affichage des informations relatives aux champs de la classe de p
        for (Field champ : champs) {
            System.out.println("---- Champ de nom : " + champ.getName());
            System.out.println("type : " + champ.getType().getName());
            int mod = champ.getModifiers();
            System.out.println("modificateurs : " + mod);
            if (Modifier.isPrivate(mod)) System.out.println("prive");
            if (Modifier.isStatic(mod)) System.out.println("static");

        }
    }
}

class PointChap24MethodesClass2 {
    public PointChap24MethodesClass2() {
        x = 0;
        y = 0;
        compte++;
    }

    public PointChap24MethodesClass2(int x, int y) {
        this.x = x;
        this.y = y;
        compte++;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    private void symetrise() {
        x = -x;
        y = -y;
    }

    public static void afficheNbre() {
        System.out.println("il y a " + compte + "points");
    }

    private int x, y;
    public static int compte = 0;
    protected int z;
}