public class Thread_test___ {
    public static void main(String []args){
        Runnable taget=new Myrunnable_2();
        for (int i = 0; i < 100; i++) {
            new Thread(taget).start();
        }
    }
}
