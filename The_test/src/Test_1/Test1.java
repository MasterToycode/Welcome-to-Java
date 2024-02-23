package Test_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Test1 {
    public static List<People>people=new ArrayList<>();

    public static void main(String [] args){

        Random r=new Random();
        for (int i = 1; i <=100 ; i++) {
            while (true) {
                int index=r.nextInt(200)+1;
                if (exit(index)){
                People p=new People(index,i);
                people.add(p);
                break;
                }
            }

        }

        System.out.println("People is at" +people);

        while (people.size()>1){
            List<People>people1=new ArrayList<>();
            for (int i = 1; i < people.size(); i+=2) {
                people1.add(people.get(i));
            }
            people=people1;
        }


        System.out.println(people.get(0));
    }



    public static boolean exit(int index){
        for (People person : people) {
            if (person.getCode()==index)return false;
        }
        return true;
    }
}