package Reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestMovie_2 {
    @Test
    public void TestGetFields() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Movie> aClass = Movie.class;

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+"-------->"+declaredField.getType());
        }

        System.out.println("-------------------------------------");
        Field name1 = aClass.getDeclaredField("name");
        System.out.println(name1.getType()+name1.getName());

        Constructor<Movie> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);


        Movie movie = declaredConstructor.newInstance();
        name1.setAccessible(true);
        name1.set(movie,"沙丘");
        System.out.println(movie);
    }
}
