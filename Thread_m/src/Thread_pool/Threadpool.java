package Thread_pool;

import java.util.concurrent.*;

public class Threadpool {
    public static void main(String []args){
//        public ThreadPoolExecutor(int corePoolSize,
//        int maximumPoolSize,
//        long keepAliveTime,
//        TimeUnit unit,
//        BlockingQueue<Runnable> workQueue,
//        ThreadFactory threadFactory,
//        RejectedExecutionHandler handler)



        Executor threadPoolExecutor =
                new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                        Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.CallerRunsPolicy() );

//        新任务拒绝策略策略
//        ThreadPoolExecutor.AbortP01icy 详解丢弃任务并抛出 ReJectedExecutionException 异常, 。是默认的策略丢弃任务，
//        ThreadPoolExecutor.DiscardPOIicy 但是不抛出异常这是不推荐的做法
//        ThreadPool.DiscardOIdestPOIicy 抛弃队列中等待最久的任务然后把当前任务加入队列中
//        ThreadPool.Executor.CaIIerRunsP01icy 由主线程负责调用任务的 run() 方法从而绕过线程池直接执行
//





        MyRunnable myRunnable = new MyRunnable();

        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);


        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);


        // 关闭线程池
        ((ThreadPoolExecutor) threadPoolExecutor).shutdown();


    }
}












