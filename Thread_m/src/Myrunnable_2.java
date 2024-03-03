import java.util.concurrent.atomic.AtomicInteger;

public class Myrunnable_2 implements Runnable{
    private AtomicInteger number;
    public Myrunnable_2() {
        this.number=new AtomicInteger(0);
    }
    //乐观锁！!!!
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"  cout------->"+(number.incrementAndGet()));
        }
    }
}
