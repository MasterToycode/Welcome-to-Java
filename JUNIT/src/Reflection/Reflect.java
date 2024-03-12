package Reflection;

public class Reflect {
    public static void main(String []args) throws ClassNotFoundException {
        Class<Movie> movieClass = Movie.class;
        System.out.println(movieClass.getName());
        System.out.println(movieClass.getSimpleName());

        Class<?> aClass = Class.
                forName(movieClass.getName());
        System.out.println(aClass == movieClass);

//        Movie movie=new Movie();
//        Class<? extends Movie> aClass1 = movie.getClass();
//        System.out.println(aClass1 == aClass);
    }
}
