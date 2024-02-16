import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Try_3 {
    public static void main(String [] args) throws ParseException {
        Date d= new Date();
        System.out.println(d);

        long time =d.getTime();//单位 ：ms
        System.out.println(time);

        time+=2*1000;
        Date d2=new Date(time);
        System.out.println(d2);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String rs=sdf.format(d);
        System.out.println(rs);


        String rs2="2024-8-24 8:24:2";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//String类型转换成Date类型
        Date d3=sdf2.parse(rs2);
        System.out.println(d2);

    }
}