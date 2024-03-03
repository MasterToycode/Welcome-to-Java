package Thread_pool;

import java.util.concurrent.*;

public class Thread_pool_2 {
    public static void main(String []args) throws ExecutionException, InterruptedException {

        ExecutorService threadPoolExecutor =
                new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(4),
                        Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.CallerRunsPolicy() );

        //实现对Callable类型的任务的执行

        Future<String> submit = threadPoolExecutor.submit(new MyCallable(8));
        Future<String> submit1 = threadPoolExecutor.submit(new MyCallable(6));
        Future<String> submit2 = threadPoolExecutor.submit(new MyCallable(7));
        Future<String> submit3 = threadPoolExecutor.submit(new MyCallable(10));
        Future<String> submit4 = threadPoolExecutor.submit(new MyCallable(5));

        System.out.println(submit.get());
        System.out.println(submit1.get());
        System.out.println(submit2.get());
        System.out.println(submit3.get());

        System.out.println(submit4.get());

        threadPoolExecutor.shutdown();
    }
}