package Thread_net;

public class Thread_test {
    public static void main(String []args){
        Mydesk mydesk=new Mydesk();

        new Thread(()->{
            while (true) {
                mydesk.Put();
            }
        },"Cooker1").start();

        new Thread(()->{
            while (true) {
                mydesk.Put();
            }
        },"Cooker2").start();

        new Thread(()->{
            while (true) {
                mydesk.Put();
            }
        },"Cooker3").start();

        new Thread(()->{
            while (true) {
                mydesk.get();
            }
        },"Eat1").start();

        new Thread(()->{
            while (true) {
                mydesk.get();
            }
        },"Eat2").start();

    }
}
