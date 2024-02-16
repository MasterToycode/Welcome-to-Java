import java.util.Calendar;

public class Try_4
{
    public static void main(String []args){
        Calendar now=Calendar.getInstance();
        System.out.println(now);
        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.getTime());
        now.set(Calendar.MONTH,8);
        System.out.println(now.get(Calendar.MONTH));
    }
}