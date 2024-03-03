package Thread_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Acccount {
    private double money;

    private String cardid;

    private final Lock lock=new ReentrantLock();
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public Acccount(double money, String cardid) {
        this.money = money;
        this.cardid = cardid;
    }

    public Acccount() {
    }


    public  void Drawmoney(double money){

        String name = Thread.currentThread().getName();
        lock.lock();
        try {

            if (this.money>=money){
                System.out.println(name+" comes to withdraw money!");
                this.money-=money;
                System.out.println("After "+name+" withdraw the money, left "+this.money);
            }
            else {
                System.out.println(name+" can not withdraw money!");
            }

        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }

        finally {
            lock.unlock();
        }
    }

    public static void test(){
        synchronized (Acccount.class){

        }
    }

}
