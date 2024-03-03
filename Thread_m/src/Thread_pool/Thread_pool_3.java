package Thread_pool;

import java.util.concurrent.*;

public class Thread_pool_3 {
    public static void main(String []args) throws ExecutionException, InterruptedException {

        ExecutorService threadPoolExecutor = Executors.newFixedThreadPool(3);//本质上都是使用ThreadPoolExecutor这个类
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

        //计算密集型任务：cpu核数+1
        //IO型密集任务：cpu核数*2
        //大型项目：不推荐Executor的方法，建议使用ThreadPoolExecutor
    }
}
