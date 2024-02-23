package Test_2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;

public class Timetask extends TimerTask {
    private LocalDateTime start_time;

    public Timetask() {
        System.out.println("-------------------------------------------2024 China's College Entrance Examination-------------------------------------------------------");
        String string="2024-06-07 09:00:00";
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        start_time=LocalDateTime.parse(string,formatter);
    }


    @Override
    public void run() {
        LocalDateTime now=LocalDateTime.now();
        Duration duration=Duration.between(now,start_time);
        System.out.println(
                duration.toDays()+" day "+duration.toHours()+" hours "+
                        duration.toMinutes()+" mins "+duration.toSecondsPart()+" seconds ");
    }
}
