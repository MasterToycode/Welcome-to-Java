package Reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestMovie {
    @Test
    public void Test_GetConstrcutors() throws NoSuchMethodException {
        //反射的第一步，获取class对象
        Class<Movie> movieClass = Movie.class;
        //获取类的方法
        Constructor<?>[] constructors =
                new Constructor[]{movieClass.getDeclaredConstructor()};
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName()+"->>>>>>"+ constructor.getParameterCount());
        }

    }


    @Test
    public void Test_Con_2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Movie> movieClass = Movie.class;


        System.out.println("-----------------------");
        Constructor<Movie> constructor1 =
                movieClass.
                        getDeclaredConstructor
                                (String.class, double.class, String.class, double.class, double.class);

        Constructor<Movie> declaredConstructor = movieClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Movie movie = declaredConstructor.newInstance();
        System.out.println(movie);


        Movie movie1 = constructor1.newInstance("沙丘", 9.0, "w", 10^10, 824);
        System.out.println(movie1);
        System.out.println(constructor1.getName()+"->>>>>>"+ constructor1.getParameterCount());
}

}
