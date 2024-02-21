import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maptest_1 {
    public static void main(String [] args){
        Map<String ,Integer>stringIntegerMap=new HashMap<>();

        stringIntegerMap.put("kobe",198);
        stringIntegerMap.put("MJ",198);
        stringIntegerMap.put("SGA",198);
        stringIntegerMap.put("James",203);
        stringIntegerMap.put("Curry",192);
        stringIntegerMap.put("KD",213);

        Set<Map.Entry<String,Integer>>entries= stringIntegerMap.entrySet();

        for (Map.Entry<String,Integer> stringIntegerEntry:entries){
            String key=stringIntegerEntry.getKey();
            Integer value=stringIntegerEntry.getValue();
            System.out.println(key+"----->"+value);
        }
        System.out.println("--------------------------------------");

       stringIntegerMap.forEach((k,v)-> System.out.println(k+"----->"+v));
        System.out.println("--------------------------------------");


            Set<String> keySet=stringIntegerMap.keySet();
        for (String s : keySet) {
            System.out.println(s+"----->"+stringIntegerMap.get(s));
        }
        System.out.println("--------------------------------------");



    }
}
