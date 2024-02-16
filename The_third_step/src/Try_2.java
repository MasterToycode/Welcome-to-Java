import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Try_2 {
        public static void main(String [] args) throws IOException, InterruptedException {
            long time1=System.currentTimeMillis();

            Runtime r=Runtime.getRuntime();
           Process p= r.exec("YoudaoDict");
            Thread.sleep(5000);
            p.destroy();

            double a=0.1;
            double b=0.2;
            System.out.println(a + b);
            System.out.println("----------------------------------------------");

            BigDecimal b1=BigDecimal.valueOf(a);
            BigDecimal b2=BigDecimal.valueOf(b);

            BigDecimal c1=b1.add(b2);
            BigDecimal c2=b1.subtract(b2);
            BigDecimal c3=b1.multiply(b2);
            BigDecimal c4=b1.divide(b2,8, RoundingMode.HALF_UP);

            System.out.println(c1.doubleValue());
            System.out.println(c2.doubleValue());
            System.out.println(c3.doubleValue());
            System.out.println(c4.doubleValue());

            long tim2=System.currentTimeMillis();
            System.out.println(tim2 - time1);
        }
}
