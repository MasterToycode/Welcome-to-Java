package THREADM_TEST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class My_thread extends Thread{
    public static final Logger LOGGER= LoggerFactory.getLogger("LogBackTest");

    public My_thread(String name){
        super(name);
    }

    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        LOGGER.info("No1_Thread is starting : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(thread.getName()+i);
        }
    }
}
