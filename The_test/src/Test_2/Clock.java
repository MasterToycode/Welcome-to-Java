package Test_2;

import java.util.Timer;

public class Clock {
    public static void main(String [] args){
        Timer timer=new Timer();
        timer.schedule(new Timetask(),0,1000);
    }
}