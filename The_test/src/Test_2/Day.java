package Test_2;

import java.time.LocalDate;

public class Day {
    private LocalDate date;
    private  boolean flag;//rest?

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Day(LocalDate date, boolean flag) {
        this.date = date;
        this.flag = flag;
    }

    public Day() {
    }

    @Override
    public String toString() {
        return "Day{" +
                "date=" + date +
                ", flag=" + flag +
                '}';
    }

    public void Print(){
        System.out.println(date+(flag?"[rest]":""));
    }
}
