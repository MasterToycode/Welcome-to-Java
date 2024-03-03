package THREADM_TEST;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }


    @Override
    public String call()  {
        if (f(n)>0) return f(n)+"";
        else return new Exception().getMessage();
    }

    private long f(int n){
        if (n==0) return 1;
        if (n<0) return -1;
        else return f(n-1)*n;
    }

}
