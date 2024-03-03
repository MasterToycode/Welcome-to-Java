package Thread_pool;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"Thread_pool do with Runnalbe_programm");
            Thread.sleep(Integer.MAX_VALUE);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
