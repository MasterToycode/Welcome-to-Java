package MyJunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Mytest_test1 {
    @Mytest
    public void tset1(){
        System.out.println("test1----------------");
    }
    @Mytest
    public void tset2(){
        System.out.println("test2----------------");
    }
    public void tset3(){
        System.out.println("test3----------------");
    }
    @Mytest
    public void tset4(){
        System.out.println("test4----------------");
    }



    public static void main(String[] args) {
        Mytest_test1 mytestTest1 = new Mytest_test1();
        Class<Mytest_test1> mytestTest1Class = Mytest_test1.class;
        Method[] declaredMethods =
                mytestTest1Class.getDeclaredMethods();

        
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Mytest.class)){
                try {
                    declaredMethod.invoke(mytestTest1);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
