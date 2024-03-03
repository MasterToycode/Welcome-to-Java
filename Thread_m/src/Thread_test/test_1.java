package Thread_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test_1 {
    public static void main(String []args){
        List<String> gift=new ArrayList<>();
        String [] names={"打火机","AJ","口红","香水","皮带"};
        Random random=new Random();

        for (int i = 0; i < 100; i++) {
            gift.add(names[random.nextInt(names.length)]+(i+1));
        }

        test_1_mythread k = new test_1_mythread(gift, "K");
        test_1_mythread s = new test_1_mythread(gift, "S");
        k.start();
        s.start();


    }
}
