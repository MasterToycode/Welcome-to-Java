package THREADM_TEST;

public class Thread_test_2 {
    public static void main(String []args){

        new Thread(()->{
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程输出！！"+i);
                }
        }
            ).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main线程输出！！"+i);
        }
    }
}
