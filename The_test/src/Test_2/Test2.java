package Test_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static LocalDate start_time=LocalDate.of(2024,2,3);
    public static LocalDate static_edmnth;


    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input the Year and month (after 2024.2.3)");
        System.out.println("Your input must be like : YYYY-mm");
        LocalDate edndate=start_time;


        while (true) {
            String next=scanner.next()+"-01";
            if (next.matches("\\d{4}-\\d{2}-\\d{2}"))//
            {
                edndate=LocalDate.parse(next);
                static_edmnth=edndate;
                edndate=edndate.plusMonths(1).minusDays(1);
                break;
            }

            else System.out.println("Your input is not true! Please input again !");
        }//get the end_Date



        List<Day>dayList=new ArrayList<>();
        while (start_time.isBefore(edndate)){
            Day day=new Day(start_time,false);
            dayList.add(day);
            start_time=start_time.plusDays(1);
        }
        System.out.println(dayList);//Print all the days!



        for (int i = 0; i < dayList.size(); i+=3) {
            dayList.get(i).setFlag(true);
        }//set all the resting day


        List<Day>dayList1=new ArrayList<>();


        System.out.println("These days that you are resting in "+static_edmnth.getMonth()+" :");
        for (int i = 0; i < dayList.size(); i++) {
            if (dayList.get(i).getDate().isAfter(static_edmnth)&&dayList.get(i).isFlag())
            {
                    dayList1.add(dayList.get(i));
                    dayList.get(i).Print();
            }
        }



        System.out.println("These days are on weekend when you are resting in "+static_edmnth.getMonth()+" :");
        dayList1.stream()
                .filter(day -> day.getDate().getDayOfWeek().getValue()==6||
                        day.getDate().getDayOfWeek().getValue()==7
                        )
                .forEach(
                        day -> {
                            System.out.println(day+((day.getDate().getDayOfWeek().getValue()==6)?"Sut":"Sun"));
                        });


    }
}