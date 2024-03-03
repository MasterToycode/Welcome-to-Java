package Thread_net;

import java.util.ArrayList;
import java.util.List;

public class Mydesk {
    private List<String> strings=new ArrayList<>();

    public Mydesk() {
    }

    public synchronized void Put(){
        try {
            String name = Thread.currentThread().getName();
            if (strings.size()==0){
                strings.add(name+" makes a Baozi!");
                Thread.sleep(2000);
                    this.notify();
                    this.wait();
            }
            else {
                this.notify();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if (strings.size()!=0){
                System.out.println(name+" have eat the Baozi that "+strings.get(0).replace("makes a Baozi","makes"));
                strings.clear();
                Thread.sleep(2000);
                this.notify();
                this.wait();
            }

            else {
                this.notify();
                this.wait();
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
