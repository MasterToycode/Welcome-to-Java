import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test_1 {

    public static void main(String [] args){
        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zoneId1=ZoneId.of("America/New_York");//分装成对象
        ZonedDateTime zonedDateTime=ZonedDateTime.now(zoneId1);
        System.out.println(zonedDateTime);

         ZonedDateTime zonedDateTime1=ZonedDateTime.now(Clock.systemUTC());
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2=ZonedDateTime.now();
        System.out.println(zonedDateTime2);
    }
}