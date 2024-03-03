package Thread_safe;

public class Thread_safe_1 {
    public static void main(String []args){
        Acccount acccount=new Acccount(100000,"ICBC110");
        new Draw_thread(acccount,"No1_K").start();
        new Draw_thread(acccount,"No2_S").start();

        Acccount acccount1=new Acccount(50000,"ICBC111");
        new Draw_thread(acccount1,"No3_J").start();
        new Draw_thread(acccount1,"No4_C").start();

    }
}
