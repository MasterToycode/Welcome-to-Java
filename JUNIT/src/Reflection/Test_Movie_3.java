package Reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test_Movie_3 {
    @Test
    public void Test_GetMethods()throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
            Class<Movie> aClass = Movie.class;

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() +
                    "->>>" + declaredMethod.getTypeParameters() +
                    "->>>>" + declaredMethod.getReturnType());

        }
        Method printing = aClass.getDeclaredMethod("printing");
        System.out.println(printing.getName() + printing.getReturnType());

        Method find = aClass.getDeclaredMethod("FIND", double.class);
        System.out.println(find.getName() + find.getReturnType());

        Constructor<Movie> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Movie movie = declaredConstructor.newInstance();
        printing.invoke(movie);
    }
}
