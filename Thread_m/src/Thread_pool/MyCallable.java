package Thread_pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        if (f(n)<0) return "Wrong!";
        else return f(n)+" This is the answer of the "+n+"! and "+Thread.currentThread().getName()+"get it!";
    }

    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    private long f(int n){
        if (n==0) return 1;
        if (n<0) return -1;
        else return f(n-1)*n;
    }
}
