import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Test_1
{
    public static void main(String [] args){
        Collection<String> c=new ArrayList<>();
        c.add("Kobe");
        c.add("MJ");
        c.add("James");
        c.add("SGA");
        c.add("KD");

        //c.forEach( s-> System.out.println(s));
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        c.forEach(System.out::println);
    }
}
