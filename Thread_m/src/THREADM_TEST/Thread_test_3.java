package THREADM_TEST;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread_test_3 {
    public static void main(String []args){
        Callable<String> myCallable = new MyCallable(6);

        FutureTask<String> futureTask = new FutureTask<>(myCallable);//未来任务对象实现了Runnable接口
        //可以在线程执行之后get方法获取结果

        new Thread(futureTask).start();

        try {
            String s = futureTask.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
