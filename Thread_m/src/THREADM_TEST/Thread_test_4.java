package THREADM_TEST;

public class Thread_test_4 {
    public static void main(String []args) throws InterruptedException {
        for (int i = 0; i <5 ; i++) {
            System.out.println(i);
            if (i==2){
                Thread.sleep(5000);
            }

            Thread myThread = new My_thread("No1_thread: ");
            myThread.start();
            myThread.join();

            Thread myThread1 = new My_thread("No2_thread: ");
            myThread1.start();
            myThread1.join();
        }
    }
}
