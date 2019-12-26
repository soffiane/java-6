package chap24;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class IntroAnnot {
    public static void main(String args[]) throws NoSuchMethodException {
        if (AChap24IntroAnnot2.class.isAnnotationPresent(InfosChap24IntroAnnot2.class))
            System.out.println("-- @Infos pr�sente sur A");
        else System.out.println("-- @Infos non pr�sente sur A");
        if (BChap24IntroAnnot2.class.isAnnotationPresent(InfosChap24IntroAnnot2.class))
            System.out.println("-- @Infos pr�sente sur B");
        else System.out.println("-- @Infos non pr�sente sur B");

        Method m1 = AChap24IntroAnnot2.class.getDeclaredMethod("f");
        if (m1.isAnnotationPresent(InfosChap24IntroAnnot2.class)) {
            System.out.println("-- @Infos pr�sente sur A.f");
            InfosChap24IntroAnnot2 ainf1 = m1.getAnnotation(InfosChap24IntroAnnot2.class);
            System.out.println("message = " + ainf1.message());
            System.out.println("value   = " + ainf1.value());
        }

        Method m2 = AChap24IntroAnnot2.class.getDeclaredMethod("g");
        if (m2.isAnnotationPresent(InfosChap24IntroAnnot2.class)) {
            System.out.println("-- @Infos pr�sente sur A.g");
            InfosChap24IntroAnnot2 ainf2 = m2.getAnnotation(InfosChap24IntroAnnot2.class);
            System.out.println("message = " + ainf2.message());
            System.out.println("value   = " + ainf2.value());
        }
    }
}

@InfosChap24IntroAnnot2(message = "Message Classe A", value = 20)
class A {
    @InfosChap24IntroAnnot2(message = "Message methode f")
    void f() {
    }

    @InfosChap24IntroAnnot2(12)
    void g() {
    }

    void h() {
    }
}

class B {
}

@Retention(RetentionPolicy.RUNTIME)
@interface Infos {
    String message() default "Rien";

    int value() default 0;
}