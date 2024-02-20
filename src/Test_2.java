import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Test_2 {
    public static void main(String []args){
        Collection<Movie> movies=new ArrayList<>();//集合存地址
        movies.add(new Movie("xiaoshengkedejiushu",9.7,"luobingsi"));
        movies.add(new Movie("chumendeshijie",9.6,"sdfg"));
        movies.add(new Movie("bawangbieji",9.5,"zhenguorong"));
        movies.add(new Movie("xingjichuangyue",9.9,"zxcvbnm"));

       movies.forEach(System.out::println);
    }
}
