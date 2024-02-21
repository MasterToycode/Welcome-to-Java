import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class The_first_try_stream {

    public static void main(String []args){
        List<String> stringList=new ArrayList<>();
        Collections.addAll(stringList,"张三","张无忌","张天逸","Kobe","SGA","James","MJ");
        List<String>list=new ArrayList<>();
        for (String s : stringList) {
            if (s.startsWith("张")&&s.length()==3) list.add(s);
        }
        System.out.println(list);


       List<String>stringList1= stringList.stream().
                filter(s -> s.startsWith("张")).
                filter(s -> s.length()==3).
                collect(Collectors.toList());
        System.out.println(stringList1);
    }
}
