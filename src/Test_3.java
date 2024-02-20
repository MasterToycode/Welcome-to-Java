import java.util.*;

public class Test_3 {
    public static void main(String [] args){
        test();
        test(10);
        test(10,20,30);
        test(new int[]{20,30,40,50});
        List<String> strings=new ArrayList<>();
        Collections.addAll(strings,"kobe","MJ","SGA","Jmaes");
        System.out.println(strings);

        Collections.shuffle(strings);
        System.out.println(strings);


    }

    public static void test(int ... nums){
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("-----------------------------------------");
    }
}
