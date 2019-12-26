package chap24;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class IntroAnnot2 {
    public static void main(String args[]) throws NoSuchMethodException {
        Annotation[] annotationsDeA = AChap24IntroAnnot2.class.getAnnotations();
        System.out.println("Annotations de la classe A : ");
        for (Annotation a : annotationsDeA)
            System.out.println(a.annotationType().getName());

        Method m1 = AChap24IntroAnnot2.class.getDeclaredMethod("f");
        Annotation[] annotationsDEf = m1.getAnnotations();
        System.out.println("Annotations de la methode A.f : ");
        for (Annotation a : annotationsDEf)
            System.out.println(a.annotationType().getName());

        Annotation[] annotationsDeB = BChap24IntroAnnot2.class.getAnnotations();
        System.out.println("Annotations de la classe B : ");
        for (Annotation a : annotationsDeB)
            System.out.println(a.annotationType().getName());
        Annotation[] annotationsDeclDeB = BChap24IntroAnnot2.class.getDeclaredAnnotations();
        System.out.println("Annotations declarees de la classe B : ");
        for (Annotation a : annotationsDeclDeB)
            System.out.println(a.annotationType().getName());
    }
}

@Deprecated
@InfosChap24IntroAnnot2(message = "Message Classe A", value = 20)
class AChap24IntroAnnot2 {
    @Deprecated
    @InfosChap24IntroAnnot2(message = "Message methode f")
    void f() {
    }
}

class BChap24IntroAnnot2 extends AChap24IntroAnnot2 {
    @Override
    void f() {
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface InfosChap24IntroAnnot2 {
    String message() default "Rien";

    int value() default 0;
}
