package Thread_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test_1_mythread extends Thread {
    @Override
    public void run()
    {
        while (true){
            synchronized (list){
                if (list.size()<10){
                    break;
                }
                else {
                Random random=new Random();
                String removed = list.remove(random.nextInt(list.size()));
                count++;
                System.out.println(name1+"get the gift "+removed);
                }
            }
        }
        System.out.println(name1+ "get the gift in total " + count);
    }

    private List<String> list=new ArrayList<>();

    private String name1;

    public test_1_mythread(List<String> list, String name) {
        this.list = list;
        this.name1 = name;
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String getName1() {
        return name1;
    }


    public void setName1(String name) {
        this.name1 = name;
    }
}
