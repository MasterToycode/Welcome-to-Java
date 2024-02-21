import java.util.*;

public class Try_2 {
    public static void main(String []args){
        List<String> list=new ArrayList<>();
        String [] strings={"A","B","C","D"};
        Random random=new Random();
        for (int i = 0; i < 80; i++) {
            int i1=random.nextInt(4);
            list.add(strings[i1]);
        }

        Map<String ,Integer> map=new HashMap<>();
        for (String string : list) {
            if (map.containsKey(string)) map.put(string,map.get(string)+1);
            else map.put(string,1);
        }

//        System.out.println(map);

        System.out.println("So ,we choose the ");
        map.entrySet().stream().
                sorted((o1, o2) -> o2.getValue()- o1.getValue())
                .limit(1)
                .forEach(System.out::println);

        System.out.println(map.entrySet().stream().
                max(((o1, o2) -> o1.getValue() - o2.getValue())).
                get());
    }
}
