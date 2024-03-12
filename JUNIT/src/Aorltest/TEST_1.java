package Aorltest;

import java.util.ArrayList;
import java.util.List;

public class TEST_1 {

    public static void main(String []args){
        List<Integer> f = f(58);
        System.out.println(f.get(0));
        System.out.println(f.get(1));

    }

    public static List<Integer> f(int n){
        List<Integer> list =new ArrayList<>();
        if ((n&1)==1) {
            list.add(0);
            list.add(0);
        }
        else if ((n&1)==0&&n%4==0){
            list.add(n/2);
            list.add(n/4);
        }
        else {
            list.add(n/2);
            list.add((n-2)/4-1);
        }
                return list;
    }
}
