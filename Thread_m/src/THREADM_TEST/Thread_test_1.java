package THREADM_TEST;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Thread_test_1 {
    public static final Logger LOGGER= LoggerFactory.getLogger("LogBackTest");


    //main方法是由主线程启动执行的！！！
    public static void main(String []args){
            Thread myThread=new My_thread("No1:");

            myThread.start();//启动线程必须调用start方法

            Runnable myRunnable = new MyRunnable();
            new Thread(myRunnable,"No2: ").start();

            Thread m=Thread.currentThread();
            System.out.println(m.getName());

            for (int i = 0; i < 5; i++) {
                LOGGER.info("main_Thread is starting ");
            }
            //不要把main的线程的任务放在子线程之前！！！
    }
}
