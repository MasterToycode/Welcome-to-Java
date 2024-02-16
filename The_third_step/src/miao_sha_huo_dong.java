import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class miao_sha_huo_dong
{
    public static void main(String [] args) throws ParseException {
        String start="2024-2-24 0:00:00";
        String end="2024-2-24 0:10:00";
        String xm="2024-2-24 0:8:24";
        String xj="2024-2-24 0:10:57";

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date st=sdf.parse(start);
        Date ed=sdf.parse(end);
        Date XM=sdf.parse(xm);
        Date XJ=sdf.parse(xj);

        long time_st=st.getTime();
        long time_ed=ed.getTime();
        long time_xm=XM.getTime();
        long time_xj=XJ.getTime();

        if (time_xj>=time_st&&time_xj<=time_ed) System.out.println("Good");
        else System.out.println("Fail");

        if (time_xm>=time_st&&time_xm<=time_ed) System.out.println("Good");
        else System.out.println("Fail");
    }
}