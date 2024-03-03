package THREADM_TEST;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        for (int i = 0; i < 5; i++) {
            System.out.println(thread.getName()+i);
        }
    }
}
