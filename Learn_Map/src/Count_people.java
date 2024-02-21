import java.util.*;

public class Count_people {
    public static void main(String []args){
        List<String> list=new ArrayList<>();
        String [] strings={"A","B","C","D"};
        Random random=new Random();
        for (int i = 0; i < 80; i++) {
            int i1=random.nextInt(4);
            list.add(strings[i1]);
        }

        Map<String ,Integer>map=new HashMap<>();
        for (String string : list) {
            if (map.containsKey(string)) map.put(string,map.get(string)+1);
            else map.put(string,1);
        }
        System.out.println(map);

    }
}
