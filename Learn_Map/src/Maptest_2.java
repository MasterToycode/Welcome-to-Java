import java.util.*;

public class Maptest_2 {
    public static void main(String [] args){
        Map<String , List<String>>stringListMap =new HashMap<>();
        List<String>stringList =new ArrayList<>();
        Collections.addAll(stringList,"nanjingshi","suzhoushi","wuxishi","changzhoushi");
        stringListMap.put("jiangsusheng",stringList);

    }
}