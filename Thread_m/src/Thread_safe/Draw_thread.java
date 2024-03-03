package Thread_safe;
public class Draw_thread extends Thread{

    @Override
    public void run() {
        acc.Drawmoney(10000);
    }

    public Draw_thread(Acccount acc,String name) {
        this.acc = acc;
        this.name=name;

    }

    private Acccount acc;
    private String name;
}
