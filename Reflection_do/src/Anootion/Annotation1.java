package Anootion;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Annotation1 {
    @Test
    public void parseClass(){
        Class<Demo> demoClass = Demo.class;

        if (demoClass.isAnnotationPresent(Mytest.class)){
            Mytest declaredAnnotation = demoClass.getDeclaredAnnotation(Mytest.class);
            System.out.println(declaredAnnotation.value());
            System.out.println(declaredAnnotation.aaa());
            System.out.println(Arrays.toString(declaredAnnotation.bbb()));
        }
    }


    @Test
    public void parseMethod(){
        Class<Demo> demoClass = Demo.class;
        try {
            Method test1 = demoClass.getDeclaredMethod("test1");
            if (test1.isAnnotationPresent(Mytest.class)){
                Mytest declaredAnnotation = test1.getDeclaredAnnotation(Mytest.class);
                System.out.println(declaredAnnotation.value());
                System.out.println(declaredAnnotation.aaa());
                System.out.println(Arrays.toString(declaredAnnotation.bbb()));
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }

}
