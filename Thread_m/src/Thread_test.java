public class Thread_test {
    public static void main(String []args){
        Runnable taget=new Test_runnable();
        for (int i = 0; i < 100; i++) {
            new Thread(taget).start();
        }
    }
}
