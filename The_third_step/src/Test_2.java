import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test_2
{
    public static void main(String []args){
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        String string=dateTimeFormatter.format(localDateTime);
        System.out.println(string);

        String string1=localDateTime.format(dateTimeFormatter);
        System.out.println(string1);

        String string2="2024-2-24 8:24:2";
        LocalDateTime localDateTime1=LocalDateTime.parse(string,dateTimeFormatter);
        System.out.println(localDateTime1);


        LocalDate localDate=LocalDate.of(2024,2,24);
        LocalDate localDate1=LocalDate.of(1996,8,2);

        Period between=Period.between(localDate,localDate1);
        System.out.println(between);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());
    }
}
