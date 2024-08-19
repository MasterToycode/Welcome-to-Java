package org.example.pro_2;

import org.junit.jupiter.api.Test;

public class ThreadLocalTest {
    @Test
    public void testThraedLocalSetAndGet(){
        ThreadLocal threadLocal = new ThreadLocal();
        new Thread(()->{
            threadLocal.set("kobe");
            System.out.println(Thread.currentThread().getName()+": "+threadLocal.get());
        },"Blue").start();

        new Thread(()->{
            threadLocal.set("SGA");
            System.out.println(Thread.currentThread().getName()+": "+threadLocal.get());
        },"Red").start();
    }
}
