public class Test_runnable  implements Runnable{
    private  int number;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (this)
            {
                System.out.println(Thread.currentThread().getName()+"  cout------->"+(++number));
            }
        }
    }
}
